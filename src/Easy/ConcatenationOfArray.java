package Easy;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for(int j = 0; j < 2; j++){
            if(j == 0){
                for(int ansFirst = 0; ansFirst < nums.length; ansFirst++){
                    ans[ansFirst] = nums[ansFirst];
                }
            } if(j == 1){
                for(int ansSecond = 0; ansSecond < nums.length; ansSecond++){
                    ans[ansSecond + nums.length] = nums[ansSecond];
                }
            }
        }
        return ans;
    }
}
