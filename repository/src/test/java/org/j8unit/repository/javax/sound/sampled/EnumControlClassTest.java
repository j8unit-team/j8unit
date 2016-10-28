package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.EnumControl;
import javax.sound.sampled.EnumControl.Type;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EnumControlClassTest
implements org.j8unit.repository.javax.sound.sampled.EnumControlClassTests<EnumControl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.EnumControl]

    @Override
    public Class<EnumControl> createNewSUT() {
        return EnumControl.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.EnumControl]

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.EnumControlClassTests.TypeClassTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.EnumControl$Type]

        @Override
        public Class<Type> createNewSUT() {
            return Type.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.EnumControl$Type]

    }

}
