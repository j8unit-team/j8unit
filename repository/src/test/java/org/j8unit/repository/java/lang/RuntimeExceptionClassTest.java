package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimeExceptionClassTest
implements org.j8unit.repository.java.lang.RuntimeExceptionClassTests<RuntimeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.RuntimeException]

    @Override
    public Class<RuntimeException> createNewSUT() {
        return RuntimeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link RuntimeException#RuntimeException(Throwable)
     * public java.lang.RuntimeException(java.lang.Throwable)}.
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
    public void create_RuntimeException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RuntimeException sut = null; // = new RuntimeException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link RuntimeException#RuntimeException(String, Throwable) public
     * java.lang.RuntimeException(java.lang.String,java.lang.Throwable)}.
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
    public void create_RuntimeException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RuntimeException sut = null; // = new RuntimeException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link RuntimeException#RuntimeException(String)
     * public java.lang.RuntimeException(java.lang.String)}.
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
    public void create_RuntimeException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RuntimeException sut = null; // = new RuntimeException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link RuntimeException#RuntimeException() public
     * java.lang.RuntimeException()}.
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
    public void create_RuntimeException()
    throws Exception {
        // create new instance
        final RuntimeException sut = new RuntimeException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.RuntimeException]

}
