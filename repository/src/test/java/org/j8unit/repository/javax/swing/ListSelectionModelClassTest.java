package org.j8unit.repository.javax.swing;

import javax.swing.ListSelectionModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ListSelectionModel} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.ListSelectionModelClassTests}).
 */

@RunWith(J8Unit4.class)
public class ListSelectionModelClassTest
implements ListSelectionModelClassTests<ListSelectionModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ListSelectionModel]

    @Override
    public Class<ListSelectionModel> createNewSUT() {
        return ListSelectionModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.ListSelectionModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ListSelectionModel]

}
