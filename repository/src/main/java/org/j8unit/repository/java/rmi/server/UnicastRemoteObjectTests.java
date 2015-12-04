package org.j8unit.repository.java.rmi.server;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.rmi.server.UnicastRemoteObject class java.rmi.server.UnicastRemoteObject},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.server.UnicastRemoteObjectClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface UnicastRemoteObjectTests<SUT extends java.rmi.server.UnicastRemoteObject>
extends org.j8unit.repository.java.rmi.server.RemoteServerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.rmi.server.UnicastRemoteObject#clone() public java.lang.Object java.rmi.server.UnicastRemoteObject.clone() throws java.lang.CloneNotSupportedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
