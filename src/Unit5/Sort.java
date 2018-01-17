package Unit5;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入待排序整数的个数：");
        int n=s.nextInt();
        int[] a=new int[n];
        int i,j,tmp;
        System.out.println("请输入待排序的整数：");
        for (i=0;i<n;i++)
            a[i]=s.nextInt();
        for (i=0;i<n;i++){
            for (j=0;j<n-i-1;j++){ //一起冒泡排序
                if (a[j]>a[j+1]){ //交换相邻元素
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        System.out.println("排序结果:");
        for (i=0;i<n;i++)
            System.out.println(a[i]+" ");
    }
}
