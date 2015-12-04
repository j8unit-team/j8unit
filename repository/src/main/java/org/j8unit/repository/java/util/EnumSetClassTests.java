package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.EnumSet class java.util.EnumSet}, containing all class relevant test methods (at
 * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.util.EnumSetTests}.
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
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.EnumSetTests
 */
@Category(J8UnitRepository.class)
public abstract interface EnumSetClassTests<SUT extends Class<? extends java.util.EnumSet<E>>, E extends java.lang.Enum<E>>
extends org.j8unit.repository.java.lang.CloneableClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.util.AbstractSetClassTests<SUT, E> {

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.EnumSet<E>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.EnumSet.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.util.EnumSet#copyOf(java.util.EnumSet) public static java.util.EnumSet
     * java.util.EnumSet.copyOf(java.util.EnumSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_copyOf_EnumSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.EnumSet#copyOf(java.util.Collection) public static java.util.EnumSet
     * java.util.EnumSet.copyOf(java.util.Collection)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_copyOf_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.EnumSet#noneOf(java.lang.Class) public static java.util.EnumSet
     * java.util.EnumSet.noneOf(java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_noneOf_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.EnumSet#range(java.lang.Enum,java.lang.Enum) public static java.util.EnumSet
     * java.util.EnumSet.range(java.lang.Enum,java.lang.Enum)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_range_Enum_Enum()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.EnumSet#of(java.lang.Enum,java.lang.Enum,java.lang.Enum,java.lang.Enum,java.lang.Enum) public
     * static java.util.EnumSet
     * java.util.EnumSet.of(java.lang.Enum,java.lang.Enum,java.lang.Enum,java.lang.Enum,java.lang.Enum)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_Enum_Enum_Enum_Enum_Enum()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.EnumSet#of(java.lang.Enum,java.lang.Enum...) public static java.util.EnumSet
     * java.util.EnumSet.of(java.lang.Enum,java.lang.Enum...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_Enum_EnumArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.EnumSet#of(java.lang.Enum) public static java.util.EnumSet
     * java.util.EnumSet.of(java.lang.Enum)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_Enum()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.EnumSet#of(java.lang.Enum,java.lang.Enum) public static java.util.EnumSet
     * java.util.EnumSet.of(java.lang.Enum,java.lang.Enum)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_Enum_Enum()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.EnumSet#of(java.lang.Enum,java.lang.Enum,java.lang.Enum) public static
     * java.util.EnumSet java.util.EnumSet.of(java.lang.Enum,java.lang.Enum,java.lang.Enum)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_Enum_Enum_Enum()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.EnumSet#of(java.lang.Enum,java.lang.Enum,java.lang.Enum,java.lang.Enum) public
     * static java.util.EnumSet java.util.EnumSet.of(java.lang.Enum,java.lang.Enum,java.lang.Enum,java.lang.Enum)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_Enum_Enum_Enum_Enum()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.EnumSet#complementOf(java.util.EnumSet) public static java.util.EnumSet
     * java.util.EnumSet.complementOf(java.util.EnumSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_complementOf_EnumSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.EnumSet#allOf(java.lang.Class) public static java.util.EnumSet
     * java.util.EnumSet.allOf(java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_allOf_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
