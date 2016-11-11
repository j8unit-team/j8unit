package org.j8unit.repository.javax.swing.event;

import javax.swing.event.RowSorterListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowSorterListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.RowSorterListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class RowSorterListenerClassTest
implements RowSorterListenerClassTests<RowSorterListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.RowSorterListener]

    @Override
    public Class<RowSorterListener> createNewSUT() {
        return RowSorterListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.RowSorterListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.RowSorterListener]

}
