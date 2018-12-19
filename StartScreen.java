import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class StartScreen extends Application{  //WHEN BUTTON IS PRESSED, SAY "PLUS" or "MINUS"

   @Override
   public void start(Stage primaryStage) throws Exception{
       
      Button plus = new Button("+");
      Button minus = new Button("-");
      Label label = new Label("0");
       
      HBox btmRow = new HBox(label, plus, minus);
      
      Scene scene = new Scene(btmRow, 600, 400);
      
      primaryStage.setScene(scene);
      primaryStage.setTitle("Title of Game");
      primaryStage.show();

      plus.setOnAction(e -> label.setText("plus"));
      minus.setOnAction(e -> label.setText("minus"));
   }
}