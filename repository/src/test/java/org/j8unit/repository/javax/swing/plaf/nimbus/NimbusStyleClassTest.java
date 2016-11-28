package org.j8unit.repository.javax.swing.plaf.nimbus;

import javax.swing.plaf.nimbus.NimbusStyle;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NimbusStyle} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.nimbus.NimbusStyleClassTests}).
 */
@RunWith(J8Unit4.class)
public class NimbusStyleClassTest
implements NimbusStyleClassTests<NimbusStyle> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.nimbus.NimbusStyle]

    @Override
    public Class<NimbusStyle> createNewSUT() {
        return NimbusStyle.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.nimbus.NimbusStyle]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.nimbus.NimbusStyle]

}
