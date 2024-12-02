public class Main {
    public static void main(String[] args) {
        Model model = new Model(); // Ensure model is properly instantiated
        View view = new View();    // Ensure view is properly instantiated
        Controller controller = new Controller(model, view);

        // Using the controller to manipulate and display data
        controller.setData("Hello, MVC!"); // No error should occur here
        controller.updateView();          // Output: Data: Hello, MVC!
    }
}
