import java.util.Scanner;

public class RotasiArray {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6}; // array awal
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah langkah rotasi ke kanan (k): ");
        int k = input.nextInt();
        input.close();

        k = k % data.length; // untuk mencegah rotasi lebih dari panjang array
        reverse(data, 0, data.length - 1);
        reverse(data, 0, k - 1);
        reverse(data, k, data.length - 1);

        System.out.println("Array setelah rotasi ke kanan sebanyak " + k + " langkah:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    // Fungsi bantu untuk membalik sebagian array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
