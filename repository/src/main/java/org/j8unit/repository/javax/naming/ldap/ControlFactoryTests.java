package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.ldap.ControlFactory class javax.naming.ldap.ControlFactory}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.ldap.ControlFactoryClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ControlFactoryTests<SUT extends javax.naming.ldap.ControlFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.ControlFactory#getControlInstance(javax.naming.ldap.Control) public
     * abstract javax.naming.ldap.Control javax.naming.ldap.ControlFactory.getControlInstance(javax.naming.ldap.Control)
     * throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getControlInstance_Control()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
