package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.BooleanControl.Type;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BooleanControl} (by simply reusing the
 * J8Unit test interface {@link BooleanControlClassTests}).
 */

@RunWith(J8Unit4.class)
public class BooleanControlClassTest
implements BooleanControlClassTests<BooleanControl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.BooleanControl]

    @Override
    public Class<BooleanControl> createNewSUT() {
        return BooleanControl.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.BooleanControl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.BooleanControl]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Type} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.javax.sound.sampled.BooleanControlClassTests.TypeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.BooleanControlClassTests.TypeClassTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.BooleanControl$Type]

        @Override
        public Class<Type> createNewSUT() {
            return Type.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.BooleanControl$Type]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.BooleanControl$Type]

    }

}
