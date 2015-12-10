package org.j8unit.repository.javax.swing.plaf.nimbus;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NimbusLookAndFeelClassTest
implements org.j8unit.repository.javax.swing.plaf.nimbus.NimbusLookAndFeelClassTests<javax.swing.plaf.nimbus.NimbusLookAndFeel> {

    @Override
    public Class<javax.swing.plaf.nimbus.NimbusLookAndFeel> createNewSUT() {
        return javax.swing.plaf.nimbus.NimbusLookAndFeel.class;
    }

}
