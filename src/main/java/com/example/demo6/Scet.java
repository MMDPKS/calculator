package com.example.demo6;

public class Scet {

    String sl(long number,long number2,  int ns2){
        int ns;
        long fin;
        String a;


        ns = 10;
        number = Long.parseLong(Long.toString(number, ns));


        number2 = Long.parseLong(Long.toString(number2, ns));

        fin = number+ number2;
        a = (Long.toString(fin, ns2));
        return a;
    }
    String umn(long number,long number2,  int ns2){
        int ns;
        long fin;
        String a;

        ns = 10;
        number = Long.parseLong(Long.toString(number, ns));


        number2 = Long.parseLong(Long.toString(number2, ns));

        fin = number* number2;
        a = (Long.toString(fin, ns2));
        return a;
    }
    String min(long number, long number2,  int ns2){
        int ns;
        long fin;
        String a;


        ns = 10;
        number = Long.parseLong(Long.toString(number, ns));

        number2 = Long.parseLong(Long.toString(number2, ns));

        fin = number- number2;
        a = (Long.toString(fin, ns2));
        return a;
    }
    String del(long number,long number2,  int ns2){
        int ns;
        long fin;
        String a;

        ns = 10;
        number = Long.parseLong(Long.toString(number, ns));


        number2 = Long.parseLong(Long.toString(number2, ns));

        fin = number/ number2;
        a = (Long.toString(fin, ns2));
        return a;
    }
    String per1(long number,int ns2){
        String a = null;
        a = Long.toString(number, ns2);

        return a;
    }

}
