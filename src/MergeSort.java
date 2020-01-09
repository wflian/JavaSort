/**
 * 归并排序
 * 将待排序的数列分成若干个长度为1的子数列，然后将这些数列两两合并；得到若干个长度为2的有序数列，再将这些数列两两合并；得到若干个长度为4的有序数列，再将它们两两合并；直接合并成一个数列为止。
 */
public class MergeSort {

    public static void main(String a[]) {

        int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
        MyMergeSort mms = new MyMergeSort();
        mms.sort(inputArr);
        for (int i : inputArr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static class MyMergeSort {
        private int[] array;
        private int[] tempMergArr;
        private int length;

        public void sort(int inputArr[]) {
            this.array = inputArr;
            this.length = inputArr.length;
            this.tempMergArr = new int[length];
            doMergeSort(0, length - 1);
        }

        private void doMergeSort(int lowerIndex, int higherIndex) {

            if (lowerIndex < higherIndex) {
                int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
                // Below step sorts the left side of the array
                doMergeSort(lowerIndex, middle);
                // Below step sorts the right side of the array
                doMergeSort(middle + 1, higherIndex);
                // Now merge both sides
                mergeParts(lowerIndex, middle, higherIndex);
            }
        }

        private void mergeParts(int lowerIndex, int middle, int higherIndex) {

            for (int i = lowerIndex; i <= higherIndex; i++) {
                tempMergArr[i] = array[i];
            }
            int i = lowerIndex;
            int j = middle + 1;
            int k = lowerIndex;
            while (i <= middle && j <= higherIndex) {
                if (tempMergArr[i] <= tempMergArr[j]) {
                    array[k] = tempMergArr[i];
                    i++;
                } else {
                    array[k] = tempMergArr[j];
                    j++;
                }
                k++;
            }
            while (i <= middle) {
                array[k] = tempMergArr[i];
                k++;
                i++;
            }
        }
    }
}
