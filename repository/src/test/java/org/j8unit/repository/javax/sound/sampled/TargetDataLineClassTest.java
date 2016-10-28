package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.TargetDataLine;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TargetDataLineClassTest
implements org.j8unit.repository.javax.sound.sampled.TargetDataLineClassTests<TargetDataLine> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.TargetDataLine]

    @Override
    public Class<TargetDataLine> createNewSUT() {
        return TargetDataLine.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.TargetDataLine]

}
