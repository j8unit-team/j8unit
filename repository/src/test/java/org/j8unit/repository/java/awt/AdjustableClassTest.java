package org.j8unit.repository.java.awt;

import java.awt.Adjustable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Adjustable} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.AdjustableClassTests}).
 */

@RunWith(J8Unit4.class)
public class AdjustableClassTest
implements AdjustableClassTests<Adjustable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Adjustable]

    @Override
    public Class<Adjustable> createNewSUT() {
        return Adjustable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Adjustable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Adjustable]

}
