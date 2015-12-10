package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LineUnavailableExceptionTest
implements org.j8unit.repository.javax.sound.sampled.LineUnavailableExceptionTests<javax.sound.sampled.LineUnavailableException> {

    @Override
    public javax.sound.sampled.LineUnavailableException createNewSUT() {
        return new javax.sound.sampled.LineUnavailableException();
    }

}
