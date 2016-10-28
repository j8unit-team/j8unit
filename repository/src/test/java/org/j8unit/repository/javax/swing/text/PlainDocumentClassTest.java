package org.j8unit.repository.javax.swing.text;

import javax.swing.text.PlainDocument;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PlainDocumentClassTest
implements org.j8unit.repository.javax.swing.text.PlainDocumentClassTests<PlainDocument> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.PlainDocument]

    @Override
    public Class<PlainDocument> createNewSUT() {
        return PlainDocument.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.text.PlainDocument#PlainDocument()
     * public javax.swing.text.PlainDocument()}.
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
    public void create_PlainDocument()
    throws Exception {
        // create new instance
        final PlainDocument sut = new PlainDocument();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.PlainDocument#PlainDocument(javax.swing.text.AbstractDocument.Content) public
     * javax.swing.text.PlainDocument(javax.swing.text.AbstractDocument$Content)}.
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
    public void create_PlainDocument_Content()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PlainDocument sut = null; // = new PlainDocument(javax.swing.text.AbstractDocument.Content);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.PlainDocument]

}
