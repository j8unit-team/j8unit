package org.j8unit.repository.javax.jws.soap;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.jws.soap.SOAPBinding interface javax.jws.soap.SOAPBinding},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.jws.soap.SOAPBindingClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SOAPBindingTests<SUT extends javax.jws.soap.SOAPBinding>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.jws.soap.SOAPBinding#use() public abstract javax.jws.soap.SOAPBinding$Use javax.jws.soap.SOAPBinding.use()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_use() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.jws.soap.SOAPBinding#parameterStyle() public abstract javax.jws.soap.SOAPBinding$ParameterStyle javax.jws.soap.SOAPBinding.parameterStyle()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parameterStyle() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.jws.soap.SOAPBinding#style() public abstract javax.jws.soap.SOAPBinding$Style javax.jws.soap.SOAPBinding.style()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_style() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.jws.soap.SOAPBinding$Use class javax.jws.soap.SOAPBinding$Use},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.jws.soap.SOAPBindingClassTests.UseClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface UseTests<SUT extends javax.jws.soap.SOAPBinding.Use>
    extends org.j8unit.repository.java.lang.EnumTests<SUT,javax.jws.soap.SOAPBinding.Use>
    {

    }

    /**
     * <p>
     * Test class for {@link javax.jws.soap.SOAPBinding$ParameterStyle class javax.jws.soap.SOAPBinding$ParameterStyle},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.jws.soap.SOAPBindingClassTests.ParameterStyleClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ParameterStyleTests<SUT extends javax.jws.soap.SOAPBinding.ParameterStyle>
    extends org.j8unit.repository.java.lang.EnumTests<SUT,javax.jws.soap.SOAPBinding.ParameterStyle>
    {

    }

    /**
     * <p>
     * Test class for {@link javax.jws.soap.SOAPBinding$Style class javax.jws.soap.SOAPBinding$Style},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.jws.soap.SOAPBindingClassTests.StyleClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface StyleTests<SUT extends javax.jws.soap.SOAPBinding.Style>
    extends org.j8unit.repository.java.lang.EnumTests<SUT,javax.jws.soap.SOAPBinding.Style>
    {

    }

}
