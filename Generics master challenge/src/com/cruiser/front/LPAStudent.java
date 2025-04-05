package com.cruiser.front;

import java.util.Comparator;

public class LPAStudent extends Student{
    private Double percentComplete;
    public LPAStudent() {
        percentComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    public Double getPercentComplete() {
        return percentComplete;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        if (fieldName.equalsIgnoreCase("PERCENTCOMPLETE")) return (percentComplete <= Double.parseDouble(value));
        return super.matchFieldValue(fieldName, value);
    }
}

class StudentComparator implements Comparator<LPAStudent> {

    @Override
    public int compare(LPAStudent o1, LPAStudent o2) {
        return o1.getPercentComplete().compareTo(o2.getPercentComplete());
    }
}









