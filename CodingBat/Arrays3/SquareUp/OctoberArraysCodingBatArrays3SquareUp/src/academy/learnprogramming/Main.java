package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(squareUp(n)));
    }
    private static int[] squareUp(int n){
        int[] nums = new int[n*n];
        int count=0,c=0,a=0,co = 0;
        outer:
        for(int i=nums.length-1;i>=0;i--){

             if(c != nums.length){
                 c++;
                 while(count!=n){

                     if(count!=(n-a)){
                         count++;
                         if(co>0){
                             nums[i]=0;
                         }else{
                             nums[i]=count;
                         }

                     }
                     else{
                         if(count<=n){
                             nums[i]=0;
                             count++;
                             co++;
                         }
                         else{
                             break;
                         }
                     }
                     continue outer;
                 }
                 co=0;
                 count = 0;
                 a++;
                 ++i;
                 --c;
             }

        }
        return nums;
    }
}
