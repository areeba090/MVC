package controller;


import mvcexample.model.Subject;
import mvcexample.view.View;

public class Controller {
    private Subject subject;
    private View view;

    public Controller(Subject subject, View view) {
        this.subject = subject;
        this.view = view;
    }

    public void setSubjectName(String name) {
        subject.setName(name);
    }

    public String getSubjectName() {
        return subject.getName();
    }

    public void setSubjectMarks(int marks) {
        subject.setMarks(marks);
    }

    public int getSubjectMarks() {
        return subject.getMarks();
    }

    public void updateView() {
        view.printSubjectDetails(subject.getName(), subject.getMarks());
    }
}
