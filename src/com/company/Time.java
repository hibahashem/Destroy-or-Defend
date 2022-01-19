package com.company;

public class Time extends Thread{
    @Override
    public void run()
    {
        while (startgame.remaningtime>0)
        {
            startgame.remaningtime--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        startgame.state=GameState.DefenderWon;
        startgame.gamestate(startgame.state);
    }
}
