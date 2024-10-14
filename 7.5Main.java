class Main {
  public static void main(String[] args) {
    RecursiveMethods nj = new RecursiveMethods();
    // factorial test
    System.out.println(nj.fact(6));
    // exponential test
    System.out.println(nj.exp(2, 5));
    // Palindrome test
    System.out.println(nj.isPalindrome("racecar"));
    // Merge Sort test
    int [] intlist = {8,4,10, 7, 7, 1, 100, 78, 23, 89, 12, 5, 90, -1, 99, 45};
    System.out.println("Unsorted List:");
    for (int khsp = 0; khsp < intlist.length; khsp++){
      System.out.println(intlist[khsp]);
    }
    nj.mergeSort(intlist);
    System.out.println("Sorted List:");
    for (int khsp = 0; khsp < intlist.length; khsp++){
      System.out.println(intlist[khsp]);
    }
  }
}