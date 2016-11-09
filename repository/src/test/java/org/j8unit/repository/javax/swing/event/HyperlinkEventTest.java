package org.j8unit.repository.javax.swing.event;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkEvent.EventType;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HyperlinkEvent} (by simply reusing
 * the J8Unit test interface {@link HyperlinkEventTests}).
 */

@RunWith(J8Unit4.class)
public class HyperlinkEventTest
implements HyperlinkEventTests<HyperlinkEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.HyperlinkEvent]

    @Override
    public HyperlinkEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.event.HyperlinkEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.HyperlinkEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.HyperlinkEvent]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link EventType} (by simply reusing the
     * J8Unit test interface {@link EventTypeTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class EventTypeTest
    implements EventTypeTests<EventType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.HyperlinkEvent$EventType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(EventType.EXITED, //
                                    EventType.ACTIVATED, //
                                    EventType.ENTERED);
        }

        @Parameter(0)
        public EventType sut;

        @Override
        public EventType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.HyperlinkEvent$EventType]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.HyperlinkEvent$EventType]

    }

}
