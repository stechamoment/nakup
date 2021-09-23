package com.company;

public class Main {

    public static void main(String[] args) {
        int cena = 0;
        int i = 0;
        String[] pole = new String[args.length];
        if (args[0].equals("1") || args[0].equals("2") || args[0].equals("3")) {
            while (i < args.length) {
                if (args[i].equals("1")) {
                    pole[i] = "rohlik";
                    cena = cena + 1;
                }else if (args[i].equals("2")) {
                    pole[i] = "mliko";
                    cena = cena + 10;
                }else if (args[i].equals("3")) {
                    pole[i] = "cokolada";
                    cena = cena + 30;
                }
                i++;
            }{
                i = 0;
                System.out.println("kosik:");
                while(i < args.length){
                    System.out.println(pole[i]);
                    i++;
                }
                System.out.println("cena: "+cena);
            }
        } else{
            System.out.println("1 je rohlik");
            System.out.println("2 je mliko");
            System.out.println("3 je cokolada");
        }

    }
}
