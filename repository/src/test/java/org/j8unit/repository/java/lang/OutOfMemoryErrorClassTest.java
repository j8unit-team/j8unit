package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OutOfMemoryError} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.OutOfMemoryErrorClassTests}).
 */
@RunWith(J8Unit4.class)
public class OutOfMemoryErrorClassTest
implements OutOfMemoryErrorClassTests<OutOfMemoryError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.OutOfMemoryError]

    @Override
    public Class<OutOfMemoryError> createNewSUT() {
        return OutOfMemoryError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link OutOfMemoryError#OutOfMemoryError() public
     * java.lang.OutOfMemoryError()}.
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
    public void create_OutOfMemoryError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OutOfMemoryError sut = new OutOfMemoryError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link OutOfMemoryError#OutOfMemoryError(String)
     * public java.lang.OutOfMemoryError(java.lang.String)}.
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
    public void create_OutOfMemoryError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OutOfMemoryError sut = null; // = new OutOfMemoryError(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.OutOfMemoryError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.OutOfMemoryError]

}
