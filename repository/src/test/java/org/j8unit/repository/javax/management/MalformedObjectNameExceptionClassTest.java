package org.j8unit.repository.javax.management;

import javax.management.MalformedObjectNameException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MalformedObjectNameException} (by simply
 * reusing the J8Unit test interface {@link MalformedObjectNameExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class MalformedObjectNameExceptionClassTest
implements MalformedObjectNameExceptionClassTests<MalformedObjectNameException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MalformedObjectNameException]

    @Override
    public Class<MalformedObjectNameException> createNewSUT() {
        return MalformedObjectNameException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MalformedObjectNameException#MalformedObjectNameException() public
     * javax.management.MalformedObjectNameException()}.
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
    public void create_MalformedObjectNameException()
    throws Exception {
        // create new instance
        final MalformedObjectNameException sut = new MalformedObjectNameException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MalformedObjectNameException#MalformedObjectNameException(String) public
     * javax.management.MalformedObjectNameException(java.lang.String)}.
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
    public void create_MalformedObjectNameException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MalformedObjectNameException sut = null; // = new MalformedObjectNameException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MalformedObjectNameException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MalformedObjectNameException]

}
