package com.company;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            TimeTable timeTable = gson.fromJson(new FileReader("src/Result_200.json"), TimeTable.class);
            System.out.println(timeTable.getLines().get(0).discipline);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
