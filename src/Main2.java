import service.TestCollectionService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        addElements(arrayList, linkedList);

        System.out.println("--------------------Before even element remove--------------------------");
        System.out.println("ArrayList size = " + arrayList.size());
        System.out.println("LinkedList size = " + linkedList.size());

        double arrayListEvenElementRemoveTime = TestCollectionService.getAllEvenElementRemovingTime(arrayList);
        double linkedListEvenElementRemoveTime = TestCollectionService.getAllEvenElementRemovingTime(linkedList);

        System.out.println("--------------------After even element remove--------------------------");
        System.out.println("ArrayList size = " + arrayList.size());
        System.out.println("LinkedList size = " + linkedList.size());

        System.out.println("----------------------------------------------");
        System.out.println("By ArrayList Remove Time  = " + arrayListEvenElementRemoveTime);
        System.out.println("By LinkedList Remove Time = " + linkedListEvenElementRemoveTime);

        arrayList.clear();
        linkedList.clear();
        addElements(arrayList, linkedList);
        System.out.println("================================================================================");

        System.out.println("--------------------Before odd element remove--------------------------");
        System.out.println("ArrayList size = " + arrayList.size());
        System.out.println("LinkedList size = " + linkedList.size());

        double arrayListOddElementRemoveTime = TestCollectionService.getAllOddElementRemovingTime(arrayList);
        double linkedListOddElementRemoveTime = TestCollectionService.getAllOddElementRemovingTime(linkedList);

        System.out.println("--------------------After odd element remove--------------------------");
        System.out.println("ArrayList size = " + arrayList.size());
        System.out.println("LinkedList size = " + linkedList.size());

        System.out.println("----------------------------------------------");
        System.out.println("By ArrayList Remove Time  = " + arrayListOddElementRemoveTime);
        System.out.println("By LinkedList Remove Time = " + linkedListOddElementRemoveTime);

    }

    public static void addElements(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int number = random.nextInt();
            arrayList.add(number);
            linkedList.add(number);
        }
    }
}
