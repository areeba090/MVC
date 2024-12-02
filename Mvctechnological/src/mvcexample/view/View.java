package mvcexample.view;





import javax.swing.*;
import java.awt.*;
import java.util.logging.*;

public class View {
    private static final Logger LOGGER = Logger.getLogger(View.class.getName());

    public void printSubjectDetails(String name, int marks) {
        JFrame frame = new JFrame("Subject Details");
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea("Subject: " + name + "\nMarks: " + marks);
        textArea.setEditable(false);

        frame.add(textArea, BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.setVisible(true);

        LOGGER.info("Displayed subject details in GUI");
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
        LOGGER.warning(message);
    }
}
