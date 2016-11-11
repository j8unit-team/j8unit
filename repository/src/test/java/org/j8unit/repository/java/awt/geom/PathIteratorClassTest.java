package org.j8unit.repository.java.awt.geom;

import java.awt.geom.PathIterator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PathIterator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.geom.PathIteratorClassTests}).
 */

@RunWith(J8Unit4.class)
public class PathIteratorClassTest
implements PathIteratorClassTests<PathIterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.geom.PathIterator]

    @Override
    public Class<PathIterator> createNewSUT() {
        return PathIterator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.geom.PathIterator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.geom.PathIterator]

}
