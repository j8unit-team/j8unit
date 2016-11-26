package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.DialogTypeSelection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DialogTypeSelection} (by simply reusing
 * the J8Unit test interface
 * {@link org.j8unit.repository.javax.print.attribute.standard.DialogTypeSelectionClassTests}).
 */
@RunWith(J8Unit4.class)
public class DialogTypeSelectionClassTest
implements DialogTypeSelectionClassTests<DialogTypeSelection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.DialogTypeSelection]

    @Override
    public Class<DialogTypeSelection> createNewSUT() {
        return DialogTypeSelection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.DialogTypeSelection]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.DialogTypeSelection]

}
