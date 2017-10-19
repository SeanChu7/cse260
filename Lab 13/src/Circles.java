import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
public class Circles extends Application{
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Circle c1 = new Circle(500*Math.random(), 500*Math.random(), 15);
		Circle c2 = new Circle(500*Math.random(), 500*Math.random(), 15);
		Line l = new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());
		Text text = new Text(Math.abs((c2.getCenterX()+c1.getCenterX()))/2,Math.abs((c2.getCenterY()+c1.getCenterY()))/2, "Distance: " + Math.sqrt(Math.pow(c2.getCenterX()-c1.getCenterX(), 2)+Math.pow(c2.getCenterY()-c1.getCenterY(), 2)));
		pane.getChildren().add(c1);
		pane.getChildren().add(c2);
		pane.getChildren().add(l);
		pane.getChildren().add(text);
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
