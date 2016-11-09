package org.j8unit.repository.javax.xml.ws.handler;

import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.MessageContext.Scope;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MessageContext} (by simply reusing the
 * J8Unit test interface {@link MessageContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class MessageContextClassTest
implements MessageContextClassTests<MessageContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.handler.MessageContext]

    @Override
    public Class<MessageContext> createNewSUT() {
        return MessageContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.handler.MessageContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.handler.MessageContext]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Scope} (by simply reusing the J8Unit
     * test interface {@link ScopeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ScopeClassTest
    implements ScopeClassTests<Scope> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.handler.MessageContext$Scope]

        @Override
        public Class<Scope> createNewSUT() {
            return Scope.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.xml.ws.handler.MessageContext.Scope#values() public static
         * javax.xml.ws.handler.MessageContext$Scope[] javax.xml.ws.handler.MessageContext$Scope.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_values()
        throws Exception {
            // write some test for {@link javax.xml.ws.handler.MessageContext.Scope#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.xml.ws.handler.MessageContext.Scope#valueOf(String) public static
         * javax.xml.ws.handler.MessageContext$Scope
         * javax.xml.ws.handler.MessageContext$Scope.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link javax.xml.ws.handler.MessageContext.Scope#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.handler.MessageContext$Scope]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.handler.MessageContext$Scope]

    }

}
