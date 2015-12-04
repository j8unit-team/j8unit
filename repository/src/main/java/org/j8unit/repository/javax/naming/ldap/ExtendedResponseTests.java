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
 * Test class for {@link javax.naming.ldap.ExtendedResponse interface javax.naming.ldap.ExtendedResponse},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.ldap.ExtendedResponseClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ExtendedResponseTests<SUT extends javax.naming.ldap.ExtendedResponse>
extends org.j8unit.repository.java.io.SerializableTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.ExtendedResponse#getID() public abstract java.lang.String javax.naming.ldap.ExtendedResponse.getID()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getID() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.ExtendedResponse#getEncodedValue() public abstract byte[] javax.naming.ldap.ExtendedResponse.getEncodedValue()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEncodedValue() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
