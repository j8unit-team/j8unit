package org.j8unit.repository.javax.swing.plaf.synth;

import javax.swing.plaf.synth.SynthConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SynthConstants} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.synth.SynthConstantsTests}).
 */
@RunWith(J8Unit4.class)
public class SynthConstantsTest
implements SynthConstantsTests<SynthConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.synth.SynthConstants]

    @Override
    public SynthConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.synth.SynthConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.synth.SynthConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.synth.SynthConstants]

}
