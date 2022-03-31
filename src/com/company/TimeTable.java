package com.company;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TimeTable {
    @SerializedName("timetable")
    List<TimeTableLine> lines;

    public TimeTable(List<TimeTableLine> lines) {
        this.lines = lines;
    }

    public List<TimeTableLine> getLines() {
        return lines;
    }
}
