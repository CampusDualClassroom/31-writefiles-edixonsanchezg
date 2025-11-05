package com.campusdual.classroom;

import com.campusdual.Utils;

import java.io.FileWriter;
import java.io.IOException;

public class Exercise {

    public static void main(String[] args) {

    }

    public static String generateStringToSave(String string) {
        if (string == null) {
            return generateUserInputToSave();
        }
        return string;

    }

    private static String generateUserInputToSave(){
        StringBuilder sb = new StringBuilder();
        System.out.println("Escribe debajo el texto que quieras. Pulsa \"ENTER\" 2 veces seguidas para finalizar:");
        String string;
        while(!(string = Utils.string()).isEmpty()){
            sb.append(string).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void printToFile(String string) {
        try (FileWriter fw = new FileWriter("src/main/resources/data.txt")) {
            fw.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
