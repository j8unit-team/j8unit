package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLWriter class
 * javax.swing.text.html.HTMLWriter}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.html.HTMLWriterTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.html.HTMLWriterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.html.HTMLWriter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HTMLWriterTests<SUT extends javax.swing.text.html.HTMLWriter>
extends org.j8unit.repository.javax.swing.text.AbstractWriterTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLWriter#write() public void
     * javax.swing.text.html.HTMLWriter.write() throws java.io.IOException,javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLWriter#write()
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
