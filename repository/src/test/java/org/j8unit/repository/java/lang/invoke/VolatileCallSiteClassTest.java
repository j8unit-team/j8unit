package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.VolatileCallSite;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link VolatileCallSite} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.invoke.VolatileCallSiteClassTests}).
 */
@RunWith(J8Unit4.class)
public class VolatileCallSiteClassTest
implements VolatileCallSiteClassTests<VolatileCallSite> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.invoke.VolatileCallSite]

    @Override
    public Class<VolatileCallSite> createNewSUT() {
        return VolatileCallSite.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.invoke.VolatileCallSite#VolatileCallSite(java.lang.invoke.MethodType) public
     * java.lang.invoke.VolatileCallSite(java.lang.invoke.MethodType)}.
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
    public void create_VolatileCallSite_MethodType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final VolatileCallSite sut = null; // = new VolatileCallSite(java.lang.invoke.MethodType);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.invoke.VolatileCallSite#VolatileCallSite(java.lang.invoke.MethodHandle) public
     * java.lang.invoke.VolatileCallSite(java.lang.invoke.MethodHandle)}.
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
    public void create_VolatileCallSite_MethodHandle()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final VolatileCallSite sut = null; // = new VolatileCallSite(java.lang.invoke.MethodHandle);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.invoke.VolatileCallSite]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.invoke.VolatileCallSite]

}
