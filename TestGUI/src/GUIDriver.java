import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUIDriver extends Application {

	@Override
	public void start(Stage primary) throws Exception {
		VBox vbox = new VBox();
		Button btnHello = new Button("Hello");
		btnHello.setMinSize(400, 200);
		vbox.getChildren().add(btnHello);
		Scene scene = new Scene(vbox, 400,200);
		primary.setScene(scene);
		primary.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
