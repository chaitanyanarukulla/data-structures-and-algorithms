package LeftJoin;

import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {
    public static ArrayList<Object> leftJoin(HashMap<String, String> leftHashMap, HashMap<String, String> rightHashMap) {
        ArrayList<Object> outPut = new ArrayList<>();
        for (String key: leftHashMap.keySet()) {
            ArrayList<String> temporaryArrayList = new ArrayList<String>();
            temporaryArrayList.add(key);
            temporaryArrayList.add(leftHashMap.get(key));
            temporaryArrayList.add(rightHashMap.get(key));
            outPut.add(temporaryArrayList);
        }
        return outPut;
    }
}

