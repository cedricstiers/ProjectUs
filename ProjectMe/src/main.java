

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.animation.PauseTransition;
import javafx.util.Duration;
import javafx.event.*;
import javafx.scene.Node;


public class main extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Welcome");

        VBox root = new VBox(10);

        root.setAlignment(Pos.CENTER);

        Label lblWelcome = new Label("Graph Coloring");

        lblWelcome.setStyle(
                "-fx-font-size: 30;"+
                "-fx-font-family: 'Ariel';")
        ;

        Scene scene = new Scene(root, 400, 400);

        PauseTransition pause = new PauseTransition(Duration.seconds(4));
        pause.setOnFinished(e -> {
            StartMenu.display("Start Menu");
            primaryStage.close();
        });
        pause.play();

        root.getChildren().add(lblWelcome);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
