package org.j8unit.repository.javax.swing;

import javax.swing.SingleSelectionModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SingleSelectionModel} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.SingleSelectionModelClassTests}).
 */

@RunWith(J8Unit4.class)
public class SingleSelectionModelClassTest
implements SingleSelectionModelClassTests<SingleSelectionModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.SingleSelectionModel]

    @Override
    public Class<SingleSelectionModel> createNewSUT() {
        return SingleSelectionModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.SingleSelectionModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.SingleSelectionModel]

}
