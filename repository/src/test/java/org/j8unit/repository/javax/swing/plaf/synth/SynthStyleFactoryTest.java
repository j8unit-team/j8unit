package org.j8unit.repository.javax.swing.plaf.synth;

import javax.swing.plaf.synth.SynthStyleFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SynthStyleFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.synth.SynthStyleFactoryTests}).
 */
@RunWith(J8Unit4.class)
public class SynthStyleFactoryTest
implements SynthStyleFactoryTests<SynthStyleFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.synth.SynthStyleFactory]

    @Override
    public SynthStyleFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.synth.SynthStyleFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.synth.SynthStyleFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.synth.SynthStyleFactory]

}
