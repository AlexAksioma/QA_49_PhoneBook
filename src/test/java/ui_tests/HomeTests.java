package ui_tests;

import manager.ApplicationManager;
import org.testng.annotations.Test;

public class HomeTests extends ApplicationManager {

    @Test
    public void firstTest(){
        System.out.println("first test");
    }

    //  setup (BeforeMethod)  --> firstTest (Test) --> tearDown (AfterMethod)
}
