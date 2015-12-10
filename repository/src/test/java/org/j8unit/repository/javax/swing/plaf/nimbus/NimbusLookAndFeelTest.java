package org.j8unit.repository.javax.swing.plaf.nimbus;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NimbusLookAndFeelTest
implements org.j8unit.repository.javax.swing.plaf.nimbus.NimbusLookAndFeelTests<javax.swing.plaf.nimbus.NimbusLookAndFeel> {

    @Override
    public javax.swing.plaf.nimbus.NimbusLookAndFeel createNewSUT() {
        return new javax.swing.plaf.nimbus.NimbusLookAndFeel();
    }

}
