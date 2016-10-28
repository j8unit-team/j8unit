package org.j8unit.repository.java.awt;

import java.awt.ScrollPane;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScrollPaneClassTest
implements org.j8unit.repository.java.awt.ScrollPaneClassTests<ScrollPane> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.ScrollPane]

    @Override
    public Class<ScrollPane> createNewSUT() {
        return ScrollPane.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ScrollPane#ScrollPane(int) public
     * java.awt.ScrollPane(int) throws java.awt.HeadlessException}.
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
    public void create_ScrollPane_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ScrollPane sut = null; // = new ScrollPane(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ScrollPane#ScrollPane() public
     * java.awt.ScrollPane() throws java.awt.HeadlessException}.
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
    public void create_ScrollPane()
    throws Exception {
        // create new instance
        final ScrollPane sut = new ScrollPane();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.ScrollPane]

}
