package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.StringContent class javax.swing.text.StringContent}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link StringContentClassTests}.
 * </p>
 *
 * @see javax.swing.text.StringContent class javax.swing.text.StringContent (the hereby targeted class-under-test class)
 * @see StringContentClassTests StringContentClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StringContentTests<SUT extends javax.swing.text.StringContent>
extends AbstractDocumentTests.ContentTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.StringContent#getChars(int, int, javax.swing.text.Segment) public void
     * javax.swing.text.StringContent.getChars(int,int,javax.swing.text.Segment) throws
     * javax.swing.text.BadLocationException}.
     *
     * <p>
     * Test method for {@link javax.swing.text.StringContent#getChars(int, int, javax.swing.text.Segment) public void
     * javax.swing.text.StringContent.getChars(int,int,javax.swing.text.Segment) throws
     * javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.StringContent#getChars(int, int, javax.swing.text.Segment) public void
     *      javax.swing.text.StringContent.getChars(int,int,javax.swing.text.Segment) throws
     *      javax.swing.text.BadLocationException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getChars_int_int_Segment()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StringContent#remove(int, int) public javax.swing.undo.UndoableEdit
     * javax.swing.text.StringContent.remove(int,int) throws javax.swing.text.BadLocationException}.
     *
     * <p>
     * Test method for {@link javax.swing.text.StringContent#remove(int, int) public javax.swing.undo.UndoableEdit
     * javax.swing.text.StringContent.remove(int,int) throws javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.StringContent#remove(int, int) public javax.swing.undo.UndoableEdit
     *      javax.swing.text.StringContent.remove(int,int) throws javax.swing.text.BadLocationException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_remove_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StringContent#getString(int, int) public java.lang.String
     * javax.swing.text.StringContent.getString(int,int) throws javax.swing.text.BadLocationException}.
     *
     * <p>
     * Test method for {@link javax.swing.text.StringContent#getString(int, int) public java.lang.String
     * javax.swing.text.StringContent.getString(int,int) throws javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.StringContent#getString(int, int) public java.lang.String
     *      javax.swing.text.StringContent.getString(int,int) throws javax.swing.text.BadLocationException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getString_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StringContent#createPosition(int) public javax.swing.text.Position
     * javax.swing.text.StringContent.createPosition(int) throws javax.swing.text.BadLocationException}.
     *
     * <p>
     * Test method for {@link javax.swing.text.StringContent#createPosition(int) public javax.swing.text.Position
     * javax.swing.text.StringContent.createPosition(int) throws javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.StringContent#createPosition(int) public javax.swing.text.Position
     *      javax.swing.text.StringContent.createPosition(int) throws javax.swing.text.BadLocationException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createPosition_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StringContent#length() public int
     * javax.swing.text.StringContent.length()}.
     *
     * <p>
     * Test method for {@link javax.swing.text.StringContent#length() public int
     * javax.swing.text.StringContent.length()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.StringContent#length() public int javax.swing.text.StringContent.length() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_length()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StringContent#insertString(int, String) public
     * javax.swing.undo.UndoableEdit javax.swing.text.StringContent.insertString(int,java.lang.String) throws
     * javax.swing.text.BadLocationException}.
     *
     * <p>
     * Test method for {@link javax.swing.text.StringContent#insertString(int, String) public
     * javax.swing.undo.UndoableEdit javax.swing.text.StringContent.insertString(int,java.lang.String) throws
     * javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.StringContent#insertString(int, String) public javax.swing.undo.UndoableEdit
     *      javax.swing.text.StringContent.insertString(int,java.lang.String) throws
     *      javax.swing.text.BadLocationException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_insertString_int_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
