package com.switchfully.funiversity;

public class CourseMapper {

    private String id;
    private String name;
    private double studyPoints;
    private Category category;
    private Professor professor;

    public CourseDto maptoDto(Course course){
        return new CourseDto(
                course.getId(), course.getName(), course.getStudyPoints(), course.getCategory(), course.getProfessor());
    }
}
