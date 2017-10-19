import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import java.util.Random;
public class Circles extends Application{
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Random r = new Random();
		c1.centerXProperty().bind(r.nextInt(pane.widthProperty().intValue()));
		c2.centerXProperty().bind(r.nextInt(pane.widthProperty().intValue()));
		c1.centerYProperty().bind(r.nextInt(pane.heightProperty().intValue()));
		c2.centerYProperty().bind(r.nextInt(pane.heightProperty().intValue()));
	}
}
