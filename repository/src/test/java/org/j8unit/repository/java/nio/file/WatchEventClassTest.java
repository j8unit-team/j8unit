package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class WatchEventClassTest
implements org.j8unit.repository.java.nio.file.WatchEventClassTests<java.nio.file.WatchEvent> {

    @RunWith(J8Unit4.class)
    public static class KindClassTest
    implements org.j8unit.repository.java.nio.file.WatchEventClassTests.KindClassTests<java.nio.file.WatchEvent.Kind> {

        @Override
        public Class<java.nio.file.WatchEvent.Kind> createNewSUT() {
            return java.nio.file.WatchEvent.Kind.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ModifierClassTest
    implements org.j8unit.repository.java.nio.file.WatchEventClassTests.ModifierClassTests<java.nio.file.WatchEvent.Modifier> {

        @Override
        public Class<java.nio.file.WatchEvent.Modifier> createNewSUT() {
            return java.nio.file.WatchEvent.Modifier.class;
        }

    }

    @Override
    public Class<java.nio.file.WatchEvent> createNewSUT() {
        return java.nio.file.WatchEvent.class;
    }

}
