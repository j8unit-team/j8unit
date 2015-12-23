package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PortClassTest
implements org.j8unit.repository.javax.sound.sampled.PortClassTests<javax.sound.sampled.Port> {

    @Override
    public Class<javax.sound.sampled.Port> createNewSUT() {
        return javax.sound.sampled.Port.class;
    }

    @RunWith(J8Unit4.class)
    public static class InfoClassTest
    implements org.j8unit.repository.javax.sound.sampled.PortClassTests.InfoClassTests<javax.sound.sampled.Port.Info> {

        @Override
        public Class<javax.sound.sampled.Port.Info> createNewSUT() {
            return javax.sound.sampled.Port.Info.class;
        }

    }

}
