package org.j8unit.repository.java.awt;

import java.awt.AWTException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AWTException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.AWTExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class AWTExceptionClassTest
implements AWTExceptionClassTests<AWTException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.AWTException]

    @Override
    public Class<AWTException> createNewSUT() {
        return AWTException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.AWTException#AWTException(String)
     * public java.awt.AWTException(java.lang.String)}.
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
    public void create_AWTException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AWTException sut = null; // = new AWTException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.AWTException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.AWTException]

}
