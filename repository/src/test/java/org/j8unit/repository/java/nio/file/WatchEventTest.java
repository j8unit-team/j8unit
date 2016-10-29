package org.j8unit.repository.java.nio.file;

import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WatchEventTest<T>
implements org.j8unit.repository.java.nio.file.WatchEventTests<WatchEvent<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.WatchEvent]

    @Override
    public WatchEvent<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.WatchEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.WatchEvent]

    @RunWith(J8Unit4.class)
    public static class ModifierTest
    implements org.j8unit.repository.java.nio.file.WatchEventTests.ModifierTests<Modifier> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.WatchEvent$Modifier]

        @Override
        public Modifier createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.WatchEvent.Modifier], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.WatchEvent$Modifier]

    }

    @RunWith(J8Unit4.class)
    public static class KindTest<T>
    implements org.j8unit.repository.java.nio.file.WatchEventTests.KindTests<Kind<T>, T> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.WatchEvent$Kind]

        @Override
        public Kind<T> createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.WatchEvent.Kind], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.WatchEvent$Kind]

    }

}
