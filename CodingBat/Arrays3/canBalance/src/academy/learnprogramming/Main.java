package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(canBalance(a));
    }
    private static boolean canBalance(int[] nums){
        int max = Integer.MIN_VALUE;
        int index1=0,index2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                index2 = i;
                System.out.println("index2 = "+index2);
            }
            if(nums[i]>max){
                max = nums[i];
                index1 = i;
                System.out.println("index1 = "+index1);
            }

        }
        return true;
    }
}
