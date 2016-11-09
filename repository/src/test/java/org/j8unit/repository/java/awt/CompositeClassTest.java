package org.j8unit.repository.java.awt;

import java.awt.Composite;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Composite} (by simply reusing the J8Unit
 * test interface {@link CompositeClassTests}).
 */

@RunWith(J8Unit4.class)
public class CompositeClassTest
implements CompositeClassTests<Composite> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Composite]

    @Override
    public Class<Composite> createNewSUT() {
        return Composite.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Composite]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Composite]

}
