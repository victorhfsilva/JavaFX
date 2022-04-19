package emptywindow;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
        
/**
 *
 * @author Victor
 */
public class EmptyWindow extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //Create a group object
        Group group = new Group();
        
        //Create a Scene by passing the group object, height and width
        Scene scene = new Scene(group, 600, 300);
        
        scene.setFill(Color.DARKSLATEGREY);
        
        //Set the title to Stage
        primaryStage.setTitle("Empty Window");
        
        //Add the scene to Stage
        primaryStage.setScene(scene);
        
        //Display the contents of the stage
        primaryStage.show();        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
