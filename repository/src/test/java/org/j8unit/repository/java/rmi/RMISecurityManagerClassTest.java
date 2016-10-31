package org.j8unit.repository.java.rmi;

import java.rmi.RMISecurityManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMISecurityManagerClassTest
implements org.j8unit.repository.java.rmi.RMISecurityManagerClassTests<RMISecurityManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.RMISecurityManager]

    @Override
    public Class<RMISecurityManager> createNewSUT() {
        return RMISecurityManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.RMISecurityManager#RMISecurityManager() public java.rmi.RMISecurityManager()}.
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
    public void create_RMISecurityManager()
    throws Exception {
        // create new instance
        final RMISecurityManager sut = new RMISecurityManager();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.RMISecurityManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.RMISecurityManager]

}
