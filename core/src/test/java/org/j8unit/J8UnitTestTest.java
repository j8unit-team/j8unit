package org.j8unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.rules.ExpectedException.none;
import org.junit.AssumptionViolatedException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class J8UnitTestTest {

    @Rule
    public ExpectedException thrown = none();

    @Test
    public void testFunctionalInterfaceStyle() {
        final J8UnitTest<String> t = String::new;
        final String sut = t.createNewSUT();
        assertNotNull(sut);
        assertEquals("", sut);
    }

    @Test
    public void testRuntimeExceptionFailure() {
        this.thrown.expect(NullPointerException.class);
        this.thrown.expectMessage("Intended runtime failure!");

        final J8UnitTest<String> t = () -> {
            throw new NullPointerException("Intended runtime failure!");
        };
        t.createNewSUT();
    }

    @Test
    public void testAssumptionFailure() {
        this.thrown.expect(AssumptionViolatedException.class);
        this.thrown.expectMessage("Intended assumption failure!");

        final J8UnitTest<String> t = () -> {
            throw new AssumptionViolatedException("Intended assumption failure!");
        };
        t.createNewSUT();
    }

}
