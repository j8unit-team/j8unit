package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LayerUITest<V extends java.awt.Component>
implements org.j8unit.repository.javax.swing.plaf.LayerUITests<javax.swing.plaf.LayerUI<V>, V> {

    @Override
    public javax.swing.plaf.LayerUI<V> createNewSUT() {
        return new javax.swing.plaf.LayerUI<>();
    }

}
