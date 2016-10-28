package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.ReverbType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReverbTypeClassTest
implements org.j8unit.repository.javax.sound.sampled.ReverbTypeClassTests<ReverbType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.ReverbType]

    @Override
    public Class<ReverbType> createNewSUT() {
        return ReverbType.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.ReverbType]

}
