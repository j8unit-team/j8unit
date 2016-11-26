package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Caret;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Caret} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.CaretTests}).
 */
@RunWith(J8Unit4.class)
public class CaretTest
implements CaretTests<Caret> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Caret]

    @Override
    public Caret createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.Caret], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.Caret]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.Caret]

}
