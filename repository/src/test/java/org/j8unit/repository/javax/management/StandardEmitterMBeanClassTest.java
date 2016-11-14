package org.j8unit.repository.javax.management;

import javax.management.StandardEmitterMBean;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StandardEmitterMBean} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.StandardEmitterMBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class StandardEmitterMBeanClassTest
implements StandardEmitterMBeanClassTests<StandardEmitterMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.StandardEmitterMBean]

    @Override
    public Class<StandardEmitterMBean> createNewSUT() {
        return StandardEmitterMBean.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.StandardEmitterMBean#StandardEmitterMBean(Object, Class, boolean, javax.management.NotificationEmitter)
     * public <T>
     * javax.management.StandardEmitterMBean(T,java.lang.Class<T>,boolean,javax.management.NotificationEmitter)}.
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
    public void create_StandardEmitterMBean_Object_Class_boolean_NotificationEmitter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StandardEmitterMBean sut = null; // = new StandardEmitterMBean(Object, Class, boolean,
                                               // javax.management.NotificationEmitter);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.StandardEmitterMBean#StandardEmitterMBean(Object, Class, javax.management.NotificationEmitter)
     * public <T> javax.management.StandardEmitterMBean(T,java.lang.Class<T>,javax.management.NotificationEmitter)}.
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
    public void create_StandardEmitterMBean_Object_Class_NotificationEmitter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StandardEmitterMBean sut = null; // = new StandardEmitterMBean(Object, Class,
                                               // javax.management.NotificationEmitter);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.StandardEmitterMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.StandardEmitterMBean]

}
