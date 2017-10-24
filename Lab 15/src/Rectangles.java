import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Rectangles extends Application {
	private TextField rect1X1 = new TextField();
	private TextField rect1width = new TextField();
	private TextField rect1Y1 = new TextField();
	private TextField rect1height = new TextField();
	private TextField rect2X1 = new TextField();
	private TextField rect2width = new TextField();
	private TextField rect2Y1 = new TextField();
	private TextField rect2height = new TextField();
	private Button create = new Button("Create Rectangles");

	@Override
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("X Coordinate of Rectangle 1"), 0, 0);
		gridPane.add(rect1X1, 1, 0);
		gridPane.add(new Label("Y Coordinate of Rectangle 1"), 0, 1);
		gridPane.add(rect1Y1, 1, 1);
		gridPane.add(new Label("Width of Rectangle 1"), 0, 2);
		gridPane.add(rect1width, 1, 2);
		gridPane.add(new Label("Height of Rectangle 1"), 0, 3);
		gridPane.add(rect1height, 1, 3);
		gridPane.add(new Label("X Coordinate of Rectangle 2"), 0, 4);
		gridPane.add(rect2X1, 1, 4);
		gridPane.add(new Label("Y Coordinate of Rectangle 2"), 0, 5);
		gridPane.add(rect2Y1, 1, 5);
		gridPane.add(new Label("Width of Rectangle 2"), 0, 6);
		gridPane.add(rect2width, 1, 6);
		gridPane.add(new Label("Height of Rectangle 2"), 0, 7);
		gridPane.add(rect2height, 1, 7);
		gridPane.add(create, 1, 8);
		create.setOnAction(e -> createRectangles(primaryStage));
		Scene scene = new Scene(gridPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void createRectangles(Stage primaryStage) {
		double rect1X = Double.parseDouble(rect1X1.getText());
		double rect1Y = Double.parseDouble(rect1Y1.getText());
		double rect1w = Double.parseDouble(rect1width.getText());
		double rect1h = Double.parseDouble(rect1height.getText());
		double rect2X = Double.parseDouble(rect2X1.getText());
		double rect2Y = Double.parseDouble(rect2Y1.getText());
		double rect2w = Double.parseDouble(rect2width.getText());
		double rect2h = Double.parseDouble(rect2height.getText());
		Rectangle rect1 = new Rectangle(rect1X,rect1Y,rect1w,rect1h);
		Rectangle rect2 = new Rectangle(rect2X,rect2Y,rect2w,rect2h);
		rect2.setFill(Color.GREEN);
		Pane pane = new Pane();
		pane.getChildren().add(rect1);
		pane.getChildren().add(rect2);
		Text t = new Text();
		t.setX(150);
		t.setY(50);
		
		if (rect1.contains(rect2X,rect2Y) && rect1.contains(rect2X+rect2w,rect2Y+rect2h)) {
			t.setText("Rectangle 1 contains rectangle 2");
		}
		else if (rect2.contains(rect1X,rect1Y) && rect2.contains(rect1X+rect1w,rect1Y+rect1h)) {
			t.setText("Rectangle 2 contains rectangle 1");
		}
		else if (rect1.intersects(rect2X, rect2Y, rect2w, rect2h)) {
			t.setText("The rectangles intersect");
		}
		else {
			t.setText("The Rectangles do not Overlap");
		}
		pane.getChildren().add(t);
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
