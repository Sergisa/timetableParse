package com.company;

import com.formdev.flatlaf.FlatDarkLaf;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FlatDarkLaf.install();
        JsonExtractor extractor = new JsonExtractor(new Gson());
        List<TimeTableLine> currentTimeTable = extractor.getTimeTable("src/timetable1_simple.json");
        System.out.println(extractor.getTimeTable("src/timetable1_simple.json").get(1).day);
        System.out.println(extractor.getGroups("src/groups.json").get(1).name);

        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("four 1 5 88 ");
        strings.add("five-six");

        strings.stream()
                .filter(element -> !element.contains("-"))
                .map(s -> "null")
                .forEach(System.out::println);
        System.out.println(strings);
    }
}
