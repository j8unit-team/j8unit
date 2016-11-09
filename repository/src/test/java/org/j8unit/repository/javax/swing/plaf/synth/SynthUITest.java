package org.j8unit.repository.javax.swing.plaf.synth;

import javax.swing.plaf.synth.SynthUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SynthUI} (by simply reusing the
 * J8Unit test interface {@link SynthUITests}).
 */

@RunWith(J8Unit4.class)
public class SynthUITest
implements SynthUITests<SynthUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.synth.SynthUI]

    @Override
    public SynthUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.synth.SynthUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.synth.SynthUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.synth.SynthUI]

}
