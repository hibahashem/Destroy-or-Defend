package com.company;

public class Defender extends  Team{

    public Defender()
    {
        this.creatplayer();
        this.creatunit();
    }

    public void creatplayer()
    {
        Player Defender1=new Player(3000,2,3);
        this.players.add(Defender1);
        Player Defender2=new Player(3000,2,4);
        this.players.add(Defender2);
    }
    public void creatunit()
    {

        Unit newunit;
        //Defender1
        newunit= this.players.get(0).buyunit(0);
        if(this.Acceptposition(4410+newunit.position.radius,2570+newunit.position.radius))
        {
            newunit.position.x=4410;
            newunit.position.y=2570;
            this.teamunitposition.add(newunit.position);
            this.players.get(0).units.add(newunit);
            this.players.get(0).points -=newunit.unitprice;
        }
//        newunit= this.players.get(0).buyunit(1);
//        if(this.Acceptposition(4310+newunit.position.radius,2510+newunit.position.radius))
//        {
//            newunit.position.x=4310;
//            newunit.position.y=2510;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(0).units.add(newunit);
//            this.players.get(0).points -=newunit.unitprice;
//        }
        newunit= this.players.get(0).buyunit(2);
        if(this.Acceptposition(4350+newunit.position.radius,2550+newunit.position.radius))
        {
            newunit.position.x=4450;
            newunit.position.y=2550;
            this.teamunitposition.add(newunit.position);
            this.players.get(0).units.add(newunit);
            this.players.get(0).points -=newunit.unitprice;
        }
//        newunit= this.players.get(0).buyunit(3);
//        if(this.Acceptposition(4450+newunit.position.radius,2400+newunit.position.radius))
//        {
//            newunit.position.x=4450;
//            newunit.position.y=2400;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(0).units.add(newunit);
//            this.players.get(0).points -=newunit.unitprice;
//        }
        newunit= this.players.get(0).buyunit(4);
        if(this.Acceptposition(4300+newunit.position.radius,2500+newunit.position.radius))
        {
            newunit.position.x=4300;
            newunit.position.y=2500;
            this.teamunitposition.add(newunit.position);
            this.players.get(0).units.add(newunit);
            this.players.get(0).points -=newunit.unitprice;
        }
        newunit= this.players.get(0).buyunit(5);
        if(this.Acceptposition(4450+newunit.position.radius,2600+newunit.position.radius))
        {
            newunit.position.x=4450;
            newunit.position.y=2600;
            this.teamunitposition.add(newunit.position);
            this.players.get(0).units.add(newunit);
            this.players.get(0).points -=newunit.unitprice;
        }


        //Defender2
//        newunit= this.players.get(1).buyunit(0);
//        if(this.Acceptposition(4401+newunit.position.radius,2560+newunit.position.radius))
//        {
//            newunit.position.x=4401;
//            newunit.position.y=2560;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(1).units.add(newunit);
//            this.players.get(1).points -=newunit.unitprice;
//        }
        newunit= this.players.get(1).buyunit(1);
        if(this.Acceptposition(4320+newunit.position.radius,2520+newunit.position.radius))
        {
            newunit.position.x=4320;
            newunit.position.y=2520;
            this.teamunitposition.add(newunit.position);
            this.players.get(1).units.add(newunit);
            this.players.get(1).points -=newunit.unitprice;
        }
//        newunit= this.players.get(1).buyunit(6);
//        if(this.Acceptposition(4400+newunit.position.radius,2400+newunit.position.radius))
//        {
//            newunit.position.x=4400;
//            newunit.position.y=2400;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(1).units.add(newunit);
//            this.players.get(1).points -=newunit.unitprice;
//        }
        newunit= this.players.get(1).buyunit(7);
        if(this.Acceptposition(4400+newunit.position.radius,2200+newunit.position.radius))
        {
            newunit.position.x=4400;
            newunit.position.y=2200;
            this.teamunitposition.add(newunit.position);
            this.players.get(1).units.add(newunit);
            this.players.get(1).points -=newunit.unitprice;
        }
//        newunit= this.players.get(1).buyunit(9);
//        if(this.Acceptposition(4600+newunit.position.radius,2500+newunit.position.radius))
//        {
//            newunit.position.x=4600;
//            newunit.position.y=2500;
//            this.teamunitposition.add(newunit.position);
//            this.players.get(1).units.add(newunit);
//            this.players.get(1).points -=newunit.unitprice;
//        }
        newunit= this.players.get(1).buyunit(10);
        if(this.Acceptposition(4600+newunit.position.radius,2400+newunit.position.radius))
        {
            newunit.position.x=4600;
            newunit.position.y=2400;
            this.teamunitposition.add(newunit.position);
            this.players.get(1).units.add(newunit);
            this.players.get(1).points -=newunit.unitprice;
        }
        newunit= this.players.get(1).buyunit(11);
        if(this.Acceptposition(4200+newunit.position.radius,2000+newunit.position.radius))
        {
            newunit.position.x=4200;
            newunit.position.y=2000;
            this.teamunitposition.add(newunit.position);
            this.players.get(1).units.add(newunit);
            this.players.get(1).points -=newunit.unitprice;
        }
    }

    @Override
    public int numofunit() {
        return 0;
    }
}
