package org.j8unit.repository.javax.management.timer;

import javax.management.timer.TimerNotification;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerNotificationClassTest
implements org.j8unit.repository.javax.management.timer.TimerNotificationClassTests<TimerNotification> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.timer.TimerNotification]

    @Override
    public Class<TimerNotification> createNewSUT() {
        return TimerNotification.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.timer.TimerNotification#TimerNotification(String, Object, long, long, String, Integer)
     * public
     * javax.management.timer.TimerNotification(java.lang.String,java.lang.Object,long,long,java.lang.String,java.lang.Integer)}.
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
    public void create_TimerNotification_String_Object_long_long_String_Integer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TimerNotification sut = null; // = new TimerNotification(String, Object, long, long, String, Integer);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.timer.TimerNotification]

}
