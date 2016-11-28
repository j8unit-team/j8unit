package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.FontUIResource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FontUIResource} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.FontUIResourceClassTests}).
 */
@RunWith(J8Unit4.class)
public class FontUIResourceClassTest
implements FontUIResourceClassTests<FontUIResource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.FontUIResource]

    @Override
    public Class<FontUIResource> createNewSUT() {
        return FontUIResource.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.FontUIResource#FontUIResource(String, int, int) public
     * javax.swing.plaf.FontUIResource(java.lang.String,int,int)}.
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
    public void create_FontUIResource_String_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FontUIResource sut = null; // = new FontUIResource(String, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.FontUIResource#FontUIResource(java.awt.Font) public
     * javax.swing.plaf.FontUIResource(java.awt.Font)}.
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
    public void create_FontUIResource_Font()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FontUIResource sut = null; // = new FontUIResource(java.awt.Font);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.FontUIResource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.FontUIResource]

}
