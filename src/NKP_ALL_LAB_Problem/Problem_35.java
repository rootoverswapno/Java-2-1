package NKP_ALL_LAB_Problem;

public class Problem_35 {
    public static void main(String[] args) {
        int iterations = 100_000;

        // Test String
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";  // This creates a new String object every time
        }
        long endTime = System.nanoTime();
        long durationString = endTime - startTime;
        System.out.println("Time taken by String: " + durationString + " ns");

        // Test StringBuffer
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("a");
        }
        endTime = System.nanoTime();
        long durationStringBuffer = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + durationStringBuffer + " ns");

        // Test StringBuilder
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("a");
        }
        endTime = System.nanoTime();
        long durationStringBuilder = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + durationStringBuilder + " ns");
    }
}
