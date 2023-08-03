package stepdefinition;

import io.cucumber.java.en.Given;
import jquerydroppable.DragAndDrop;

public class JQueryStep {
    @Given("user drag and drop")
    public void userDragAndDrop()
    {
        DragAndDrop.dragAndDrop();
    }
}
