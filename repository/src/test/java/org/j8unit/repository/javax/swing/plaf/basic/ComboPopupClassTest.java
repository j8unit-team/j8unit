package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.ComboPopup;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ComboPopup} (by simply reusing the J8Unit
 * test interface {@link ComboPopupClassTests}).
 */

@RunWith(J8Unit4.class)
public class ComboPopupClassTest
implements ComboPopupClassTests<ComboPopup> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.ComboPopup]

    @Override
    public Class<ComboPopup> createNewSUT() {
        return ComboPopup.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.ComboPopup]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.ComboPopup]

}
