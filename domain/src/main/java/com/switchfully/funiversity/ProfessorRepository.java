package com.switchfully.funiversity;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.util.HashMap;

public class ProfessorRepository {

    private static HashMap<String, Professor> professorDatabase =
            Maps.newHashMap(
                    new ImmutableMap.Builder<String, Professor>()
                            .put("AA", new Professor("AA", "Albert", "Einstein"))
                            .build()
            );

    public static Professor getProfessorInformation(String id) throws IllegalArgumentException{
        if(professorDatabase.containsKey(id)) {
            return professorDatabase.get(id);
        } else {
            throw new IllegalArgumentException(String.format("No professor found for id:%s", id));
        }
    }
}
