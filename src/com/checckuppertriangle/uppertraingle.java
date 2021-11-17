package com.checckuppertriangle;
import java.util.Scanner;
public class uppertraingle {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] array=new int[n][n];
        int counter=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j]=scn.nextInt();
                if(i>j && array[i][j]!=0)
                {
                    counter=1;
                }
            }
        }
        if(counter==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
