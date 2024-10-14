public class BinarySearch {
  public static int binaryFindValue(int[] array, int value) {
    // code the method body here
    int min = 0;
    int max = array.length - 1;
    // while loop that keeps taking middle value and adjusting it accordingly based on if its higher or lower than the value
    while (min <= max){
      int mid = (min + max)/2;
      if (array[mid] == value){
        return mid;
      }
      else if (array[mid] < value){
        min = mid + 1;
      }
      else if (array[mid] > value){
        max = mid - 1;
      }
    }
    // if the value is not in the array
    return -1;
  }

  
  public static void testFindValue() {
    int[] testArr1 = {2, 4, 5, 7 , 8, 10, 13};
    int[] testArr2 = generateRandArray();
    testArr2[0] = -5;

    if (binaryFindValue(testArr1, 13) == 6) {
      System.out.println("Success"); 
    } else {
      System.out.println("Fail");
    }

    if (binaryFindValue(testArr1, 12) == -1) {
      System.out.println("Success"); 
    } else {
      System.out.println("Fail");
    }
    
    if (binaryFindValue(testArr2, -5) == 0) {
      System.out.println("Success"); 
    } else {
      System.out.println("Fail");
    }    
  }

  public static int[] generateRandArray() {
    int[] randArray = new int[3000];
    for (int i = 0; i < randArray.length; i++) {
      randArray[i] = (int) (Math.random() * 10000);
    }
    java.util.Arrays.sort(randArray);
    return randArray;
  }
}