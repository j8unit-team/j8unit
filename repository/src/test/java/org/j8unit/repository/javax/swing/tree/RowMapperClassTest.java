package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.RowMapper;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowMapper} (by simply reusing the J8Unit
 * test interface {@link RowMapperClassTests}).
 */

@RunWith(J8Unit4.class)
public class RowMapperClassTest
implements RowMapperClassTests<RowMapper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.RowMapper]

    @Override
    public Class<RowMapper> createNewSUT() {
        return RowMapper.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.RowMapper]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.RowMapper]

}
