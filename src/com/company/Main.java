package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         *Англиcче алфавитти жана сандарды файлга жазыныз
         * A a
         * B b
         * C c
         * ...
         * ...
         * Z z
         * 0
         * 1
         * 2
         * ...
         * 9
         * Кайра эле ошол файлдан анын ичиндеги маалыматты окуп консольго чыгарышыныз керек
         * 1: A a
         * 2: B b
         * ...
         * ...
         * 26: Z z
         * 27: 0
         * 28: 1
         * ...
         * ...
         * 36: 9
         */
        try (FileWriter writer = new FileWriter("alfavit.text")) {
            writer.write("Aa Bb Cc Dd Ee Ff Gg Hh \n" +
                              "Ii Kk Ll Mm Nn Oo Pp \n" +
                              "Rr Ss Tt Uu Vv Ww Xx Yy Zz \n");
            writer.write("0 1 2 3 4 5 6 7 8 9 ");
        } catch (IOException e) {
            System.out.println("jklgjk");
        }
       try (FileReader reader = new FileReader("alfavit.text")){
           Scanner scanner = new Scanner(reader);
           while (scanner.hasNextLine()){
               System.out.println(scanner.nextLine());
           }



       }catch (IOException e){
           System.out.println("flkgjildkf");
       }
    }
}