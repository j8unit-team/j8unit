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
 * Test class for {@link org.omg.CORBA.DynArray interface org.omg.CORBA.DynArray},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CORBA.DynArrayClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DynArrayTests<SUT extends org.omg.CORBA.DynArray>
extends org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
        org.j8unit.repository.org.omg.CORBA.DynAnyTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynArray#get_elements() public abstract org.omg.CORBA.Any[] org.omg.CORBA.DynArray.get_elements()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_elements() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynArray#set_elements(org.omg.CORBA.Any[]) public abstract void org.omg.CORBA.DynArray.set_elements(org.omg.CORBA.Any[]) throws org.omg.CORBA.DynAnyPackage.InvalidSeq}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_elements_AnyArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
