package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.ReverbType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ReverbType} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sound.sampled.ReverbTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class ReverbTypeClassTest
implements ReverbTypeClassTests<ReverbType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.ReverbType]

    @Override
    public Class<ReverbType> createNewSUT() {
        return ReverbType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.ReverbType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.ReverbType]

}
