package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.InvalidKeyException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidKeyException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.openmbean.InvalidKeyExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class InvalidKeyExceptionClassTest
implements InvalidKeyExceptionClassTests<InvalidKeyException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.InvalidKeyException]

    @Override
    public Class<InvalidKeyException> createNewSUT() {
        return InvalidKeyException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.openmbean.InvalidKeyException#InvalidKeyException() public
     * javax.management.openmbean.InvalidKeyException()}.
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
    public void create_InvalidKeyException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidKeyException sut = new InvalidKeyException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.openmbean.InvalidKeyException#InvalidKeyException(String) public
     * javax.management.openmbean.InvalidKeyException(java.lang.String)}.
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
    public void create_InvalidKeyException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidKeyException sut = null; // = new InvalidKeyException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.InvalidKeyException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.InvalidKeyException]

}
