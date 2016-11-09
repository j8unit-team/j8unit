package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NullPointerException} (by simply reusing
 * the J8Unit test interface {@link NullPointerExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class NullPointerExceptionClassTest
implements NullPointerExceptionClassTests<NullPointerException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.NullPointerException]

    @Override
    public Class<NullPointerException> createNewSUT() {
        return NullPointerException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NullPointerException#NullPointerException()
     * public java.lang.NullPointerException()}.
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
    public void create_NullPointerException()
    throws Exception {
        // create new instance
        final NullPointerException sut = new NullPointerException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link NullPointerException#NullPointerException(String) public
     * java.lang.NullPointerException(java.lang.String)}.
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
    public void create_NullPointerException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NullPointerException sut = null; // = new NullPointerException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.NullPointerException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.NullPointerException]

}
