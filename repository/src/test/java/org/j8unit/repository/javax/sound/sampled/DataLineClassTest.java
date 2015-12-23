package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataLineClassTest
implements org.j8unit.repository.javax.sound.sampled.DataLineClassTests<javax.sound.sampled.DataLine> {

    @Override
    public Class<javax.sound.sampled.DataLine> createNewSUT() {
        return javax.sound.sampled.DataLine.class;
    }

    @RunWith(J8Unit4.class)
    public static class InfoClassTest
    implements org.j8unit.repository.javax.sound.sampled.DataLineClassTests.InfoClassTests<javax.sound.sampled.DataLine.Info> {

        @Override
        public Class<javax.sound.sampled.DataLine.Info> createNewSUT() {
            return javax.sound.sampled.DataLine.Info.class;
        }

    }

}
