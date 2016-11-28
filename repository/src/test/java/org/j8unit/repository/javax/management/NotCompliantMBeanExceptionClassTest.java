package org.j8unit.repository.javax.management;

import javax.management.NotCompliantMBeanException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotCompliantMBeanException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.NotCompliantMBeanExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class NotCompliantMBeanExceptionClassTest
implements NotCompliantMBeanExceptionClassTests<NotCompliantMBeanException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.NotCompliantMBeanException]

    @Override
    public Class<NotCompliantMBeanException> createNewSUT() {
        return NotCompliantMBeanException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.NotCompliantMBeanException#NotCompliantMBeanException() public
     * javax.management.NotCompliantMBeanException()}.
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
    public void create_NotCompliantMBeanException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotCompliantMBeanException sut = new NotCompliantMBeanException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.NotCompliantMBeanException#NotCompliantMBeanException(String) public
     * javax.management.NotCompliantMBeanException(java.lang.String)}.
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
    public void create_NotCompliantMBeanException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotCompliantMBeanException sut = null; // = new NotCompliantMBeanException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.NotCompliantMBeanException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.NotCompliantMBeanException]

}
