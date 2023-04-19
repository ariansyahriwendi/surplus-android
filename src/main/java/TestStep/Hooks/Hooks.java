package TestStep.Hooks;

import BaseClass.BaseSetUp;
import BaseClass.BaseStep;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Hooks extends BaseStep {

    public Hooks() {
        super();
    }

    @Before
    public void setUp() throws MalformedURLException {
        BaseSetUp.setup();
    }

//    @After
//    public void tearDown() {
//        BaseSetUp.teardown();
//        }

}


