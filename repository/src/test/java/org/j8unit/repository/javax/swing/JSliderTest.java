package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JSliderTest
implements org.j8unit.repository.javax.swing.JSliderTests<javax.swing.JSlider> {

    @Override
    public javax.swing.JSlider createNewSUT() {
        return new javax.swing.JSlider();
    }

}
