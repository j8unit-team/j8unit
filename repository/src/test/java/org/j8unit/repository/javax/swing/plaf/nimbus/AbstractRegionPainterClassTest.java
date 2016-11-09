package org.j8unit.repository.javax.swing.plaf.nimbus;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractRegionPainter} (by simply reusing
 * the J8Unit test interface {@link AbstractRegionPainterClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractRegionPainterClassTest
implements AbstractRegionPainterClassTests<AbstractRegionPainter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.nimbus.AbstractRegionPainter]

    @Override
    public Class<AbstractRegionPainter> createNewSUT() {
        return AbstractRegionPainter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.nimbus.AbstractRegionPainter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.nimbus.AbstractRegionPainter]

}
