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

    private static int maxMirror(int[] nums) {
        int count = 0;
        int maxCount = 0;
        int visited = -1;
        int numb = 0;
        int index = 0;
        int jVal=0;
        if (nums.length == 1) {
            count = nums.length;
        }
        outer:
        for (int i = 0; i < nums.length; i++) {

            for (int j = nums.length - 1; j >= 0; j--) {
//                if (count>1 && nums[j] == numb) {
//                    i = index;
//                    count = 0;
//                }

                if (nums[i] == nums[j] && nums[j] != visited) {
                    if ((j - 1) >= 0 && j != 0 && (i + 1) < nums.length) {
                        if (i != j && nums[i + 1] == nums[j - 1]) {
//                            if (nums[j] == numb) {
//                                i = index;
//                                count = 0;
//                            }

                            count++;
                            if (count == 1) {
                                index = i;
                                System.out.println("Index : "+index);
                                numb = nums[j];
                            }

                            continue outer;
                        } else if (i == j && nums[i + 1] == nums[j - 1]) {
                            count++;
                            continue outer;
                        }
                    }

                    if ((i - 1) >= 0 && (j + 1) < nums.length) {
                        if (nums[i - 1] == nums[j + 1]) {
                            count++;
                            nums[j] = visited;
                            nums[j + 1] = visited;
                            //continue outer;
                        }
                    }
                }

//
                if (((j-1)>=0)&&nums[j-1] == numb) {
                    i = index;
                    System.out.println("i : "+i);
                    count = 0;
                    continue outer;
                }


            }
            if (maxCount < count) {
                maxCount = count;
            }

        }
        return count;
    }
}
