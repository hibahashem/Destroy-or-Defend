package com.company;


public class   Attacker extends  Team {

    public Attacker()
    {
        this.creatplayer();
        this.creatunit();
    }

    public void creatplayer()
    {
        Player Attacker1=new Player(3000,1,1);
        this.players.add(Attacker1);
        Player Attacker2=new Player(3000,1,2);
        this.players.add(Attacker2);
    }
    public void creatunit()
    {
        Unit newunit;
//      //Attacker1
//            newunit= this.players.get(0).buyunit(0);
//           if(this.Acceptposition(1000+newunit.position.radius,30+newunit.position.radius))
//           {
//               newunit.position.x=1000;
//               newunit.position.y=30;
//               this.teamunitposition.add(newunit.position);
//               this.players.get(0).units.add(newunit);
//               this.players.get(0).points -=newunit.unitprice;
//
//           }
//        newunit= this.players.get(0).buyunit(1);
//        if(this.Acceptposition(1010+newunit.position.radius,50+newunit.position.radius))
//        {
//            newunit.position.x=1010;
//            newunit.position.y=50;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(0).units.add(newunit);
//            this.players.get(0).points -=newunit.unitprice;
//
//        }
//        newunit= this.players.get(0).buyunit(2);
//        if(this.Acceptposition(1600+newunit.position.radius,50+newunit.position.radius))
//        {
//            newunit.position.x=1600;
//            newunit.position.y=50;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(0).units.add(newunit);
//            this.players.get(0).points -=newunit.unitprice;
//
//        }
//        newunit= this.players.get(0).buyunit(3);
//        if(this.Acceptposition(40+newunit.position.radius,40+newunit.position.radius))
//        {
//            newunit.position.x=40;
//            newunit.position.y=40;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(0).units.add(newunit);
//            this.players.get(0).points -=newunit.unitprice;
//
//        }
//        newunit= this.players.get(0).buyunit(4);
//        if(this.Acceptposition(40+newunit.position.radius,70+newunit.position.radius))
//        {
//            newunit.position.x=40;
//            newunit.position.y=70;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(0).units.add(newunit);
//            this.players.get(0).points -=newunit.unitprice;
//
//        }


        //Attacker2
//        newunit= this.players.get(1).buyunit(0);
//        if(this.Acceptposition(1000+newunit.position.radius,5+newunit.position.radius))
//        {
//            newunit.position.x=1000;
//            newunit.position.y=5;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(1).units.add(newunit);
//            this.players.get(1).points -=newunit.unitprice;
//        }
//        newunit= this.players.get(1).buyunit(1);
//        if(this.Acceptposition(60+newunit.position.radius,70+newunit.position.radius))
//        {
//            newunit.position.x=60;
//            newunit.position.y=70;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(1).units.add(newunit);
//            this.players.get(1).points -=newunit.unitprice;
//        }
//        newunit= this.players.get(1).buyunit(2);
//        if(this.Acceptposition(888+newunit.position.radius,777+newunit.position.radius))
//        {
//            newunit.position.x=888;
//            newunit.position.y=777;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(1).units.add(newunit);
//            this.players.get(1).points -=newunit.unitprice;
//
//        }
//        newunit= this.players.get(1).buyunit(5);
//        if(this.Acceptposition(90+newunit.position.radius,120+newunit.position.radius))
//        {
//            newunit.position.x=90;
//            newunit.position.y=120;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(1).units.add(newunit);
//            this.players.get(1).points -=newunit.unitprice;
//
//        }
//        newunit= this.players.get(1).buyunit(6);
//        if(this.Acceptposition(500+newunit.position.radius,210+newunit.position.radius))
//        {
//            newunit.position.x=500;
//            newunit.position.y=210;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(1).units.add(newunit);
//            this.players.get(1).points -=newunit.unitprice;
//
//        }
//        newunit= this.players.get(1).buyunit(7);
//        if(this.Acceptposition(550+newunit.position.radius,2500+newunit.position.radius))
//        {
//            newunit.position.x=550;
//            newunit.position.y=2500;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(1).units.add(newunit);
//            this.players.get(1).points -=newunit.unitprice;
//
//        }
        newunit= this.players.get(1).buyunit(8);
        if(this.Acceptposition(200+newunit.position.radius,3000+newunit.position.radius))
        {
            newunit.position.x=200;
            newunit.position.y=3000;
            this.teamunitposition.add(newunit.position);
            this.players.get(1).units.add(newunit);
            this.players.get(1).points -=newunit.unitprice;

        }

    }
    public int numofunit()
    {
        int num=0;
        for (int i=0;i<this.players.size();i++)
        {
            num+=this.players.get(i).units.size();
        }
        return num;
    }





}
