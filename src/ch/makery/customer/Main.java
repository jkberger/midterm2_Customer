package ch.makery.customer;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;
    private AnchorPane CustomerInfo;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("CustomerInformation");


        showCustomerInfo();
    }

    /**
     * Initializes the root layout.
     */
    
    public void showCustomerInfo() {
        try {
            // Load customer info.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/CustomerInfo.fxml"));
            AnchorPane CustomerInfo = (AnchorPane) loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }    
    }
    

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}