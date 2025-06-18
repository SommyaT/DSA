package Easy;

/* 
public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 12, 78, 34, 89, 2};

        int largest = numbers[0]; // Assume first element is the largest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}
*/

public class LargestElement {

   public static void main(String[] args) {
    
        int[] arr = {1,2,3,4,5,6,7,9,8};

        int largestt = arr[0];
        
        for (int i=0; i<arr.length; i++){

            if(arr[i] > largestt){
                largestt = arr[i];
            }

        }

   }

}