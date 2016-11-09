package org.j8unit.repository.javax.crypto.interfaces;

import javax.crypto.interfaces.DHKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DHKey} (by simply reusing the J8Unit test
 * interface {@link DHKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class DHKeyClassTest
implements DHKeyClassTests<DHKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.interfaces.DHKey]

    @Override
    public Class<DHKey> createNewSUT() {
        return DHKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.interfaces.DHKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.interfaces.DHKey]

}
