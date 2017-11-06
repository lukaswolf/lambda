package javaExercise2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArray {
    public static List<Integer> map(List<Integer> list, SimpleOperation lambda){
        List<Integer> result =new LinkedList<>();
        for (Integer integer : list) {
            result.add(lambda.f(integer));

        }


        return result;
    }
}
