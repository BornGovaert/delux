package com.switchfully.funiversity;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/studyPoints")
public class CourseController {
    private CourseController courseController;

    //@Inject
    public CourseController(CourseController courseController) {
        this.courseController = courseController;
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public int getStudyPoints(@PathVariable("studyPoints") Integer studyPoints) {
        return courseController.getStudyPoints(studyPoints);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Professor createProfessor(@RequestBody Professor professor){
        return ProfessorController.createProfessor(professor);
    }
}
