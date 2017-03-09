/*======================================
  class MergeSortTester

  ALGORITHM: 
  - will return input arr if length is equal to 1
  - splits the input array into half, until the length of the parts is 1
  - at this point, it will merge the adjacent parts that were split together so that the 
    resulting array is sorted
  - when all the parts are merged successfully, the resulting array will be sorted

  BIG-OH CLASSIFICATION OF ALGORITHM: nlog(n)
 

  Mean execution times for dataset of size n:
  Batch size:10
  n=1       time: 
  n=10      time: 
  n=50      time: 
  n=100     time: 
  n=1000    time: 

  ANALYSIS:
  Because merge sort invovles an array continually dividing itself in 2 untill it reaches arrays of length one it xontains O(logn) run time. However, since each merge operation is done in linear time, as a whole merge sorts is O(nlogn). It must be noted that the actual splitting of an array is done in constant run time. 
    
  ======================================*/

public class MergeSortTester 
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
      

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("~~~~~~~~~~ARRAY n=1000~~~~~~~~~~~~~~");
	int counter = 0;
	while (counter<9){
	    //populate a 1000 item array
	    int x = 0;
	    while(x<1000){
		test1000[x] = (int) (Math.random() * 50);
		x++;
	    }
	    System.out.println("Testing on array ");
	    MergeSort.printArray(test1000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    MergeSort.sort(test1000);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time1000 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("~~~~~~~~~~ARRAY n=5000~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 5000 item array
	    int p = 0;
	    while(p<5000){
		test5000[p] = (int) (Math.random() * 50);
		p++;
	    }
	    System.out.println("Testing on array ");
	    MergeSort.printArray(test5000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    MergeSort.sort(test5000);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time5000 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

       	System.out.println("~~~~~~~~~~ARRAY n=1500~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 1500 item array
	    int y = 0;
	    while(y<1500){
		test1500[y] = (int) (Math.random() * 50);
		y++;
	    }
	    System.out.println("Testing on array ");
	    MergeSort.printArray(test1500);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    MergeSort.sort(test1500);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time1500 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("~~~~~~~~~~ARRAY n=2000~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 2000 item array
	    int z = 0;
	    while(z<2000){
		test2000[z] = (int) (Math.random() * 50);
		z++;
	    }
	    System.out.println("Testing on array ");
	    MergeSort.printArray(test2000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    MergeSort.sort(test2000);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time2000 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("~~~~~~~~~~ARRAY n=3000~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 3000 item array
	    int q = 0;
	    while(q<3000){
		test3000[q] = (int) (Math.random() * 1000);
		q++;
	    }
	    System.out.println("Testing on array ");
	    MergeSort.printArray(test3000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    MergeSort.sort(test3000);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time3000 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println("~~~~~~~~~~ARRAY n=4000~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 4000 item array
	    int q = 0;
	    while(q<4000){
		test4000[q] = (int) (Math.random() * 1000000);
		q++;
	    }
	    System.out.println("Testing on array ");
	    MergeSort.printArray(test4000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    MergeSort.sort(test4000);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time4000 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	
	System.out.println("AVG TIME FOR n=1000:" + (time1000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=5000:" + (time5000 *1.0 / 10));		
	System.out.println("AVG TIME FOR n=2000:" + (time2000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=1500:" + (time1500 *1.0 / 10));
	System.out.println("AVG TIME FOR n=3000:" + (time3000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=4000:" + (time4000 *1.0 / 10));		
	/*
	System.out.println("Standard nlogn time when n is 9");
	System.out.println("Time merge sort takes to sort array of length 9");
	System.out.println("\n\n\n");
	System.out.println("Unsorted array len 9 : " + time(test1));
	System.out.println("Sorted array len 9 : " + time(test2));
	*/
    }//end main

}//end class
