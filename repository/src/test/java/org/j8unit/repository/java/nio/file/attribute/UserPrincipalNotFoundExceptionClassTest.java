package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UserPrincipalNotFoundExceptionClassTest
implements org.j8unit.repository.java.nio.file.attribute.UserPrincipalNotFoundExceptionClassTests<UserPrincipalNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.UserPrincipalNotFoundException]

    @Override
    public Class<UserPrincipalNotFoundException> createNewSUT() {
        return UserPrincipalNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.file.attribute.UserPrincipalNotFoundException#UserPrincipalNotFoundException(String) public
     * java.nio.file.attribute.UserPrincipalNotFoundException(java.lang.String)}.
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
    public void create_UserPrincipalNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UserPrincipalNotFoundException sut = null; // = new UserPrincipalNotFoundException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.UserPrincipalNotFoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.UserPrincipalNotFoundException]

}
