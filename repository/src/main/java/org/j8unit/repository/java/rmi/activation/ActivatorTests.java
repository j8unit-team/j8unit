package org.j8unit.repository.java.rmi.activation;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.rmi.activation.Activator interface java.rmi.activation.Activator},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.activation.ActivatorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ActivatorTests<SUT extends java.rmi.activation.Activator>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.rmi.activation.Activator#activate(java.rmi.activation.ActivationID,boolean) public abstract java.rmi.MarshalledObject java.rmi.activation.Activator.activate(java.rmi.activation.ActivationID,boolean) throws java.rmi.activation.ActivationException,java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_activate_ActivationID_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
