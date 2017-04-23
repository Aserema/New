package com.company;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mój Komputer on 2017-04-15.
 */
public class Tablica {

    private int i,j;

    public void czytaj_dane(double [][]macierz,int rozmiar){

        Random rand = new Random();
        for(i=0;i<rozmiar;i++){
        for (j=0;j<rozmiar;j++){
            if(i==j)
                macierz[i][j]=1; ///Math.round(9*(rand.nextDouble()));
            else
                macierz[i][j]=0;
            }
            }
        }
    public void wyswietl(double[][] macierz,int rozmiar){
        for(i=0;i<rozmiar;i++){

        for (j=0;j<rozmiar;j++){

            System.out.print((int)macierz[i][j] + " ");

        }
        System.out.println();
    }
        System.out.println();

    }
    public void przetworz_dane(double[][] macierz, int rozmiar){
       double sum=0;
        for(i=0;i<rozmiar;i++){
            for (j=0;j<rozmiar;j++){
                if(i==j)
                    sum=sum+macierz[i][j];
            }
        }
        System.out.println("suma liczb na przekatnej wynosi" + (int)sum);
    }

    public void zapisz_dane_do_pliku(double[][] macierz, int rozmiar) throws IOException {


        PrintWriter zapis = new PrintWriter("tablica2.txt");

        for(i=0;i<rozmiar;i++){

            for (j=0;j<rozmiar;j++){

                zapis.print( (int)macierz[i][j]);
              //  System.out.print((int)macierz[i][j] + " ");
            }
            zapis.println();
           // System.out.println();

        }

      //  System.out.println();
        zapis.close();
    }

    public void odczyt_danych(double macierz1[][], int rozmiar) throws IOException {

        FileReader file = new FileReader("tablica2.txt");
        BufferedReader  br = new BufferedReader(file);
        Scanner in = new Scanner(file);

        for(i=0;i<rozmiar;i++){
                String zdanie = br.readLine();
                System.out.println(zdanie);
                }

       file.close();
    }


}
