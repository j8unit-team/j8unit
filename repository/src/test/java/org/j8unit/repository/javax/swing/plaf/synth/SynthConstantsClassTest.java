package org.j8unit.repository.javax.swing.plaf.synth;

import javax.swing.plaf.synth.SynthConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SynthConstants} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.synth.SynthConstantsClassTests}).
 */
@RunWith(J8Unit4.class)
public class SynthConstantsClassTest
implements SynthConstantsClassTests<SynthConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.synth.SynthConstants]

    @Override
    public Class<SynthConstants> createNewSUT() {
        return SynthConstants.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.synth.SynthConstants]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.synth.SynthConstants]

}
