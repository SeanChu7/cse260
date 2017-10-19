import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Square extends Application{
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Polyline polyline = new Polyline();
		ObservableList list = polyline.getPoints();
		double scaleFactor = 0.0125;
		for (int x = -100; x <= 100; x++) {
		list.add(x + 200.0);
		list.add(scaleFactor*(100*100)-scaleFactor * x * x);
		}
		pane.getChildren().add(polyline);
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
