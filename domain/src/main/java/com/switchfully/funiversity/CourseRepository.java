package com.switchfully.funiversity;


import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.util.HashMap;

public class CourseRepository {

    private static HashMap<String, Course> courseDatabase =
            Maps.newHashMap(
                    new ImmutableMap.Builder<String, Course>()
                            .put("AA", new Course("AA", "ARCO", 6.0, Category.HISTORY, new Professor("AA", "Albert", "Einstein")))
                            .build()
            );

    public static Course getCourseInformation(String id) throws IllegalArgumentException{
        if(courseDatabase.containsKey(id)) {
            return courseDatabase.get(id);
        } else {
            throw new IllegalArgumentException(String.format("No course found for id:%s", id));
        }
    }
}
