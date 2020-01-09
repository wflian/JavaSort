/**
 * 快速排序
 * 将原问题分解为若干个规模更小，但结构与原问题相似的子问题，递归地解这些子问题，然后将这些子问题的解组合为原问题的解。
 */
public class QuickSort {

    public static void main(String a[]) {
        MyQuickSort sorter = new MyQuickSort();
        int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        sorter.sort(input);
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static class MyQuickSort {
        private int array[];
        private int length;

        public void sort(int[] inputArr) {
            if (inputArr == null || inputArr.length == 0) {
                return;
            }
            this.array = inputArr;
            length = inputArr.length;
            quickSort(0, length - 1);
        }

        private void quickSort(int lowerIndex, int higherIndex) {

            int i = lowerIndex;
            int j = higherIndex;
            // calculate pivot number, I am taking pivot as middle index number
            int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
            // Divide into two arrays
            while (i <= j) {
                /**
                 * In each iteration, we will identify a number from left side which
                 * is greater then the pivot value, and also we will identify a number
                 * from right side which is less then the pivot value. Once the search
                 * is done, then we exchange both numbers.
                 */
                while (array[i] < pivot) {
                    i++;
                }
                while (array[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    exchangeNumbers(i, j);
                    //move index to next position on both sides
                    i++;
                    j--;
                }
            }
            // call quickSort() method recursively
            if (lowerIndex < j)
                quickSort(lowerIndex, j);
            if (i < higherIndex)
                quickSort(i, higherIndex);
        }

        private void exchangeNumbers(int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }


}
