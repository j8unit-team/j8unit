package org.j8unit.repository.org.omg.PortableServer.POAManagerPackage;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.POAManagerPackage.State class org.omg.PortableServer.POAManagerPackage.State},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.POAManagerPackage.StateClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface StateTests<SUT extends org.omg.PortableServer.POAManagerPackage.State>
extends org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAManagerPackage.State#value() public int org.omg.PortableServer.POAManagerPackage.State.value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
