package HomeWork2;

import java.util.Arrays;

public class Lesson2 {

    public static void massiv1 (int [] arr1)
    {
        for (int i = 0; i <arr1.length; i++) {
            switch (arr1[i]) {
                case 1:
                    arr1[i] = 0;
                    break;
                case 0:
                    arr1[i] = 1;
                    break;
            }
        }
    }

    public static void pustoy() {
        int[] arr1;
        arr1=new int[8];
        arr1[0]=1;
        for (int i = 1; i < arr1.length; i++) {
             arr1[i]=arr1[i-1]+3;
            }
        System.out.println(Arrays.toString(arr1));

        }
     public static void massiv3 (int arr3[]) {
        for (int i=0; i<arr3.length;i++) {
            if (arr3[i]<6) {arr3[i]*=2;}
                   }
         System.out.println((Arrays.toString(arr3)));
     }
    public static void maxmin (int arr4[]) {
        int max=arr4[0];
        int min=arr4[0];
        for (int i=1; i<arr4.length;i++) {
            if (arr4[i]<min) {min=arr4[i];}
            else { if (arr4[i]>max) {max=arr4[i];}
            }
            }

        System.out.println("max="+max+"  min="+min );

    }
    public static void diagonal() {
        int[][] arr5;
        arr5=new int[5][5];
        for (int i = 0; i < arr5.length; i++) {
            for (int j=0; j<arr5.length; j++){
                if (i==j) { arr5[i][j]=1;}
                else {arr5[i][j]=0;}
            }
            System.out.println(Arrays.toString(arr5[i]));}
    }

    public static void main (String[] args) {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        massiv1(arr);
        System.out.println((Arrays.toString(arr)));
        pustoy();
        int arr3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        massiv3(arr3);
        maxmin(arr3);
        diagonal();
    }
}
