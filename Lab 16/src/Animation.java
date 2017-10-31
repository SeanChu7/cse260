import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application{
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Polyline polyline = new Polyline();
		ObservableList list = polyline.getPoints();
		double scaleFactor = 50;
		for (int x = -170; x <= 170; x++) {
		list.add(x + 200.0);
		list.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}
		polyline.setStroke(Color.RED);
		pane.getChildren().add(polyline);
		Circle circle = new Circle(5);
		pane.getChildren().add(circle);
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setPath(polyline);
		pt.setNode(circle);
		pt.play();
		pane.setOnMousePressed(e->pt.pause());
		pane.setOnMouseReleased(e->pt.play());
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
