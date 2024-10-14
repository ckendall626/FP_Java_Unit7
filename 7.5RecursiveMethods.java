// for Arrays.copyOfRange
import java.util.Arrays; 

class RecursiveMethods{
  // takes an int and returns factorial using recursive methods until it reaches 0 and then multiplies them all back up
  public static int fact(int n){
    if(n == 0){
      return 1;
    }
    else{
      return (n * fact(n-1));
    }
  }
// takes 2 ints, the base and the exponent respectively, and uses a recursive method to go down powers until the power is 0 and then it multiplies them all back up
  public static int exp(int a, int n){
    if (n==0){
      return 1;
    }
    else{
      return (a * exp(a, n-1));
    }
  }

  public static Boolean isPalindrome(String ksp){ // takes string input
    int tracker = 0; // for recursive to close in on both ends
    ksp = ksp.trim(); // trim
    String compare1 = ksp.substring(0,1); // should get first letter
    String compare2 = ksp.substring((ksp.length()-1),ksp.length()); // should get last letter
    // base case
    if (ksp.length() == 1){
      return true;
    }
      // if the word is not a palindrome then this triggers
    else if (!compare1.equalsIgnoreCase(compare2)){
      return false;
    }
      // recursive method
    else {
      return (isPalindrome(ksp.substring(tracker + 1,ksp.length()-1)));
    }
  }

  public void mergeSort(int [] intlist){
    // base case when a list is length 1
    if (intlist.length == 1){
      return;
    }
    int midpoint = intlist.length/2;
    int [] intlistFirst = Arrays.copyOfRange(intlist, 0, midpoint);
    int [] intlistLast = Arrays.copyOfRange(intlist, midpoint, intlist.length);
    // recursive methods
      mergeSort(intlistFirst);
      mergeSort(intlistLast);

    // the sorting method
    merge(intlist, intlistFirst, intlistLast);
    
  }
  public void merge(int [] intlistFinal, int [] intlistFirst, int [] intlistLast){
    // tracker for main array
    int ksp = 0;
    // tracker for first half array
    int left = 0;
    // tracker for last half array
    int right = 0;

    // array sorter code. checks that until either the first half or the last half is empty, it will compare the 0th index of both arrays and place the smaller one in the first index of the main array. it will then move the tracker up by 1 and repeat the process until one of the arrays is empty
    while (left < intlistFirst.length && right < intlistLast.length){
      if (intlistFirst[left] < intlistLast[right]){
        intlistFinal[ksp] = intlistFirst[left];
        left ++;
      }
      else{
        intlistFinal[ksp] = intlistLast[right];
        right++;
      }
      // so the main array index tracker goes up no matter the outcome above
      ksp ++;
      
    }
    // just incase the lists are not even
  while (left < intlistFirst.length){
    intlistFinal[ksp] = intlistFirst[left];
    left ++;
    ksp ++;
  }
    // just incase the lists are not even
while (right < intlistLast.length){
  intlistFinal[ksp] = intlistLast[right];
  right ++;
  ksp ++;
}
}
}