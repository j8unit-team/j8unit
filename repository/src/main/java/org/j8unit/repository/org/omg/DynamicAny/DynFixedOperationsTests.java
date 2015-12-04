package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.DynamicAny.DynFixedOperations interface org.omg.DynamicAny.DynFixedOperations},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.DynamicAny.DynFixedOperationsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DynFixedOperationsTests<SUT extends org.omg.DynamicAny.DynFixedOperations>
extends org.j8unit.repository.org.omg.DynamicAny.DynAnyOperationsTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynFixedOperations#get_value() public abstract java.lang.String org.omg.DynamicAny.DynFixedOperations.get_value()}.
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
     * Test method for {@link org.omg.DynamicAny.DynFixedOperations#set_value(java.lang.String) public abstract boolean org.omg.DynamicAny.DynFixedOperations.set_value(java.lang.String) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_value_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
