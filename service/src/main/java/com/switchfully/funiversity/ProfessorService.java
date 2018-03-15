package com.switchfully.funiversity;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProfessorService {

    private final static Logger LOGGER = Logger.getLogger(ProfessorService.class.getName());

    public Professor getProfessor(String id) {
        try {
            Professor professor = ProfessorRepository.getProfessorInformation(id);
            return professor;
        } catch (IllegalArgumentException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            return new Professor(id, "Unknown firstname professor", "Unknow lastname professor");
        }
    }
}