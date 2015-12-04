package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.net.ssl.SSLSessionBindingListener interface javax.net.ssl.SSLSessionBindingListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.SSLSessionBindingListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SSLSessionBindingListenerTests<SUT extends javax.net.ssl.SSLSessionBindingListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSessionBindingListener#valueUnbound(javax.net.ssl.SSLSessionBindingEvent)
     * public abstract void javax.net.ssl.SSLSessionBindingListener.valueUnbound(javax.net.ssl.SSLSessionBindingEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_valueUnbound_SSLSessionBindingEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSessionBindingListener#valueBound(javax.net.ssl.SSLSessionBindingEvent)
     * public abstract void javax.net.ssl.SSLSessionBindingListener.valueBound(javax.net.ssl.SSLSessionBindingEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_valueBound_SSLSessionBindingEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
