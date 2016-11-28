package org.j8unit.repository.javax.swing.text;

import javax.swing.text.GapContent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GapContent} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.GapContentClassTests}).
 */
@RunWith(J8Unit4.class)
public class GapContentClassTest
implements GapContentClassTests<GapContent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.GapContent]

    @Override
    public Class<GapContent> createNewSUT() {
        return GapContent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.text.GapContent#GapContent(int)
     * public javax.swing.text.GapContent(int)}.
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
    public void create_GapContent_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GapContent sut = null; // = new GapContent(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.text.GapContent#GapContent() public
     * javax.swing.text.GapContent()}.
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
    public void create_GapContent()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GapContent sut = new GapContent();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.GapContent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.GapContent]

}
