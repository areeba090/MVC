package mvcexample.model;




import java.util.logging.*;

public class Subject {
    private static final Logger LOGGER = Logger.getLogger(Subject.class.getName());
    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
        LOGGER.info("Subject name set to: " + name);
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
        LOGGER.info("Subject marks set to: " + marks);
    }

    public int getMarks() {
        return marks;
    }
}
