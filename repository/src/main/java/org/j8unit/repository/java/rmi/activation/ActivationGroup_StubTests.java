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
 * Test class for {@link java.rmi.activation.ActivationGroup_Stub class java.rmi.activation.ActivationGroup_Stub},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.activation.ActivationGroup_StubClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ActivationGroup_StubTests<SUT extends java.rmi.activation.ActivationGroup_Stub>
extends org.j8unit.repository.java.rmi.activation.ActivationInstantiatorTests<SUT>,
        org.j8unit.repository.java.rmi.RemoteTests<SUT>,
        org.j8unit.repository.java.rmi.server.RemoteStubTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroup_Stub#newInstance(java.rmi.activation.ActivationID,java.rmi.activation.ActivationDesc) public java.rmi.MarshalledObject java.rmi.activation.ActivationGroup_Stub.newInstance(java.rmi.activation.ActivationID,java.rmi.activation.ActivationDesc) throws java.rmi.RemoteException,java.rmi.activation.ActivationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_newInstance_ActivationID_ActivationDesc() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
