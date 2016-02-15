package org.j8unit.repository.java.rmi.activation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.activation.ActivationInstantiator interface
 * java.rmi.activation.ActivationInstantiator}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ActivationInstantiatorClassTests}.
 * </p>
 *
 * @see java.rmi.activation.ActivationInstantiator interface java.rmi.activation.ActivationInstantiator (the hereby
 *      targeted class-under-test class)
 * @see ActivationInstantiatorClassTests ActivationInstantiatorClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivationInstantiatorTests<SUT extends java.rmi.activation.ActivationInstantiator>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationInstantiator#newInstance(java.rmi.activation.ActivationID, java.rmi.activation.ActivationDesc)
     * public abstract java.rmi.MarshalledObject<? extends java.rmi.Remote>
     * java.rmi.activation.ActivationInstantiator.newInstance(java.rmi.activation.ActivationID,java.rmi.activation.ActivationDesc)
     * throws java.rmi.activation.ActivationException,java.rmi.RemoteException}.
     *
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationInstantiator#newInstance(java.rmi.activation.ActivationID, java.rmi.activation.ActivationDesc)
     * public abstract java.rmi.MarshalledObject
     * java.rmi.activation.ActivationInstantiator.newInstance(java.rmi.activation.ActivationID,java.rmi.activation.ActivationDesc)
     * throws java.rmi.activation.ActivationException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.activation.ActivationInstantiator#newInstance(java.rmi.activation.ActivationID,
     *      java.rmi.activation.ActivationDesc) public abstract java.rmi.MarshalledObject
     *      java.rmi.activation.ActivationInstantiator.newInstance(java.rmi.activation.ActivationID,java.rmi.activation.
     *      ActivationDesc) throws java.rmi.activation.ActivationException,java.rmi.RemoteException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInstance_ActivationID_ActivationDesc()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
