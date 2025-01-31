/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author kanav
 */
public class Assign2 {
    public static void main(String[] args) {
        int targetSum=6;
        int nums[] ={1, 2, 3, 4, 5, 6, 7, 8, 9,2,2,2,2,2,5,-3};
        int ans[][]= solve(targetSum,nums);
    
        for (int[] an : ans) {
            for (int i : an) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    private static int[][] solve(int targetSum, int[] nums) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   Arrays.sort(nums);
    Set<ArrayList>hs= new HashSet<>();
   ArrayList<Integer> tempList= new ArrayList<>();
  int sum=0;
  for(int first=0;first<nums.length-2;first++){
  int sec=first+1;
  int third=nums.length-1;
  
  while(sec<third){
  
  sum=nums[first]+nums[sec]+nums[third];
  
  if(sum==targetSum){ 
      
  tempList.add(nums[first]);
  tempList.add(nums[sec++]);
  tempList.add(nums[third--]);
      hs.add( new ArrayList<>(tempList));
      tempList.clear();
      
  }
   
 
  if(sum<0)sec++;
  if(sum>0)third--;
  }
  }
  int [][]tempArray= new int[hs.size()][3];
  
 int cnt=0;
 for(ArrayList<Integer>al:hs){
 
 for(int i=0;i<al.size();i++){
 tempArray[cnt][i]=al.get(i);}
 cnt+=1;
 }
 return tempArray;
  }
  
  
  
  

        
}