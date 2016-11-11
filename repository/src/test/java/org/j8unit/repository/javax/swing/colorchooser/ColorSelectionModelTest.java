package org.j8unit.repository.javax.swing.colorchooser;

import javax.swing.colorchooser.ColorSelectionModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ColorSelectionModel} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.colorchooser.ColorSelectionModelTests}).
 */

@RunWith(J8Unit4.class)
public class ColorSelectionModelTest
implements ColorSelectionModelTests<ColorSelectionModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.colorchooser.ColorSelectionModel]

    @Override
    public ColorSelectionModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.colorchooser.ColorSelectionModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.colorchooser.ColorSelectionModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.colorchooser.ColorSelectionModel]

}
