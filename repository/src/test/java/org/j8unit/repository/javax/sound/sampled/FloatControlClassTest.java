package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FloatControlClassTest
implements org.j8unit.repository.javax.sound.sampled.FloatControlClassTests<FloatControl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.FloatControl]

    @Override
    public Class<FloatControl> createNewSUT() {
        return FloatControl.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.FloatControl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.FloatControl]

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.FloatControlClassTests.TypeClassTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.FloatControl$Type]

        @Override
        public Class<Type> createNewSUT() {
            return Type.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.FloatControl$Type]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.FloatControl$Type]

    }

}
