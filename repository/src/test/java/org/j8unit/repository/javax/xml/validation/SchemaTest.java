package org.j8unit.repository.javax.xml.validation;

import javax.xml.validation.Schema;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Schema} (by simply reusing the J8Unit
 * test interface {@link SchemaTests}).
 */

@RunWith(J8Unit4.class)
public class SchemaTest
implements SchemaTests<Schema> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.validation.Schema]

    @Override
    public Schema createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.validation.Schema], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.validation.Schema]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.validation.Schema]

}
