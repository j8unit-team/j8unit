package org.j8unit.repository.javax.swing;

import javax.swing.ButtonModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ButtonModel} (by simply reusing the
 * J8Unit test interface {@link ButtonModelClassTests}).
 */

@RunWith(J8Unit4.class)
public class ButtonModelClassTest
implements ButtonModelClassTests<ButtonModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ButtonModel]

    @Override
    public Class<ButtonModel> createNewSUT() {
        return ButtonModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.ButtonModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ButtonModel]

}
