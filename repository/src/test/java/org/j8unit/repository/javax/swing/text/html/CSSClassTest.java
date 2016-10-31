package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.html.CSS;
import javax.swing.text.html.CSS.Attribute;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CSSClassTest
implements org.j8unit.repository.javax.swing.text.html.CSSClassTests<CSS> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.CSS]

    @Override
    public Class<CSS> createNewSUT() {
        return CSS.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.text.html.CSS#CSS() public
     * javax.swing.text.html.CSS()}.
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
    public void create_CSS()
    throws Exception {
        // create new instance
        final CSS sut = new CSS();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.html.CSS#getAttribute(String)
     * public static final javax.swing.text.html.CSS$Attribute
     * javax.swing.text.html.CSS.getAttribute(java.lang.String)}.
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
    public void test_getAttribute_String()
    throws Exception {
        // write some test for {@link javax.swing.text.html.CSS#getAttribute(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.html.CSS#getAllAttributeKeys()
     * public static javax.swing.text.html.CSS$Attribute[] javax.swing.text.html.CSS.getAllAttributeKeys()}.
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
    public void test_getAllAttributeKeys()
    throws Exception {
        // write some test for {@link javax.swing.text.html.CSS#getAllAttributeKeys()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.CSS]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.CSS]

    @RunWith(J8Unit4.class)
    public static class AttributeClassTest
    implements org.j8unit.repository.javax.swing.text.html.CSSClassTests.AttributeClassTests<Attribute> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.CSS$Attribute]

        @Override
        public Class<Attribute> createNewSUT() {
            return Attribute.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.CSS$Attribute]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.CSS$Attribute]

    }

}
