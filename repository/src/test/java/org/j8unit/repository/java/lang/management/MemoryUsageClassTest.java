package org.j8unit.repository.java.lang.management;

import java.lang.management.MemoryUsage;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryUsageClassTest
implements org.j8unit.repository.java.lang.management.MemoryUsageClassTests<MemoryUsage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.MemoryUsage]

    @Override
    public Class<MemoryUsage> createNewSUT() {
        return MemoryUsage.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.management.MemoryUsage#MemoryUsage(long, long, long, long) public
     * java.lang.management.MemoryUsage(long,long,long,long)}.
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
    public void create_MemoryUsage_long_long_long_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MemoryUsage sut = null; // = new MemoryUsage(long, long, long, long);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.MemoryUsage#from(javax.management.openmbean.CompositeData) public static
     * java.lang.management.MemoryUsage java.lang.management.MemoryUsage.from(javax.management.openmbean.CompositeData)}
     * .
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
        // write some test for {@link java.lang.management.MemoryUsage#from(javax.management.openmbean.CompositeData)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.MemoryUsage]

}
