package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.remote.rmi.RMIJRMPServerImpl class javax.management.remote.rmi.RMIJRMPServerImpl},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.remote.rmi.RMIJRMPServerImplClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RMIJRMPServerImplTests<SUT extends javax.management.remote.rmi.RMIJRMPServerImpl>
extends org.j8unit.repository.javax.management.remote.rmi.RMIServerImplTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIJRMPServerImpl#toStub() public java.rmi.Remote javax.management.remote.rmi.RMIJRMPServerImpl.toStub() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toStub() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
