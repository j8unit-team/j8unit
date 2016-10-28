package org.j8unit.repository.javax.naming.ldap;

import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.ldap.Control;
import javax.naming.ldap.ControlFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ControlFactoryClassTest
implements org.j8unit.repository.javax.naming.ldap.ControlFactoryClassTests<ControlFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.ControlFactory]

    @Override
    public Class<ControlFactory> createNewSUT() {
        return ControlFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link ControlFactory#getControlInstance(Control, Context, Hashtable) public static javax.naming.ldap.Control
     * javax.naming.ldap.ControlFactory.getControlInstance(javax.naming.ldap.Control,javax.naming.Context,java.util.Hashtable<?,
     * ?>) throws javax.naming.NamingException}.
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
    public void test_getControlInstance_Control_Context_Hashtable()
    throws Exception {
        // write some test for {@link ControlFactory#getControlInstance(Control, Context, Hashtable)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.ControlFactory]

}
