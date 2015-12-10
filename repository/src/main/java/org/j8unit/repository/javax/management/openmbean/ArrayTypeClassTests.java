package org.j8unit.repository.javax.management.openmbean;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.openmbean.ArrayType class javax.management.openmbean.ArrayType}, containing
 * all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.management.openmbean.ArrayTypeTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.openmbean.ArrayTypeTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ArrayTypeClassTests<SUT extends javax.management.openmbean.ArrayType<T>, T>
extends org.j8unit.repository.javax.management.openmbean.OpenTypeClassTests<SUT, T> {

    /**
     * Test method for {@link javax.management.openmbean.ArrayType#ArrayType(int,javax.management.openmbean.OpenType)
     * public javax.management.openmbean.ArrayType(int,javax.management.openmbean.OpenType) throws
     * javax.management.openmbean.OpenDataException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ArrayType_int_OpenType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.openmbean.ArrayType<T> sut = null; // = new
                                                                  // ArrayType(int,javax.management.openmbean.OpenType);
    }

    /**
     * Test method for
     * {@link javax.management.openmbean.ArrayType#ArrayType(javax.management.openmbean.SimpleType,boolean) public
     * javax.management.openmbean.ArrayType(javax.management.openmbean.SimpleType,boolean) throws
     * javax.management.openmbean.OpenDataException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ArrayType_SimpleType_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.openmbean.ArrayType<T> sut = null; // = new
                                                                  // ArrayType(javax.management.openmbean.SimpleType,boolean);
    }

    /**
     * <p>
     * Test method for {@link javax.management.openmbean.ArrayType#getArrayType(javax.management.openmbean.OpenType)
     * public static javax.management.openmbean.ArrayType
     * javax.management.openmbean.ArrayType.getArrayType(javax.management.openmbean.OpenType) throws
     * javax.management.openmbean.OpenDataException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getArrayType_OpenType()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.openmbean.ArrayType#getPrimitiveArrayType(java.lang.Class) public static
     * javax.management.openmbean.ArrayType javax.management.openmbean.ArrayType.getPrimitiveArrayType(java.lang.Class)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrimitiveArrayType_Class()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.openmbean.ArrayType.class.isAssignableFrom(sut));
    }

}
