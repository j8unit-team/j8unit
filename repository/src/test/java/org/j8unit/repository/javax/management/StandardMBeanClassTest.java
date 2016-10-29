package org.j8unit.repository.javax.management;

import javax.management.StandardMBean;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardMBeanClassTest
implements org.j8unit.repository.javax.management.StandardMBeanClassTests<StandardMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.StandardMBean]

    @Override
    public Class<StandardMBean> createNewSUT() {
        return StandardMBean.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.StandardMBean#StandardMBean(Object, Class) public <T>
     * javax.management.StandardMBean(T,java.lang.Class<T>) throws javax.management.NotCompliantMBeanException}.
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
    public void create_StandardMBean_Object_Class()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StandardMBean sut = null; // = new StandardMBean(Object, Class);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.StandardMBean#StandardMBean(Object, Class, boolean) public <T>
     * javax.management.StandardMBean(T,java.lang.Class<T>,boolean)}.
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
    public void create_StandardMBean_Object_Class_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StandardMBean sut = null; // = new StandardMBean(Object, Class, boolean);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.StandardMBean]

}
