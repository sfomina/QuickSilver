/*======================================
  class QuickSortTester

  ALGORITHM: 
 

  BIG-OH CLASSIFICATION OF ALGORITHM: 
  BEST CASE 
  WORST CASE
 

  Mean execution times for dataset of size n:
  Batch size:10
  n=1       time: 
  n=10      time: 
  n=50      time: 
  n=100     time: 
  n=1000    time: 

  ANALYSIS:
   
    
  ======================================*/

public class QuickSortTester 
{

    /******************************
     Creates 10 arrays of 1,10,50,100,and 1000 items and finds the avg time in miliseconds it takes to complete a merge sort, printing out a trace diagram for each test case.
     ******************************/

    public static long time(int[] arr){
	MergeSort runner = new MergeSort();
	long time = System.nanoTime();
	runner.sort(arr);
	time = System.nanoTime() - time;
	return time;
    }
    
    public static void testArr(int[] arr, double time, int type){
		System.out.println("~~~~~~~~~~ARRAY n = " + length + "~~~~~~~~~~~~~~");
	int counter = 0;
	while (counter<10){
	    //populate a length sized array
	    int x = 0;
	    while(x<arr.length){
		arr[x] = (int) (Math.random() * 50);
		x++;
	    }
	    System.out.println("Testing on array ");
	    QuickSort.printArr(arr);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    if (type == 0){
	    QuickSort.qsort1(arr);
	    }
	    else if (type == 1){
		QuickSort.qsort2(arr);
	    }
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static void main( String[] args ) 
    {
	int[] test1000= new int [1000];
	int[] test1500 = new int [1500];
	int[] test2000 = new int [2000];
	int[] test5000 = new int [5000];
	int[] test4000 = new int[4000];
	int[] test3000 = new int[3000];
	
	double a = 0;
	double b = 0;
	double time1000 = 0;
	double time5000 = 0;
	double time2000 = 0;
	double time1500 = 0;
	double time3000 = 0;
	double time4000 = 0;
      
	//WORST CASE PIVOT POS
	testArr(test1000, time1000, 
	
	
	System.out.println("~~~~~~~~~~~~~~WORST PIVOT POS~~~~~~~~~~~~~~~~~~");

	
	System.out.println("AVG TIME FOR n=1000:" + (time1000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=5000:" + (time5000 *1.0 / 10));		
	System.out.println("AVG TIME FOR n=2000:" + (time2000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=1500:" + (time1500 *1.0 / 10));
	System.out.println("AVG TIME FOR n=3000:" + (time3000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=4000:" + (time4000 *1.0 / 10));		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	/*
	System.out.println("Standard nlogn time when n is 9");
	System.out.println("Time merge sort takes to sort array of length 9");
	System.out.println("\n\n\n");
	System.out.println("Unsorted array len 9 : " + time(test1));
	System.out.println("Sorted array len 9 : " + time(test2));
	*/
    }//end main

}//end class
