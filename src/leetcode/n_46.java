package leetcode;

import java.util.ArrayList;
import java.util.List;

public class n_46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        backtrack( nums,output,result ,0);
        return output;
    }
    public static void backtrack(int[] nums, List<List<Integer>> output, List<Integer> result, int index){
        if (index == nums.length){
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.addAll(result);
            output.add(arrayList);
            return;

        }else {
        for (int i=0;i<nums.length;i++){
            if (!result.contains(nums[i])){
                result.add(nums[i]);
                backtrack(nums,output,result,index+1);
                result.remove(result.size()-1);
            }
        }

        }

    }

    public static void main(String[] args) {

        int[] nums = {3,5,1};
        System.out.println(permute(nums));

    }
}
