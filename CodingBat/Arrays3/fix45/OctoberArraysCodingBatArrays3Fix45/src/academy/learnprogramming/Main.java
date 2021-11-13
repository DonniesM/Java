package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(fix45(a)));
    }
    private static int[] fix45(int[] nums){
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==4){
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==5){
                        if(j!=0){
                            if(nums[j-1]==4) {
                                continue;
                            }
                        }
                        temp = nums[j];
                        nums[j]=nums[i+1];
                        nums[i+1]=temp;
                    }
                }
            }
        }
        return nums;
    }
}
