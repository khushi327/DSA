import java.util.Scanner;
class DSA1{
    public static void main(String[]args){
        int[] arr=new int[5];
        int n;
        boolean found=false;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 number in array:");
        for(int i=0;i<5;i++){
            System.out.print(" ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter number you want to find:");
        n=sc.nextInt();
        for(int i=0;i<5;i++){
            if(arr[i]==n){
                System.out.print(n+" found at "+i+" index.");
                found=true;
                break;
            }
        }
        if(!found){
                System.out.print(" not found.");
            }
        sc.close();
    }
}