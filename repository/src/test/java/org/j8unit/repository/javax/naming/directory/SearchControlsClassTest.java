package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.SearchControls;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SearchControlsClassTest
implements org.j8unit.repository.javax.naming.directory.SearchControlsClassTests<SearchControls> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.SearchControls]

    @Override
    public Class<SearchControls> createNewSUT() {
        return SearchControls.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.SearchControls#SearchControls(int, long, int, String[], boolean, boolean) public
     * javax.naming.directory.SearchControls(int,long,int,java.lang.String[],boolean,boolean)}.
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
    public void create_SearchControls_int_long_int_StringArray_boolean_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SearchControls sut = null; // = new SearchControls(int, long, int, String[], boolean, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.SearchControls#SearchControls() public javax.naming.directory.SearchControls()}.
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
    public void create_SearchControls()
    throws Exception {
        // create new instance
        final SearchControls sut = new SearchControls();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.SearchControls]

}
