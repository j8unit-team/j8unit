package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.ConstantCallSite;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConstantCallSiteClassTest
implements org.j8unit.repository.java.lang.invoke.ConstantCallSiteClassTests<ConstantCallSite> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.invoke.ConstantCallSite]

    @Override
    public Class<ConstantCallSite> createNewSUT() {
        return ConstantCallSite.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.invoke.ConstantCallSite#ConstantCallSite(java.lang.invoke.MethodHandle) public
     * java.lang.invoke.ConstantCallSite(java.lang.invoke.MethodHandle)}.
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
    public void create_ConstantCallSite_MethodHandle()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConstantCallSite sut = null; // = new ConstantCallSite(java.lang.invoke.MethodHandle);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.invoke.ConstantCallSite]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.invoke.ConstantCallSite]

}
