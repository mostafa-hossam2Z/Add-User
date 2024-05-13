package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import lc.com.base;

public class Hooks extends base {
    AddUsersteps surveystepsobj =new AddUsersteps();
    @Before
   public void start()
    {
       launchbrowser();
    }

    @After
    public void quit()
    {
        driver.quit();
    }
}

