package test;

import test.Sample;
import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {
    @Test
    public void testAdd() {
        assertEquals(3, Sample.add(1, 2));
    }
}
