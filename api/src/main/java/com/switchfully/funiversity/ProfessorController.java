package com.switchfully.funiversity;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/studyPoints")
public class ProfessorController {
    private ProfessorService professorService;
    private ProfessorMapper professorMapper;

    //@Inject
    public ProfessorController(ProfessorController professorController, ProfessorMapper professorMapper) {
        this.professorService = professorService;
        this.professorMapper = professorMapper;
    }
// CREATE
    //READ
    //UPDATE
    //DELETE

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> getProfessors() {
        return ProfessorService.getProfessors();

        @GetMapping(produces = "application/json")
        @ResponseStatus(HttpStatus.OK)
        public int getCoursesBasedOnStudyPoints (@PathVariable("studyPoints") Integer studyPoints){
            return professorService.getStudyPoints(studyPoints);
        }

        @GetMapping(produces = "application/json")
        @ResponseStatus(HttpStatus.OK)
        public int getCoursesBasedProfessorId (@PathVariable("studyPoints") Integer studyPoints){
            return professorService.getStudyPoints(studyPoints);
        }

        @PostMapping(consumes = "application/json", produces = "application/json")
        @ResponseStatus(HttpStatus.CREATED)
        public Professor createProfessor (@RequestBody Professor professor){
            return ProfessorService.createProfessor(professor);
        }

    }
}