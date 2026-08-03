import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DemoTest {

    // Valid triangle (scalene)
    @Test
    public void testValidTriangle() {
        assertTrue(Demo.isTriangle(3, 4, 5));
    }

    // Valid equilateral triangle
    @Test
    public void testEquilateralTriangle() {
        assertTrue(Demo.isTriangle(5, 5, 5));
    }

    // Valid isosceles triangle
    @Test
    public void testIsoscelesTriangle() {
        assertTrue(Demo.isTriangle(5, 5, 8));
    }

    // Boundary case: sum of two sides equals the third
    @Test
    public void testBoundaryTriangle() {
        assertFalse(Demo.isTriangle(1, 2, 3));
    }

    // Invalid triangle
    @Test
    public void testInvalidTriangle() {
        assertFalse(Demo.isTriangle(1, 2, 5));
    }

    // Zero-length side
    @Test
    public void testZeroSide() {
        assertFalse(Demo.isTriangle(0, 4, 5));
    }

    // Negative-length side
    @Test
    public void testNegativeSide() {
        assertFalse(Demo.isTriangle(-1, 4, 5));
    }

    // Test the main() method with valid input
    @Test
    public void testMainValidTriangle() {
        String input = "3\n4\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Demo.main(new String[]{});

        assertTrue(output.toString().contains("This is a triangle"));
    }

    // Test the main() method with invalid input
    @Test
    public void testMainInvalidTriangle() {
        String input = "1\n2\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Demo.main(new String[]{});

        assertTrue(output.toString().contains("This is not a triangle"));
    }@Test
public void testAllZeroSides() {
    assertFalse(Demo.isTriangle(0, 0, 0));
}

@Test
public void testDecimalTriangle() {
    assertTrue(Demo.isTriangle(2.5, 3.5, 4.5));
}

@Test
public void testLargeTriangle() {
    assertTrue(Demo.isTriangle(1000, 1000, 1000));
}

@Test
public void testAnotherBoundary() {
    assertFalse(Demo.isTriangle(5, 10, 15));
}
}