package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.SourceDataLine;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SourceDataLineClassTest
implements org.j8unit.repository.javax.sound.sampled.SourceDataLineClassTests<SourceDataLine> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.SourceDataLine]

    @Override
    public Class<SourceDataLine> createNewSUT() {
        return SourceDataLine.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.SourceDataLine]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.SourceDataLine]

}
