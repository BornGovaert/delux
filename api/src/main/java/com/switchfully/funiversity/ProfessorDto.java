package com.switchfully.funiversity;

public class ProfessorDto {

    private String id;
    private String firstname;
    private String lastname;


    public ProfessorDto(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

}
