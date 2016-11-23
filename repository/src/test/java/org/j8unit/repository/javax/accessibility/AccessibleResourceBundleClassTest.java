package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleResourceBundle;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleResourceBundle} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.accessibility.AccessibleResourceBundleClassTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class AccessibleResourceBundleClassTest
implements AccessibleResourceBundleClassTests<AccessibleResourceBundle> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleResourceBundle]

    @Override
    public Class<AccessibleResourceBundle> createNewSUT() {
        return AccessibleResourceBundle.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.accessibility.AccessibleResourceBundle#AccessibleResourceBundle() public
     * javax.accessibility.AccessibleResourceBundle()}.
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
    public void create_AccessibleResourceBundle()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccessibleResourceBundle sut = new AccessibleResourceBundle();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleResourceBundle]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleResourceBundle]

}
