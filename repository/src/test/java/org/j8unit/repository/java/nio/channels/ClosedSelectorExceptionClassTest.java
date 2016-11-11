package org.j8unit.repository.java.nio.channels;

import java.nio.channels.ClosedSelectorException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ClosedSelectorException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.channels.ClosedSelectorExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ClosedSelectorExceptionClassTest
implements ClosedSelectorExceptionClassTests<ClosedSelectorException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.ClosedSelectorException]

    @Override
    public Class<ClosedSelectorException> createNewSUT() {
        return ClosedSelectorException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.channels.ClosedSelectorException#ClosedSelectorException() public
     * java.nio.channels.ClosedSelectorException()}.
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
    public void create_ClosedSelectorException()
    throws Exception {
        // create new instance
        final ClosedSelectorException sut = new ClosedSelectorException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.ClosedSelectorException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.ClosedSelectorException]

}
