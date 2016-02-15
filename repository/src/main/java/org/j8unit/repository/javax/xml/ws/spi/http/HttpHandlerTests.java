package org.j8unit.repository.javax.xml.ws.spi.http;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.spi.http.HttpHandler class javax.xml.ws.spi.http.HttpHandler}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link HttpHandlerClassTests}.
 * </p>
 *
 * @see javax.xml.ws.spi.http.HttpHandler class javax.xml.ws.spi.http.HttpHandler (the hereby targeted class-under-test
 *      class)
 * @see HttpHandlerClassTests HttpHandlerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HttpHandlerTests<SUT extends javax.xml.ws.spi.http.HttpHandler>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.spi.http.HttpHandler#handle(javax.xml.ws.spi.http.HttpExchange) public
     * abstract void javax.xml.ws.spi.http.HttpHandler.handle(javax.xml.ws.spi.http.HttpExchange) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.spi.http.HttpHandler#handle(javax.xml.ws.spi.http.HttpExchange) public
     * abstract void javax.xml.ws.spi.http.HttpHandler.handle(javax.xml.ws.spi.http.HttpExchange) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.http.HttpHandler#handle(javax.xml.ws.spi.http.HttpExchange) public abstract void
     *      javax.xml.ws.spi.http.HttpHandler.handle(javax.xml.ws.spi.http.HttpExchange) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handle_HttpExchange()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
