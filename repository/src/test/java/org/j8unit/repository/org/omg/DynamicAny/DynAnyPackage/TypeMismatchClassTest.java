package org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynAnyPackage.TypeMismatch;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TypeMismatch} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage.TypeMismatchClassTests}).
 */
@RunWith(J8Unit4.class)
public class TypeMismatchClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage.TypeMismatchClassTests<TypeMismatch> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynAnyPackage.TypeMismatch]

    @Override
    public Class<TypeMismatch> createNewSUT() {
        return TypeMismatch.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.DynamicAny.DynAnyPackage.TypeMismatch#TypeMismatch() public
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_TypeMismatch()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TypeMismatch sut = new TypeMismatch();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.DynamicAny.DynAnyPackage.TypeMismatch#TypeMismatch(String) public
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_TypeMismatch_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TypeMismatch sut = null; // = new TypeMismatch(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynAnyPackage.TypeMismatch]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynAnyPackage.TypeMismatch]

}
