import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Rectangles extends Application {
	boolean add = true;
	private static List<Circle> circles = new ArrayList<Circle>();
	private static Rectangle holder = new Rectangle();
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		pane.setOnMouseClicked(e -> {
			for(int i = 0; i < circles.size(); i++) {
				if(circles.get(i).contains(e.getX(),e.getY())) {
					pane.getChildren().remove(circles.get(i));
					circles.remove(circles.get(i));
					updateRect(pane);
					add = false;
				}
			}
			if(add) {
			Circle circle = new Circle(e.getX(),e.getY(),10);
			pane.getChildren().add(circle);
			circles.add(circle);
			updateRect(pane);
			}
			add = true;
		});
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void updateRect(Pane pane) {
		Double minX = circles.get(0).getCenterX();
		Double minY = circles.get(0).getCenterY();
		Double maxX = circles.get(0).getCenterX();
		Double maxY = circles.get(0).getCenterY();
		for (int i = 0; i < circles.size(); i++) {
			if (circles.get(i).getCenterX() < minX)
				minX = circles.get(i).getCenterX();
			if (circles.get(i).getCenterY() < minY)
				minY = circles.get(i).getCenterY();
			if (circles.get(i).getCenterX() > maxX)
				maxX = circles.get(i).getCenterX();
			if (circles.get(i).getCenterY() > maxY)
				maxY = circles.get(i).getCenterY();
		}
		if (pane.getChildren().contains(holder))
			pane.getChildren().remove(holder);
		Rectangle rectangle = new Rectangle(minX-10,minY-10,(maxX+10)-(minX-10),(maxY+10)-(minY-10));
		rectangle.setStroke(Color.RED);
		rectangle.setFill(Color.TRANSPARENT);
		holder = rectangle;
		pane.getChildren().add(rectangle);
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
