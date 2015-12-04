package org.j8unit.repository.javax.naming.event;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.naming.event.NamingListener interface javax.naming.event.NamingListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.event.NamingListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NamingListenerTests<SUT extends javax.naming.event.NamingListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.naming.event.NamingListener#namingExceptionThrown(javax.naming.event.NamingExceptionEvent) public abstract void javax.naming.event.NamingListener.namingExceptionThrown(javax.naming.event.NamingExceptionEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_namingExceptionThrown_NamingExceptionEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
