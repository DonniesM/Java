package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the outer array : ");
        int n = sc.nextInt();
        int[] outer = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<outer.length;i++){
            outer[i]=sc.nextInt();
        }
        System.out.println("Enter the number of elements in the inner array : ");
        int n1 = sc.nextInt();
        int[] inner = new int[n1];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<inner.length;i++){
            inner[i]=sc.nextInt();
        }
        System.out.println(linearIn(outer,inner));
    }

    public static boolean linearIn(int[] outer,int[] inner){
        int count = 0;
        inner:
        for(int i=0;i<inner.length;i++){
            for(int j=0;j<outer.length;j++){
                if(outer[j]==inner[i]){
                    count++;
                    continue inner;
                }
            }
        }
        if(count == inner.length){
            return true;
        }
        return false;
    }
}
