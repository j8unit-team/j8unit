package org.j8unit.repository.java.sql;

import java.sql.SQLPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLPermissionClassTest
implements org.j8unit.repository.java.sql.SQLPermissionClassTests<SQLPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.SQLPermission]

    @Override
    public Class<SQLPermission> createNewSUT() {
        return SQLPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.sql.SQLPermission#SQLPermission(String)
     * public java.sql.SQLPermission(java.lang.String)}.
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
    public void create_SQLPermission_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SQLPermission sut = null; // = new SQLPermission(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.sql.SQLPermission#SQLPermission(String, String) public
     * java.sql.SQLPermission(java.lang.String,java.lang.String)}.
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
    public void create_SQLPermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SQLPermission sut = null; // = new SQLPermission(String, String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.SQLPermission]

}
