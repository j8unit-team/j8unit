package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.Element;
import javax.swing.text.html.ParagraphView;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParagraphViewClassTest
implements org.j8unit.repository.javax.swing.text.html.ParagraphViewClassTests<ParagraphView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.ParagraphView]

    @Override
    public Class<ParagraphView> createNewSUT() {
        return ParagraphView.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ParagraphView#ParagraphView(Element) public
     * javax.swing.text.html.ParagraphView(javax.swing.text.Element)}.
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
    public void create_ParagraphView_Element()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ParagraphView sut = null; // = new ParagraphView(Element);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.ParagraphView]

}
