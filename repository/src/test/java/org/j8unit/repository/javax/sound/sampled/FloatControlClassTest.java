package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FloatControlClassTest
implements org.j8unit.repository.javax.sound.sampled.FloatControlClassTests<javax.sound.sampled.FloatControl> {

    @Override
    public Class<javax.sound.sampled.FloatControl> createNewSUT() {
        return javax.sound.sampled.FloatControl.class;
    }

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.FloatControlClassTests.TypeClassTests<javax.sound.sampled.FloatControl.Type> {

        @Override
        public Class<javax.sound.sampled.FloatControl.Type> createNewSUT() {
            return javax.sound.sampled.FloatControl.Type.class;
        }

    }

}
