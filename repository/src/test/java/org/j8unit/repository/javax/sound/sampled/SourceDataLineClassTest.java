package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SourceDataLineClassTest
implements org.j8unit.repository.javax.sound.sampled.SourceDataLineClassTests<javax.sound.sampled.SourceDataLine> {

    @Override
    public Class<javax.sound.sampled.SourceDataLine> createNewSUT() {
        return javax.sound.sampled.SourceDataLine.class;
    }

}
