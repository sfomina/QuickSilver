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

    public static int[] reverseArr(int[] arr){
	int counter = 1;
	for (int i = arr.length-1 ; i >=0; i--){
	    arr[i] = counter;
	    counter ++;
	}
	return arr;
    }
    
    public static void testArr(int[] arr, double time, int type){
	double startTime ;
	double endTime;

	System.out.println("~~~~~~~~~~ARRAY n = " + arr.length + "~~~~~~~~~~~~~~");
	int counter = 0;
	while (counter<10){
	    //populate a length sized array
	    if (type == 0 || type == 1){
		int x = 0;
		while(x<arr.length){
		    arr[x] = (int) (Math.random() * 50);
		    x++;
		}
	    }
	    //System.out.println("Testing on array ");
	    //QuickSort.printArr(arr);
	    //System.out.print(" ....\n");

	    //start stopwatch
	    startTime = System.currentTimeMillis();
	    System.out.println(startTime);
	    if (type == 0 || type == 2){
	    QuickSort.qsort1(arr);
	    }
	    else if (type == 1){
		QuickSort.qsort2(arr);
	    }
	    endTime= System.currentTimeMillis();
	    System.out.println(endTime);
	    time += endTime-startTime;
	    System.out.println("Time: " + (endTime-startTime));
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
	
	double time1000 = 0;
	double time5000 = 0;
	double time2000 = 0;
	double time1500 = 0;
	double time3000 = 0;
	double time4000 = 0;
      
	//AVG CASE
	testArr(test1000, time1000, 0);
	testArr(test1500, time1500, 0);
	testArr(test2000, time2000, 0);	
	testArr(test3000, time3000, 0);
	testArr(test4000, time4000, 0);	
	testArr(test5000, time5000, 0);	
	
	System.out.println("~~~~~~~~~~~~~~AVG CASE~~~~~~~~~~~~~~~~~~");

	
	System.out.println("AVG TIME FOR n=1000:" + (time1000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=5000:" + (time5000 *1.0 / 10));		
	System.out.println("AVG TIME FOR n=2000:" + (time2000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=1500:" + (time1500 *1.0 / 10));
	System.out.println("AVG TIME FOR n=3000:" + (time3000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=4000:" + (time4000 *1.0 / 10));
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	/*
	//BEST CASE
	time1000 = 0;
	time5000 = 0;
	time2000 = 0;
	time1500 = 0;
	time3000 = 0;
	time4000 = 0;      
	
	testArr(test1000, time1000, 1);
	testArr(test1500, time1500, 1);
	testArr(test2000, time2000, 1);	
	testArr(test3000, time3000, 1);
	testArr(test4000, time4000, 1);	
	testArr(test5000, time5000, 1);	
	
	System.out.println("~~~~~~~~~~~~~~BEST CASE~~~~~~~~~~~~~~~~~~");

	
	System.out.println("AVG TIME FOR n=1000:" + (time1000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=5000:" + (time5000 *1.0 / 10));		
	System.out.println("AVG TIME FOR n=2000:" + (time2000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=1500:" + (time1500 *1.0 / 10));
	System.out.println("AVG TIME FOR n=3000:" + (time3000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=4000:" + (time4000 *1.0 / 10));		
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	//WORST CASE
	time1000 = 0;
	time5000 = 0;
	time2000 = 0;
	time1500 = 0;
	time3000 = 0;
	time4000 = 0;
	
	test1000 = reverseArr(test1000);
	test1500 = reverseArr(test1500);
	test2000 = reverseArr(test2000);
	test5000 = reverseArr(test5000);
	test4000 = reverseArr(test4000);
	test3000 = reverseArr(test3000);

	testArr(test1000, time1000, 2);
	testArr(test1500, time1500, 2);
	testArr(test2000, time2000, 2);	
	testArr(test3000, time3000, 2);
	testArr(test4000, time4000, 2);	
	testArr(test5000, time5000, 2);

	System.out.println("~~~~~~~~~~~~~~WORST CASE~~~~~~~~~~~~~~~~~~");

	
	System.out.println("AVG TIME FOR n=1000:" + (time1000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=5000:" + (time5000 *1.0 / 10));		
	System.out.println("AVG TIME FOR n=2000:" + (time2000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=1500:" + (time1500 *1.0 / 10));
	System.out.println("AVG TIME FOR n=3000:" + (time3000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=4000:" + (time4000 *1.0 / 10));
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        */
    }//end main

}//end class
