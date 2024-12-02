public class Controller {
    private Model model;
    private View view;

    // Constructor
    public Controller(Model model, View view) {
        this.model = model; // Fix: Correctly assign the parameter "model" to the instance variable
        this.view = view;   // Fix: Correctly assign the parameter "view" to the instance variable
    }

    // Method to set data in the model
    public void setData(String data) {
        model.setData(data);
    }

    // Method to get data from the model
    public String getData() {
        return model.getData(); // Fix: Add a missing semicolon at the end
    }

    // Method to update the view using the model data
    public void updateView() {
        view.printData(model.getData());
    }
}
