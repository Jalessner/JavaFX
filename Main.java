package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
  @Override
  public void start(Stage primaryStage) {
    try {
      Label greetingLabel = new Label("Hello World!");
      Label label1 = new Label("CS400 MyFirstJavaFX");
      ObservableList<String> options =
          FXCollections.observableArrayList("Option 1", "Option 2", "Option 3");
      ComboBox comboBox = new ComboBox(options);
      Image image = new Image("face.png");
      ImageView imageView = new ImageView(image);
      Button button = new Button("Done");
      TextField textField = new TextField();
      BorderPane root = new BorderPane();
      root.setTop(greetingLabel);
      root.setTop(label1);
      root.setLeft(comboBox);
      root.setCenter(imageView);
      root.setBottom(button);
      root.setRight(textField);
      Scene scene = new Scene(root, 400, 400);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.setTitle("Joe's First JavaFX program");
      primaryStage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
