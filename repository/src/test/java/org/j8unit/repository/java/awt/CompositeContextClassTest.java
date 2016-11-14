package org.j8unit.repository.java.awt;

import java.awt.CompositeContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CompositeContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.CompositeContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class CompositeContextClassTest
implements CompositeContextClassTests<CompositeContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.CompositeContext]

    @Override
    public Class<CompositeContext> createNewSUT() {
        return CompositeContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.CompositeContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.CompositeContext]

}
