package org.j8unit.repository.javax.management;

import javax.management.NotificationFilterSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotificationFilterSupport} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.NotificationFilterSupportClassTests}).
 */

@RunWith(J8Unit4.class)
public class NotificationFilterSupportClassTest
implements NotificationFilterSupportClassTests<NotificationFilterSupport> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.NotificationFilterSupport]

    @Override
    public Class<NotificationFilterSupport> createNewSUT() {
        return NotificationFilterSupport.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.NotificationFilterSupport#NotificationFilterSupport() public
     * javax.management.NotificationFilterSupport()}.
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
    public void create_NotificationFilterSupport()
    throws Exception {
        // create new instance
        final NotificationFilterSupport sut = new NotificationFilterSupport();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.NotificationFilterSupport]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.NotificationFilterSupport]

}
