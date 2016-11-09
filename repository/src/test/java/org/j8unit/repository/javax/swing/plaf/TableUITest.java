package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.TableUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TableUI} (by simply reusing the
 * J8Unit test interface {@link TableUITests}).
 */

@RunWith(J8Unit4.class)
public class TableUITest
implements TableUITests<TableUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.TableUI]

    @Override
    public TableUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.TableUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.TableUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.TableUI]

}
