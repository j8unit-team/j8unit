package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.StyleConstants class javax.swing.text.StyleConstants}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.StyleConstantsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface StyleConstantsTests<SUT extends javax.swing.text.StyleConstants>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyleConstants$CharacterConstants class
     * javax.swing.text.StyleConstants$CharacterConstants}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.StyleConstantsClassTests.CharacterConstantsClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface CharacterConstantsTests<SUT extends javax.swing.text.StyleConstants.CharacterConstants>
    extends org.j8unit.repository.javax.swing.text.AttributeSetTests.CharacterAttributeTests<SUT>,
    org.j8unit.repository.javax.swing.text.StyleConstantsTests<SUT> {

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyleConstants$ColorConstants class
     * javax.swing.text.StyleConstants$ColorConstants}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.StyleConstantsClassTests.ColorConstantsClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ColorConstantsTests<SUT extends javax.swing.text.StyleConstants.ColorConstants>
    extends org.j8unit.repository.javax.swing.text.AttributeSetTests.ColorAttributeTests<SUT>,
    org.j8unit.repository.javax.swing.text.AttributeSetTests.CharacterAttributeTests<SUT>, org.j8unit.repository.javax.swing.text.StyleConstantsTests<SUT> {

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyleConstants$FontConstants class
     * javax.swing.text.StyleConstants$FontConstants}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.StyleConstantsClassTests.FontConstantsClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FontConstantsTests<SUT extends javax.swing.text.StyleConstants.FontConstants>
    extends org.j8unit.repository.javax.swing.text.AttributeSetTests.FontAttributeTests<SUT>,
    org.j8unit.repository.javax.swing.text.AttributeSetTests.CharacterAttributeTests<SUT>, org.j8unit.repository.javax.swing.text.StyleConstantsTests<SUT> {

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyleConstants$ParagraphConstants class
     * javax.swing.text.StyleConstants$ParagraphConstants}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.StyleConstantsClassTests.ParagraphConstantsClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ParagraphConstantsTests<SUT extends javax.swing.text.StyleConstants.ParagraphConstants>
    extends org.j8unit.repository.javax.swing.text.AttributeSetTests.ParagraphAttributeTests<SUT>,
    org.j8unit.repository.javax.swing.text.StyleConstantsTests<SUT> {

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#toString() public java.lang.String
     * javax.swing.text.StyleConstants.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
