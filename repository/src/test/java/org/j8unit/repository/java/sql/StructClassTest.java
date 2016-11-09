package org.j8unit.repository.java.sql;

import java.sql.Struct;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Struct} (by simply reusing the J8Unit
 * test interface {@link StructClassTests}).
 */

@RunWith(J8Unit4.class)
public class StructClassTest
implements StructClassTests<Struct> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Struct]

    @Override
    public Class<Struct> createNewSUT() {
        return Struct.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Struct]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Struct]

}
