
/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
    1. Designate a pivot position and place that value in its finl resting place arranging the rest of the values to the left or to the right depending on if they are greater or less that the pivot 
   2. Continue to recursively partition the bottom and top half of the array so long as the lowerbound is less than the upper bound 
   3. Designate a starting lower bound at 0 and a starting upper bound as the last item of the array
 *
 * 2a. Worst pivot choice / array state and associated runtime: 
 *The beginning or the end of the array O(N^2) 
 * 2b. Best pivot choice / array state and associated runtime:
 *The middle of the arra O(nlogn)
 * 3. Approach to handling duplicate values in array:
 *The algorithm places values equal to the pivot point to the right
 *****************************************************/

/***
    PROTIP: Assume no duplicates during initial development phase.
    Once you have a working implementation, test against arrays 
    with duplicate values, and revise if necessary. (Backup first.)
 ***/

public class QuickSort 
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }

    public static int partition(int[] arr, int first, int last, int pivot){
	int pivotVal = arr[pivot];
	swap(pivot, last, arr);
	int position = first;
	for (int i = first; i < last ; i++){
	    if (arr[i] < pivotVal){
		swap(position, i, arr);
		position ++;
	    }
	}
	swap(last,position, arr);
	return position;
	
    }
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    
    public static void qsort1(int[] d){
	qsortH1(d, 0, d.length-1);
    }

    public static void qsortH1(int[] d, int lower, int uppr){
	//System.out.println("==============");
	//printArr(d);
	//System.out.println("lower:" + lower);
	//System.out.println("upper:" + uppr);
	//System.out.println("=============");
	if(lower < uppr) {
	    int pivotPos = partition(d, lower, uppr, uppr);
	    qsortH(d, lower, pivotPos - 1);
	    qsortH(d, pivotPos + 1, uppr);
	}
    }
    
 
    public static void qsort2(int[] d){
	qsortH1(d, 0, d.length-1);
    }

    public static void qsortH2(int[] d, int lower, int uppr){
	//System.out.println("==============");
	//printArr(d);
	//System.out.println("lower:" + lower);
	//System.out.println("upper:" + uppr);
	//System.out.println("=============");
	if(lower < uppr) {
	    int pivotPos = partition(d, lower, uppr, (lower+uppr)/2);
	    qsortH(d, lower, pivotPos - 1);
	    qsortH(d, pivotPos + 1, uppr);
	}
    }
    

    

    // Thinkers are encouraged to roll their own subroutines.
    // Insert your auxiliary helper methods here.


    //main method for testing
    public static void main( String[] args ) 
    {
	//int[] arg = {5,4,17,9000,6};
	///System.out.println("position:" + partition(arg, 0, 4, 2));
	//printArr(arg);
	    

	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);

	qsort( arr1 );	
       	System.out.println("arr1 after qsort: " );
	printArr(arr1);

	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

       	shuffle(arrN);
       	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);


	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


	

	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	qsort( arr2 );	
       	System.out.println("arr2 after qsort: " );
	printArr(arr2);


	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);

       	shuffle(arrMatey);
       	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);

	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	
    }//end main

}//end class QuickSort

