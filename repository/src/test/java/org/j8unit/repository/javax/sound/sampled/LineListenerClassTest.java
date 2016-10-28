package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.LineListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LineListenerClassTest
implements org.j8unit.repository.javax.sound.sampled.LineListenerClassTests<LineListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.LineListener]

    @Override
    public Class<LineListener> createNewSUT() {
        return LineListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.LineListener]

}
