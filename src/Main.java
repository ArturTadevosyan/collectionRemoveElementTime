import service.TestWithSwitchCollectionService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        addElements(arrayList, linkedList);

        System.out.println("--------------------Before odd element remove--------------------------");
        System.out.println("ArrayList size = " + arrayList.size());
        System.out.println("LinkedList size = " + linkedList.size());
        double arrayListOddElementRemoveTime = TestWithSwitchCollectionService.getByNumberTypeElementsRemovingTime(arrayList, "odd");
        double linkedListOddElementRemoveTime = TestWithSwitchCollectionService.getByNumberTypeElementsRemovingTime(linkedList, "odd");
        System.out.println("--------------------After odd element remove--------------------------");
        System.out.println("ArrayList size = " + arrayList.size());
        System.out.println("LinkedList size = " + linkedList.size());
        System.out.println("----------------------------------------------");
        System.out.println("By ArrayList Remove Time  = " + arrayListOddElementRemoveTime);
        System.out.println("By LinkedList Remove Time = " + linkedListOddElementRemoveTime);

        arrayList.clear();
        linkedList.clear();
        addElements(arrayList, linkedList);
        System.out.println("================================================================================");

        System.out.println("--------------------Before even element remove--------------------------");
        System.out.println("ArrayList size = " + arrayList.size());
        System.out.println("LinkedList size = " + linkedList.size());
        double arrayListEvenElementRemoveTime = TestWithSwitchCollectionService.getByNumberTypeElementsRemovingTime(arrayList, "even");
        double linkedListEvenElementRemoveTime = TestWithSwitchCollectionService.getByNumberTypeElementsRemovingTime(linkedList, "even");
        System.out.println("--------------------After even element remove--------------------------");
        System.out.println("ArrayList size = " + arrayList.size());
        System.out.println("LinkedList size = " + linkedList.size());
        System.out.println("----------------------------------------------");
        System.out.println("By ArrayList Remove Time  = " + arrayListEvenElementRemoveTime);
        System.out.println("By LinkedList Remove Time = " + linkedListEvenElementRemoveTime);
    }

    public static void addElements(Collection<Integer> list1, Collection<Integer> list2) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int number = random.nextInt();
            list1.add(number);
            list2.add(number);
        }
    }
}
