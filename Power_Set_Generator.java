package Offlines;

import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.Random;
public class Power_Set_Generator {
    void Power_Set(char[] arr){
        int n = arr.length;
        long total_num = (long) Math.pow(2,n);

        System.out.println("[]");
        for(int i=0;i<total_num;i++){
            for(int j=0;j<n;j++){
                if((i & 1<<j) > 0){
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Power_Set_Generator p = new Power_Set_Generator();
        Random random = new Random();
        char[] hudai = {'1','2','3','4','5','6','7','8','9','0',
                      'a','s','d','f','g','h','j','k','l','z',
                      'x','c','v','b','n','m','q','w','e','r',
                      't','y','u','i','o','p'};

        Scanner scan = new Scanner(System.in);
        System.out.println("Give number of elements you need : ");
        int n = scan.nextInt();

        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = hudai[random.nextInt(hudai.length)];
        }

        p.Power_Set(arr);
    }
}
