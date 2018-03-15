package com.switchfully.funiversity;

public class CourseDto {

    private String id;
    private String name;
    private double studyPoints;
    private Category category;
    private Professor professor;

    public CourseDto(String id, String name, double studyPoints, Category category, Professor professor) {
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
