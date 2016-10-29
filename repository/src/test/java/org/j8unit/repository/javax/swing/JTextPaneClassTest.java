package org.j8unit.repository.javax.swing;

import javax.swing.JTextPane;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTextPaneClassTest
implements org.j8unit.repository.javax.swing.JTextPaneClassTests<JTextPane> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JTextPane]

    @Override
    public Class<JTextPane> createNewSUT() {
        return JTextPane.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JTextPane#JTextPane(javax.swing.text.StyledDocument) public
     * javax.swing.JTextPane(javax.swing.text.StyledDocument)}.
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
    public void create_JTextPane_StyledDocument()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JTextPane sut = null; // = new JTextPane(javax.swing.text.StyledDocument);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JTextPane#JTextPane() public
     * javax.swing.JTextPane()}.
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
    public void create_JTextPane()
    throws Exception {
        // create new instance
        final JTextPane sut = new JTextPane();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JTextPane]

}
