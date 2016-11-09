package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.TableHeaderUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TableHeaderUI} (by simply reusing the
 * J8Unit test interface {@link TableHeaderUITests}).
 */

@RunWith(J8Unit4.class)
public class TableHeaderUITest
implements TableHeaderUITests<TableHeaderUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.TableHeaderUI]

    @Override
    public TableHeaderUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.TableHeaderUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.TableHeaderUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.TableHeaderUI]

}
