package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.StyleConstants class javax.swing.text.StyleConstants}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link StyleConstantsClassTests}.
 * </p>
 *
 * @see javax.swing.text.StyleConstants class javax.swing.text.StyleConstants (the hereby targeted class-under-test
 *      class)
 * @see StyleConstantsClassTests StyleConstantsClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StyleConstantsTests<SUT extends javax.swing.text.StyleConstants>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#toString() public java.lang.String
     * javax.swing.text.StyleConstants.toString()}.
     *
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#toString() public java.lang.String
     * javax.swing.text.StyleConstants.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.StyleConstants#toString() public java.lang.String
     *      javax.swing.text.StyleConstants.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.text.StyleConstants.FontConstants class
     * javax.swing.text.StyleConstants$FontConstants}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link StyleConstantsClassTests.FontConstantsClassTests}.
     * </p>
     *
     * @see javax.swing.text.StyleConstants.FontConstants class javax.swing.text.StyleConstants$FontConstants (the
     *      hereby targeted class-under-test class)
     * @see StyleConstantsClassTests.FontConstantsClassTests StyleConstantsClassTests.FontConstantsClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FontConstantsTests<SUT extends javax.swing.text.StyleConstants.FontConstants>
    extends AttributeSetTests.FontAttributeTests<SUT>, AttributeSetTests.CharacterAttributeTests<SUT>, StyleConstantsTests<SUT> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.text.StyleConstants.ParagraphConstants class
     * javax.swing.text.StyleConstants$ParagraphConstants}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link StyleConstantsClassTests.ParagraphConstantsClassTests}.
     * </p>
     *
     * @see javax.swing.text.StyleConstants.ParagraphConstants class javax.swing.text.StyleConstants$ParagraphConstants
     *      (the hereby targeted class-under-test class)
     * @see StyleConstantsClassTests.ParagraphConstantsClassTests StyleConstantsClassTests.ParagraphConstantsClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ParagraphConstantsTests<SUT extends javax.swing.text.StyleConstants.ParagraphConstants>
    extends AttributeSetTests.ParagraphAttributeTests<SUT>, StyleConstantsTests<SUT> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.text.StyleConstants.ColorConstants class
     * javax.swing.text.StyleConstants$ColorConstants}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link StyleConstantsClassTests.ColorConstantsClassTests}.
     * </p>
     *
     * @see javax.swing.text.StyleConstants.ColorConstants class javax.swing.text.StyleConstants$ColorConstants (the
     *      hereby targeted class-under-test class)
     * @see StyleConstantsClassTests.ColorConstantsClassTests StyleConstantsClassTests.ColorConstantsClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ColorConstantsTests<SUT extends javax.swing.text.StyleConstants.ColorConstants>
    extends AttributeSetTests.ColorAttributeTests<SUT>, AttributeSetTests.CharacterAttributeTests<SUT>, StyleConstantsTests<SUT> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.text.StyleConstants.CharacterConstants class
     * javax.swing.text.StyleConstants$CharacterConstants}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link StyleConstantsClassTests.CharacterConstantsClassTests}.
     * </p>
     *
     * @see javax.swing.text.StyleConstants.CharacterConstants class javax.swing.text.StyleConstants$CharacterConstants
     *      (the hereby targeted class-under-test class)
     * @see StyleConstantsClassTests.CharacterConstantsClassTests StyleConstantsClassTests.CharacterConstantsClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CharacterConstantsTests<SUT extends javax.swing.text.StyleConstants.CharacterConstants>
    extends AttributeSetTests.CharacterAttributeTests<SUT>, StyleConstantsTests<SUT> {

    }

}
