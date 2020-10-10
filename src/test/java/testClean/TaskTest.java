package testClean;

import SesionManager.Sesion;
import activityTodo.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class TaskTest {
    MainActivity taskActivity=new MainActivity();
    @Test
    public void verifyAddTask() throws MalformedURLException {

        taskActivity.addFirst.click();
        taskActivity.titleBoxTask.type("Task 1");
        taskActivity.confirmationTask.click();

        for (int i=2;i<4;i++){
            taskActivity.add.click();
            taskActivity.titleBoxTask.type("Task "+i);
            taskActivity.confirmationTask.click();
        }

        //verificacion
        boolean actualResult=taskActivity.isDisplayedTodo("Task 2");
        Assert.assertTrue("Error",actualResult);


    }

    @After
    public void after() throws MalformedURLException {
        Sesion.getInstance().closeSesion();
    }
}

