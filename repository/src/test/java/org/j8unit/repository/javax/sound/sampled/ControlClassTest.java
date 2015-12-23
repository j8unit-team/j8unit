package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ControlClassTest
implements org.j8unit.repository.javax.sound.sampled.ControlClassTests<javax.sound.sampled.Control> {

    @Override
    public Class<javax.sound.sampled.Control> createNewSUT() {
        return javax.sound.sampled.Control.class;
    }

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.ControlClassTests.TypeClassTests<javax.sound.sampled.Control.Type> {

        @Override
        public Class<javax.sound.sampled.Control.Type> createNewSUT() {
            return javax.sound.sampled.Control.Type.class;
        }

    }

}
