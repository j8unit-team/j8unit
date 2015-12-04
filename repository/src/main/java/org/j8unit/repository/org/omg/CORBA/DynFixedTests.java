package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.DynFixed interface org.omg.CORBA.DynFixed},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CORBA.DynFixedClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DynFixedTests<SUT extends org.omg.CORBA.DynFixed>
extends org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
        org.j8unit.repository.org.omg.CORBA.DynAnyTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynFixed#get_value() public abstract byte[] org.omg.CORBA.DynFixed.get_value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_value() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynFixed#set_value(byte[]) public abstract void org.omg.CORBA.DynFixed.set_value(byte[]) throws org.omg.CORBA.DynAnyPackage.InvalidValue}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_value_byteArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
