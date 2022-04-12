package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonExtractor {
    private final Gson gson;

    public JsonExtractor(Gson gson) {
        this.gson = gson;
    }

    public List<TimeTableLine> getTimeTable(String file) {
        TimeTableLine[] timetableLines = null;
        try {

            timetableLines = gson.fromJson(
                    new FileReader(file, StandardCharsets.UTF_8),
                    TimeTableLine[].class
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>(Arrays.asList(timetableLines));
    }

    public List<Group> getGroups(String file) {
        Group[] timetableLines = null;
        try {
            timetableLines = gson.fromJson(
                    new FileReader(file, StandardCharsets.UTF_8),
                    Group[].class
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>(Arrays.asList(timetableLines));
    }

}
