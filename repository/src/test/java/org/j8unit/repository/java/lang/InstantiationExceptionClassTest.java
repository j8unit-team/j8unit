package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstantiationExceptionClassTest
implements org.j8unit.repository.java.lang.InstantiationExceptionClassTests<InstantiationException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.InstantiationException]

    @Override
    public Class<InstantiationException> createNewSUT() {
        return InstantiationException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link InstantiationException#InstantiationException()
     * public java.lang.InstantiationException()}.
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
    public void create_InstantiationException()
    throws Exception {
        // create new instance
        final InstantiationException sut = new InstantiationException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link InstantiationException#InstantiationException(String) public
     * java.lang.InstantiationException(java.lang.String)}.
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
    public void create_InstantiationException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InstantiationException sut = null; // = new InstantiationException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.InstantiationException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.InstantiationException]

}
