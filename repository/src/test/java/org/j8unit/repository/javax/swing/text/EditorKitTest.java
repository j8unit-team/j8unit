package org.j8unit.repository.javax.swing.text;

import javax.swing.text.EditorKit;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EditorKitTest
implements org.j8unit.repository.javax.swing.text.EditorKitTests<EditorKit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.EditorKit]

    @Override
    public EditorKit createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.EditorKit], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.EditorKit]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.EditorKit]

}
