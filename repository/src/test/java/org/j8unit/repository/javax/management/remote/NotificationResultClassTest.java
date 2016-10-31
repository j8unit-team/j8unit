package org.j8unit.repository.javax.management.remote;

import javax.management.remote.NotificationResult;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationResultClassTest
implements org.j8unit.repository.javax.management.remote.NotificationResultClassTests<NotificationResult> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.NotificationResult]

    @Override
    public Class<NotificationResult> createNewSUT() {
        return NotificationResult.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.NotificationResult#NotificationResult(long, long, javax.management.remote.TargetedNotification[])
     * public javax.management.remote.NotificationResult(long,long,javax.management.remote.TargetedNotification[])}.
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
    public void create_NotificationResult_long_long_TargetedNotificationArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotificationResult sut = null; // = new NotificationResult(long, long,
                                             // javax.management.remote.TargetedNotification[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.NotificationResult]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.NotificationResult]

}
