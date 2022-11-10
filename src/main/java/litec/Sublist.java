package litec;

public class Sublist {
    /**
     * Get a sublist/array.
     * @param start The start index (inclusive).
     * @param end The end index (inclusive).
     * @return The sublist.
     */
    public static int[] subList(int[] list, int start, int end) {
        int[] subList = new int[end-start+1];
        for (int i=start; i<=end; i++) {
            subList[i-start] = list[i];
        }
        return subList;
    }
}
