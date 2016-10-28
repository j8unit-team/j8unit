package org.j8unit.repository.javax.jws.soap;

import static org.junit.Assert.assertTrue;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime constraints
 * and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test {@link SOAPBinding public
 * abstract @interface javax.jws.soap.SOAPBinding}.
 *
 * (In addition, the runtime type of this j8unit test interface's generic type is verified by
 * {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * The complementary j8unit test interface containing the instance relevant aspects is
 * {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests}.
 * </p>
 *
 * <p>
 * <strong>What? Testing the class/the type itself? What is it good for?</strong>
 * </p>
 *
 * <p>
 * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
 *
 * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
 * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision of
 * specific constructors (and its individual requirements) should be covered by according test methods. (Note, this is
 * not limited to constructors only; Just think of factory methods and further.)
 *
 * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
 * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
 * </p>
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPBindingClassTests<SUT extends SOAPBinding>
extends org.j8unit.repository.java.lang.annotation.AnnotationClassTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.soap.SOAPBinding]
    /**
     * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
     *      (the hereby targeted method-under-test)
     *
     * @since 0.9.2
     */
    @Override
    @BeforeClass
    public default void verifyGenericType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to SOAPBinding.class!",
                   SOAPBinding.class.isAssignableFrom(sut));
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.soap.SOAPBinding]

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link Style public static final enum javax.jws.soap.SOAPBinding$Style}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests.StyleTests}.
     * </p>
     *
     * <p>
     * <strong>What? Testing the class/the type itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
     *
     * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
     * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision
     * of specific constructors (and its individual requirements) should be covered by according test methods. (Note,
     * this is not limited to constructors only; Just think of factory methods and further.)
     *
     * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation
     * type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
     * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface StyleClassTests<SUT extends Style>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.soap.SOAPBinding$Style]
        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to Style.class!",
                              Style.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.soap.SOAPBinding$Style]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link ParameterStyle public static final enum javax.jws.soap.SOAPBinding$ParameterStyle}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests.ParameterStyleTests}.
     * </p>
     *
     * <p>
     * <strong>What? Testing the class/the type itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
     *
     * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
     * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision
     * of specific constructors (and its individual requirements) should be covered by according test methods. (Note,
     * this is not limited to constructors only; Just think of factory methods and further.)
     *
     * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation
     * type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
     * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ParameterStyleClassTests<SUT extends ParameterStyle>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.soap.SOAPBinding$ParameterStyle]
        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to ParameterStyle.class!",
                              ParameterStyle.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.soap.SOAPBinding$ParameterStyle]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test {@link Use
     * public static final enum javax.jws.soap.SOAPBinding$Use}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests.UseTests}.
     * </p>
     *
     * <p>
     * <strong>What? Testing the class/the type itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
     *
     * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
     * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision
     * of specific constructors (and its individual requirements) should be covered by according test methods. (Note,
     * this is not limited to constructors only; Just think of factory methods and further.)
     *
     * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation
     * type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
     * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UseClassTests<SUT extends Use>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.soap.SOAPBinding$Use]
        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to Use.class!",
                              Use.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.soap.SOAPBinding$Use]

    }

}
