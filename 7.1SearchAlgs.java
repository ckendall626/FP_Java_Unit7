public class SearchAlgs {
  public static int getMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++){
      if (arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }	

  public static int getAvg(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum/arr.length;
  }

  public static void testGetAvg(){
    int[] testArr = {5, 10, 2, 4, 8, 7, 13};
      if (getAvg(testArr) == 7) {
        System.out.println("Success"); 
      } else {
        System.out.println("Fail");
      }
    }
  
  public static void testGetMax() {
    int[] testArr = {5, 10, 2, 4, 8, 7, 13};
    if (getMax(testArr) == 13) {
      System.out.println("Success"); 
    } else {
      System.out.println("Fail");
    }
  }

  public static int findValue(int[] array, int value) {
    int i = 0;
    while (i < array.length){
      if (array[i] == value){
        return i;
      }
      i++;
    }
    return -1;
  }

  public static void testFindValue() {
    int[] testArr = {5, 10, 2, 4, 8, 7, 13};
    if (findValue(testArr, 13) == 6) {
      System.out.println("Success"); 
    } else {
      System.out.println("Fail");
    }
    System.out.println(findValue(testArr, 18));
  }
}