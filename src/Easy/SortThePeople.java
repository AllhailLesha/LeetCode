package Easy;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0; i < heights.length; i++){
            for(int j = 0; j < heights.length - i - 1; j++){
                if(heights[j] < heights[j + 1]){
                    int tempHeights = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = tempHeights;
                    String tempNames = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempNames;
                }
            }
        }
        return names;
    }
}
