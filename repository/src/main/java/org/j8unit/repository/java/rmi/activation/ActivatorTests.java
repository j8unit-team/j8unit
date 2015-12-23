package org.j8unit.repository.java.rmi.activation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.activation.Activator interface java.rmi.activation.Activator}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.activation.ActivatorTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.activation.ActivatorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.activation.Activator
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivatorTests<SUT extends java.rmi.activation.Activator>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.activation.Activator#activate(java.rmi.activation.ActivationID, boolean) public
     * abstract java.rmi.MarshalledObject
     * java.rmi.activation.Activator.activate(java.rmi.activation.ActivationID,boolean) throws
     * java.rmi.activation.ActivationException,java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.Activator#activate(java.rmi.activation.ActivationID, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_activate_ActivationID_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
