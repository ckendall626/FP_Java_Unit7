class Main {
  public static void main(String[] args) {
    int numbers[] = {11,4, 3, 3, 10, 33,9,5,5, -1, 100, 0, 11};
    SelectionSort nj = new SelectionSort();
    //System.out.println(nj.getMin(numbers, 0, 5));
    //nj.swap(numbers, 0, 1);
    nj.sort(numbers);
    for(int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }
  }
}