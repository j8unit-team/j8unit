package org.j8unit.repository.java.util.logging;

import java.util.logging.LoggingPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoggingPermissionClassTest
implements org.j8unit.repository.java.util.logging.LoggingPermissionClassTests<LoggingPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.LoggingPermission]

    @Override
    public Class<LoggingPermission> createNewSUT() {
        return LoggingPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.logging.LoggingPermission#LoggingPermission(String, String) public
     * java.util.logging.LoggingPermission(java.lang.String,java.lang.String) throws java.lang.IllegalArgumentException}
     * .
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
    public void create_LoggingPermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LoggingPermission sut = null; // = new LoggingPermission(String, String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.LoggingPermission]

}
