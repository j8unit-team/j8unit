package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InternalError} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.InternalErrorClassTests}).
 */
@RunWith(J8Unit4.class)
public class InternalErrorClassTest
implements InternalErrorClassTests<InternalError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.InternalError]

    @Override
    public Class<InternalError> createNewSUT() {
        return InternalError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link InternalError#InternalError(Throwable) public
     * java.lang.InternalError(java.lang.Throwable)}.
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
    public void create_InternalError_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InternalError sut = null; // = new InternalError(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link InternalError#InternalError(String, Throwable)
     * public java.lang.InternalError(java.lang.String,java.lang.Throwable)}.
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
    public void create_InternalError_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InternalError sut = null; // = new InternalError(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link InternalError#InternalError(String) public
     * java.lang.InternalError(java.lang.String)}.
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
    public void create_InternalError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InternalError sut = null; // = new InternalError(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link InternalError#InternalError() public
     * java.lang.InternalError()}.
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
    public void create_InternalError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InternalError sut = new InternalError();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.InternalError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.InternalError]

}
