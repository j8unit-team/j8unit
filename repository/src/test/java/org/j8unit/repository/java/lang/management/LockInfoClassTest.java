package org.j8unit.repository.java.lang.management;

import java.lang.management.LockInfo;
import javax.management.openmbean.CompositeData;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LockInfoClassTest
implements org.j8unit.repository.java.lang.management.LockInfoClassTests<LockInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.LockInfo]

    @Override
    public Class<LockInfo> createNewSUT() {
        return LockInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link LockInfo#LockInfo(String, int) public
     * java.lang.management.LockInfo(java.lang.String,int)}.
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
    public void create_LockInfo_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LockInfo sut = null; // = new LockInfo(String, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link LockInfo#from(CompositeData) public static
     * java.lang.management.LockInfo java.lang.management.LockInfo.from(javax.management.openmbean.CompositeData)}.
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
    public void test_from_CompositeData()
    throws Exception {
        // write some test for {@link LockInfo#from(CompositeData)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.LockInfo]

}
