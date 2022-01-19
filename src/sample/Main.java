package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        String path="C:\\Users\\LENOVO\\IdeaProjects\\untitled1\\untitled1\\src\\sample\\beginsong.m4a";
//Media media=new Media(new File(path).toURI().toString());
//        MediaPlayer mediaPlayer =new MediaPlayer(media);
//        mediaPlayer.play();


        primaryStage.setTitle("war game");
        Image image1 = new Image(getClass().getResourceAsStream("mainphoto.jpg"));
        ImageView imageview1 = new ImageView(image1);
        Button button = new Button();
        button.setText("new game");
        button.setTranslateX(0);
        button.setTranslateY(200);
        String font="-fx-background-color: \n" +
                "        #cccccc,\n" +
                "        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" +
                "        linear-gradient(#20262b, #191d22),\n" +
                "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" +
                "    -fx-background-radius: 5,4,3,5;\n" +
                "    -fx-background-insets: 0,1,2,0;\n" +
                "    -fx-text-fill: white;\n" +
                "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" +
                "    -fx-font-family: \"Arial\";\n" +
                "    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" +
                "    -fx-font-size: 12px;\n" +
                "    -fx-padding: 10 20 10 20;";
        button.setStyle(font);
       gridfx g = new gridfx();
       // button.setOnAction(this);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("open button");
                try
                {
                    g.start(new Stage());
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                primaryStage.close();

            }

        });
        StackPane stack = new StackPane();
        stack.getChildren().addAll(imageview1, button);

        Scene scene = new Scene(stack);
        primaryStage.setScene(scene);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setWidth(1400);
        primaryStage.setHeight(800);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
