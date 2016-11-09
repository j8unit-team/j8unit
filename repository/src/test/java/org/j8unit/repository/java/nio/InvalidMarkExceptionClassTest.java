package org.j8unit.repository.java.nio;

import java.nio.InvalidMarkException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidMarkException} (by simply reusing
 * the J8Unit test interface {@link InvalidMarkExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidMarkExceptionClassTest
implements InvalidMarkExceptionClassTests<InvalidMarkException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.InvalidMarkException]

    @Override
    public Class<InvalidMarkException> createNewSUT() {
        return InvalidMarkException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.InvalidMarkException#InvalidMarkException() public java.nio.InvalidMarkException()}.
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
    public void create_InvalidMarkException()
    throws Exception {
        // create new instance
        final InvalidMarkException sut = new InvalidMarkException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.InvalidMarkException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.InvalidMarkException]

}
