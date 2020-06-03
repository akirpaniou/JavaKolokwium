package com.company;

public class Main {

    public static void main(String[] args) {

        Kwadrat a = new Kwadrat(5);
        Trojkat b = new Trojkat(5,4,2);
        System.out.println("Powierzchnia kwadratu to " + a.obliczpowierzchnie());
        System.out.println("Powierzchnia trojkata to " + b.obliczpowierzchnie());

    }
}

interface ksztalt {
    double obliczpowierzchnie();
    double obliczobwod();
}
class Kwadrat implements ksztalt {
    double dlugoscboku;
    public Kwadrat(double dlugoscboku){
        this.dlugoscboku=dlugoscboku;
    }
    public double obliczpowierzchnie(){
        return dlugoscboku * dlugoscboku;
    }
    public double obliczobwod(){
        return dlugoscboku * 4;
    }
}
class Trojkat implements ksztalt {

    double bokA;
    double bokB;
    double bokC;

    public Trojkat(double bokA, double bokB, double bokC){
        this.bokA=bokA;
        this.bokB=bokB;
        this.bokC=bokC;
    }
    public double obliczpowierzchnie(){
        return Math.sqrt(((bokA+bokB+bokC) / 2) * (((bokA+bokB+bokC) / 2)-bokA) * (((bokA+bokB+bokC) / 2)-bokB) * (((bokA+bokB+bokC) / 2)-bokC));
    }
    public double obliczobwod(){
        return bokA+bokB+bokC;
    }
}