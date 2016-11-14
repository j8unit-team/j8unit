package org.j8unit.repository.javax.jws.soap;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.EnumTests;
import org.j8unit.repository.java.lang.annotation.AnnotationTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link SOAPBinding
 * public abstract @interface javax.jws.soap.SOAPBinding}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.jws.soap.SOAPBindingClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPBindingTests<SUT extends SOAPBinding>
extends AnnotationTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.jws.soap.SOAPBinding#use() public abstract
     * javax.jws.soap.SOAPBinding$Use javax.jws.soap.SOAPBinding.use()}.
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
    public default void test_use()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.jws.soap.SOAPBinding#parameterStyle() public
     * abstract javax.jws.soap.SOAPBinding$ParameterStyle javax.jws.soap.SOAPBinding.parameterStyle()}.
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
    public default void test_parameterStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.jws.soap.SOAPBinding#style() public abstract
     * javax.jws.soap.SOAPBinding$Style javax.jws.soap.SOAPBinding.style()}.
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
    public default void test_style()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.soap.SOAPBinding]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.soap.SOAPBinding]

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link ParameterStyle public static final enum javax.jws.soap.SOAPBinding$ParameterStyle}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.jws.soap.SOAPBindingClassTests.ParameterStyleClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ParameterStyleTests<SUT extends ParameterStyle>
    extends EnumTests<SUT, ParameterStyle> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding$ParameterStyle]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.soap.SOAPBinding$ParameterStyle]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.soap.SOAPBinding$ParameterStyle]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Use public
     * static final enum javax.jws.soap.SOAPBinding$Use}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.jws.soap.SOAPBindingClassTests.UseClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UseTests<SUT extends Use>
    extends EnumTests<SUT, Use> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Use]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Use]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Use]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Style
     * public static final enum javax.jws.soap.SOAPBinding$Style}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.jws.soap.SOAPBindingClassTests.StyleClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface StyleTests<SUT extends Style>
    extends EnumTests<SUT, Style> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Style]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Style]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Style]

    }

}
