package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.Utilities class javax.swing.text.Utilities}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.UtilitiesTests}.
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
 * @see org.j8unit.repository.javax.swing.text.UtilitiesTests
 */
@Category(J8UnitRepository.class)
public abstract interface UtilitiesClassTests<SUT extends Class<? extends javax.swing.text.Utilities>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.text.Utilities#Utilities() public javax.swing.text.Utilities()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Utilities()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.Utilities sut = null; // = new Utilities();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.text.Utilities> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.Utilities.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Utilities#getPositionAbove(javax.swing.text.JTextComponent,int,int)
     * public static final int javax.swing.text.Utilities.getPositionAbove(javax.swing.text.JTextComponent,int,int)
     * throws javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPositionAbove_JTextComponent_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.Utilities#drawTabbedText(javax.swing.text.Segment,int,int,java.awt.Graphics,javax.swing.text.TabExpander,int)
     * public static final int
     * javax.swing.text.Utilities.drawTabbedText(javax.swing.text.Segment,int,int,java.awt.Graphics,javax.swing.text.TabExpander,int)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_drawTabbedText_Segment_int_int_Graphics_TabExpander_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Utilities#getParagraphElement(javax.swing.text.JTextComponent,int) public
     * static final javax.swing.text.Element
     * javax.swing.text.Utilities.getParagraphElement(javax.swing.text.JTextComponent,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParagraphElement_JTextComponent_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Utilities#getRowEnd(javax.swing.text.JTextComponent,int) public static
     * final int javax.swing.text.Utilities.getRowEnd(javax.swing.text.JTextComponent,int) throws
     * javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRowEnd_JTextComponent_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.Utilities#getTabbedTextWidth(javax.swing.text.Segment,java.awt.FontMetrics,int,javax.swing.text.TabExpander,int)
     * public static final int
     * javax.swing.text.Utilities.getTabbedTextWidth(javax.swing.text.Segment,java.awt.FontMetrics,int,javax.swing.text.TabExpander,int)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTabbedTextWidth_Segment_FontMetrics_int_TabExpander_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.Utilities#getTabbedTextOffset(javax.swing.text.Segment,java.awt.FontMetrics,int,int,javax.swing.text.TabExpander,int)
     * public static final int
     * javax.swing.text.Utilities.getTabbedTextOffset(javax.swing.text.Segment,java.awt.FontMetrics,int,int,javax.swing.text.TabExpander,int)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTabbedTextOffset_Segment_FontMetrics_int_int_TabExpander_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.Utilities#getTabbedTextOffset(javax.swing.text.Segment,java.awt.FontMetrics,int,int,javax.swing.text.TabExpander,int,boolean)
     * public static final int
     * javax.swing.text.Utilities.getTabbedTextOffset(javax.swing.text.Segment,java.awt.FontMetrics,int,int,javax.swing.text.TabExpander,int,boolean)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTabbedTextOffset_Segment_FontMetrics_int_int_TabExpander_int_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.Utilities#getBreakLocation(javax.swing.text.Segment,java.awt.FontMetrics,int,int,javax.swing.text.TabExpander,int)
     * public static final int
     * javax.swing.text.Utilities.getBreakLocation(javax.swing.text.Segment,java.awt.FontMetrics,int,int,javax.swing.text.TabExpander,int)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBreakLocation_Segment_FontMetrics_int_int_TabExpander_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Utilities#getWordEnd(javax.swing.text.JTextComponent,int) public static
     * final int javax.swing.text.Utilities.getWordEnd(javax.swing.text.JTextComponent,int) throws
     * javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWordEnd_JTextComponent_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Utilities#getPreviousWord(javax.swing.text.JTextComponent,int) public
     * static final int javax.swing.text.Utilities.getPreviousWord(javax.swing.text.JTextComponent,int) throws
     * javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPreviousWord_JTextComponent_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Utilities#getWordStart(javax.swing.text.JTextComponent,int) public static
     * final int javax.swing.text.Utilities.getWordStart(javax.swing.text.JTextComponent,int) throws
     * javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWordStart_JTextComponent_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Utilities#getNextWord(javax.swing.text.JTextComponent,int) public static
     * final int javax.swing.text.Utilities.getNextWord(javax.swing.text.JTextComponent,int) throws
     * javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNextWord_JTextComponent_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Utilities#getRowStart(javax.swing.text.JTextComponent,int) public static
     * final int javax.swing.text.Utilities.getRowStart(javax.swing.text.JTextComponent,int) throws
     * javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRowStart_JTextComponent_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Utilities#getPositionBelow(javax.swing.text.JTextComponent,int,int)
     * public static final int javax.swing.text.Utilities.getPositionBelow(javax.swing.text.JTextComponent,int,int)
     * throws javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPositionBelow_JTextComponent_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
