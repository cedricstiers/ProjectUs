
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class SettingsMenu {
    public static void gameMode1(String title){
        Stage settingsMenu =new Stage();

        settingsMenu.setTitle(title);

        VBox root = new VBox(15);

        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-padding: 15;" + "-fx-border-width: 2;" + "-fx-border-insets: 2;" );

        Label lblNode = new Label("");
        Label lblEdge = new Label("");

        Slider nodeSlider = new Slider(0, 30, 1);
        nodeSlider.setShowTickMarks(true);
        nodeSlider.setShowTickLabels(true);
        nodeSlider.setMajorTickUnit(5f);
        nodeSlider.setBlockIncrement(1f);
        nodeSlider.setSnapToTicks(true);

        Slider edgeSlider = new Slider(0, 180, 1);
        edgeSlider.setShowTickMarks(true);
        edgeSlider.setShowTickLabels(true);
        edgeSlider.setMajorTickUnit(20f);
        edgeSlider.setBlockIncrement(1f);
        edgeSlider.setSnapToTicks(true);


        Button btnGo =new Button("Go");
        Button btnBack = new Button("Back");

        nodeSlider.valueProperty().addListener(new ChangeListener<Number>() {

                    public void changed(ObservableValue <? extends Number >
                                                observable, Number oldValue, Number newValue)
                    {

                        //lblNode.setText("value: " + newValue);
                        lblNode.setText("Nodes: " + String.format("%.0f", newValue));
                    }
                });

        edgeSlider.valueProperty().addListener(new ChangeListener<Number>() {

            public void changed(ObservableValue <? extends Number >
                                        observable, Number oldValue, Number newValue)
            {

                //lblNode.setText("value: " + newValue);
                lblEdge.setText("Edges: " + String.format("%.0f", newValue));
            }
        });


        btnGo.setOnAction(e -> {
            GameCanvas.display("This is a game", (int)nodeSlider.getValue(), (int)edgeSlider.getValue() );

            settingsMenu.close();
        });

        btnBack.setOnAction( e->{
            GameModeMenu.display("Game mode menu");

            settingsMenu.close();
        });

        root.getChildren().addAll(nodeSlider, lblNode,edgeSlider,lblEdge, btnGo, btnBack);

        Scene scene = new Scene(root, 400, 400);
        settingsMenu.setScene(scene);
        settingsMenu.show();
        scene.getStylesheets().add("JMetroDarkTheme.css");

    }
    public static void gameMode2(String title){
        Stage settingsMenu =new Stage();

        settingsMenu.setTitle(title);

        VBox root = new VBox(15);

        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-padding: 15;" + "-fx-border-width: 2;" + "-fx-border-insets: 2;" );

        Label lblNode = new Label("");
        Label lblEdge = new Label("");

        Slider nodeSlider = new Slider(0, 30, 1);
        nodeSlider.setShowTickMarks(true);
        nodeSlider.setShowTickLabels(true);
        nodeSlider.setMajorTickUnit(5f);
        nodeSlider.setBlockIncrement(1f);
        nodeSlider.setSnapToTicks(true);

        Slider edgeSlider = new Slider(0, 180, 1);
        edgeSlider.setShowTickMarks(true);
        edgeSlider.setShowTickLabels(true);
        edgeSlider.setMajorTickUnit(20f);
        edgeSlider.setBlockIncrement(1f);
        edgeSlider.setSnapToTicks(true);


        Button btnGo =new Button("Go");
        Button btnBack = new Button("Back");

        nodeSlider.valueProperty().addListener(new ChangeListener<Number>() {

            public void changed(ObservableValue <? extends Number >
                                        observable, Number oldValue, Number newValue)
            {

                //lblNode.setText("value: " + newValue);
                lblNode.setText("Nodes: " + String.format("%.0f", newValue));
            }
        });

        edgeSlider.valueProperty().addListener(new ChangeListener<Number>() {

            public void changed(ObservableValue <? extends Number >
                                        observable, Number oldValue, Number newValue)
            {

                //lblNode.setText("value: " + newValue);
                lblEdge.setText("Edges: " + String.format("%.0f", newValue));
            }
        });


        btnGo.setOnAction(e -> {
            GameCanvas.display("This is a game", (int)nodeSlider.getValue(), (int)edgeSlider.getValue() );

            settingsMenu.close();
        });

        btnBack.setOnAction( e->{
            GameModeMenu.display("Game mode menu");

            settingsMenu.close();
        });

        root.getChildren().addAll(nodeSlider, lblNode,edgeSlider,lblEdge, btnGo, btnBack);

        Scene scene = new Scene(root, 400, 400);
        settingsMenu.setScene(scene);
        settingsMenu.show();
        scene.getStylesheets().add("JMetroDarkTheme.css");

    }
    public static void gameMode3(String title){
        Stage settingsMenu =new Stage();

        settingsMenu.setTitle(title);

        VBox root = new VBox(15);

        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-padding: 15;" + "-fx-border-width: 2;" + "-fx-border-insets: 2;" );

        Label lblNode = new Label("");
        Label lblEdge = new Label("");

        Slider nodeSlider = new Slider(0, 30, 1);
        nodeSlider.setShowTickMarks(true);
        nodeSlider.setShowTickLabels(true);
        nodeSlider.setMajorTickUnit(5f);
        nodeSlider.setBlockIncrement(1f);
        nodeSlider.setSnapToTicks(true);

        Slider edgeSlider = new Slider(0, 180, 1);
        edgeSlider.setShowTickMarks(true);
        edgeSlider.setShowTickLabels(true);
        edgeSlider.setMajorTickUnit(20f);
        edgeSlider.setBlockIncrement(1f);
        edgeSlider.setSnapToTicks(true);


        Button btnGo =new Button("Go");
        Button btnBack = new Button("Back");

        nodeSlider.valueProperty().addListener(new ChangeListener<Number>() {

            public void changed(ObservableValue <? extends Number >
                                        observable, Number oldValue, Number newValue)
            {

                //lblNode.setText("value: " + newValue);
                lblNode.setText("Nodes: " + String.format("%.0f", newValue));
            }
        });

        edgeSlider.valueProperty().addListener(new ChangeListener<Number>() {

            public void changed(ObservableValue <? extends Number >
                                        observable, Number oldValue, Number newValue)
            {

                //lblNode.setText("value: " + newValue);
                lblEdge.setText("Edges: " + String.format("%.0f", newValue));
            }
        });


        btnGo.setOnAction(e -> {
            GameCanvas.display("This is a game", (int)nodeSlider.getValue(), (int)edgeSlider.getValue() );

            settingsMenu.close();
        });

        btnBack.setOnAction( e->{
            GameModeMenu.display("Game mode menu");

            settingsMenu.close();
        });

        root.getChildren().addAll(nodeSlider, lblNode,edgeSlider,lblEdge, btnGo, btnBack);

        Scene scene = new Scene(root, 400, 400);
        settingsMenu.setScene(scene);
        settingsMenu.show();
        scene.getStylesheets().add("JMetroDarkTheme.css");

    }
}
