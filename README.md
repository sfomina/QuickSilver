# QuickSilver

QuickSort is our implementation of the quicksort algorithm. The explanation of the algorithm is in the java file.

MergeSortTester helps determine the runtime for quicksort.





# Analysis

The Quicksort algorithm runs a range from O(n*log(n)) to O(n^2), from best to worst case scenario. The algorithm picks a value of partition from the array, and organize the rest of the array into 2 halves: values less than the partition on the left, and values more than the partition on the right. Then, the algorithm branches out using recursion by running itself on the array on the left and the array on the right. If the target array contains only 1 item, then it leaves it as-is. The partition value isn't included in the array being recursed b/c it is alreadu in its correct position. 

In the best case scenario, the algorithm would somehow magically pick up the array's middle value and cut the array exactly in half. In this case, the cutting of the array would O(log(n)), and with a while loop in every call of the algorithm, the total runtime O(n*log(n)). 

In the worst case scenario, the algorithm would somehow pick up the array's largest/smallest value, thus dividing the array in the most skewed way possible. In this case, each cutting would leave one array of size 1 and one of size n-1, thus resulting in a total of O(n^2) runtime.

# Time Trials

We created a method testArr(int[], double, int) to populate an array of int and calculate its runtime in nanoTime based on the int type.

   type == 0 is used for calculating the avergae runtime
   type == 1 is used for calculating the best case runtime
   type == 2 is used for calculating the worst case runtime

For the test arrays, we used array sizes 1000, 1500, 2000, 3000, 4000, 5000. The main method would call on testArr and calculate the runtime, then display it.

The graph is linked below:

![Alt text](https://github.com/sfomina/QuickSilver/blob/master/graphs.png?raw=true"Graphs")