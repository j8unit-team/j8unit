package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnectionNotification;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectionNotificationClassTest
implements org.j8unit.repository.javax.management.remote.JMXConnectionNotificationClassTests<JMXConnectionNotification> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXConnectionNotification]

    @Override
    public Class<JMXConnectionNotification> createNewSUT() {
        return JMXConnectionNotification.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.JMXConnectionNotification#JMXConnectionNotification(String, Object, String, long, String, Object)
     * public
     * javax.management.remote.JMXConnectionNotification(java.lang.String,java.lang.Object,java.lang.String,long,java.lang.String,java.lang.Object)}.
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
    public void create_JMXConnectionNotification_String_Object_String_long_String_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JMXConnectionNotification sut = null; // = new JMXConnectionNotification(String, Object, String, long,
                                                    // String, Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.JMXConnectionNotification]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXConnectionNotification]

}
