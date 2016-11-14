package org.j8unit.repository.javax.swing.text;

import javax.swing.text.WrappedPlainView;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WrappedPlainView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.WrappedPlainViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class WrappedPlainViewClassTest
implements WrappedPlainViewClassTests<WrappedPlainView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.WrappedPlainView]

    @Override
    public Class<WrappedPlainView> createNewSUT() {
        return WrappedPlainView.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.WrappedPlainView#WrappedPlainView(javax.swing.text.Element, boolean) public
     * javax.swing.text.WrappedPlainView(javax.swing.text.Element,boolean)}.
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
    public void create_WrappedPlainView_Element_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WrappedPlainView sut = null; // = new WrappedPlainView(javax.swing.text.Element, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.WrappedPlainView#WrappedPlainView(javax.swing.text.Element) public
     * javax.swing.text.WrappedPlainView(javax.swing.text.Element)}.
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
    public void create_WrappedPlainView_Element()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WrappedPlainView sut = null; // = new WrappedPlainView(javax.swing.text.Element);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.WrappedPlainView]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.WrappedPlainView]

}
