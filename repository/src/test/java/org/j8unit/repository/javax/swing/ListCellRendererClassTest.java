package org.j8unit.repository.javax.swing;

import javax.swing.ListCellRenderer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ListCellRenderer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.ListCellRendererClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ListCellRendererClassTest
implements ListCellRendererClassTests<ListCellRenderer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ListCellRenderer]

    @Override
    public Class<ListCellRenderer> createNewSUT() {
        return ListCellRenderer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.ListCellRenderer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ListCellRenderer]

}
