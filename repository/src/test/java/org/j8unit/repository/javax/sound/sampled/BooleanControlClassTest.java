package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BooleanControlClassTest
implements org.j8unit.repository.javax.sound.sampled.BooleanControlClassTests<javax.sound.sampled.BooleanControl> {

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.BooleanControlClassTests.TypeClassTests<javax.sound.sampled.BooleanControl.Type> {

        @Override
        public Class<javax.sound.sampled.BooleanControl.Type> createNewSUT() {
            return javax.sound.sampled.BooleanControl.Type.class;
        }

    }

    @Override
    public Class<javax.sound.sampled.BooleanControl> createNewSUT() {
        return javax.sound.sampled.BooleanControl.class;
    }

}
