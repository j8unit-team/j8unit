package org.j8unit.repository.java.util;

import java.util.Timer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerClassTest
implements org.j8unit.repository.java.util.TimerClassTests<Timer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Timer]

    @Override
    public Class<Timer> createNewSUT() {
        return Timer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Timer#Timer(String, boolean) public
     * java.util.Timer(java.lang.String,boolean)}.
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
    public void create_Timer_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Timer sut = null; // = new Timer(String, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Timer#Timer(String) public
     * java.util.Timer(java.lang.String)}.
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
    public void create_Timer_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Timer sut = null; // = new Timer(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Timer#Timer(boolean) public
     * java.util.Timer(boolean)}.
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
    public void create_Timer_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Timer sut = null; // = new Timer(boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Timer#Timer() public
     * java.util.Timer()}.
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
    public void create_Timer()
    throws Exception {
        // create new instance
        final Timer sut = new Timer();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Timer]

}
