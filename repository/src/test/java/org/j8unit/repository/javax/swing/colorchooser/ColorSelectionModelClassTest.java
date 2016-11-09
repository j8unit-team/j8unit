package org.j8unit.repository.javax.swing.colorchooser;

import javax.swing.colorchooser.ColorSelectionModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ColorSelectionModel} (by simply reusing
 * the J8Unit test interface {@link ColorSelectionModelClassTests}).
 */

@RunWith(J8Unit4.class)
public class ColorSelectionModelClassTest
implements ColorSelectionModelClassTests<ColorSelectionModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.colorchooser.ColorSelectionModel]

    @Override
    public Class<ColorSelectionModel> createNewSUT() {
        return ColorSelectionModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.colorchooser.ColorSelectionModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.colorchooser.ColorSelectionModel]

}
