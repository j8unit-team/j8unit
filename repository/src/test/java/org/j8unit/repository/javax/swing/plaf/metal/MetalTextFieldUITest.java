package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetalTextFieldUITest
implements org.j8unit.repository.javax.swing.plaf.metal.MetalTextFieldUITests<javax.swing.plaf.metal.MetalTextFieldUI> {

    @Override
    public javax.swing.plaf.metal.MetalTextFieldUI createNewSUT() {
        return new javax.swing.plaf.metal.MetalTextFieldUI();
    }

}