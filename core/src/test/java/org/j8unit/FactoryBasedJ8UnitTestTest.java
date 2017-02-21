package org.j8unit;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.isA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.internal.matchers.ThrowableMessageMatcher.hasMessage;
import static org.junit.rules.ExpectedException.none;
import java.io.IOException;
import org.junit.AssumptionViolatedException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FactoryBasedJ8UnitTestTest {

    @Rule
    public ExpectedException thrown = none();

    @Test
    public void testFunctionalInterfaceStyle() {
        final FactoryBasedJ8UnitTest<String> t = () -> String::new;
        final String sut = t.createNewSUT();
        assertNotNull(sut);
        assertEquals("", sut);
    }

    @Test
    public void testRuntimeExceptionFailure() {
        this.thrown.expect(AssertionError.class);
        this.thrown.expectMessage("Failed to create new subject-under-test instance!");
        this.thrown.expectCause(isA(NullPointerException.class));
        this.thrown.expectCause(hasMessage(equalTo("Intended runtime failure!")));

        final FactoryBasedJ8UnitTest<String> t = () -> () -> {
            throw new NullPointerException("Intended runtime failure!");
        };
        t.createNewSUT();
    }

    @Test
    public void testCheckedExceptionFailure() {
        this.thrown.expect(AssertionError.class);
        this.thrown.expectMessage("Failed to create new subject-under-test instance!");
        this.thrown.expectCause(isA(IOException.class));
        this.thrown.expectCause(hasMessage(equalTo("Intended checked failure!")));

        final FactoryBasedJ8UnitTest<String> t = () -> () -> {
            throw new IOException("Intended checked failure!");
        };
        t.createNewSUT();
    }

    @Test
    public void testAssumptionFailure() {
        this.thrown.expect(AssumptionViolatedException.class);
        this.thrown.expectMessage("This assumption violation must be rethrown without any enevloping exception!");

        final FactoryBasedJ8UnitTest<String> t = () -> () -> {
            throw new AssumptionViolatedException("This assumption violation must be rethrown without any enevloping exception!");
        };
        t.createNewSUT();
    }

}
