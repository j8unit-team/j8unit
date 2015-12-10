package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReverbTypeClassTest
implements org.j8unit.repository.javax.sound.sampled.ReverbTypeClassTests<javax.sound.sampled.ReverbType> {

    @Override
    public Class<javax.sound.sampled.ReverbType> createNewSUT() {
        return javax.sound.sampled.ReverbType.class;
    }

}
