package mvcexample;


import mvcexample.controller.Controller;
import mvcexample.model.Subject;
import mvcexample.view.View;

import java.util.logging.*;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Create the Model and View
        Subject subject = new Subject();
        View view = new View();

        // Create the Controller
        Controller controller = new Controller(subject, view);

        // Set data through the Controller
        controller.setSubjectName("Mathematics");
        controller.setSubjectMarks(95);
        controller.updateView();

        // Log success
        LOGGER.info("Application executed successfully.");
    }
}
