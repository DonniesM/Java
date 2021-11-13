package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(seriesUp(n)));
    }
    private static int[] seriesUp(int n){
        int lengthN = n*(n+1)/2;
        int[] nums = new int[lengthN];
        int count = 1,k = 1,j=1;
        outer:
        for(int i=0;i<lengthN;i++){
            if(count<=k){
                while(j<=k){
                    nums[i] = j;
                    count++;
                    j++;
                    continue outer;
                }
            }
            else{
                --i;
            }
            count = 1;
            k++;
            j=1;
        }
     return nums;
    }
}
