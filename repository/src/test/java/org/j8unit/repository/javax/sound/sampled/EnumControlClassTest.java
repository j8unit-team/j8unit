package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EnumControlClassTest
implements org.j8unit.repository.javax.sound.sampled.EnumControlClassTests<javax.sound.sampled.EnumControl> {

    @Override
    public Class<javax.sound.sampled.EnumControl> createNewSUT() {
        return javax.sound.sampled.EnumControl.class;
    }

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.EnumControlClassTests.TypeClassTests<javax.sound.sampled.EnumControl.Type> {

        @Override
        public Class<javax.sound.sampled.EnumControl.Type> createNewSUT() {
            return javax.sound.sampled.EnumControl.Type.class;
        }

    }

}
