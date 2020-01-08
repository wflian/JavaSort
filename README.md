# 概述

在计算器科学与数学中，一个排序算法（英语：Sorting algorithm）是一种能将一串数据依照特定排序方式进行排列的一种算法。本文将总结几类常用的排序算法，包括冒泡排序、选择排序、插入排序、快速排序和归并排序，分别使用Java代码实现，简要使用图例方式介绍其实现原理。

算法原理及实现

#### 1. 冒泡排序

* 原理图

![image](https://github.com/wflian/Sort/blob/master/img/img%20BubbleSort.jpeg)

* 理解

通过重复地遍历要排序的列表，比较每对相邻的项目，并在顺序错误的情况下交换它们。

#### 2、选择排序

* 原理图

![image](https://github.com/wflian/Sort/blob/master/img/img_%20InsertionSort.jpeg)

* 理解

内部循环查找下一个最小（或最大）值，外部循环将该值放入其适当的位置。

冒泡排序和选择排序的区别

```
1、冒泡排序是比较相邻位置的两个数，而选择排序是按顺序比较，找最大值或者最小值；
2、冒泡排序每一轮比较后，位置不对都需要换位置，选择排序每一轮比较都只需要换一次位置；
3、冒泡排序是通过数去找位置，选择排序是给定位置去找数。
3、插入排序
```
#### 3、插入排序

* 原理图

![image](https://github.com/wflian/Sort/blob/master/img/img_%20MergeSort.jpeg)

* 理解
每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。


#### 4、快速排序

* 原理图

![image](https://github.com/wflian/Sort/blob/master/img/img_%20QuickSort.jpeg)

* 理解

将原问题分解为若干个规模更小，但结构与原问题相似的子问题，递归地解这些子问题，然后将这些子问题的解组合为原问题的解。
#### 5、归并排序

* 原理图

![image](https://github.com/wflian/Sort/blob/master/img/img_%20SelectionSort.jpeg)

* 理解

将待排序的数列分成若干个长度为1的子数列，然后将这些数列两两合并；得到若干个长度为2的有序数列，再将这些数列两两合并；得到若干个长度为4的有序数列，再将它们两两合并；直接合并成一个数列为止。
## 常见排序算法复杂度
![image](https://github.com/wflian/Sort/blob/master/img/img_SortSummary.jpeg)
