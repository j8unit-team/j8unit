package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class JLayerClassTest
implements org.j8unit.repository.javax.swing.JLayerClassTests<javax.swing.JLayer> {

    @Override
    public Class<javax.swing.JLayer> createNewSUT() {
        return javax.swing.JLayer.class;
    }

}
