package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ExecutionException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ExecutionException} (by simply reusing
 * the J8Unit test interface {@link ExecutionExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ExecutionExceptionClassTest
implements ExecutionExceptionClassTests<ExecutionException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ExecutionException]

    @Override
    public Class<ExecutionException> createNewSUT() {
        return ExecutionException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ExecutionException#ExecutionException(Throwable) public
     * java.util.concurrent.ExecutionException(java.lang.Throwable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ExecutionException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ExecutionException sut = null; // = new ExecutionException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ExecutionException#ExecutionException(String, Throwable) public
     * java.util.concurrent.ExecutionException(java.lang.String,java.lang.Throwable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ExecutionException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ExecutionException sut = null; // = new ExecutionException(String, Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ExecutionException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ExecutionException]

}
