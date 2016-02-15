package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.SSLSessionBindingEvent class
 * javax.net.ssl.SSLSessionBindingEvent}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SSLSessionBindingEventClassTests}.
 * </p>
 *
 * @see javax.net.ssl.SSLSessionBindingEvent class javax.net.ssl.SSLSessionBindingEvent (the hereby targeted
 *      class-under-test class)
 * @see SSLSessionBindingEventClassTests SSLSessionBindingEventClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SSLSessionBindingEventTests<SUT extends javax.net.ssl.SSLSessionBindingEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSessionBindingEvent#getName() public java.lang.String
     * javax.net.ssl.SSLSessionBindingEvent.getName()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSessionBindingEvent#getName() public java.lang.String
     * javax.net.ssl.SSLSessionBindingEvent.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSessionBindingEvent#getName() public java.lang.String
     *      javax.net.ssl.SSLSessionBindingEvent.getName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSessionBindingEvent#getSession() public javax.net.ssl.SSLSession
     * javax.net.ssl.SSLSessionBindingEvent.getSession()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSessionBindingEvent#getSession() public javax.net.ssl.SSLSession
     * javax.net.ssl.SSLSessionBindingEvent.getSession()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSessionBindingEvent#getSession() public javax.net.ssl.SSLSession
     *      javax.net.ssl.SSLSessionBindingEvent.getSession() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSession()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
