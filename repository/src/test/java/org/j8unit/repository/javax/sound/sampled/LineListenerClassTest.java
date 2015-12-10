package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LineListenerClassTest
implements org.j8unit.repository.javax.sound.sampled.LineListenerClassTests<javax.sound.sampled.LineListener> {

    @Override
    public Class<javax.sound.sampled.LineListener> createNewSUT() {
        return javax.sound.sampled.LineListener.class;
    }

}
