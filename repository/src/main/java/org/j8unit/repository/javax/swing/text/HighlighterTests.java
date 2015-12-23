package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.Highlighter interface javax.swing.text.Highlighter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.HighlighterTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.HighlighterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.Highlighter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HighlighterTests<SUT extends javax.swing.text.Highlighter>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.Highlighter.HighlightPainter interface
     * javax.swing.text.Highlighter$HighlightPainter}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.HighlighterTests.HighlightPainterTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.HighlighterClassTests.HighlightPainterClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.Highlighter.HighlightPainter
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface HighlightPainterTests<SUT extends javax.swing.text.Highlighter.HighlightPainter>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.Highlighter.HighlightPainter#paint(java.awt.Graphics, int, int, java.awt.Shape, javax.swing.text.JTextComponent)
         * public abstract void
         * javax.swing.text.Highlighter$HighlightPainter.paint(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.Highlighter.HighlightPainter#paint(java.awt.Graphics, int, int, java.awt.Shape,
         *             javax.swing.text.JTextComponent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_paint_Graphics_int_int_Shape_JTextComponent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.Highlighter.Highlight interface
     * javax.swing.text.Highlighter$Highlight}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.HighlighterTests.HighlightTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.HighlighterClassTests.HighlightClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.Highlighter.Highlight
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface HighlightTests<SUT extends javax.swing.text.Highlighter.Highlight>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.Highlighter.Highlight#getEndOffset() public abstract int
         * javax.swing.text.Highlighter$Highlight.getEndOffset()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.Highlighter.Highlight#getEndOffset()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getEndOffset()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.Highlighter.Highlight#getPainter() public abstract
         * javax.swing.text.Highlighter$HighlightPainter javax.swing.text.Highlighter$Highlight.getPainter()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.Highlighter.Highlight#getPainter()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getPainter()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.Highlighter.Highlight#getStartOffset() public abstract int
         * javax.swing.text.Highlighter$Highlight.getStartOffset()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.Highlighter.Highlight#getStartOffset()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getStartOffset()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.Highlighter#addHighlight(int, int, javax.swing.text.Highlighter.HighlightPainter) public
     * abstract java.lang.Object
     * javax.swing.text.Highlighter.addHighlight(int,int,javax.swing.text.Highlighter$HighlightPainter) throws
     * javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.Highlighter#addHighlight(int, int, javax.swing.text.Highlighter.HighlightPainter)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addHighlight_int_int_HighlightPainter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Highlighter#changeHighlight(java.lang.Object, int, int) public abstract
     * void javax.swing.text.Highlighter.changeHighlight(java.lang.Object,int,int) throws
     * javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.Highlighter#changeHighlight(java.lang.Object, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_changeHighlight_Object_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Highlighter#deinstall(javax.swing.text.JTextComponent) public abstract
     * void javax.swing.text.Highlighter.deinstall(javax.swing.text.JTextComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.Highlighter#deinstall(javax.swing.text.JTextComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deinstall_JTextComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Highlighter#getHighlights() public abstract
     * javax.swing.text.Highlighter$Highlight[] javax.swing.text.Highlighter.getHighlights()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.Highlighter#getHighlights()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHighlights()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Highlighter#install(javax.swing.text.JTextComponent) public abstract void
     * javax.swing.text.Highlighter.install(javax.swing.text.JTextComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.Highlighter#install(javax.swing.text.JTextComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_install_JTextComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Highlighter#paint(java.awt.Graphics) public abstract void
     * javax.swing.text.Highlighter.paint(java.awt.Graphics)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.Highlighter#paint(java.awt.Graphics)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paint_Graphics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Highlighter#removeAllHighlights() public abstract void
     * javax.swing.text.Highlighter.removeAllHighlights()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.Highlighter#removeAllHighlights()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeAllHighlights()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Highlighter#removeHighlight(java.lang.Object) public abstract void
     * javax.swing.text.Highlighter.removeHighlight(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.Highlighter#removeHighlight(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeHighlight_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
