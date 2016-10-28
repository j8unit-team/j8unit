package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.FutureTask;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class FutureTaskClassTest
implements org.j8unit.repository.java.util.concurrent.FutureTaskClassTests<FutureTask> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.FutureTask]

    @Override
    public Class<FutureTask> createNewSUT() {
        return FutureTask.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.FutureTask#FutureTask(Runnable, Object) public
     * java.util.concurrent.FutureTask(java.lang.Runnable,V)}.
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
    public void create_FutureTask_Runnable_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FutureTask sut = null; // = new FutureTask(Runnable, Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.FutureTask#FutureTask(java.util.concurrent.Callable) public
     * java.util.concurrent.FutureTask(java.util.concurrent.Callable<V>)}.
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
    public void create_FutureTask_Callable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FutureTask sut = null; // = new FutureTask(java.util.concurrent.Callable);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.FutureTask]

}
