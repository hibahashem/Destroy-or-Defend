package com.company;
import java.util.ArrayList;


public class startgame {
    static int remaningtime=200;
    private static startgame x = null;
    public static startgame getObj()
    { if (startgame.x == null)

        startgame.x = new startgame();
        return startgame.x;
    }
    public ArrayList<Team> teams=new ArrayList<>();
    public static Grid grid;
    public static GameState state;
    public static int reammeningattackunit;
    static Time time=new Time();

    public GameState getState() {
        return state;
    }

    public startgame()
    {
        this.newgame();

    }

    public void newgame ()
    {


        Team Attacers=new Attacker();
        Team Defenders=new Defender();
        Hard hards=new Hard();
        teams.add(Attacers);
        teams.add(Defenders);
        //Hards.add(hards);
        grid= Grid.getObj();
        grid.setArray(Attacers.getunits());
        grid.setArray(Defenders.getunits());
        grid.setArray(hards.getObstacles());
        // grid.printzoomgrid(0,70,0,70);
        reammeningattackunit=Attacers.numofunit();
        time.start();
        for(int i=0 ;i<grid.getArray().size();i++)
        {
            grid.getArray().get(i).start();
        }


    }

    public static void gamestate(GameState currentstate)
    {
        time.stop();
        if(state==GameState.AttakerWon)
        {
            System.out.println("The Attacker won");
            for(int i=0 ;i<grid.getArray().size();i++)
            {
                grid.getArray().get(i).stop();

            }

        }
        if(state==GameState.DefenderWon)
        {
            System.out.println("The Defender won");
            for(int i=0 ;i<grid.getArray().size();i++)
            {
                grid.getArray().get(i).stop();

            }

        }


        return;

    }

}
