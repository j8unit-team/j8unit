package org.j8unit.repository.javax.swing;

import javax.swing.MutableComboBoxModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MutableComboBoxModel} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.MutableComboBoxModelClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class MutableComboBoxModelClassTest
implements MutableComboBoxModelClassTests<MutableComboBoxModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.MutableComboBoxModel]

    @Override
    public Class<MutableComboBoxModel> createNewSUT() {
        return MutableComboBoxModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.MutableComboBoxModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.MutableComboBoxModel]

}
