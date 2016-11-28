package org.j8unit.repository.java.sql;

import java.sql.DriverPropertyInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DriverPropertyInfo} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.sql.DriverPropertyInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class DriverPropertyInfoClassTest
implements DriverPropertyInfoClassTests<DriverPropertyInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.DriverPropertyInfo]

    @Override
    public Class<DriverPropertyInfo> createNewSUT() {
        return DriverPropertyInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.sql.DriverPropertyInfo#DriverPropertyInfo(String, String) public
     * java.sql.DriverPropertyInfo(java.lang.String,java.lang.String)}.
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
    public void create_DriverPropertyInfo_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DriverPropertyInfo sut = null; // = new DriverPropertyInfo(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.DriverPropertyInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.DriverPropertyInfo]

}
