package service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestCollectionService {
    public static double getAllOddElementRemovingTime(Collection<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        long startTime = System.currentTimeMillis();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime) / 1000.0;
    }

    public static double getAllEvenElementRemovingTime(Collection<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        long startTime = System.currentTimeMillis();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime) / 1000.0;
    }


}
