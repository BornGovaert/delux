package com.switchfully.funiversity;

public class ProfessorMapper {

    public ProfessorDto maptoDto(Professor professor) {
        return new ProfessorDto(professor.getId(),professor.getFirstname(), professor.getLastname());
    }
}
