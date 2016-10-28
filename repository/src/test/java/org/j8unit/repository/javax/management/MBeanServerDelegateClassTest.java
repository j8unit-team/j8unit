package org.j8unit.repository.javax.management;

import javax.management.MBeanServerDelegate;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerDelegateClassTest
implements org.j8unit.repository.javax.management.MBeanServerDelegateClassTests<MBeanServerDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanServerDelegate]

    @Override
    public Class<MBeanServerDelegate> createNewSUT() {
        return MBeanServerDelegate.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanServerDelegate#MBeanServerDelegate() public javax.management.MBeanServerDelegate()}.
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
    public void create_MBeanServerDelegate()
    throws Exception {
        // create new instance
        final MBeanServerDelegate sut = new MBeanServerDelegate();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanServerDelegate]

}
