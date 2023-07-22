import java.util.*;
//import java.util.HashSet;
//import java.util.Set;


public class Main {
    private static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 8, 5, 6, 7, 8, 4));
    private static List<String> words = new ArrayList<>(List.of("Андрей", "Семен", "Федор",
            "Семен", "Николай", "Андрей",
            "Петр", "Иван", "Федор"));

    public static void main(String[] args) {
        System.out.println("Homework 2.6 is here!");
        System.out.println(" task1() ----------------------");
        task1();
        System.out.println("\n task2() ----------------------");
        task2();
        System.out.println("\n task3() ----------------------");
        task3();
        System.out.println("\n task4() ----------------------");
        task4();


    }

    private static void task1() {
        for (Integer e : nums) {
            if (e % 2 == 0) {
                System.out.print(e + " , ");
            }
        }
    }

    private static void task2() {
        System.out.println(" decision 1");
        List<Integer> comparativeList =  new ArrayList<>(nums);
        Collections.sort(comparativeList);
        int comparativeElement = Integer.MIN_VALUE;
        for (Integer e : comparativeList) {
            if (e % 2 == 0 && e != comparativeElement) {
                System.out.print(e + " , ");
                comparativeElement = e;
            }
        }
        System.out.println("\n decision 2");
        Set<Integer> uniqueNumbers = new TreeSet<>(nums);
        for (Integer e : uniqueNumbers) {
            if (e % 2 == 0) {
                System.out.print(e + " , ");
            }
        }
    }

    private static void task3() {
        Set<String> nameWord = new HashSet<>(words);
        System.out.println(nameWord);
        for (String e : nameWord) {
            System.out.print(e + " , ");
        }
    }

    private static void task4() {
        Set<String> nameWord = new HashSet<>(words);
        System.out.println("количество дубликатов = " + (words.size() - nameWord.size()));

    }

}