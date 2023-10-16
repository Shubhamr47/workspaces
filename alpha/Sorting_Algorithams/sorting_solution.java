package Sorting_Algorithams;

//import javax.xml.transform.Templates;

public class sorting_solution {
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn <= arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn;j++) {
                if (arr[j] > arr[j + 1]) {
                    int Temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = Temp;
                }
            }
        }
    }


    

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 3, 8, 6, 0, 2, 4, 2, 6 };
        bubbleSort(arr);
        printarr(arr);
    }
}
