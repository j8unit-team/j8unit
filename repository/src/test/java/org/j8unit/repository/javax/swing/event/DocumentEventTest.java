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

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DocumentEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.DocumentEventTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentEventTest
implements DocumentEventTests<DocumentEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.DocumentEvent]

    @Override
    public DocumentEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.DocumentEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.DocumentEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.DocumentEvent]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ElementChange} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.DocumentEventTests.ElementChangeTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ElementChangeTest
    implements ElementChangeTests<ElementChange> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.DocumentEvent$ElementChange]

        @Override
        public ElementChange createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.DocumentEvent.ElementChange], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.DocumentEvent$ElementChange]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.DocumentEvent$ElementChange]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link EventType} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.DocumentEventTests.EventTypeTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class EventTypeTest
    implements EventTypeTests<EventType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.DocumentEvent$EventType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.DocumentEvent$EventType]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.DocumentEvent$EventType]

    }

}
