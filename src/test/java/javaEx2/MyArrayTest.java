package javaEx2;

import javaExercise2.MyArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyArrayTest {
    @Test
    public void test1(){
        List<Integer> elements = new ArrayList<>();
        elements.add(5);
        elements.add(8);
        elements.add(12);
        elements.add(2584);
      List<Integer> list =   MyArray.map(elements,(a -> a-1));
        for (int i =0; i<elements.size();i++) {
            Integer vail= list.get(i)+1;
            if (!vail.equals(elements.get(i)));

            
        }
    }
}
