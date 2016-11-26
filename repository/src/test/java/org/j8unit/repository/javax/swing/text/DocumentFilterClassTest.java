package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.fail;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocumentFilter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.DocumentFilterClassTests}).
 */
@RunWith(J8Unit4.class)
public class DocumentFilterClassTest
implements DocumentFilterClassTests<DocumentFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DocumentFilter]

    @Override
    public Class<DocumentFilter> createNewSUT() {
        return DocumentFilter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.DocumentFilter#DocumentFilter() public javax.swing.text.DocumentFilter()}.
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
    public void create_DocumentFilter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DocumentFilter sut = new DocumentFilter();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DocumentFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DocumentFilter]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link FilterBypass} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DocumentFilterClassTests.FilterBypassClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class FilterBypassClassTest
    implements org.j8unit.repository.javax.swing.text.DocumentFilterClassTests.FilterBypassClassTests<FilterBypass> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DocumentFilter$FilterBypass]

        @Override
        public Class<FilterBypass> createNewSUT() {
            return FilterBypass.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.DocumentFilter.FilterBypass#FilterBypass() public
         * javax.swing.text.DocumentFilter$FilterBypass()}.
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

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DocumentFilter$FilterBypass]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DocumentFilter$FilterBypass]

    }

}
