package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.RowMapper;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RowMapper} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.tree.RowMapperTests}).
 */
@RunWith(J8Unit4.class)
public class RowMapperTest
implements RowMapperTests<RowMapper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.RowMapper]

    @Override
    public RowMapper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.tree.RowMapper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.RowMapper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.RowMapper]

}
