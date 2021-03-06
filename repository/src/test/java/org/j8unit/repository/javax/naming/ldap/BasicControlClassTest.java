package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.BasicControl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicControl} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.ldap.BasicControlClassTests}).
 */
@RunWith(J8Unit4.class)
public class BasicControlClassTest
implements BasicControlClassTests<BasicControl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.BasicControl]

    @Override
    public Class<BasicControl> createNewSUT() {
        return BasicControl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.BasicControl#BasicControl(String) public
     * javax.naming.ldap.BasicControl(java.lang.String)}.
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
    public void create_BasicControl_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BasicControl sut = null; // = new BasicControl(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.BasicControl#BasicControl(String, boolean, byte[]) public
     * javax.naming.ldap.BasicControl(java.lang.String,boolean,byte[])}.
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
    public void create_BasicControl_String_boolean_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BasicControl sut = null; // = new BasicControl(String, boolean, byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.BasicControl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.BasicControl]

}
