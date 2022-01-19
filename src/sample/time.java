package sample;

import com.company.GameState;
import javafx.application.Platform;
import javafx.scene.Group;

import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

public class time {
    public void t(Group group, Arena arena, AtomicBoolean key)
    {
        java.util.Timer timer=new java.util.Timer();

        TimerTask task=new TimerTask() {

            @Override

            public void run() {
                if(arena.g.getState()!= GameState.Running)
                {

                    System.exit(0);
                }

                Platform.runLater(() -> {

                    group.getChildren().add(arena.view(key));
                });
            }
        };



        timer.scheduleAtFixedRate(task, 0, 100);


    }
}
