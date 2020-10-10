package activityTodo;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class MainActivity {

    public Button addFirst;
    public Button add;
    public Button option;
    public Button delete;
    public Button confirmationTask;
    public TextBox titleBoxTask;
    public TextBox noteBox;
    public Button taskDeleteConfirmation;
    public Label resultLabel;
    public TextBox taskDate;



    public MainActivity(){


        addFirst= new Button(By.id("com.splendapps.splendo:id/imgFirstTask"));
        add= new Button(By.id("com.splendapps.splendo:id/ivFAB_AddTask"));
        titleBoxTask= new TextBox(By.id("com.splendapps.splendo:id/edtTaskName"));
        confirmationTask=new Button(By.id("com.splendapps.splendo:id/action_save_task"));
        resultLabel= new Label(By.id("com.splendapps.splendo:id/listMain"));
        delete=new Button(By.id("com.splendapps.splendo:id/title"));
        taskDate = new TextBox(By.id("com.splendapps.splendo:id/edtDueD"));
        taskDeleteConfirmation = new Button(By.id("android:id/button1"));



    }

    public boolean isDisplayedTodo(String nameTodo){
        String locator="//android.widget.TextView[@text='"+nameTodo+"']";
        Label todoItem = new Label(By.xpath(locator));
        return todoItem.isDisplayed();
    }

    public void selectItem(String nameTodo) throws MalformedURLException {
        String locator="//android.widget.TextView[@text='"+nameTodo+"']";
        Label taskItem = new Label(By.xpath(locator));
        taskItem.click();
    }
}
