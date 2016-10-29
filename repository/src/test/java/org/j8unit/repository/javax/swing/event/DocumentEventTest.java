package org.j8unit.repository.javax.swing.event;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentEvent.ElementChange;
import javax.swing.event.DocumentEvent.EventType;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class DocumentEventTest
implements org.j8unit.repository.javax.swing.event.DocumentEventTests<DocumentEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.DocumentEvent]

    @Override
    public DocumentEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.DocumentEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.DocumentEvent]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class EventTypeTest
    implements org.j8unit.repository.javax.swing.event.DocumentEventTests.EventTypeTests<EventType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.DocumentEvent$EventType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(EventType.REMOVE, //
                                    EventType.INSERT, //
                                    EventType.CHANGE);
        }

        @Parameter(0)
        public EventType sut;

        @Override
        public EventType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.DocumentEvent$EventType]

    }

    @RunWith(J8Unit4.class)
    public static class ElementChangeTest
    implements org.j8unit.repository.javax.swing.event.DocumentEventTests.ElementChangeTests<ElementChange> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.DocumentEvent$ElementChange]

        @Override
        public ElementChange createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.DocumentEvent.ElementChange], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.DocumentEvent$ElementChange]

    }

}
