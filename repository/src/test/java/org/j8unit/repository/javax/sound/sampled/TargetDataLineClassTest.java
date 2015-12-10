package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TargetDataLineClassTest
implements org.j8unit.repository.javax.sound.sampled.TargetDataLineClassTests<javax.sound.sampled.TargetDataLine> {

    @Override
    public Class<javax.sound.sampled.TargetDataLine> createNewSUT() {
        return javax.sound.sampled.TargetDataLine.class;
    }

}
