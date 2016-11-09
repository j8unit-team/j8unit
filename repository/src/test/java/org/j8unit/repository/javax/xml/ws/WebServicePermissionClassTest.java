package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServicePermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebServicePermission} (by simply reusing
 * the J8Unit test interface {@link WebServicePermissionClassTests}).
 */

@RunWith(J8Unit4.class)
public class WebServicePermissionClassTest
implements WebServicePermissionClassTests<WebServicePermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebServicePermission]

    @Override
    public Class<WebServicePermission> createNewSUT() {
        return WebServicePermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.WebServicePermission#WebServicePermission(String) public
     * javax.xml.ws.WebServicePermission(java.lang.String)}.
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
    public void create_WebServicePermission_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WebServicePermission sut = null; // = new WebServicePermission(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.WebServicePermission#WebServicePermission(String, String) public
     * javax.xml.ws.WebServicePermission(java.lang.String,java.lang.String)}.
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
    public void create_WebServicePermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WebServicePermission sut = null; // = new WebServicePermission(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.WebServicePermission]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebServicePermission]

}
