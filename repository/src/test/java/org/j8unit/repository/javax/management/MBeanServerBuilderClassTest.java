package org.j8unit.repository.javax.management;

import javax.management.MBeanServerBuilder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerBuilderClassTest
implements org.j8unit.repository.javax.management.MBeanServerBuilderClassTests<MBeanServerBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanServerBuilder]

    @Override
    public Class<MBeanServerBuilder> createNewSUT() {
        return MBeanServerBuilder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanServerBuilder#MBeanServerBuilder() public javax.management.MBeanServerBuilder()}.
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
    public void create_MBeanServerBuilder()
    throws Exception {
        // create new instance
        final MBeanServerBuilder sut = new MBeanServerBuilder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MBeanServerBuilder]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanServerBuilder]

}
