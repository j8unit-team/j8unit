package org.j8unit.repository.javax.swing.plaf.synth;

import javax.swing.plaf.synth.SynthPainter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SynthPainter} (by simply reusing the
 * J8Unit test interface {@link SynthPainterTests}).
 */

@RunWith(J8Unit4.class)
public class SynthPainterTest
implements SynthPainterTests<SynthPainter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.synth.SynthPainter]

    @Override
    public SynthPainter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.synth.SynthPainter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.synth.SynthPainter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.synth.SynthPainter]

}
