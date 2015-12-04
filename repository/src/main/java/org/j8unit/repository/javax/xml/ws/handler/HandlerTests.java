package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.ws.handler.Handler interface javax.xml.ws.handler.Handler},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.handler.HandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HandlerTests<SUT extends javax.xml.ws.handler.Handler<C>, C extends javax.xml.ws.handler.MessageContext>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.Handler#handleFault(javax.xml.ws.handler.MessageContext) public abstract boolean javax.xml.ws.handler.Handler.handleFault(javax.xml.ws.handler.MessageContext)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handleFault_MessageContext() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.Handler#handleMessage(javax.xml.ws.handler.MessageContext) public abstract boolean javax.xml.ws.handler.Handler.handleMessage(javax.xml.ws.handler.MessageContext)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handleMessage_MessageContext() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.Handler#close(javax.xml.ws.handler.MessageContext) public abstract void javax.xml.ws.handler.Handler.close(javax.xml.ws.handler.MessageContext)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_close_MessageContext() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
