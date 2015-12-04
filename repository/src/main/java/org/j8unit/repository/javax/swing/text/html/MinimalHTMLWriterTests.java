package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.MinimalHTMLWriter class javax.swing.text.html.MinimalHTMLWriter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.html.MinimalHTMLWriterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MinimalHTMLWriterTests<SUT extends javax.swing.text.html.MinimalHTMLWriter>
extends org.j8unit.repository.javax.swing.text.AbstractWriterTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.MinimalHTMLWriter#write() public void
     * javax.swing.text.html.MinimalHTMLWriter.write() throws java.io.IOException,javax.swing.text.BadLocationException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
