package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.PagedResultsResponseControl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PagedResultsResponseControl} (by simply
 * reusing the J8Unit test interface {@link PagedResultsResponseControlClassTests}).
 */

@RunWith(J8Unit4.class)
public class PagedResultsResponseControlClassTest
implements PagedResultsResponseControlClassTests<PagedResultsResponseControl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.PagedResultsResponseControl]

    @Override
    public Class<PagedResultsResponseControl> createNewSUT() {
        return PagedResultsResponseControl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.PagedResultsResponseControl#PagedResultsResponseControl(String, boolean, byte[]) public
     * javax.naming.ldap.PagedResultsResponseControl(java.lang.String,boolean,byte[]) throws java.io.IOException}.
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
    public void create_PagedResultsResponseControl_String_boolean_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PagedResultsResponseControl sut = null; // = new PagedResultsResponseControl(String, boolean, byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.PagedResultsResponseControl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.PagedResultsResponseControl]

}
