package API;

import org.junit.Assert;
import org.junit.Test;
import java.time.Clock;
import java.util.List;

import static io.restassured.RestAssured.given;

public class ReqresTest {
    private final static String URL = "https://reqres.in/";

    @Test
    public void checkAvatarAndIdTest(){
    Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());

            List<UserData> users = given()
                .when()
                .get("api/users?page=2")
                 .then().log().all()
                .extract().body().jsonPath().getList("data",UserData.class);

        users.forEach(x-> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assert.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));

        List<String> avatars = users.stream().map(UserData::getAvatar).toList();
        List<String> ids = users.stream().map(x->x.getId().toString()).toList();
         for(int i = 0; i<avatars.size(); i++) {
             Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
    }

    @Test
    public void successRegTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        int id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        Register user = new Register("eve.holt@reqres.in", "pistol");
        SuccessReg successReg = given()
                .body(user)
                .when()
                .header("x-api-key", "reqres-free-v1")
                .post("api/register")
                .then().log().all()
                .extract().as(SuccessReg.class);

        Assert.assertNotNull(successReg.getToken());
        Assert.assertEquals(id, successReg.getId());
        Assert.assertEquals(token, successReg.getToken());
    }

     @Test
    public void unSuccessRegTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseError400());
         Register user = new Register("sydney@fife", "");
         UnSuccessReg unSuccessReg = given()
                .body(user)
                 .header("x-api-key", "reqres-free-v1")
                 .post("api/register")
                .then().log().all()
                .extract().as(UnSuccessReg.class);
    Assert.assertEquals("Missing password", unSuccessReg.getError());
    }

    @Test
    public void sortedYearsTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
         List<ColorsData> colors = given()
                .when()
                 .header("x-api-key", "reqres-free-v1")
                 .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ColorsData.class);

        List<Integer> years = colors.stream().map(ColorsData::getYear).toList();
        List<Integer> sortedYears = years.stream().sorted().toList();

        Assert.assertEquals(sortedYears, years);
        System.out.println(years);
        System.out.println(sortedYears);
    }

    @Test
    public void deleteUserTest() {
    Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecUnique(204));
        given()
                .when()
                .header("x-api-key", "reqres-free-v1")
                .delete("api/users/2")
                .then().log().all();
    }

    @Test
    public void timeTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
         UserTime user = new UserTime("morpheus", "zion resident");
        UserTimeResponse response = given()
                .body(user)
                .when()
                .header("x-api-key", "reqres-free-v1")
                .put("api/users/2")
                .then().log().all()
                .extract().as(UserTimeResponse.class);
        String actualTime = response.getUpdatedAt().substring(0, 19);
        String currentTime = Clock.systemUTC().instant().toString().substring(0, 19);

        System.out.println("Expected time: " + currentTime);
        System.out.println("Actual time:   " + actualTime);

        Assert.assertEquals(currentTime, actualTime);
    }
}
