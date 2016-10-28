package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.CompoundControl;
import javax.sound.sampled.CompoundControl.Type;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompoundControlClassTest
implements org.j8unit.repository.javax.sound.sampled.CompoundControlClassTests<CompoundControl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.CompoundControl]

    @Override
    public Class<CompoundControl> createNewSUT() {
        return CompoundControl.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.CompoundControl]

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.CompoundControlClassTests.TypeClassTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.CompoundControl$Type]

        @Override
        public Class<Type> createNewSUT() {
            return Type.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.CompoundControl$Type]

    }

}
