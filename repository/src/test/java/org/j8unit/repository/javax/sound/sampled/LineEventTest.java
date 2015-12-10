package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LineEventTest
implements org.j8unit.repository.javax.sound.sampled.LineEventTests<javax.sound.sampled.LineEvent> {

    @RunWith(J8Unit4.class)
    public static class TypeTest
    implements org.j8unit.repository.javax.sound.sampled.LineEventTests.TypeTests<javax.sound.sampled.LineEvent.Type> {

        @Override
        public javax.sound.sampled.LineEvent.Type createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.sound.sampled.LineEvent.Type] available.");
        }

    }

    @Override
    public javax.sound.sampled.LineEvent createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.sound.sampled.LineEvent] available.");
    }

}
