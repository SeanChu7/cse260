import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Geometry extends Application{

	@Override
	public void start(Stage primaryStage) {
		Polyline polyline = new Polyline();
		ObservableList list = polyline.getPoints();
		//for (Double x = -150.0;x<=150.0;x++) {
		//	list.add(250+x);
		//	list.add(Math.sqrt(Math.pow(100, 2)-(Math.pow(x-250, 2))+150));
		//}
		Pane pane = new Pane();
		Circle pend = new Circle(250,250,10);
		Line pendString = new Line(250,100,pend.getCenterX(),pend.getCenterY());
		//polyline.setStroke(Color.TRANSPARENT);
		//pane.getChildren().add(polyline);
		//PathTransition pt = new PathTransition();
		//pt.setDuration(Duration.millis(4000));
		//pt.setAutoReverse(true);
		pane.getChildren().add(pendString);
		pane.getChildren().add(pend);
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
