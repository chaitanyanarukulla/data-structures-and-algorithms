package LeftJoin;

import java.util.HashMap;

public class LeftJoin {
    public HashMap<String,String> LeftJoin(HashMap<String,String> inputOne,HashMap<String, String> inputTwo) {
        inputTwo.forEach((key, value) -> inputOne.merge( key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + "," + v2));
        return inputOne;
    }
}
