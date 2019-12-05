package leetcode;

import org.omg.CosNaming.NameHelper;

import java.util.HashMap;

public class n_42 {


   public int rain (int[] height){
       int left = 0;
       int right = height.length-1;
       int max = 0;
       int index = 0;
       int target = 0;
       int maxleft = 0;
       int maxright = 0;

       for (int i=0;i<height.length;i++)
           if (max <= height[i]) {
               index = i;
               max = height[i];
           }

       for (int i=0;i<index;i++){
         if (height[i]<maxleft){
             target = target+maxleft-height[i];
         }else {
             maxleft = height[i];
         }


       }

       for (int i=height.length-1;i>index;i--){

           if (height[i]<maxright){
               target = target+maxright-height[i];
           }else {
               maxright = height[i];
           }

       }

        return target;
    }

    public static void main(String[] args) {


       int[] nums = {0,7,8,9,6,4,9};
       new n_42().rain(nums);


    }
}
