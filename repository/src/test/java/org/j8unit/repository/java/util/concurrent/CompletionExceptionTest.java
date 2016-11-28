package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CompletionException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CompletionException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.CompletionExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class CompletionExceptionTest
implements CompletionExceptionTests<CompletionException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.CompletionException]

    @Override
    public CompletionException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.CompletionException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.CompletionException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.CompletionException]

}
