package com.solvd.homework8.companyinfo;

import com.solvd.homework8.people.Worker;

import java.util.Set;

public class Course extends Activity {

    public Course(String name, String location, Set<Worker> workers) {
        super(name, location, workers);
    }
}