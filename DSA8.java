//reverse array
import java.util.Scanner;
class DSA8{
    public static void main(String[]args){
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 elements:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Reverse of the array:");
        for(int i=4;i>=0;i--){
            System.out.print(" "+arr[i]);
        }
        sc.close();
    }
}