package org.j8unit.repository.javax.swing.plaf.synth;

import javax.swing.plaf.synth.SynthSliderUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SynthSliderUI} (by simply reusing the
 * J8Unit test interface {@link SynthSliderUITests}).
 */

@RunWith(J8Unit4.class)
public class SynthSliderUITest
implements SynthSliderUITests<SynthSliderUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.synth.SynthSliderUI]

    @Override
    public SynthSliderUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.synth.SynthSliderUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.synth.SynthSliderUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.synth.SynthSliderUI]

}
