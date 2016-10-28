package org.j8unit.repository.javax.management.modelmbean;

import javax.management.modelmbean.ModelMBeanInfo;
import javax.management.modelmbean.RequiredModelMBean;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RequiredModelMBeanClassTest
implements org.j8unit.repository.javax.management.modelmbean.RequiredModelMBeanClassTests<RequiredModelMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.modelmbean.RequiredModelMBean]

    @Override
    public Class<RequiredModelMBean> createNewSUT() {
        return RequiredModelMBean.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link RequiredModelMBean#RequiredModelMBean() public
     * javax.management.modelmbean.RequiredModelMBean() throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
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
    public void create_RequiredModelMBean()
    throws Exception {
        // create new instance
        final RequiredModelMBean sut = new RequiredModelMBean();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link RequiredModelMBean#RequiredModelMBean(ModelMBeanInfo) public
     * javax.management.modelmbean.RequiredModelMBean(javax.management.modelmbean.ModelMBeanInfo) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
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
    public void create_RequiredModelMBean_ModelMBeanInfo()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RequiredModelMBean sut = null; // = new RequiredModelMBean(ModelMBeanInfo);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.modelmbean.RequiredModelMBean]

}
