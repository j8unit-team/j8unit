package org.j8unit.repository.java.awt.event;

import java.awt.event.AWTEventListenerProxy;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AWTEventListenerProxyClassTest
implements org.j8unit.repository.java.awt.event.AWTEventListenerProxyClassTests<AWTEventListenerProxy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.AWTEventListenerProxy]

    @Override
    public Class<AWTEventListenerProxy> createNewSUT() {
        return AWTEventListenerProxy.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.event.AWTEventListenerProxy#AWTEventListenerProxy(long, java.awt.event.AWTEventListener) public
     * java.awt.event.AWTEventListenerProxy(long,java.awt.event.AWTEventListener)}.
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
    public void create_AWTEventListenerProxy_long_AWTEventListener()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AWTEventListenerProxy sut = null; // = new AWTEventListenerProxy(long, java.awt.event.AWTEventListener);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.AWTEventListenerProxy]

}
