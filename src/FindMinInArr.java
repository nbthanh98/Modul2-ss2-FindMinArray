import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class FindMinInArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhap size cho mang: ");
            size = scanner.nextInt();
            if( size < 0 || size > 20){
                System.out.println("nhap lai mang: ");
            }
        }while ( size <0 || size > 20);
        int arrNum[] = new int[size];
        nhapMang(arrNum);
        xuatMang(arrNum);
        int result = findMinInArr(arrNum);
        System.out.print("Min = " +result);-
    }

    public static void nhapMang(int arr[]) {
        Scanner scanner = new Scanner(System.in);
        for( int i = 0; i< arr.length; i++){
            System.out.print("Nhap gtri " + i+ ": ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int arr[]) {
        for( int i =0; i< arr.length; i++){
            System.out.print(arr[i] + "   ");
        }
    }
    public static int findMinInArr(int arr[]) {
        int min = arr[0];
        int index = 0;
        for( int i =0; i< arr.length; i++){
            if( arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return min;
    }
}
