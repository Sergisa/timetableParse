package com.company;

import java.util.*;

public class ArrayListManipulator {
    private List<String> stringList;

    public ArrayListManipulator(List<String> stringList) {
        this.stringList = stringList;
    }

    public ArrayListManipulator filter(Decision<String> decision) {
        List<String> newList = new ArrayList<>();
        for (String currentString : stringList) {
            if (!decision.make(currentString)) {
                newList.add(currentString);
            }
        }
        stringList = newList;
        return this;
    }

    public ArrayListManipulator map(Replacer<String> replacer) {
        List<String> newList = new ArrayList<>();
        for (String currentString : stringList) {
            newList.add(replacer.replace(currentString));
        }
        stringList = newList;
        return this;
    }

    public boolean hasAny(String s){
        return stringList.contains(s);
    }

    public List<String> getStringList() {
        return stringList;
    }
}
