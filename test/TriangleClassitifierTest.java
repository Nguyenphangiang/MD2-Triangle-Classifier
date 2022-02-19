import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassitifierTest {
    @Test
    void testEquilateralTriangle(){
        TriangleClassitifier t = new TriangleClassitifier(2,2,2);
        int expected = 2;
        int result = t.checkTypeTriangle();
        assertEquals(expected,result);
    }@Test
    void testIsoscelesTriangle(){
        TriangleClassitifier t = new TriangleClassitifier(2,2,3);
        int expected = 1;
        int result = t.checkTypeTriangle();
        assertEquals(expected,result);
    }@Test
    void testTriangle(){
        TriangleClassitifier t = new TriangleClassitifier(3,4,5);
        int expected = 0;
        int result = t.checkTypeTriangle();
        assertEquals(expected,result);
    }@Test
    void testNotTriangle(){
        TriangleClassitifier t = new TriangleClassitifier(8,2,3);
        int expected = -1;
        int result = t.checkTypeTriangle();
        assertEquals(expected,result);
    }@Test
    void testNotTriangle1(){
        TriangleClassitifier t = new TriangleClassitifier(-1,2,1);
        int expected = -1;
        int result = t.checkTypeTriangle();
        assertEquals(expected,result);
    }@Test
    void testNotTriangle2(){
        TriangleClassitifier t = new TriangleClassitifier(0,1,1);
        int expected = -1;
        int result = t.checkTypeTriangle();
        assertEquals(expected,result);
    }
}