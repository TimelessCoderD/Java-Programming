import java.util.ArrayList;

public class ArrayListFunctions {

    public static void main(String[] args) {

        // 1. Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // 2. add()
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("After add(): " + list);


        // 3. add(index, value)
        list.add(1, 15);

        System.out.println("After add(index, value): " + list);


        // 4. get(index)
        int value = list.get(2);

        System.out.println("get(2): " + value);


        // 5. set(index, value)
        list.set(2, 25);

        System.out.println("After set(2, 25): " + list);


        // 6. size()
        System.out.println("Size: " + list.size());


        // 7. contains()
        System.out.println("Contains 20: " + list.contains(20));
        System.out.println("Contains 100: " + list.contains(100));


        // 8. indexOf()
        System.out.println("Index of 20: " + list.indexOf(20));


        // 9. lastIndexOf()
        list.add(20);

        System.out.println("List: " + list);
        System.out.println("Last index of 20: " + list.lastIndexOf(20));


        // 10. remove(index)
        list.remove(1);

        System.out.println("After remove(1): " + list);


        // 11. remove(Integer.valueOf(value))
        list.remove(Integer.valueOf(20));

        System.out.println("After removing value 20: " + list);


        // 12. isEmpty()
        System.out.println("Is empty: " + list.isEmpty());


        // 13. Traversal using normal for loop
        System.out.println("Normal for loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        // 14. Traversal using enhanced for loop
        System.out.println("Enhanced for loop:");

        for (int num : list) {
            System.out.println(num);
        }


        // 15. clear()
        list.clear();

        System.out.println("After clear(): " + list);


        // 16. isEmpty() after clear
        System.out.println("Is empty after clear: " + list.isEmpty());
    }
}