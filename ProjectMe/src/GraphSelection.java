import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class GraphSelection {
    public static void display(String title){
        Stage graphSelection = new Stage();

        VBox root = new VBox(15);



        Scene scene = new Scene(root, 400, 400);
        graphSelection.setScene(scene);
        graphSelection.show();


    }

}
