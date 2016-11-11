package org.j8unit.repository.javax.swing;

import javax.swing.PopupFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PopupFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.PopupFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class PopupFactoryClassTest
implements PopupFactoryClassTests<PopupFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.PopupFactory]

    @Override
    public Class<PopupFactory> createNewSUT() {
        return PopupFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.PopupFactory#PopupFactory() public
     * javax.swing.PopupFactory()}.
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
    public void create_PopupFactory()
    throws Exception {
        // create new instance
        final PopupFactory sut = new PopupFactory();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.PopupFactory#getSharedInstance() public
     * static javax.swing.PopupFactory javax.swing.PopupFactory.getSharedInstance()}.
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
    public void test_getSharedInstance()
    throws Exception {
        // write some test for {@link javax.swing.PopupFactory#getSharedInstance()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.PopupFactory#setSharedInstance(javax.swing.PopupFactory) public static void
     * javax.swing.PopupFactory.setSharedInstance(javax.swing.PopupFactory)}.
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
    public void test_setSharedInstance_PopupFactory()
    throws Exception {
        // write some test for {@link javax.swing.PopupFactory#setSharedInstance(javax.swing.PopupFactory)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.PopupFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.PopupFactory]

}
