package org.j8unit.repository.java.rmi.dgc;

import java.rmi.dgc.VMID;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link VMID} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.rmi.dgc.VMIDClassTests}).
 */

@RunWith(J8Unit4.class)
public class VMIDClassTest
implements VMIDClassTests<VMID> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.dgc.VMID]

    @Override
    public Class<VMID> createNewSUT() {
        return VMID.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.rmi.dgc.VMID#VMID() public
     * java.rmi.dgc.VMID()}.
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
    public void create_VMID()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final VMID sut = new VMID();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.dgc.VMID#isUnique() public static boolean
     * java.rmi.dgc.VMID.isUnique()}.
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
    public void test_isUnique()
    throws Exception {
        // write some test for {@link java.rmi.dgc.VMID#isUnique()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.dgc.VMID]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.dgc.VMID]

}
