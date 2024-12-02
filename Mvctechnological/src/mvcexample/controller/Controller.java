package mvcexample.controller;


import mvcexample.model.Subject;
import mvcexample.view.View;

import java.util.logging.*;

public class Controller {
    private static final Logger LOGGER = Logger.getLogger(Controller.class.getName());

    private Subject subject;
    private View view;

    public Controller(Subject subject, View view) {
        this.subject = subject;
        this.view = view;
    }

    public void setSubjectName(String name) {
        try {
            subject.setName(name);
            LOGGER.info("Subject name set through controller: " + name);
        } catch (Exception e) {
            view.showErrorMessage("Error setting subject name.");
            LOGGER.log(Level.SEVERE, "Error setting subject name", e);
        }
    }

    public void setSubjectMarks(int marks) {
        try {
            subject.setMarks(marks);
            LOGGER.info("Subject marks set through controller: " + marks);
        } catch (Exception e) {
            view.showErrorMessage("Error setting subject marks.");
            LOGGER.log(Level.SEVERE, "Error setting subject marks", e);
        }
    }

    public void updateView() {
        try {
            view.printSubjectDetails(subject.getName(), subject.getMarks());
        } catch (Exception e) {
            view.showErrorMessage("Error displaying subject details.");
            LOGGER.log(Level.SEVERE, "Error displaying subject details", e);
        }
    }
}
