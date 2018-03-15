package com.switchfully.funiversity;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


public class Course {

    private String id;
    private String name;
    private double studyPoints;
    private Category category;
    private Professor professor;

    public Course(String id, String name, double studyPoints, Category category, Professor professor) {
        this.id = id;
        this.name = name;
        this.studyPoints = studyPoints;
        this.category = category;
        this.professor = professor;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getStudyPoints() {
        return studyPoints;
    }

    public Category getCategory() {
        return category;
    }

    public Professor getProfessor() {
        return professor;
    }

}
