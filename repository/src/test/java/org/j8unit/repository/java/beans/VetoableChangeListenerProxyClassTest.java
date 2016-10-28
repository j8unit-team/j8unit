package org.j8unit.repository.java.beans;

import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeListenerProxy;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VetoableChangeListenerProxyClassTest
implements org.j8unit.repository.java.beans.VetoableChangeListenerProxyClassTests<VetoableChangeListenerProxy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.VetoableChangeListenerProxy]

    @Override
    public Class<VetoableChangeListenerProxy> createNewSUT() {
        return VetoableChangeListenerProxy.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link VetoableChangeListenerProxy#VetoableChangeListenerProxy(String, VetoableChangeListener) public
     * java.beans.VetoableChangeListenerProxy(java.lang.String,java.beans.VetoableChangeListener)}.
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
    public void create_VetoableChangeListenerProxy_String_VetoableChangeListener()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final VetoableChangeListenerProxy sut = null; // = new VetoableChangeListenerProxy(String,
                                                      // VetoableChangeListener);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.VetoableChangeListenerProxy]

}
