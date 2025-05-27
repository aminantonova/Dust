package com.example.selenium;

public enum UserName {

    AMINA("Amina", "Antonova", "amina antonova", "A1b@cdef");

    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String password;

    UserName(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
        }

   public String getLastName() {
        return lastName;
        }

   public String getUserName() {
        return userName;
        }

   public String getPassword() {
        return password;
        }
    }