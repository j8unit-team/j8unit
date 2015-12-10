package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetalLookAndFeelTest
implements org.j8unit.repository.javax.swing.plaf.metal.MetalLookAndFeelTests<javax.swing.plaf.metal.MetalLookAndFeel> {

    @Override
    public javax.swing.plaf.metal.MetalLookAndFeel createNewSUT() {
        return new javax.swing.plaf.metal.MetalLookAndFeel();
    }

}
