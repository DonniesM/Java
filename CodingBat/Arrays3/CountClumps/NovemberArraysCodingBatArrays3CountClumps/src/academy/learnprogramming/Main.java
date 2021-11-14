package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(countClumps(a));
    }

    private static int countClumps(int[] nums) {
        int count = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) < nums.length && count > 0 && nums[i] == nums[i + 1]) {
                count = 0;
                continue;
            }
            if ((i + 1) < nums.length && nums[i] == nums[i + 1]) {
                count++;
                if ((i - 1) < nums.length && (i - 1) >= 0 && nums[i - 1] == nums[i]) {
                    count = 0;
                }

                c += count;
            } else
                count = 0;
        }
        return c;
    }
}
