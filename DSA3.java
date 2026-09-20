import java.util.Scanner;
class DSA3{
    public static void main(String[]args){
        int[] arr=new int[5];
        int Count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 number:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter number you want to find that how many times it appear:");
        int num =sc.nextInt();
        for(int i=0;i<5;i++){
            if(num==arr[i]){
                Count++;
            }
        }
        System.out.print(Count+" Times the "+num+" appear." );
        sc.close();
    }
}