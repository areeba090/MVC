package mvcexample;


import controller.Controller;
import mvcexample.model.Subject;
import mvcexample.view.View;

public class Main {
    public static void main(String[] args) {
        // Create the Model and View objects.
        Subject subject = new Subject();
        View view = new View();

        // Create the Controller with Model and View.
        Controller controller = new Controller(subject, view);

        // Set data through the Controller.
        controller.setSubjectName("Mathematics");
        controller.setSubjectMarks(95);

        // Update the View to display data.
        controller.updateView();
    }
}

