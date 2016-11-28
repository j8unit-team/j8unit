package org.j8unit.repository.javax.swing.plaf.synth;

import javax.swing.plaf.synth.SynthInternalFrameUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SynthInternalFrameUI} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.synth.SynthInternalFrameUITests}).
 */
@RunWith(J8Unit4.class)
public class SynthInternalFrameUITest
implements SynthInternalFrameUITests<SynthInternalFrameUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.synth.SynthInternalFrameUI]

    @Override
    public SynthInternalFrameUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.synth.SynthInternalFrameUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.synth.SynthInternalFrameUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.synth.SynthInternalFrameUI]

}
