package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LineClassTest
implements org.j8unit.repository.javax.sound.sampled.LineClassTests<javax.sound.sampled.Line> {

    @Override
    public Class<javax.sound.sampled.Line> createNewSUT() {
        return javax.sound.sampled.Line.class;
    }

    @RunWith(J8Unit4.class)
    public static class InfoClassTest
    implements org.j8unit.repository.javax.sound.sampled.LineClassTests.InfoClassTests<javax.sound.sampled.Line.Info> {

        @Override
        public Class<javax.sound.sampled.Line.Info> createNewSUT() {
            return javax.sound.sampled.Line.Info.class;
        }

    }

}
