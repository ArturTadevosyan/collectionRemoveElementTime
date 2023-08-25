package service;

import java.util.Iterator;
import java.util.List;

public class TestWithSwitchCollectionService {
    public static double getByNumberTypeElementsRemovingTime(List<Integer> list, String type) {
        Iterator<Integer> iterator = list.iterator();
        long startTime = System.currentTimeMillis();
        while (iterator.hasNext()) {
            switch (type) {
                case "odd": {
                    if (iterator.next() % 2 != 0) {
                        iterator.remove();
                    }
                    break;
                }
                case "even": {
                    if (iterator.next() % 2 == 0) {
                        iterator.remove();
                    }
                    break;
                }
            }

        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime) / 1000.0;
    }
}
