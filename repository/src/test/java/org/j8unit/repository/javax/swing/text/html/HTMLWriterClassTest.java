package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.html.HTMLWriter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLWriter} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.html.HTMLWriterClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLWriterClassTest
implements HTMLWriterClassTests<HTMLWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLWriter]

    @Override
    public Class<HTMLWriter> createNewSUT() {
        return HTMLWriter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.html.HTMLWriter#HTMLWriter(java.io.Writer, javax.swing.text.html.HTMLDocument, int, int)
     * public javax.swing.text.html.HTMLWriter(java.io.Writer,javax.swing.text.html.HTMLDocument,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_HTMLWriter_Writer_HTMLDocument_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final HTMLWriter sut = null; // = new HTMLWriter(java.io.Writer, javax.swing.text.html.HTMLDocument, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.html.HTMLWriter#HTMLWriter(java.io.Writer, javax.swing.text.html.HTMLDocument) public
     * javax.swing.text.html.HTMLWriter(java.io.Writer,javax.swing.text.html.HTMLDocument)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_HTMLWriter_Writer_HTMLDocument()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final HTMLWriter sut = null; // = new HTMLWriter(java.io.Writer, javax.swing.text.html.HTMLDocument);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLWriter]

}
