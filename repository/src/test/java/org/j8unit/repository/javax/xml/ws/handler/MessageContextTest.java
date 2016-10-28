package org.j8unit.repository.javax.xml.ws.handler;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.MessageContext.Scope;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class MessageContextTest
implements org.j8unit.repository.javax.xml.ws.handler.MessageContextTests<MessageContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.MessageContext]

    @Override
    public MessageContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.handler.MessageContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.MessageContext]

    @RunWith(J8Unit4.class)
    public static class ScopeTest
    implements org.j8unit.repository.javax.xml.ws.handler.MessageContextTests.ScopeTests<Scope> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.MessageContext$Scope]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Scope.class);
        }

        @Parameter(0)
        public Scope sut;

        @Override
        public Scope createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.MessageContext$Scope]

    }

}
