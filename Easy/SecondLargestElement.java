package Easy;
public class SecondLargestElement {
    

  

  public static void main(String[] args) {

   int[] numbers = {23, 45, 12, 78, 34, 89, 2};

   int largest = -1; 
   int slargest = -1 ;

   for (int i=1; i<= numbers.length-1 ; i++){

   
    if( numbers[i] > largest){
       largest = numbers[i];
    }
    if( numbers[i-1] < largest && numbers[i-1]> slargest){
      slargest = numbers[i-1];
    }


   }



  }

}
/*
REAL ANSWER

 * int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;

for (int number : numbers) {
    if (number > largest) {
        // New largest found
        secondLargest = largest;
        largest = number;
    } else if (number > secondLargest && number < largest) {
        // New second largest found
        secondLargest = number;
    }
}

 * 
 */