package org.j8unit.repository.java.nio.file;

import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WatchEvent} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.nio.file.WatchEventClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class WatchEventClassTest
implements WatchEventClassTests<WatchEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.WatchEvent]

    @Override
    public Class<WatchEvent> createNewSUT() {
        return WatchEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.WatchEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.WatchEvent]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Modifier} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.nio.file.WatchEventClassTests.ModifierClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ModifierClassTest
    implements ModifierClassTests<Modifier> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.WatchEvent$Modifier]

        @Override
        public Class<Modifier> createNewSUT() {
            return Modifier.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.WatchEvent$Modifier]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.WatchEvent$Modifier]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Kind} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.nio.file.WatchEventClassTests.KindClassTests}).
     */
    @SuppressWarnings("rawtypes")
    @RunWith(J8Unit4.class)
    public static class KindClassTest
    implements KindClassTests<Kind> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.WatchEvent$Kind]

        @Override
        public Class<Kind> createNewSUT() {
            return Kind.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.WatchEvent$Kind]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.WatchEvent$Kind]

    }

}
