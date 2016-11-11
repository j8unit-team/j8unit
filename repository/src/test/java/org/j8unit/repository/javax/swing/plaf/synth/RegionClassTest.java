package org.j8unit.repository.javax.swing.plaf.synth;

import javax.swing.plaf.synth.Region;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Region} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.plaf.synth.RegionClassTests}).
 */

@RunWith(J8Unit4.class)
public class RegionClassTest
implements RegionClassTests<Region> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.synth.Region]

    @Override
    public Class<Region> createNewSUT() {
        return Region.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.synth.Region]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.synth.Region]

}
