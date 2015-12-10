package org.j8unit.repository.javax.swing.plaf.synth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SynthPainterClassTest
implements org.j8unit.repository.javax.swing.plaf.synth.SynthPainterClassTests<javax.swing.plaf.synth.SynthPainter> {

    @Override
    public Class<javax.swing.plaf.synth.SynthPainter> createNewSUT() {
        return javax.swing.plaf.synth.SynthPainter.class;
    }

}
