package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.fail;
import javax.swing.text.NavigationFilter;
import javax.swing.text.NavigationFilter.FilterBypass;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NavigationFilterClassTest
implements org.j8unit.repository.javax.swing.text.NavigationFilterClassTests<NavigationFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.NavigationFilter]

    @Override
    public Class<NavigationFilter> createNewSUT() {
        return NavigationFilter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.NavigationFilter#NavigationFilter() public javax.swing.text.NavigationFilter()}.
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
    public void create_NavigationFilter()
    throws Exception {
        // create new instance
        final NavigationFilter sut = new NavigationFilter();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.NavigationFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.NavigationFilter]

    @RunWith(J8Unit4.class)
    public static class FilterBypassClassTest
    implements org.j8unit.repository.javax.swing.text.NavigationFilterClassTests.FilterBypassClassTests<FilterBypass> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.NavigationFilter$FilterBypass]

        @Override
        public Class<FilterBypass> createNewSUT() {
            return FilterBypass.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.NavigationFilter.FilterBypass#FilterBypass() public
         * javax.swing.text.NavigationFilter$FilterBypass()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("Cannot construct an abstract class!")
        @Test
        @Category(Draft.class)
        public void create_FilterBypass()
        throws Exception {
            fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.NavigationFilter$FilterBypass]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.NavigationFilter$FilterBypass]

    }

}
