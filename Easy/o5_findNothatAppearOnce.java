package Easy;

public class o5_findNothatAppearOnce {

    /* 
    
    public static int getSingleElement(int []arr) {
        
          int numb = arr[0];
          int n = arr.length;

        for(int i=0; i<n-1; i++){
            numb = arr[i];
            int count = 0;
            for(int j=0; j<n-1; j++){
                if(numb == arr[j] ){
                    count++;
                }

                if(count == 1){
                    System.out.println(numb);
                    return numb;
                }

            }
        } return -1;

    }




public static void main(String args[]) {
    int[] arr = {4, 1, 2, 1, 2};
    int ans = getSingleElement(arr);
    System.out.println("The single element is: " + ans);
   }

}
*/

/*  Better Approach

public static int getSingleElement(int []arr) {
    //size of the array:
    int n = arr.length;

    // Find the maximum element:
    int maxi = arr[0];
    for (int i = 0; i < n; i++) {
        maxi = Math.max(maxi, arr[i]);
    }

    // Declare hash array of size maxi+1
    // And hash the given array:
    int[] hash = new int[maxi + 1];

    for (int i = 0; i < n; i++) {
        hash[arr[i]]++;
    }

    for (int i = 0; i < n; i++) {
        if (hash[arr[i]] == 1)
            return arr[i];
    }


    return -1;
}

public static void main(String args[]) {
    int[] arr = {4, 1, 2, 1, 2};
    int ans = getSingleElement(arr);
    System.out.println("The single element is: " + ans);

} */


// Best XOR

public static int getSingleElement(int []arr) {
    //size of the array:
    int n = arr.length;


    int xorr = 0;

    for( int i=0; i<n; i++){
        xorr = xorr ^ arr[i];
    }

    return xorr;

}



}