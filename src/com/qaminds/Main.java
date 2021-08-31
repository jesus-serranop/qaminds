package com.qaminds;

public class Main {

    public static void main(String[] args) {
	 //Entrenador entrenador = new Entrenador();
     //entrenador.entrenar();
       // char unicode = '\u007B';
        //int ascciValue = 146;
        //System.out.println("Unicode symbol = " + unicode);
        //System.out.println("ASCII value = " + (char)ascciValue);

        Television tv = new Television();

        Television tv2 = new Television("LG", 42, 1324.56);

        Television tv3 = new Television("Samsung", 60, 18999, "LCD");
    }
}
