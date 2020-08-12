package framework.steps;

import framework.managers.InitManager;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void setUp(){
        InitManager.initFramework();
    }

    @After
    public void tearDown(){
        InitManager.quitFramework();
    }
}
