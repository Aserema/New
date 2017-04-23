package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {




        int rozmiar = 10;
        double[][] tab = new double[rozmiar][rozmiar];
        double[][] tab1 = new double[rozmiar][rozmiar];
        Tablica tablica = new Tablica();

      tablica.czytaj_dane(tab,rozmiar);
     //   tablica.wyswietl(tab,rozmiar);
     // tablica.przetworz_dane(tab,rozmiar);
        tablica.zapisz_dane_do_pliku(tab,rozmiar);
        tablica.odczyt_danych(tab1,rozmiar);


    }
}
