package org.j8unit.repository.javax.swing;

import javax.swing.Popup;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Popup} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.swing.PopupClassTests}).
 */
@RunWith(J8Unit4.class)
public class PopupClassTest
implements PopupClassTests<Popup> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.Popup]

    @Override
    public Class<Popup> createNewSUT() {
        return Popup.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.Popup]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.Popup]

}
