package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.print.attribute.standard.MediaSize class javax.print.attribute.standard.MediaSize},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MediaSizeTests<SUT extends javax.print.attribute.standard.MediaSize>
extends org.j8unit.repository.javax.print.attribute.AttributeTests<SUT>,
        org.j8unit.repository.javax.print.attribute.Size2DSyntaxTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.MediaSize#getCategory() public final java.lang.Class javax.print.attribute.standard.MediaSize.getCategory()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCategory() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.MediaSize#getMediaSizeName() public javax.print.attribute.standard.MediaSizeName javax.print.attribute.standard.MediaSize.getMediaSizeName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMediaSizeName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.MediaSize#getName() public final java.lang.String javax.print.attribute.standard.MediaSize.getName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.MediaSize#equals(java.lang.Object) public boolean javax.print.attribute.standard.MediaSize.equals(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_equals_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.print.attribute.standard.MediaSize$Engineering class javax.print.attribute.standard.MediaSize$Engineering},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.EngineeringClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface EngineeringTests<SUT extends javax.print.attribute.standard.MediaSize.Engineering>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT>
    {

    }

    /**
     * <p>
     * Test class for {@link javax.print.attribute.standard.MediaSize$ISO class javax.print.attribute.standard.MediaSize$ISO},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.ISOClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ISOTests<SUT extends javax.print.attribute.standard.MediaSize.ISO>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT>
    {

    }

    /**
     * <p>
     * Test class for {@link javax.print.attribute.standard.MediaSize$NA class javax.print.attribute.standard.MediaSize$NA},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.NAClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface NATests<SUT extends javax.print.attribute.standard.MediaSize.NA>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT>
    {

    }

    /**
     * <p>
     * Test class for {@link javax.print.attribute.standard.MediaSize$Other class javax.print.attribute.standard.MediaSize$Other},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.OtherClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OtherTests<SUT extends javax.print.attribute.standard.MediaSize.Other>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT>
    {

    }

    /**
     * <p>
     * Test class for {@link javax.print.attribute.standard.MediaSize$JIS class javax.print.attribute.standard.MediaSize$JIS},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.JISClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface JISTests<SUT extends javax.print.attribute.standard.MediaSize.JIS>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT>
    {

    }

}
