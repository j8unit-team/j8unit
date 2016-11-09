package org.j8unit.repository.java.nio.file;

import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WatchEvent} (by simply reusing the
 * J8Unit test interface {@link WatchEventTests}).
 */

@RunWith(J8Unit4.class)
public class WatchEventTest<T>
implements WatchEventTests<WatchEvent<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.WatchEvent]

    @Override
    public WatchEvent<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.WatchEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.WatchEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.WatchEvent]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Modifier} (by simply reusing the
     * J8Unit test interface {@link ModifierTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ModifierTest
    implements ModifierTests<Modifier> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.WatchEvent$Modifier]

        @Override
        public Modifier createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.WatchEvent.Modifier], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.WatchEvent$Modifier]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.WatchEvent$Modifier]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Kind} (by simply reusing the
     * J8Unit test interface {@link KindTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KindTest<T>
    implements KindTests<Kind<T>, T> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.WatchEvent$Kind]

        @Override
        public Kind<T> createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.WatchEvent.Kind], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.WatchEvent$Kind]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.WatchEvent$Kind]

    }

}
