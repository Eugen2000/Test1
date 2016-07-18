package application;
	
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
		
	 class WindowButtons extends HBox {

	        public WindowButtons() {
	            Button closeBtn = new Button("X");

	            closeBtn.setOnAction(new EventHandler<ActionEvent>() {

	                @Override
	                public void handle(ActionEvent actionEvent) {
	                    Platform.exit();
	                }
	            });

	            this.getChildren().add(closeBtn);
	        }
	    }
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.setFullScreen(true);
		 //primaryStage.setOpacity(0.5);

/*        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: green;");
        ToolBar toolBar = new ToolBar();
        

        int height = 25;
        toolBar.setPrefHeight(height);
        toolBar.setMinHeight(height);
        toolBar.setMaxHeight(height);
        toolBar.getItems().add(new WindowButtons());

        borderPane.setTop(toolBar);
	*/
        

    
		//try {
			StackPane root = (StackPane)FXMLLoader.load(getClass().getResource("/view/MainStarter.fxml"));
			//root.getChildren().add(toolBar);
			root.setOnMouseClicked(new EventHandler<MouseEvent>() {
				//root.setOnCloseRequest(e -> Platform.exit());	 
	            @Override
	            public void handle(MouseEvent event) {
	                MouseButton button = event.getButton();
	                if(button==MouseButton.PRIMARY){
	                	//System.out.println("1");
	                    //label.setText("PRIMARY button clicked");
	                }else if(button==MouseButton.SECONDARY){
	                    //label.setText("SECONDARY button clicked");
	                	//System.out.println("2");
	                	Timeline timeline = new Timeline();
	                    KeyFrame key1 = new KeyFrame(Duration.millis(1500),
	                                   new KeyValue (primaryStage.getScene().getRoot().opacityProperty(), 0)); 
	                    timeline.getKeyFrames().add(key1); 
/*	
                        KeyFrame key2 = new KeyFrame(Duration.millis(3000),
                                new KeyValue (primaryStage.getScene().getRoot().opacityProperty(), 1)); 
	                    timeline.getKeyFrames().add(key2);  
*/
	                    timeline.setOnFinished((ae) -> System.exit(0)); 
	                    timeline.play();
	                	//Platform.exit();
	                	//primaryStage.close();
	                }else if(button==MouseButton.MIDDLE){
	                    //label.setText("MIDDLE button clicked");
	                }
	            }
	        });			
						
	        Scene scene = new Scene(root,900,900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
			scene.setFill(null);
			primaryStage.show();
		//} catch(Exception e) {
		//	e.printStackTrace();
		//}

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
