package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.StyleConstants class javax.swing.text.StyleConstants}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.StyleConstantsTests}.
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
 * @see org.j8unit.repository.javax.swing.text.StyleConstantsTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StyleConstantsClassTests<SUT extends javax.swing.text.StyleConstants>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyleConstants$CharacterConstants class
     * javax.swing.text.StyleConstants$CharacterConstants}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyleConstantsTests.CharacterConstantsTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.StyleConstantsTests.CharacterConstantsTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CharacterConstantsClassTests<SUT extends javax.swing.text.StyleConstants.CharacterConstants>
    extends org.j8unit.repository.javax.swing.text.AttributeSetClassTests.CharacterAttributeClassTests<SUT>,
    org.j8unit.repository.javax.swing.text.StyleConstantsClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyleConstants.CharacterConstants.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyleConstants$ColorConstants class
     * javax.swing.text.StyleConstants$ColorConstants}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyleConstantsTests.ColorConstantsTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.StyleConstantsTests.ColorConstantsTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ColorConstantsClassTests<SUT extends javax.swing.text.StyleConstants.ColorConstants>
    extends org.j8unit.repository.javax.swing.text.AttributeSetClassTests.ColorAttributeClassTests<SUT>,
    org.j8unit.repository.javax.swing.text.AttributeSetClassTests.CharacterAttributeClassTests<SUT>,
    org.j8unit.repository.javax.swing.text.StyleConstantsClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyleConstants.ColorConstants.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyleConstants$FontConstants class
     * javax.swing.text.StyleConstants$FontConstants}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyleConstantsTests.FontConstantsTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.StyleConstantsTests.FontConstantsTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FontConstantsClassTests<SUT extends javax.swing.text.StyleConstants.FontConstants>
    extends org.j8unit.repository.javax.swing.text.AttributeSetClassTests.FontAttributeClassTests<SUT>,
    org.j8unit.repository.javax.swing.text.AttributeSetClassTests.CharacterAttributeClassTests<SUT>,
    org.j8unit.repository.javax.swing.text.StyleConstantsClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyleConstants.FontConstants.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyleConstants$ParagraphConstants class
     * javax.swing.text.StyleConstants$ParagraphConstants}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyleConstantsTests.ParagraphConstantsTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.StyleConstantsTests.ParagraphConstantsTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ParagraphConstantsClassTests<SUT extends javax.swing.text.StyleConstants.ParagraphConstants>
    extends org.j8unit.repository.javax.swing.text.AttributeSetClassTests.ParagraphAttributeClassTests<SUT>,
    org.j8unit.repository.javax.swing.text.StyleConstantsClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyleConstants.ParagraphConstants.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getAlignment(javax.swing.text.AttributeSet) public static
     * int javax.swing.text.StyleConstants.getAlignment(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlignment_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getBackground(javax.swing.text.AttributeSet) public static
     * java.awt.Color javax.swing.text.StyleConstants.getBackground(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBackground_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getBidiLevel(javax.swing.text.AttributeSet) public static
     * int javax.swing.text.StyleConstants.getBidiLevel(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBidiLevel_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getComponent(javax.swing.text.AttributeSet) public static
     * java.awt.Component javax.swing.text.StyleConstants.getComponent(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getComponent_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getFirstLineIndent(javax.swing.text.AttributeSet) public
     * static float javax.swing.text.StyleConstants.getFirstLineIndent(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFirstLineIndent_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getFontFamily(javax.swing.text.AttributeSet) public static
     * java.lang.String javax.swing.text.StyleConstants.getFontFamily(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFontFamily_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getFontSize(javax.swing.text.AttributeSet) public static
     * int javax.swing.text.StyleConstants.getFontSize(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFontSize_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getForeground(javax.swing.text.AttributeSet) public static
     * java.awt.Color javax.swing.text.StyleConstants.getForeground(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getForeground_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getIcon(javax.swing.text.AttributeSet) public static
     * javax.swing.Icon javax.swing.text.StyleConstants.getIcon(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIcon_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getLeftIndent(javax.swing.text.AttributeSet) public static
     * float javax.swing.text.StyleConstants.getLeftIndent(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLeftIndent_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getLineSpacing(javax.swing.text.AttributeSet) public
     * static float javax.swing.text.StyleConstants.getLineSpacing(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLineSpacing_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getRightIndent(javax.swing.text.AttributeSet) public
     * static float javax.swing.text.StyleConstants.getRightIndent(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRightIndent_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getSpaceAbove(javax.swing.text.AttributeSet) public static
     * float javax.swing.text.StyleConstants.getSpaceAbove(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSpaceAbove_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getSpaceBelow(javax.swing.text.AttributeSet) public static
     * float javax.swing.text.StyleConstants.getSpaceBelow(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSpaceBelow_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#getTabSet(javax.swing.text.AttributeSet) public static
     * javax.swing.text.TabSet javax.swing.text.StyleConstants.getTabSet(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTabSet_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#isBold(javax.swing.text.AttributeSet) public static
     * boolean javax.swing.text.StyleConstants.isBold(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isBold_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#isItalic(javax.swing.text.AttributeSet) public static
     * boolean javax.swing.text.StyleConstants.isItalic(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isItalic_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#isStrikeThrough(javax.swing.text.AttributeSet) public
     * static boolean javax.swing.text.StyleConstants.isStrikeThrough(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isStrikeThrough_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#isSubscript(javax.swing.text.AttributeSet) public static
     * boolean javax.swing.text.StyleConstants.isSubscript(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSubscript_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#isSuperscript(javax.swing.text.AttributeSet) public static
     * boolean javax.swing.text.StyleConstants.isSuperscript(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSuperscript_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#isUnderline(javax.swing.text.AttributeSet) public static
     * boolean javax.swing.text.StyleConstants.isUnderline(javax.swing.text.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isUnderline_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#setAlignment(javax.swing.text.MutableAttributeSet,int)
     * public static void javax.swing.text.StyleConstants.setAlignment(javax.swing.text.MutableAttributeSet,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAlignment_MutableAttributeSet_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.StyleConstants#setBackground(javax.swing.text.MutableAttributeSet,java.awt.Color) public
     * static void javax.swing.text.StyleConstants.setBackground(javax.swing.text.MutableAttributeSet,java.awt.Color)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setBackground_MutableAttributeSet_Color()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#setBidiLevel(javax.swing.text.MutableAttributeSet,int)
     * public static void javax.swing.text.StyleConstants.setBidiLevel(javax.swing.text.MutableAttributeSet,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setBidiLevel_MutableAttributeSet_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#setBold(javax.swing.text.MutableAttributeSet,boolean)
     * public static void javax.swing.text.StyleConstants.setBold(javax.swing.text.MutableAttributeSet,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setBold_MutableAttributeSet_boolean()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.StyleConstants#setComponent(javax.swing.text.MutableAttributeSet,java.awt.Component)
     * public static void
     * javax.swing.text.StyleConstants.setComponent(javax.swing.text.MutableAttributeSet,java.awt.Component)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setComponent_MutableAttributeSet_Component()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.StyleConstants#setFirstLineIndent(javax.swing.text.MutableAttributeSet,float) public
     * static void javax.swing.text.StyleConstants.setFirstLineIndent(javax.swing.text.MutableAttributeSet,float)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFirstLineIndent_MutableAttributeSet_float()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.StyleConstants#setFontFamily(javax.swing.text.MutableAttributeSet,java.lang.String)
     * public static void
     * javax.swing.text.StyleConstants.setFontFamily(javax.swing.text.MutableAttributeSet,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFontFamily_MutableAttributeSet_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#setFontSize(javax.swing.text.MutableAttributeSet,int)
     * public static void javax.swing.text.StyleConstants.setFontSize(javax.swing.text.MutableAttributeSet,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFontSize_MutableAttributeSet_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.StyleConstants#setForeground(javax.swing.text.MutableAttributeSet,java.awt.Color) public
     * static void javax.swing.text.StyleConstants.setForeground(javax.swing.text.MutableAttributeSet,java.awt.Color)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setForeground_MutableAttributeSet_Color()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.StyleConstants#setIcon(javax.swing.text.MutableAttributeSet,javax.swing.Icon) public
     * static void javax.swing.text.StyleConstants.setIcon(javax.swing.text.MutableAttributeSet,javax.swing.Icon)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setIcon_MutableAttributeSet_Icon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#setItalic(javax.swing.text.MutableAttributeSet,boolean)
     * public static void javax.swing.text.StyleConstants.setItalic(javax.swing.text.MutableAttributeSet,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setItalic_MutableAttributeSet_boolean()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#setLeftIndent(javax.swing.text.MutableAttributeSet,float)
     * public static void javax.swing.text.StyleConstants.setLeftIndent(javax.swing.text.MutableAttributeSet,float)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLeftIndent_MutableAttributeSet_float()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#setLineSpacing(javax.swing.text.MutableAttributeSet,float)
     * public static void javax.swing.text.StyleConstants.setLineSpacing(javax.swing.text.MutableAttributeSet,float)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLineSpacing_MutableAttributeSet_float()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#setRightIndent(javax.swing.text.MutableAttributeSet,float)
     * public static void javax.swing.text.StyleConstants.setRightIndent(javax.swing.text.MutableAttributeSet,float)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRightIndent_MutableAttributeSet_float()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#setSpaceAbove(javax.swing.text.MutableAttributeSet,float)
     * public static void javax.swing.text.StyleConstants.setSpaceAbove(javax.swing.text.MutableAttributeSet,float)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSpaceAbove_MutableAttributeSet_float()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#setSpaceBelow(javax.swing.text.MutableAttributeSet,float)
     * public static void javax.swing.text.StyleConstants.setSpaceBelow(javax.swing.text.MutableAttributeSet,float)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSpaceBelow_MutableAttributeSet_float()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.StyleConstants#setStrikeThrough(javax.swing.text.MutableAttributeSet,boolean) public
     * static void javax.swing.text.StyleConstants.setStrikeThrough(javax.swing.text.MutableAttributeSet,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setStrikeThrough_MutableAttributeSet_boolean()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#setSubscript(javax.swing.text.MutableAttributeSet,boolean)
     * public static void javax.swing.text.StyleConstants.setSubscript(javax.swing.text.MutableAttributeSet,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSubscript_MutableAttributeSet_boolean()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.StyleConstants#setSuperscript(javax.swing.text.MutableAttributeSet,boolean) public static
     * void javax.swing.text.StyleConstants.setSuperscript(javax.swing.text.MutableAttributeSet,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSuperscript_MutableAttributeSet_boolean()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.StyleConstants#setTabSet(javax.swing.text.MutableAttributeSet,javax.swing.text.TabSet)
     * public static void
     * javax.swing.text.StyleConstants.setTabSet(javax.swing.text.MutableAttributeSet,javax.swing.text.TabSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTabSet_MutableAttributeSet_TabSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleConstants#setUnderline(javax.swing.text.MutableAttributeSet,boolean)
     * public static void javax.swing.text.StyleConstants.setUnderline(javax.swing.text.MutableAttributeSet,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setUnderline_MutableAttributeSet_boolean()
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
        assertTrue(javax.swing.text.StyleConstants.class.isAssignableFrom(sut));
    }

}
