package Easy;


import java.util.Arrays;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180, 165, 170};

        System.out.println(Arrays.toString(sortPeople(names, heights)));

    }

    public static String[] sortPeople(String[] names, int[] heights) {

        quickSort(heights, 0, heights.length - 1, names);

        System.out.println(Arrays.toString(heights));

        return names;
    }

    public static void quickSort(int[] heights, int beggin, int end, String[] names) {
        if (beggin < end) {
            int partitionIndex = partition(heights, beggin, end, names);

            quickSort(heights, beggin, partitionIndex - 1, names);
            quickSort(heights, partitionIndex + 1, end, names);
        }
    }

    public static int partition(int[] heights, int beggin, int end, String[] names) {
        int pivot = heights[end];

        int i = beggin - 1;

        for (int j = beggin; j < end; j++) {
            if (heights[j] >= pivot) {
                i++;

                swapHeights(heights, i, j);

                swapNames(names, i, j);
            }
        }

        swapHeights(heights, i + 1, end);

        swapNames(names, i + 1, end);

        System.out.println(Arrays.toString(names));

        return i + 1;
    }

    private static void swapHeights (int[] heights, int index1, int index2) {
        int tempHeights = heights[index1];
        heights[index1] = heights[index2];
        heights[index2] = tempHeights;
    }

    private static void swapNames (String[] names, int index1, int index2) {
        String tempName = names[index1];
        names[index1] = names[index2];
        names[index2] = tempName;
    }
}
