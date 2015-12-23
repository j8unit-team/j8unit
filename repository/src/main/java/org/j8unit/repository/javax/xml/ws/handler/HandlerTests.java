package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.handler.Handler interface javax.xml.ws.handler.Handler},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.ws.handler.HandlerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.handler.HandlerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.handler.Handler
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HandlerTests<SUT extends javax.xml.ws.handler.Handler<C>, C extends javax.xml.ws.handler.MessageContext>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.Handler#close(javax.xml.ws.handler.MessageContext) public abstract
     * void javax.xml.ws.handler.Handler.close(javax.xml.ws.handler.MessageContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.handler.Handler#close(javax.xml.ws.handler.MessageContext)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_close_MessageContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.Handler#handleFault(javax.xml.ws.handler.MessageContext) public
     * abstract boolean javax.xml.ws.handler.Handler.handleFault(javax.xml.ws.handler.MessageContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.handler.Handler#handleFault(javax.xml.ws.handler.MessageContext)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handleFault_MessageContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.Handler#handleMessage(javax.xml.ws.handler.MessageContext) public
     * abstract boolean javax.xml.ws.handler.Handler.handleMessage(javax.xml.ws.handler.MessageContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.handler.Handler#handleMessage(javax.xml.ws.handler.MessageContext)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handleMessage_MessageContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
