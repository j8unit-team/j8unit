package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.MutableCallSite;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MutableCallSite} (by simply reusing the
 * J8Unit test interface {@link MutableCallSiteClassTests}).
 */

@RunWith(J8Unit4.class)
public class MutableCallSiteClassTest
implements MutableCallSiteClassTests<MutableCallSite> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.invoke.MutableCallSite]

    @Override
    public Class<MutableCallSite> createNewSUT() {
        return MutableCallSite.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.invoke.MutableCallSite#MutableCallSite(java.lang.invoke.MethodType) public
     * java.lang.invoke.MutableCallSite(java.lang.invoke.MethodType)}.
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
    public void create_MutableCallSite_MethodType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MutableCallSite sut = null; // = new MutableCallSite(java.lang.invoke.MethodType);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.invoke.MutableCallSite#MutableCallSite(java.lang.invoke.MethodHandle) public
     * java.lang.invoke.MutableCallSite(java.lang.invoke.MethodHandle)}.
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
    public void create_MutableCallSite_MethodHandle()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MutableCallSite sut = null; // = new MutableCallSite(java.lang.invoke.MethodHandle);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.invoke.MutableCallSite#syncAll(java.lang.invoke.MutableCallSite[]) public static void
     * java.lang.invoke.MutableCallSite.syncAll(java.lang.invoke.MutableCallSite[])}.
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
    public void test_syncAll_MutableCallSiteArray()
    throws Exception {
        // write some test for {@link java.lang.invoke.MutableCallSite#syncAll(java.lang.invoke.MutableCallSite[])}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.invoke.MutableCallSite]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.invoke.MutableCallSite]

}
