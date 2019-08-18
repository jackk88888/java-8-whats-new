package org.paumard.javafx;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author José
 */
public class SecondApplication extends Application {
    
    @Override
    public void start(Stage stage) {

        try {
            FXMLLoader loader = 
                new FXMLLoader(
                    getClass().getResource("ihm.fxml"));

            Parent root = loader.load();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public static void main(String[] args) {

        launch();
    }
}
