package org.j8unit.repository.java.security.acl;

import java.security.acl.NotOwnerException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotOwnerExceptionClassTest
implements org.j8unit.repository.java.security.acl.NotOwnerExceptionClassTests<NotOwnerException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.acl.NotOwnerException]

    @Override
    public Class<NotOwnerException> createNewSUT() {
        return NotOwnerException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.acl.NotOwnerException#NotOwnerException() public java.security.acl.NotOwnerException()}.
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
    public void create_NotOwnerException()
    throws Exception {
        // create new instance
        final NotOwnerException sut = new NotOwnerException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.acl.NotOwnerException]

}
