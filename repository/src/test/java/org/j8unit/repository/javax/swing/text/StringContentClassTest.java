package org.j8unit.repository.javax.swing.text;

import javax.swing.text.StringContent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StringContent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.StringContentClassTests}).
 */
@RunWith(J8Unit4.class)
public class StringContentClassTest
implements StringContentClassTests<StringContent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.StringContent]

    @Override
    public Class<StringContent> createNewSUT() {
        return StringContent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.text.StringContent#StringContent()
     * public javax.swing.text.StringContent()}.
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
    public void create_StringContent()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringContent sut = new StringContent();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.StringContent#StringContent(int) public javax.swing.text.StringContent(int)}.
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
    public void create_StringContent_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringContent sut = null; // = new StringContent(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.StringContent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.StringContent]

}
