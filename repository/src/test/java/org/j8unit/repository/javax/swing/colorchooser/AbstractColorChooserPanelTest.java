package org.j8unit.repository.javax.swing.colorchooser;

import javax.swing.colorchooser.AbstractColorChooserPanel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractColorChooserPanel} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.swing.colorchooser.AbstractColorChooserPanelTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractColorChooserPanelTest
implements AbstractColorChooserPanelTests<AbstractColorChooserPanel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.colorchooser.AbstractColorChooserPanel]

    @Override
    public AbstractColorChooserPanel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.colorchooser.AbstractColorChooserPanel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.colorchooser.AbstractColorChooserPanel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.colorchooser.AbstractColorChooserPanel]

}
