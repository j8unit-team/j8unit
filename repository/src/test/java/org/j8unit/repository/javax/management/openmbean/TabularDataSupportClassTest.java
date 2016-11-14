package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.TabularDataSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TabularDataSupport} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.openmbean.TabularDataSupportClassTests}).
 */

@RunWith(J8Unit4.class)
public class TabularDataSupportClassTest
implements TabularDataSupportClassTests<TabularDataSupport> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.TabularDataSupport]

    @Override
    public Class<TabularDataSupport> createNewSUT() {
        return TabularDataSupport.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.openmbean.TabularDataSupport#TabularDataSupport(javax.management.openmbean.TabularType)
     * public javax.management.openmbean.TabularDataSupport(javax.management.openmbean.TabularType)}.
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
    public void create_TabularDataSupport_TabularType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TabularDataSupport sut = null; // = new TabularDataSupport(javax.management.openmbean.TabularType);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.openmbean.TabularDataSupport#TabularDataSupport(javax.management.openmbean.TabularType, int, float)
     * public javax.management.openmbean.TabularDataSupport(javax.management.openmbean.TabularType,int,float)}.
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
    public void create_TabularDataSupport_TabularType_int_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TabularDataSupport sut = null; // = new TabularDataSupport(javax.management.openmbean.TabularType, int,
                                             // float);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.TabularDataSupport]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.TabularDataSupport]

}
