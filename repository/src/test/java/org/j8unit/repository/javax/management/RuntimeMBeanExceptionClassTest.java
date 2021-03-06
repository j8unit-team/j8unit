package org.j8unit.repository.javax.management;

import javax.management.RuntimeMBeanException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RuntimeMBeanException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.RuntimeMBeanExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class RuntimeMBeanExceptionClassTest
implements RuntimeMBeanExceptionClassTests<RuntimeMBeanException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.RuntimeMBeanException]

    @Override
    public Class<RuntimeMBeanException> createNewSUT() {
        return RuntimeMBeanException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.RuntimeMBeanException#RuntimeMBeanException(RuntimeException) public
     * javax.management.RuntimeMBeanException(java.lang.RuntimeException)}.
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
    public void create_RuntimeMBeanException_RuntimeException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RuntimeMBeanException sut = null; // = new RuntimeMBeanException(RuntimeException);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.RuntimeMBeanException#RuntimeMBeanException(RuntimeException, String) public
     * javax.management.RuntimeMBeanException(java.lang.RuntimeException,java.lang.String)}.
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
    public void create_RuntimeMBeanException_RuntimeException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RuntimeMBeanException sut = null; // = new RuntimeMBeanException(RuntimeException, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.RuntimeMBeanException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.RuntimeMBeanException]

}
