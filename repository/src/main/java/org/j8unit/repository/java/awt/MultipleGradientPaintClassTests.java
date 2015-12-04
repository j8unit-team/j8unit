package org.j8unit.repository.java.awt;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.MultipleGradientPaint class java.awt.MultipleGradientPaint},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.awt.MultipleGradientPaintTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.MultipleGradientPaintTests
 */
@Category(J8UnitRepository.class)
public abstract interface MultipleGradientPaintClassTests<SUT extends Class<? extends java.awt.MultipleGradientPaint>>
extends org.j8unit.repository.java.awt.PaintClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.awt.MultipleGradientPaint> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.MultipleGradientPaint.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link java.awt.MultipleGradientPaint$CycleMethod class java.awt.MultipleGradientPaint$CycleMethod},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.awt.MultipleGradientPaintTests.CycleMethodTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.awt.MultipleGradientPaintTests.CycleMethodTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface CycleMethodClassTests<SUT extends Class<? extends java.awt.MultipleGradientPaint.CycleMethod>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT,java.awt.MultipleGradientPaint.CycleMethod>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.awt.MultipleGradientPaint.CycleMethod> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.MultipleGradientPaint.CycleMethod.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link java.awt.MultipleGradientPaint.CycleMethod#values() public static java.awt.MultipleGradientPaint$CycleMethod[] java.awt.MultipleGradientPaint$CycleMethod.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.awt.MultipleGradientPaint.CycleMethod#valueOf(java.lang.String) public static java.awt.MultipleGradientPaint$CycleMethod java.awt.MultipleGradientPaint$CycleMethod.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link java.awt.MultipleGradientPaint$ColorSpaceType class java.awt.MultipleGradientPaint$ColorSpaceType},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.awt.MultipleGradientPaintTests.ColorSpaceTypeTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.awt.MultipleGradientPaintTests.ColorSpaceTypeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ColorSpaceTypeClassTests<SUT extends Class<? extends java.awt.MultipleGradientPaint.ColorSpaceType>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT,java.awt.MultipleGradientPaint.ColorSpaceType>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.awt.MultipleGradientPaint.ColorSpaceType> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.MultipleGradientPaint.ColorSpaceType.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link java.awt.MultipleGradientPaint.ColorSpaceType#values() public static java.awt.MultipleGradientPaint$ColorSpaceType[] java.awt.MultipleGradientPaint$ColorSpaceType.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.awt.MultipleGradientPaint.ColorSpaceType#valueOf(java.lang.String) public static java.awt.MultipleGradientPaint$ColorSpaceType java.awt.MultipleGradientPaint$ColorSpaceType.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
