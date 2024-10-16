package studio5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import studio5.tests.ArrayMeanTestSuite;
import studio5.tests.ArraySumTestSuite;
import studio5.tests.DistanceBetweenTest;
import studio5.tests.FilledArraySumAndMeanComprehensiveTest;
import studio5.tests.FilledArrayTestSuite;
import studio5.tests.SubstituteAllTestSuite;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ DistanceBetweenTest.class, SubstituteAllTestSuite.class, ArraySumTestSuite.class,
		FilledArrayTestSuite.class, ArrayMeanTestSuite.class, FilledArraySumAndMeanComprehensiveTest.class })
public class MethodsTestSuite {
	import java.awt.Color;

	import edu.princeton.cs.introcs.StdDraw;

	public class Methods {

	    /**
	     * Draws a bullseye centered at (x, y) with the specified radius.
	     * The bullseye is composed of 4 concentric circles with alternating colors.
	     *
	     * @param x      the x-coordinate of the center of the bullseye
	     * @param y      the y-coordinate of the center of the bullseye
	     * @param radius the radius of the outermost circle
	     */
	    public static void drawBullsEye(double x, double y, double radius) {
	        // Set the pen color to red and draw the outermost circle
	        StdDraw.setPenColor(Color.RED);
	        StdDraw.filledCircle(x, y, radius);  // Outermost circle

	        // Draw a white circle 3/4 the size of the outer circle
	        StdDraw.setPenColor(Color.WHITE);
	        StdDraw.filledCircle(x, y, 0.75 * radius);

	        // Draw a blue circle 1/2 the size of the outer circle
	        StdDraw.setPenColor(Color.BLUE);
	        StdDraw.filledCircle(x, y, 0.5 * radius);

	        // Draw the innermost black circle 1/4 the size of the outer circle
	        StdDraw.setPenColor(Color.BLACK);
	        StdDraw.filledCircle(x, y, 0.25 * radius);
	    }

	    public static void main(String[] args) {
	        // Set up the canvas
	        StdDraw.setCanvasSize(600, 600);
	        StdDraw.setXscale(0, 600);
	        StdDraw.setYscale(0, 600);
	        StdDraw.enableDoubleBuffering();

	        // Draw the bullseye at the center of the canvas with a radius of 200
	        drawBullsEye(300, 300, 200);

	        // Show the drawing
	        StdDraw.show();
	    }
	}


}
