package sample;

import com.company.*;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.util.ArrayList;
import com.company.Unit;
import com.company.UnitType;
import com.company.startgame;

import java.util.concurrent.atomic.AtomicBoolean;

public class Arena {
    startgame g = startgame.getObj();
    ArrayList<Unit> ar1 = new ArrayList<Unit>();
    ArrayList<ImageView> ar2 = new ArrayList<ImageView>();


    public Arena() {
        for (int i = 0; i < g.teams.get(0).getunits().size(); i++) {
            ar1.add(g.teams.get(0).getunits().get(i));
        }
        for (int i = 0; i < g.teams.get(1).getunits().size(); i++) {
            ar1.add(g.teams.get(1).getunits().get(i));
        }
    }

    public void imagearray() {

        for (int i = 0; i < ar1.size(); i++) {

            if (ar1.get(i).UT == UnitType.Soldiers && ar1.get(i).AD == AttackDefender.Attacker && ar1.get(i).LD == LiveDead.IsLive ) {
                Image image1 = new Image(getClass().getResourceAsStream("soldier.png"));
                ImageView imageview1 = new ImageView(image1);
                imageview1.setFitHeight(ar1.get(i).position.getRadius()*10);
                imageview1.setFitWidth(ar1.get(i).position.getRadius()*10);
                imageview1.setX(0);
                imageview1.setY(0);
                ar2.add(imageview1);

            }else if (ar1.get(i).UT == UnitType.Airplane && ar1.get(i).AD == AttackDefender.Attacker) {

                Image image5 = new Image(getClass().getResourceAsStream("attackairplan.jpg"));
                ImageView imageview5 = new ImageView(image5);
                imageview5.setFitHeight(ar1.get(i).position.getRadius()*2);
                imageview5.setFitWidth(ar1.get(i).position.getRadius()*2);
                imageview5.setX(0);
                imageview5.setY(0);
                ar2.add(imageview5);


            }

            else if (ar1.get(i).UT == UnitType.Soldiers && ar1.get(i).AD == AttackDefender.defender && ar1.get(i).LD == LiveDead.IsLive ) {

                Image image2 = new Image(getClass().getResourceAsStream("soldier2.jpg"));
                ImageView imageview2 = new ImageView(image2);
                imageview2.setFitHeight(ar1.get(i).position.getRadius()*10);
                imageview2.setFitWidth(ar1.get(i).position.getRadius()*10);
                imageview2.setX(0);
                imageview2.setY(0);
                ar2.add(imageview2);
//

            } else if (ar1.get(i).UT == UnitType.Tanks && ar1.get(i).AD == AttackDefender.defender && ar1.get(i).LD == LiveDead.IsLive) {
                Image image3 = new Image(getClass().getResourceAsStream("defendertank.png"));
                ImageView imageview3 = new ImageView(image3);
                imageview3.setFitHeight(ar1.get(i).position.getRadius()*5);
                imageview3.setFitWidth(ar1.get(i).position.getRadius()*5);
                imageview3.setX(0);
                imageview3.setY(0);

                ar2.add(imageview3);
//


            } else if (ar1.get(i).UT == UnitType.Tanks && ar1.get(i).AD == AttackDefender.Attacker && ar1.get(i).LD == LiveDead.IsLive) {
                Image image4 = new Image(getClass().getResourceAsStream("attacktank.jpg"));
                ImageView imageview4 = new ImageView(image4);
                imageview4.setFitHeight(ar1.get(i).position.getRadius()*5);
                imageview4.setFitWidth(ar1.get(i).position.getRadius()*5);
                imageview4.setX(0);
                imageview4.setY(0);
                ar2.add(imageview4);



            }
            else if (ar1.get(i).UT == UnitType.Airplane && ar1.get(i).AD == AttackDefender.defender && ar1.get(i).LD == LiveDead.IsLive) {
                Image image6 = new Image(getClass().getResourceAsStream("defenderairplan.jpg"));
                ImageView imageview6 = new ImageView(image6);
                imageview6.setFitHeight(ar1.get(i).position.getRadius()*2);
                imageview6.setFitWidth(ar1.get(i).position.getRadius()*2);
                imageview6.setX(0);
                imageview6.setY(0);
                ar2.add(imageview6);


            } else if (ar1.get(i).UT == UnitType.Structure && ar1.get(i).LD == LiveDead.IsLive) {
                   if(ar1.get(i).un==unitname.pillbox ) {
                       Image image7 = new Image(getClass().getResourceAsStream("pillbox.jpg"));
                       ImageView imageview7 = new ImageView(image7);
                       imageview7.setFitHeight(ar1.get(i).position.getRadius()*2);
                       imageview7.setFitWidth(ar1.get(i).position.getRadius()*2);
                       imageview7.setX(0);
                       imageview7.setY(0);
                       ar2.add(imageview7);
                   }
                   if(ar1.get(i).un==unitname.prismtower)
                   {
                       Image image8 = new Image(getClass().getResourceAsStream("attackprismtower.jpg"));
                       ImageView imageview8= new ImageView(image8);
                       imageview8.setFitHeight(ar1.get(i).position.getRadius()*2);
                       imageview8.setFitWidth(ar1.get(i).position.getRadius()*2);
                       imageview8.setX(0);
                       imageview8.setY(0);
                       ar2.add(imageview8);
                   }
                if(ar1.get(i).un==unitname.patriotmissilesystem)
                {
                    Image image9 = new Image(getClass().getResourceAsStream("attacksystem.jpg"));
                    ImageView imageview9= new ImageView(image9);
                    imageview9.setFitHeight(ar1.get(i).position.getRadius()*2);
                    imageview9.setFitWidth(ar1.get(i).position.getRadius()*2);
                    imageview9.setX(0);
                    imageview9.setY(0);
                    ar2.add(imageview9);
                }


            } else if (ar1.get(i).UT == UnitType.River) {
                Image image10 = new Image(getClass().getResourceAsStream("river1.jpg"));
                ImageView imageview10 = new ImageView(image10);
                imageview10.setFitHeight(ar1.get(i).position.getRadius()*2);
                imageview10.setFitWidth(ar1.get(i).position.getRadius()*2);
                imageview10.setX(0);
                imageview10.setY(0);
                ar2.add(imageview10);
            }
            else if (ar1.get(i).UT == UnitType.Vale) {
                Image image11 = new Image(getClass().getResourceAsStream("vale.jpg"));
                ImageView imageview11 = new ImageView(image11);
                imageview11.setFitHeight(ar1.get(i).position.getRadius()*2);
                imageview11.setFitWidth(ar1.get(i).position.getRadius()*2);
                imageview11.setX(0);
                imageview11.setY(0);
                ar2.add(imageview11);
            }
            else if (ar1.get(i).LD == LiveDead.IsDead ) {

                Image image12 = new Image(getClass().getResourceAsStream("RIP.jpg"));
                ImageView imageview12 = new ImageView(image12);
                imageview12.setFitHeight(ar1.get(i).position.getRadius()*2);
                imageview12.setFitWidth(ar1.get(i).position.getRadius()*2);
                imageview12.setX(0);
                imageview12.setY(0);
                ar2.add(imageview12);


            }


        }
    }

    public Pane view( AtomicBoolean key) {
        Pane p = new Pane();
//        Image image22 = new Image(getClass().getResourceAsStream("attackairplan.jpg"));
//        ImageView imageview22 = new ImageView(image22);
//        imageview22.setFitHeight(ar1.get(0).position.getRadius()*2);
//        imageview22.setFitWidth(ar1.get(0).position.getRadius()*2);
//        imageview22.setX(0);
//        imageview22.setY(0);
//        ar2.add(imageview22);
        int xbase = ar1.get(0).getBase().getXbase();
        int ybase = ar1.get(0).getBase().getYbase();
        Image imageb = new Image(getClass().getResourceAsStream("mainbase.png"));
        ImageView imageviewb = new ImageView(imageb);
        imageviewb.setFitHeight(ar1.get(0).getBase().getRadius()*5);
        imageviewb.setFitWidth(ar1.get(0).getBase().getRadius()*5);
        imageviewb.setX(xbase);
        imageviewb.setY(ybase);
        p.getChildren().add(imageviewb);
        for (int i = 0; i < ar2.size(); i++) {

            KeyValue xvalue = new KeyValue(ar2.get(i).xProperty(), ar1.get(i).position.getX() );
            KeyValue yvalue = new KeyValue(ar2.get(i).yProperty(), ar1.get(i).position.getY());
            KeyFrame keyFrame = new KeyFrame(Duration.millis(1500), xvalue, yvalue);
            Timeline timeline = new Timeline();
            timeline.getKeyFrames().add(keyFrame);
            if (key.get()==true)
            {
                key.set(false);
                timeline.stop();
            }
            else {
                timeline.play();
            }

            p.getChildren().add(ar2.get(i));


        }

        return p;
    }
}

