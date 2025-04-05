package com.cruiser.util;

import com.cruiser.front.Student;

import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends Student & QueryItem> extends ArrayList<T>{




    public static <S extends QueryItem> List<S> getMatches(List<S> list, String fieldName, String value){
        List<S> filteredList = new ArrayList<>();
        for(S item:list){
            if (item.matchFieldValue(fieldName, value)) filteredList.add(item);
        }
        return filteredList;
    }


}
