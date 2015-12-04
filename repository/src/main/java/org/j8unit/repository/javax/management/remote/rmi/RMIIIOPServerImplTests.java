package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.remote.rmi.RMIIIOPServerImpl class
 * javax.management.remote.rmi.RMIIIOPServerImpl}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.remote.rmi.RMIIIOPServerImplClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RMIIIOPServerImplTests<SUT extends javax.management.remote.rmi.RMIIIOPServerImpl>
extends org.j8unit.repository.javax.management.remote.rmi.RMIServerImplTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIIIOPServerImpl#toStub() public java.rmi.Remote
     * javax.management.remote.rmi.RMIIIOPServerImpl.toStub() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toStub()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
