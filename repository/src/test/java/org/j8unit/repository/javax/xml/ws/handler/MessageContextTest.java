package org.j8unit.repository.javax.xml.ws.handler;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.MessageContext.Scope;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MessageContext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.handler.MessageContextTests}).
 */

@RunWith(J8Unit4.class)
public class MessageContextTest
implements MessageContextTests<MessageContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.MessageContext]

    @Override
    public MessageContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.handler.MessageContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.handler.MessageContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.handler.MessageContext]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Scope} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.handler.MessageContextTests.ScopeTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ScopeTest
    implements ScopeTests<Scope> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.MessageContext$Scope]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(Scope.class);
        }

        @Parameter(0)
        public Scope sut;

        @Override
        public Scope createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.handler.MessageContext$Scope]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.handler.MessageContext$Scope]

    }

}
