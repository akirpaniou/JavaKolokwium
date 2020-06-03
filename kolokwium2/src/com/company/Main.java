package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


    }
}

class uzytkownik {
    public String login;
    public String haslo;
    public ArrayList<ksiazkaAdresowa> KSIAZKAADRESOWA;
    public ArrayList<ustawienia> USTAWIENIA;
    public ArrayList<dzial> dzialy;
    public ArrayList<czarna_lista> CZARNALISTA;
}

class ustawienia{
    public String kolory;
    public String skroty_klawiszowe;
    public String jezyk;
    public String kodowanie;
}

class folder{
    public String nazwa;
    public ArrayList<uzytkownik> wlasciciel;
}

class mail{
    public ArrayList<uzytkownik> wlasciciel;
    public ArrayList<mail> nadawca;
    public ArrayList<mail> odbiorca;
    public String temat;
    public String tresc;
    public ArrayList<folder> fokler;
}

class czarna_lista{
    public ArrayList<mail> adresy_mail;
}

class reklama{
    public String tresc;
    public ArrayList<dzial> grupy_dedykowane;
}

class dzial{
    public String nazwa;
    public int ID;
    public String opis;
}

class ksiazkaAdresowa{
    public ArrayList<kontakt> kontakty;
}

class kontakt{
    public String imie;
    public String nazwisko;
    public ArrayList<mail> mail;
    public  ArrayList<mail> alternatywny_mail;
    public int telefonGSM;
    public int telefonDOM;
    public int telefonPRACA;
    public  String opis;
}