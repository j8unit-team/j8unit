package org.j8unit.repository.javax.management;

import javax.management.InvalidApplicationException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidApplicationExceptionClassTest
implements org.j8unit.repository.javax.management.InvalidApplicationExceptionClassTests<InvalidApplicationException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.InvalidApplicationException]

    @Override
    public Class<InvalidApplicationException> createNewSUT() {
        return InvalidApplicationException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.InvalidApplicationException#InvalidApplicationException(Object) public
     * javax.management.InvalidApplicationException(java.lang.Object)}.
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
    public void create_InvalidApplicationException_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidApplicationException sut = null; // = new InvalidApplicationException(Object);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.InvalidApplicationException]

}
