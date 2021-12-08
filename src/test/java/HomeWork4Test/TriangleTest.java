package HomeWork4Test;

import HomeWork4.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static HomeWork4.Triangle.*;

public class TriangleTest {
    @Test
    void positiveTest() throws Exception {
        Assertions.assertEquals(Triangle.squareTriangle(3,4,5),6);

    }
    @Test
    void negativeTest(){
        Assertions.assertThrows(Exception.class, ()->Triangle.squareTriangle(-3,4,5));
    }
}
