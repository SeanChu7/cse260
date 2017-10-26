import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Game extends Application{
	static int count = 0;
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Random r = new Random();
		long startTime = System.currentTimeMillis();
		Circle circle = new Circle(r.nextDouble()*pane.getWidth(), r.nextDouble()*pane.getHeight(),10);
		circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		pane.getChildren().add(circle);
		pane.setOnMouseClicked(e->{
			if(pane.getChildren().get(0).contains(e.getX(),e.getY())) {
				pane.getChildren().remove(pane.getChildren().get(0));
				Circle newcircle = new Circle(r.nextDouble()*pane.getWidth(), r.nextDouble()*pane.getHeight(),10);
				newcircle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
				pane.getChildren().add(newcircle);
				count++;
				if(count == 5) {
					long endTime = System.currentTimeMillis();
					String finish = "Time spent: " + (endTime-startTime);
					Text text = new Text(250,250,finish);
					pane.getChildren().add(text);
				}
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
