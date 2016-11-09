package org.j8unit.repository.javax.xml.ws.handler;

import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.MessageContext.Scope;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.EnumTests;
import org.j8unit.repository.java.util.MapTests;
import org.j8unit.repository.javax.xml.ws.handler.MessageContextClassTests.ScopeClassTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link MessageContext
 * public abstract interface javax.xml.ws.handler.MessageContext}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link MessageContextClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MessageContextTests<SUT extends MessageContext>
extends MapTests<SUT, String, Object> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.MessageContext]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.ws.handler.MessageContext#getScope(String)
     * public abstract javax.xml.ws.handler.MessageContext$Scope
     * javax.xml.ws.handler.MessageContext.getScope(java.lang.String)}.
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
    public default void test_getScope_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.handler.MessageContext#setScope(String, javax.xml.ws.handler.MessageContext.Scope) public
     * abstract void
     * javax.xml.ws.handler.MessageContext.setScope(java.lang.String,javax.xml.ws.handler.MessageContext$Scope)}.
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
    public default void test_setScope_String_Scope()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.handler.MessageContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.handler.MessageContext]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Scope
     * public static final enum javax.xml.ws.handler.MessageContext$Scope}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link ScopeClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ScopeTests<SUT extends Scope>
    extends EnumTests<SUT, Scope> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.MessageContext$Scope]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.handler.MessageContext$Scope]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.handler.MessageContext$Scope]
    }

}
