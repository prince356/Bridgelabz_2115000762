public class StringConcatenationComparison {

    public static long measureTime(Runnable method) {
        long start = System.nanoTime();
        method.run();
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        int[] sizes = {1_000, 10_000, 1_000_000};

        for (int size : sizes) {
            long stringTime = measureTime(() -> {
                String str = "";
                for (int i = 0; i < size; i++) {
                    str += "a";
                }
            });

            long stringBuilderTime = measureTime(() -> {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < size; i++) {
                    sb.append("a");
                }
            });

            long stringBufferTime = measureTime(() -> {
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < size; i++) {
                    sb.append("a");
                }
            });

            System.out.printf("Operations: %,d | String: %,d ns | StringBuilder: %,d ns | StringBuffer: %,d ns%n",
                    size, stringTime, stringBuilderTime, stringBufferTime);
        }
    }
}
