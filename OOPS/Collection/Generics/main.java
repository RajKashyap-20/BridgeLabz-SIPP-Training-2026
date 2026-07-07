//package OOPS.Collection.Generics;
//// 1. Generic Pair<T, U> Class
//class Pair<T, U> {
//    private final T first;
//    private final U second;
//
//    public Pair(T first, U second) {
//        this.first = first;
//        this.second = second;
//    }
//
//    public T getFirst() { return first; }
//    public U getSecond() { return second; }
//}
//
//// 2. Generic Stack<T> Class
//import java.util.EmptyStackException;
//import java.util.LinkedList;
//
//class Stack<T> {
//    private final LinkedList<T> list = new LinkedList<>();
//
//    public void push(T item) {
//        list.addFirst(item);
//    }
//
//    public T pop() {
//        if (isEmpty()) throw new EmptyStackException();
//        return list.removeFirst();
//    }
//
//    public boolean isEmpty() {
//        return list.isEmpty();
//    }
//}
//
//// 3. Generic Method with Bounded Type Parameter
//class ArrayUtils {
//    public static <T extends Comparable<T>> T findMax(T[] arr) {
//        if (arr == null || arr.length == 0) return null;
//        T max = arr[0];
//        for (T item : arr) {
//            if (item.compareTo(max) > 0) {
//                max = item;
//            }
//        }
//        return max;
//    }
//}
//
//// 4. Generic Repository<T> for Entities
//import java.util.ArrayList;
//import java.util.List;
//
//class Repository<T> {
//    private final List<T> data = new ArrayList<>();
//
//    public void add(T entity) {
//        data.add(entity);
//    }
//
//    public List<T> getAll() {
//        return new ArrayList<>(data);
//    }
//}
//
//// 5. Unbounded Wildcard List<?> Utility Method
//class ListUtility {
//    public static void printList(List<?> list) {
//        for (Object item : list) {
//            System.out.print(item + " ");
//        }
//        System.out.println();
//    }
//}
//
//public class main {
//    public static void main(String[] args) {
//        Pair<String, Integer> pair = new Pair<>("Age", 25);
//        System.out.println("Pair: " + pair.getFirst() + " -> " + pair.getSecond());
//
//
//        Stack<String> names = new Stack<>();
//        names.push("Alice");
//        names.push("Bob");
//        System.out.println("Popped from Stack: " + names.pop());
//
//        Integer[] numbers = {3, 9, 5, 1, 7};
//        System.out.println("Max Integer: " + ArrayUtils.findMax(numbers));
//
//        Repository<String> userRepo = new Repository<>();
//        userRepo.add("Admin");
//        userRepo.add("Guest");
//
//        System.out.print("Repository Contents: ");
//        ListUtility.printList(userRepo.getAll());
//    }
//}
//
