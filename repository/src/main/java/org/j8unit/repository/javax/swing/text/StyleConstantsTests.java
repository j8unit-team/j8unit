package org.j8unit.repository.javax.swing.text;

import javax.swing.text.StyleConstants;
import javax.swing.text.StyleConstants.CharacterConstants;
import javax.swing.text.StyleConstants.ColorConstants;
import javax.swing.text.StyleConstants.FontConstants;
import javax.swing.text.StyleConstants.ParagraphConstants;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.repository.javax.swing.text.AttributeSetTests.CharacterAttributeTests;
import org.j8unit.repository.javax.swing.text.AttributeSetTests.ColorAttributeTests;
import org.j8unit.repository.javax.swing.text.AttributeSetTests.FontAttributeTests;
import org.j8unit.repository.javax.swing.text.AttributeSetTests.ParagraphAttributeTests;
import org.j8unit.repository.javax.swing.text.StyleConstantsClassTests.CharacterConstantsClassTests;
import org.j8unit.repository.javax.swing.text.StyleConstantsClassTests.ColorConstantsClassTests;
import org.j8unit.repository.javax.swing.text.StyleConstantsClassTests.FontConstantsClassTests;
import org.j8unit.repository.javax.swing.text.StyleConstantsClassTests.ParagraphConstantsClassTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link StyleConstants
 * public class javax.swing.text.StyleConstants}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link StyleConstantsClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StyleConstantsTests<SUT extends StyleConstants>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyleConstants]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.StyleConstants#toString() public
     * java.lang.String javax.swing.text.StyleConstants.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.StyleConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.StyleConstants]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link FontConstants public static class javax.swing.text.StyleConstants$FontConstants}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link FontConstantsClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FontConstantsTests<SUT extends FontConstants>
    extends FontAttributeTests<SUT>, CharacterAttributeTests<SUT>, org.j8unit.repository.javax.swing.text.StyleConstantsTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyleConstants$FontConstants]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.StyleConstants$FontConstants]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.StyleConstants$FontConstants]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link CharacterConstants public static class javax.swing.text.StyleConstants$CharacterConstants}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link CharacterConstantsClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CharacterConstantsTests<SUT extends CharacterConstants>
    extends CharacterAttributeTests<SUT>, org.j8unit.repository.javax.swing.text.StyleConstantsTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyleConstants$CharacterConstants]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.StyleConstants$CharacterConstants]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.StyleConstants$CharacterConstants]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link ParagraphConstants public static class javax.swing.text.StyleConstants$ParagraphConstants}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link ParagraphConstantsClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ParagraphConstantsTests<SUT extends ParagraphConstants>
    extends ParagraphAttributeTests<SUT>, org.j8unit.repository.javax.swing.text.StyleConstantsTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyleConstants$ParagraphConstants]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.StyleConstants$ParagraphConstants]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.StyleConstants$ParagraphConstants]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link ColorConstants public static class javax.swing.text.StyleConstants$ColorConstants}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link ColorConstantsClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ColorConstantsTests<SUT extends ColorConstants>
    extends ColorAttributeTests<SUT>, CharacterAttributeTests<SUT>, org.j8unit.repository.javax.swing.text.StyleConstantsTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyleConstants$ColorConstants]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.StyleConstants$ColorConstants]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.StyleConstants$ColorConstants]
    }

}
