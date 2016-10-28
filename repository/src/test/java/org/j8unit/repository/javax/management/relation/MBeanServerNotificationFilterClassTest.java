package org.j8unit.repository.javax.management.relation;

import javax.management.relation.MBeanServerNotificationFilter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerNotificationFilterClassTest
implements org.j8unit.repository.javax.management.relation.MBeanServerNotificationFilterClassTests<MBeanServerNotificationFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.MBeanServerNotificationFilter]

    @Override
    public Class<MBeanServerNotificationFilter> createNewSUT() {
        return MBeanServerNotificationFilter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link MBeanServerNotificationFilter#MBeanServerNotificationFilter() public
     * javax.management.relation.MBeanServerNotificationFilter()}.
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
    public void create_MBeanServerNotificationFilter()
    throws Exception {
        // create new instance
        final MBeanServerNotificationFilter sut = new MBeanServerNotificationFilter();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.MBeanServerNotificationFilter]

}
