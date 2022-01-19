package com.company;

import java.util.ArrayList;


public class Grid {
    ArrayList<Unit> array = new ArrayList<Unit>();
    private static Grid x = null;
    String[][] console = new String[1000][1000];

    public Grid(){}
    public static Grid getObj()
    { if (Grid.x == null)

        Grid.x = new Grid();
        return Grid.x;
    }


    public void setArray(ArrayList<Unit> array) {

        this.array.addAll(array);

    }

    public ArrayList<Unit> getArray() {

        return this.array;
    }

    public synchronized void printzoomgrid(int xstart ,int xend ,int ystart ,int yend)
    {
        // System.out.println(this.array);
        for (int i=xstart;i<xend;i++)
        {
            for (int j = ystart; j < yend; j++)
            {
                this.console[i][j]="-";
            }
        }

        for (int i=xstart;i<xend;i++) {
            for (int j = ystart; j < yend; j++)
            {
                if (this.array.get(0).base. Issqaure(i,j))
                // if (this.array.get(0).base.getPosition().x == i && this.array.get(0).base.getPosition().y == j)
                {
                    this.console[i][j] = "$";
                }
                else {
                    for (int k = 0; k < this.array.size(); k++) {
                        if (this.array.get(k).position.Issqaure(i,j))
                        //  if (this.array.get(k).position.x==i && this.array.get(k).position.y==j )
                        {

                            if (this.array.get(k).AD == AttackDefender.defender && this.array.get(k).LD == LiveDead.IsLive)
                            {
                                if (this.array.get(k).un == unitname.bridge)
                                    this.console[i][j] = "=";
                                else if (this.array.get(k).un == unitname.Valy_v)
                                    this.console[i][j] = "/";
                                else if (this.array.get(k).un == unitname.River_r)
                                    this.console[i][j] = "~";
                                else
                                    this.console[i][j] = "&";

                            }
                            if (this.array.get(k).AD == AttackDefender.Attacker && this.array.get(k).LD == LiveDead.IsLive)
                            {   this.console[i][j] = "#";
                            }

                            if (this.array.get(k).LD == LiveDead.IsDead && this.console[i][j] =="-") {
                                this.console[i][j] = "*";

                            }


                        }

                    }
                }
            }
        }

        for (int i=xstart;i<xend;i++)
        {
            for (int j = ystart; j < yend; j++)
            {
                System.out.print(this.console[i][j]);
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
