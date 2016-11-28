package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.SortControl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SortControl} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.ldap.SortControlClassTests}).
 */
@RunWith(J8Unit4.class)
public class SortControlClassTest
implements SortControlClassTests<SortControl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.SortControl]

    @Override
    public Class<SortControl> createNewSUT() {
        return SortControl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.SortControl#SortControl(String, boolean) public
     * javax.naming.ldap.SortControl(java.lang.String,boolean) throws java.io.IOException}.
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
    public void create_SortControl_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SortControl sut = null; // = new SortControl(String, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.SortControl#SortControl(javax.naming.ldap.SortKey[], boolean) public
     * javax.naming.ldap.SortControl(javax.naming.ldap.SortKey[],boolean) throws java.io.IOException}.
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
    public void create_SortControl_SortKeyArray_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SortControl sut = null; // = new SortControl(javax.naming.ldap.SortKey[], boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.SortControl#SortControl(String[], boolean) public
     * javax.naming.ldap.SortControl(java.lang.String[],boolean) throws java.io.IOException}.
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
    public void create_SortControl_StringArray_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SortControl sut = null; // = new SortControl(String[], boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.SortControl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.SortControl]

}
