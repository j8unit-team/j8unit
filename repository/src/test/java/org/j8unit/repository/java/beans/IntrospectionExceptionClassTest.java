package org.j8unit.repository.java.beans;

import java.beans.IntrospectionException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IntrospectionException} (by simply
 * reusing the J8Unit test interface {@link IntrospectionExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class IntrospectionExceptionClassTest
implements IntrospectionExceptionClassTests<IntrospectionException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.IntrospectionException]

    @Override
    public Class<IntrospectionException> createNewSUT() {
        return IntrospectionException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.IntrospectionException#IntrospectionException(String) public
     * java.beans.IntrospectionException(java.lang.String)}.
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
    public void create_IntrospectionException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IntrospectionException sut = null; // = new IntrospectionException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.IntrospectionException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.IntrospectionException]

}
