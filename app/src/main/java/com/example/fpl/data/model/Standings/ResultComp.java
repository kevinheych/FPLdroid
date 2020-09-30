package com.example.fpl.data.model.Standings;

import java.util.Comparator;

public class ResultComp implements Comparator<Results> {

    @Override
    public int compare(Results o1, Results o2) {
        if (o1.getRank() > o2.getRank()) return 1;
        else if (o1.getRank() < o2.getRank()) return  -1;
        else return 0;
    }
}
