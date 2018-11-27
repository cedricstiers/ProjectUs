import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

public class StartMenu {

public static void display(String title) {

    Stage startWindow = new Stage();

    startWindow.setTitle(title);

    Label label = new Label("Welcome to the Graph Coloring game");


    VBox root = new VBox(10);

    root.setAlignment(Pos.CENTER);

    Button btnExit = new Button("Exit");
    Button btnStart = new Button("Start");

    btnExit.setMinWidth(100);
    btnStart.setMinWidth(200);

    btnExit.setOnAction(e -> System.exit(0));
   /* btnStart.setOnAction(e -> {
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setTitle("Settings");
        Scene scene = new Scene(root);
        stage.setScene(scene);
    });*/

    btnStart.setOnAction(e -> {
        GameModeMenu.display("Game Mode menu");
        startWindow.close();
     });


    root.getChildren().addAll(label, btnStart, btnExit);


    Scene scene = new Scene(root, 400, 400);
    startWindow.setScene(scene);
    startWindow.show();
    scene.getStylesheets().add("JMetroDarkTheme.css");
    }
  }
