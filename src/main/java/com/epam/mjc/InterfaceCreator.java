package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            List<Integer> resultList = new ArrayList<>();
            for (Integer value : list) {
                resultList.add(value / divider);
            }
            return resultList;
        };
    }
}
