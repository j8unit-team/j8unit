package org.j8unit.repository.java.security.acl;

import java.security.acl.LastOwnerException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LastOwnerExceptionClassTest
implements org.j8unit.repository.java.security.acl.LastOwnerExceptionClassTests<LastOwnerException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.acl.LastOwnerException]

    @Override
    public Class<LastOwnerException> createNewSUT() {
        return LastOwnerException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.acl.LastOwnerException#LastOwnerException() public java.security.acl.LastOwnerException()}.
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
    public void create_LastOwnerException()
    throws Exception {
        // create new instance
        final LastOwnerException sut = new LastOwnerException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.acl.LastOwnerException]

}
