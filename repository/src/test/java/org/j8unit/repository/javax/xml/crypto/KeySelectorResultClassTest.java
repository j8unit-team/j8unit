package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.KeySelectorResult;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeySelectorResult} (by simply reusing the
 * J8Unit test interface {@link KeySelectorResultClassTests}).
 */

@RunWith(J8Unit4.class)
public class KeySelectorResultClassTest
implements KeySelectorResultClassTests<KeySelectorResult> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.KeySelectorResult]

    @Override
    public Class<KeySelectorResult> createNewSUT() {
        return KeySelectorResult.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.KeySelectorResult]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.KeySelectorResult]

}
