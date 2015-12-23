package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.handler.MessageContext interface
 * javax.xml.ws.handler.MessageContext}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.ws.handler.MessageContextTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.handler.MessageContextClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.handler.MessageContext
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MessageContextTests<SUT extends javax.xml.ws.handler.MessageContext>
extends org.j8unit.repository.java.util.MapTests<SUT, java.lang.String, java.lang.Object> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.xml.ws.handler.MessageContext.Scope class
     * javax.xml.ws.handler.MessageContext$Scope}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.xml.ws.handler.MessageContextTests.ScopeTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.xml.ws.handler.MessageContextClassTests.ScopeClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.xml.ws.handler.MessageContext.Scope
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ScopeTests<SUT extends javax.xml.ws.handler.MessageContext.Scope>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.xml.ws.handler.MessageContext.Scope> {

    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.MessageContext#getScope(java.lang.String) public abstract
     * javax.xml.ws.handler.MessageContext$Scope javax.xml.ws.handler.MessageContext.getScope(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.handler.MessageContext#getScope(java.lang.String)
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
     * {@link javax.xml.ws.handler.MessageContext#setScope(java.lang.String, javax.xml.ws.handler.MessageContext.Scope)
     * public abstract void
     * javax.xml.ws.handler.MessageContext.setScope(java.lang.String,javax.xml.ws.handler.MessageContext$Scope)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.handler.MessageContext#setScope(java.lang.String,
     *             javax.xml.ws.handler.MessageContext.Scope)
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

}
