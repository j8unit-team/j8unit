package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ComponentUIClassTest
implements org.j8unit.repository.javax.swing.plaf.ComponentUIClassTests<javax.swing.plaf.ComponentUI> {

    @Override
    public Class<javax.swing.plaf.ComponentUI> createNewSUT() {
        return javax.swing.plaf.ComponentUI.class;
    }

}
