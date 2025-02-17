import java.util.*;

public class DataStructureComparison {

    public static long measureTime(Runnable method) {
        long start = System.nanoTime();
        method.run();
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        int[] sizes = {1_000, 100_000, 1_000_000};
        Random random = new Random();

        for (int size : sizes) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(size * 10);
            }

            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i : array) {
                hashSet.add(i);
                treeSet.add(i);
            }

            int searchElement = random.nextInt(size * 10);

            long arraySearchTime = measureTime(() -> {
                for (int i = 0; i < size; i++) {
                    if (array[i] == searchElement) {
                        break;
                    }
                }
            });

            long hashSetSearchTime = measureTime(() -> {
                hashSet.contains(searchElement);
            });

            long treeSetSearchTime = measureTime(() -> {
                treeSet.contains(searchElement);
            });

            System.out.printf("Dataset Size: %,d | Array Search: %,d ns | HashSet Search: %,d ns | TreeSet Search: %,d ns%n", 
                    size, arraySearchTime, hashSetSearchTime, treeSetSearchTime);
        }
    }
}
