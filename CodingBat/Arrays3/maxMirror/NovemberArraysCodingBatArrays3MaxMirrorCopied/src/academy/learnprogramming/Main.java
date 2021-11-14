package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array :");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(maxMirror(a));

    }
    public static int maxMirror(int[] nums) {
        int maxReverse = 0;
        int countReverse = 0;

        for (int i = 0; i < nums.length; i++) {
            countReverse = 0;
            for (int j = nums.length - 1; i + countReverse < nums.length && j >= 0; j--) {
                if (nums[i + countReverse] == nums[j]) {
                    countReverse++;
                } else {
                    if (countReverse > 0) {
                        maxReverse = Math.max(maxReverse, countReverse);
                        j += countReverse;
                        countReverse = 0;
                    }
                }
            }
            maxReverse = Math.max(maxReverse, countReverse);
        }

        return maxReverse;
    }
}
