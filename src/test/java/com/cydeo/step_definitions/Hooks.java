package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before()
    public void setupScenario(){
        System.out.println("Setting up browser using cucumber @Before each scenario");
    }

    //@Before (value = "@login", order=2)
    public void setupForLogin(){
        // If you want any code to run before any specific feature/scenario,
        // you can use value= "@tagname" to determine this
        System.out.println("Setting up browser using cucumber @Before @login scenario");
    }

    //@Before (value="@db" , order=3)
    public void setupDatabaseScenario(){

    }


    @After
    public void teardownScenario(){
        // We will implement taking screenshot in this method
        System.out.println("It will be closing browser using cucumber @After each scenario");
    }

    //@BeforeStep
    public void setupScenarioStep(){
        System.out.println("Setting up browser using cucumber @Before each scenario step");
    }

   // @BeforeStep
    public void setupScenarioStepForLogin(){
        System.out.println("Setting up browser using cucumber @Before each scenario step for login");
    }


}
