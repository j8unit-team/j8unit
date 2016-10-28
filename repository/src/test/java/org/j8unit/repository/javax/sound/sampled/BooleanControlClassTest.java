package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.BooleanControl.Type;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BooleanControlClassTest
implements org.j8unit.repository.javax.sound.sampled.BooleanControlClassTests<BooleanControl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.BooleanControl]

    @Override
    public Class<BooleanControl> createNewSUT() {
        return BooleanControl.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.BooleanControl]

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.BooleanControlClassTests.TypeClassTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.BooleanControl$Type]

        @Override
        public Class<Type> createNewSUT() {
            return Type.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.BooleanControl$Type]

    }

}
