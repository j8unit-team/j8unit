package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.handler.MessageContext interface
 * javax.xml.ws.handler.MessageContext}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MessageContextClassTests}.
 * </p>
 *
 * @see javax.xml.ws.handler.MessageContext interface javax.xml.ws.handler.MessageContext (the hereby targeted
 *      class-under-test class)
 * @see MessageContextClassTests MessageContextClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MessageContextTests<SUT extends javax.xml.ws.handler.MessageContext>
extends org.j8unit.repository.java.util.MapTests<SUT, String, Object> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.MessageContext#getScope(String) public abstract
     * javax.xml.ws.handler.MessageContext$Scope javax.xml.ws.handler.MessageContext.getScope(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.handler.MessageContext#getScope(String) public abstract
     * javax.xml.ws.handler.MessageContext$Scope javax.xml.ws.handler.MessageContext.getScope(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.handler.MessageContext#getScope(String) public abstract
     *      javax.xml.ws.handler.MessageContext$Scope javax.xml.ws.handler.MessageContext.getScope(java.lang.String)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getScope_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.handler.MessageContext#setScope(String, javax.xml.ws.handler.MessageContext.Scope) public
     * abstract void
     * javax.xml.ws.handler.MessageContext.setScope(java.lang.String,javax.xml.ws.handler.MessageContext$Scope)}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.ws.handler.MessageContext#setScope(String, javax.xml.ws.handler.MessageContext.Scope) public
     * abstract void
     * javax.xml.ws.handler.MessageContext.setScope(java.lang.String,javax.xml.ws.handler.MessageContext$Scope)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.handler.MessageContext#setScope(String, javax.xml.ws.handler.MessageContext.Scope) public
     *      abstract void
     *      javax.xml.ws.handler.MessageContext.setScope(java.lang.String,javax.xml.ws.handler.MessageContext$Scope)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setScope_String_Scope()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.xml.ws.handler.MessageContext.Scope class
     * javax.xml.ws.handler.MessageContext$Scope}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link MessageContextClassTests.ScopeClassTests}.
     * </p>
     *
     * @see javax.xml.ws.handler.MessageContext.Scope class javax.xml.ws.handler.MessageContext$Scope (the hereby
     *      targeted class-under-test class)
     * @see MessageContextClassTests.ScopeClassTests MessageContextClassTests.ScopeClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ScopeTests<SUT extends javax.xml.ws.handler.MessageContext.Scope>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.xml.ws.handler.MessageContext.Scope> {

    }

}
