import javafx.scene.control.ToolBar;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class GameCanvas {

    public static void display(String title, int nodeCount, int edgeCount) {

        System.out.println(nodeCount);
        Circle circle[] = new Circle[nodeCount+1];
        //Line line[] = new Line[nodeCount+1];

        ToolBar toolbar = new ToolBar();

        BorderPane borderPane = new BorderPane();

        Stage game = new Stage();



        Button button1 = new Button();
        //button1.setMinSize(30,30);
        button1.setPrefSize(30,30);
        toolbar.getItems().add(button1);

        Button button2 = new Button();
        //button2.setMinSize(30,30);
        button2.setStyle("-fx-background-color: MediumSeaGreen");
        button2.setPrefSize(30,30);
        toolbar.getItems().add(button2);


        game.setTitle(title);

        Group root = new Group();
        root.getChildren().addAll(borderPane);
        //borderPane.getChildren().add(toolbar);
        //borderPane.setBottom(toolbar);
        Scene scene = new Scene(root, 500, 500);

        for (int i = 0; i <= nodeCount; i++) {
            boolean valid = false;

            int rndX = (int) (Math.random() * 460 + 1);
            int rndY = (int) (Math.random() * 460 + 1);
            int rad = 10;
            circle[i] = new Circle(rndX, rndY, rad, Color.WHITE);

            if (i != 0){
                while(!valid)
                    for (int j = 0; j < i; j++) {
                        if (distance(circle[i].getCenterX(), circle[i].getCenterY(), circle[j].getCenterX(), circle[j].getCenterY()) < 40) {
                            System.out.println("Overlaped");
                            int newX = (int) (Math.random() * 460 + 1);
                            int newY = (int) (Math.random() * 460 + 1);

                            circle[i] = new Circle(newX, newY, rad, Color.WHITE);
                        } else {
                            valid = true;
                        }
            }

                System.out.println(nodeCount);

                circle[i].setStroke(Color.BLACK);
                root.getChildren().add(circle[i]);

            }

            circle[i].setCursor(Cursor.HAND);

            game.setTitle("Trying to make a game");
            game.setScene(scene);
            game.show();

            scene.getStylesheets().add("JMetroDarkTheme.css");


            //Random rndX = new Random();
            //Random rndY = new Random();

            //int rndX = (int)(Math.random() * 50 + 1);
        }

    }
    public static double distance ( double x0, double y0, double x1, double y1){
        return Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2));
    }

}

