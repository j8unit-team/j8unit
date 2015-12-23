package org.j8unit.repository.javax.swing.event;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class HyperlinkEventTest
implements org.j8unit.repository.javax.swing.event.HyperlinkEventTests<javax.swing.event.HyperlinkEvent> {

    @Override
    public javax.swing.event.HyperlinkEvent createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.swing.event.HyperlinkEvent] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class EventTypeTest
    implements org.j8unit.repository.javax.swing.event.HyperlinkEventTests.EventTypeTests<javax.swing.event.HyperlinkEvent.EventType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.swing.event.HyperlinkEvent.EventType.EXITED, //
                                    javax.swing.event.HyperlinkEvent.EventType.ACTIVATED, //
                                    javax.swing.event.HyperlinkEvent.EventType.ENTERED);
        }

        @Parameter(0)
        public javax.swing.event.HyperlinkEvent.EventType sut;

        @Override
        public javax.swing.event.HyperlinkEvent.EventType createNewSUT() {
            return this.sut;
        }

    }

}
