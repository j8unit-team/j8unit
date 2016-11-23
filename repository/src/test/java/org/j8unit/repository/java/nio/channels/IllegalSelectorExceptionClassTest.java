package org.j8unit.repository.java.nio.channels;

import java.nio.channels.IllegalSelectorException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IllegalSelectorException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.channels.IllegalSelectorExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class IllegalSelectorExceptionClassTest
implements IllegalSelectorExceptionClassTests<IllegalSelectorException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.IllegalSelectorException]

    @Override
    public Class<IllegalSelectorException> createNewSUT() {
        return IllegalSelectorException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.channels.IllegalSelectorException#IllegalSelectorException() public
     * java.nio.channels.IllegalSelectorException()}.
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
    public void create_IllegalSelectorException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalSelectorException sut = new IllegalSelectorException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.IllegalSelectorException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.IllegalSelectorException]

}
