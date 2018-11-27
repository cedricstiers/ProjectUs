import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
//import java.awt.*;
import javafx.geometry.Pos;

public class GameModeMenu {
    public static void display (String title){
        Stage gameModeMenu = new Stage();

        gameModeMenu.setTitle(title);

        VBox root = new VBox(15);

        root.setAlignment(Pos.CENTER);

        Button btnBack = new Button("Back");
        Button btnGM1 = new Button("Game Mode 1");
        Button btnGM2 = new Button("Game Mode 2");
        Button btnGM3 = new Button("Game Mode 3");

        Label lblGM1 = new Label("To the bitter end");
        Label lblGM2 = new Label("Best upper bound in a fixed time frame");
        Label lblGM3 = new Label("Random order");


        btnBack.setMinWidth(100);
        btnGM1.setMinWidth(200);
        btnGM2.setMinWidth(200);
        btnGM3.setMinWidth(200);

        btnGM1.setOnAction(e -> {
            SettingsMenu.gameMode1("Settings");
            gameModeMenu.close();
        });

        btnGM2.setOnAction(e -> {
            SettingsMenu.gameMode2("Settings");
            gameModeMenu.close();
        });

        btnGM3.setOnAction(e -> {
            SettingsMenu.gameMode3("Settings");
            gameModeMenu.close();
        });

        btnBack.setOnAction(e -> {
            StartMenu.display("Game Mode menu");
            gameModeMenu.close();
        });

        root.getChildren().addAll(lblGM1,btnGM1);
        root.getChildren().addAll(lblGM2, btnGM2);
        root.getChildren().addAll(lblGM3, btnGM3);
        root.getChildren().add(btnBack);


        Scene scene = new Scene(root, 400, 400);
        gameModeMenu.setScene(scene);
        gameModeMenu.show();

        new JMetro(JMetro.Style.DARK).applyTheme(scene);
    }
}
