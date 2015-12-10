package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JSliderClassTest
implements org.j8unit.repository.javax.swing.JSliderClassTests<javax.swing.JSlider> {

    @Override
    public Class<javax.swing.JSlider> createNewSUT() {
        return javax.swing.JSlider.class;
    }

}
