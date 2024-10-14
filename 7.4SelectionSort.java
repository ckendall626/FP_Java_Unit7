class SelectionSort {
  public int getMin(int[] testarray, int j, int length) {
    int min = testarray[j];
    for (int i = j; i < length; i++) {
      if (testarray[i] < min) {
        min = testarray[i];
      }
    }
    return min;
  }

  public void swap(int[] testarray2, int i, int j) {
    int temp = testarray2[i];
    testarray2[i] = testarray2[j];
    testarray2[j] = temp;
  }

  public void sort(int[] testarray3) {
    int ive = 0;
    while (ive < testarray3.length) {
      int min2 = getMin(testarray3, ive, testarray3.length);
      for (int nj = ive; nj < testarray3.length; nj++) {
        if (testarray3[nj] == min2) {
          swap(testarray3, ive, nj);
        }
      }
      ive++;
    }

  }
}