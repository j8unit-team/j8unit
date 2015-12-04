package org.j8unit.repository.javax.management;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.NotificationFilter interface javax.management.NotificationFilter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.NotificationFilterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NotificationFilterTests<SUT extends javax.management.NotificationFilter>
extends org.j8unit.repository.java.io.SerializableTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.management.NotificationFilter#isNotificationEnabled(javax.management.Notification) public abstract boolean javax.management.NotificationFilter.isNotificationEnabled(javax.management.Notification)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isNotificationEnabled_Notification() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
