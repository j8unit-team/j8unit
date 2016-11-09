package org.j8unit.repository.javax.accessibility;

import javax.accessibility.Accessible;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Accessible} (by simply reusing the J8Unit
 * test interface {@link AccessibleClassTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleClassTest
implements AccessibleClassTests<Accessible> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.Accessible]

    @Override
    public Class<Accessible> createNewSUT() {
        return Accessible.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.Accessible]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.Accessible]

}
