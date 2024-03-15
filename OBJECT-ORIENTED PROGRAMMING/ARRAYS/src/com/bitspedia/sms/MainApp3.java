package com.bitspedia.sms;

import java.util.Random;
import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Random random = new Random();
        //Multi-dimensional arrays
//        int nums[][] = new int[3][4];
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter number of students: ");
        n = input.nextInt();

        int nums[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            int subjectsCount = random.nextInt(10) + 1;
            nums[i] = new int[subjectsCount];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(100) + 1;
            }
        }

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int[] student : nums)
        {
            for(int marks : student)
            {
                System.out.print(marks + " ");
            }
            System.out.println();
        }
    }
}
