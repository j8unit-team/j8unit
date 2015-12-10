package org.j8unit.repository.javax.swing.plaf.synth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SynthLookAndFeelTest
implements org.j8unit.repository.javax.swing.plaf.synth.SynthLookAndFeelTests<javax.swing.plaf.synth.SynthLookAndFeel> {

    @Override
    public javax.swing.plaf.synth.SynthLookAndFeel createNewSUT() {
        return new javax.swing.plaf.synth.SynthLookAndFeel();
    }

}
