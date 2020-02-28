package com.bridgelabz.logicalprograms.utils;

/**
 *  The {@code StopWatch} data type is for measuring
 *  the time that elapses between the start and end of a
 *  programming task (wall-clock time).
 *
 *  See {@link StopwatchCPU} for a version that measures CPU time.
 *
 *  @author cherry
 *  @author cherry
 */

public class Stopwatch {
	
	    private final long end;

	    /**
	     * Initializes a new StopWatch.
	     */
	    public Stopwatch(int endTime) {
	        end = endTime;
	    } 


	    /**
	     * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
	     *
	     * @return elapsed CPU time (in seconds) since the stopwatch was created
	     */
	    public double elapsedTime() {
	        long start = System.currentTimeMillis();
	        return (end - start) / 1000.0;
	    }
	    /**
	     * Unit tests the {@code StopWatch} data type.
	     * Takes a command-line argument {@code n} and computes the 
	     * sum of the square roots of the first {@code n} positive integers,
	     * first using {@code Math.sqrt()}, then using {@code Math.pow()}.
	     * It prints to standard output the sum and the amount of time to
	     * compute the sum. Note that the discrete sum can be approximated by
	     * an integral - the sum should be approximately 2/3 * (n^(3/2) - 1).
	     *
	     * @param args the command-line arguments
	     */
//	    public static void main(String[] args) {
//	        int n = Integer.parseInt(args[0]);
//
//	        // sum of square roots of integers from 1 to n using Math.sqrt(x).
//	        Stopwatch timer1 = new Stopwatch();
//	        double sum1 = 0.0;
//	        for (int i = 1; i <= n; i++) {
//	            sum1 += Math.sqrt(i);
//	        }
//	        double time1 = timer1.elapsedTime();
//	        System.out.printf("%e (%.2f seconds)\n", sum1, time1);
//
//	        // sum of square roots of integers from 1 to n using Math.pow(x, 0.5).
//	        Stopwatch timer2 = new Stopwatch();
//	        double sum2 = 0.0;
//	        for (int i = 1; i <= n; i++) {
//	            sum2 += Math.pow(i, 0.5);
//	        }
//	        double time2 = timer2.elapsedTime();
//	        System.out.printf("%e (%.2f seconds)\n", sum2, time2);
//	    }
	} 

