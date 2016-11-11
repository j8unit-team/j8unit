package org.j8unit.repository.javax.crypto.interfaces;

import javax.crypto.interfaces.PBEKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PBEKey} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.crypto.interfaces.PBEKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class PBEKeyClassTest
implements PBEKeyClassTests<PBEKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.interfaces.PBEKey]

    @Override
    public Class<PBEKey> createNewSUT() {
        return PBEKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.interfaces.PBEKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.interfaces.PBEKey]

}
