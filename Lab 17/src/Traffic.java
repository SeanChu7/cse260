

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Traffic extends Application{

	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();
		VBox radio = new VBox(20);
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbGreen = new RadioButton("Green");
		radio.getChildren().addAll(rbGreen,rbYellow,rbRed);
		pane.setLeft(radio);
		radio.setPadding(new Insets(5, 5, 5, 5));
		Rectangle rect = new Rectangle(200,100,100,300);
		rect.setStroke(Color.BLACK);
		rect.setFill(Color.TRANSPARENT);
		Circle red = new Circle(250,150,50);
		Circle green = new Circle(250,250,50);
		Circle yellow = new Circle(250,350,50);
		red.setStroke(Color.BLACK);
		green.setStroke(Color.BLACK);
		yellow.setStroke(Color.BLACK);
		red.setFill(Color.TRANSPARENT);
		green.setFill(Color.TRANSPARENT);
		yellow.setFill(Color.TRANSPARENT);
		pane.getChildren().addAll(rect,red,green,yellow);
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbYellow.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		rbRed.setOnAction(e ->{
			if (rbRed.isSelected()) {
				red.setFill(Color.RED);
				green.setFill(Color.TRANSPARENT);
				yellow.setFill(Color.TRANSPARENT);
			}
		});
		rbGreen.setOnAction(e ->{
			if (rbGreen.isSelected()) {
				red.setFill(Color.TRANSPARENT);
				green.setFill(Color.GREEN);
				yellow.setFill(Color.TRANSPARENT);
			}
		});
		rbYellow.setOnAction(e ->{
			if (rbYellow.isSelected()) {
				red.setFill(Color.TRANSPARENT);
				green.setFill(Color.TRANSPARENT);
				yellow.setFill(Color.YELLOW);
			}
		});
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
