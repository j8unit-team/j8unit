package org.j8unit.repository.java.text;

import java.text.CollationKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CollationKey} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.CollationKeyClassTests}).
 */
@RunWith(J8Unit4.class)
public class CollationKeyClassTest
implements CollationKeyClassTests<CollationKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.CollationKey]

    @Override
    public Class<CollationKey> createNewSUT() {
        return CollationKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.CollationKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.CollationKey]

}
