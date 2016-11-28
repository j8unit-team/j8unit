package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Keymap;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Keymap} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.KeymapClassTests}).
 */
@RunWith(J8Unit4.class)
public class KeymapClassTest
implements KeymapClassTests<Keymap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Keymap]

    @Override
    public Class<Keymap> createNewSUT() {
        return Keymap.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.Keymap]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Keymap]

}
