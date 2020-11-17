import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class homepage extends Application{
    public void start(Stage primaryStage) throws Exception
    {
        StackPane sp=new StackPane();
        primaryStage.setScene(new Scene(sp));
        primaryStage.show();
    }
}
