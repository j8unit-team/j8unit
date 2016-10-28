package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationID;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationIDClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationIDClassTests<ActivationID> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.activation.ActivationID]

    @Override
    public Class<ActivationID> createNewSUT() {
        return ActivationID.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.activation.ActivationID#ActivationID(java.rmi.activation.Activator) public
     * java.rmi.activation.ActivationID(java.rmi.activation.Activator)}.
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
    public void create_ActivationID_Activator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ActivationID sut = null; // = new ActivationID(java.rmi.activation.Activator);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.activation.ActivationID]

}
