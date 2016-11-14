package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXServerErrorException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JMXServerErrorException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.remote.JMXServerErrorExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class JMXServerErrorExceptionClassTest
implements JMXServerErrorExceptionClassTests<JMXServerErrorException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXServerErrorException]

    @Override
    public Class<JMXServerErrorException> createNewSUT() {
        return JMXServerErrorException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.JMXServerErrorException#JMXServerErrorException(String, Error) public
     * javax.management.remote.JMXServerErrorException(java.lang.String,java.lang.Error)}.
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
    public void create_JMXServerErrorException_String_Error()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JMXServerErrorException sut = null; // = new JMXServerErrorException(String, Error);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.JMXServerErrorException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXServerErrorException]

}
