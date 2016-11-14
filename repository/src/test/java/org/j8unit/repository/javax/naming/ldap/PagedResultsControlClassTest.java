package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.PagedResultsControl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PagedResultsControl} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.naming.ldap.PagedResultsControlClassTests}).
 */

@RunWith(J8Unit4.class)
public class PagedResultsControlClassTest
implements PagedResultsControlClassTests<PagedResultsControl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.PagedResultsControl]

    @Override
    public Class<PagedResultsControl> createNewSUT() {
        return PagedResultsControl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.PagedResultsControl#PagedResultsControl(int, boolean) public
     * javax.naming.ldap.PagedResultsControl(int,boolean) throws java.io.IOException}.
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
    public void create_PagedResultsControl_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PagedResultsControl sut = null; // = new PagedResultsControl(int, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.PagedResultsControl#PagedResultsControl(int, byte[], boolean) public
     * javax.naming.ldap.PagedResultsControl(int,byte[],boolean) throws java.io.IOException}.
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
    public void create_PagedResultsControl_int_byteArray_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PagedResultsControl sut = null; // = new PagedResultsControl(int, byte[], boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.PagedResultsControl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.PagedResultsControl]

}
