package org.j8unit.repository.javax.swing;

import javax.swing.ComboBoxModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ComboBoxModel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.ComboBoxModelClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ComboBoxModelClassTest
implements ComboBoxModelClassTests<ComboBoxModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ComboBoxModel]

    @Override
    public Class<ComboBoxModel> createNewSUT() {
        return ComboBoxModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.ComboBoxModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ComboBoxModel]

}
