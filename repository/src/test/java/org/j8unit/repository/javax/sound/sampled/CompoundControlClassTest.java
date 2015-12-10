package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompoundControlClassTest
implements org.j8unit.repository.javax.sound.sampled.CompoundControlClassTests<javax.sound.sampled.CompoundControl> {

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.CompoundControlClassTests.TypeClassTests<javax.sound.sampled.CompoundControl.Type> {

        @Override
        public Class<javax.sound.sampled.CompoundControl.Type> createNewSUT() {
            return javax.sound.sampled.CompoundControl.Type.class;
        }

    }

    @Override
    public Class<javax.sound.sampled.CompoundControl> createNewSUT() {
        return javax.sound.sampled.CompoundControl.class;
    }

}
