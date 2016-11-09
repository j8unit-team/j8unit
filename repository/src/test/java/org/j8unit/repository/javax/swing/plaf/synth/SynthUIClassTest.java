package org.j8unit.repository.javax.swing.plaf.synth;

import javax.swing.plaf.synth.SynthUI;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SynthUI} (by simply reusing the J8Unit
 * test interface {@link SynthUIClassTests}).
 */

@RunWith(J8Unit4.class)
public class SynthUIClassTest
implements SynthUIClassTests<SynthUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.synth.SynthUI]

    @Override
    public Class<SynthUI> createNewSUT() {
        return SynthUI.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.synth.SynthUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.synth.SynthUI]

}
