package leetcode;

import javax.print.attribute.standard.NumberUpSupported;
import java.util.ArrayList;
import java.util.List;

public class n_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(0,nums,temp,result);
        return result;
    }
    public void backtrack(int start, int[] nums, List<Integer> list, List<List<Integer>> result){
      result.add(new ArrayList<Integer>(list));
      for (int i = start;i<nums.length;i++){
          list.add(nums[i]);
          backtrack(i+1,nums,list,result);
          list.remove(list.size()-1);

      }
    }


    public static void main(String[] args) {
      int[] nums = {1,2,3};
        System.out.println(new n_78().subsets(nums));

    }
}
