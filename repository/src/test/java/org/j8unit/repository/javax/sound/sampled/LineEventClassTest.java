package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LineEventClassTest
implements org.j8unit.repository.javax.sound.sampled.LineEventClassTests<javax.sound.sampled.LineEvent> {

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.LineEventClassTests.TypeClassTests<javax.sound.sampled.LineEvent.Type> {

        @Override
        public Class<javax.sound.sampled.LineEvent.Type> createNewSUT() {
            return javax.sound.sampled.LineEvent.Type.class;
        }

    }

    @Override
    public Class<javax.sound.sampled.LineEvent> createNewSUT() {
        return javax.sound.sampled.LineEvent.class;
    }

}
