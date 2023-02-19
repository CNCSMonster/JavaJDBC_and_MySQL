import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MyPane extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        root.setPrefSize(400, 300);

        TextArea textArea = new TextArea();
        textArea.setPrefSize(300, 200);
        textArea.setLayoutX(50);
        textArea.setLayoutY(50);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setPadding(new Insets(10, 10, 10, 50));
        hbox.getChildren().addAll(button1, button2, button3);
        hbox.setLayoutX(50);
        hbox.setLayoutY(260);

        root.getChildren().addAll(textArea, hbox);

        Scene scene = new Scene(root);
        primaryStage.setTitle("My Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

