package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.PlainDocument class javax.swing.text.PlainDocument}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PlainDocumentClassTests}.
 * </p>
 *
 * @see javax.swing.text.PlainDocument class javax.swing.text.PlainDocument (the hereby targeted class-under-test class)
 * @see PlainDocumentClassTests PlainDocumentClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PlainDocumentTests<SUT extends javax.swing.text.PlainDocument>
extends AbstractDocumentTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.PlainDocument#insertString(int, String, javax.swing.text.AttributeSet)
     * public void javax.swing.text.PlainDocument.insertString(int,java.lang.String,javax.swing.text.AttributeSet)
     * throws javax.swing.text.BadLocationException}.
     *
     * <p>
     * Test method for {@link javax.swing.text.PlainDocument#insertString(int, String, javax.swing.text.AttributeSet)
     * public void javax.swing.text.PlainDocument.insertString(int,java.lang.String,javax.swing.text.AttributeSet)
     * throws javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.PlainDocument#insertString(int, String, javax.swing.text.AttributeSet) public void
     *      javax.swing.text.PlainDocument.insertString(int,java.lang.String,javax.swing.text.AttributeSet) throws
     *      javax.swing.text.BadLocationException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_insertString_int_String_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.PlainDocument#getDefaultRootElement() public javax.swing.text.Element
     * javax.swing.text.PlainDocument.getDefaultRootElement()}.
     *
     * <p>
     * Test method for {@link javax.swing.text.PlainDocument#getDefaultRootElement() public javax.swing.text.Element
     * javax.swing.text.PlainDocument.getDefaultRootElement()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.PlainDocument#getDefaultRootElement() public javax.swing.text.Element
     *      javax.swing.text.PlainDocument.getDefaultRootElement() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDefaultRootElement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.PlainDocument#getParagraphElement(int) public javax.swing.text.Element
     * javax.swing.text.PlainDocument.getParagraphElement(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.text.PlainDocument#getParagraphElement(int) public javax.swing.text.Element
     * javax.swing.text.PlainDocument.getParagraphElement(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.PlainDocument#getParagraphElement(int) public javax.swing.text.Element
     *      javax.swing.text.PlainDocument.getParagraphElement(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getParagraphElement_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
