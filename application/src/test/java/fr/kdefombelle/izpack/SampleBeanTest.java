package fr.kdefombelle.izpack;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit test for izpack bean.
 */
public class SampleBeanTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Test
    public void testNullParameter() {
        exception.expect(IllegalArgumentException.class);
        new SampleApplicationBean(null);
    }

    @Test
    public void testCorrectParameter() {
        new SampleApplicationBean("test");
    }
}
