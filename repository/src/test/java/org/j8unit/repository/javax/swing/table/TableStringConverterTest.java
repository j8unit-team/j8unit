package org.j8unit.repository.javax.swing.table;

import javax.swing.table.TableStringConverter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TableStringConverter} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.table.TableStringConverterTests}).
 */

@RunWith(J8Unit4.class)
public class TableStringConverterTest
implements TableStringConverterTests<TableStringConverter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.TableStringConverter]

    @Override
    public TableStringConverter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.table.TableStringConverter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.table.TableStringConverter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.table.TableStringConverter]

}
