import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;


public class CosineAndSine extends Application{
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
		Polyline polyline2 = new Polyline();
		ObservableList list2 = polyline2.getPoints();
		double scaleFactor2 = 50;
		for (int x = -170; x <= 170; x++) {
		list2.add(x + 200.0);
		list2.add(100 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
		}
		polyline2.setStroke(Color.BLUE);
		pane.getChildren().add(polyline2);
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
