package src;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Task 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Task 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Task 3");
        List<String> nums = new ArrayList<>(List.of("cat","dog","cat",
                "dog","cat","dog","cat","dog","cat"));
        Set<String> uniqueWords = new HashSet<>(nums);
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        System.out.println();
    }
    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два","два",
                "три", "три", "три"));
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : strings) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}









