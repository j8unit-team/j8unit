package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.naming.ldap.HasControls interface javax.naming.ldap.HasControls},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.ldap.HasControlsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HasControlsTests<SUT extends javax.naming.ldap.HasControls>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.HasControls#getControls() public abstract javax.naming.ldap.Control[] javax.naming.ldap.HasControls.getControls() throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getControls() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
