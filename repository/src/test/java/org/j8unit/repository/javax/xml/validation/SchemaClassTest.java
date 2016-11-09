package org.j8unit.repository.javax.xml.validation;

import javax.xml.validation.Schema;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Schema} (by simply reusing the J8Unit
 * test interface {@link SchemaClassTests}).
 */

@RunWith(J8Unit4.class)
public class SchemaClassTest
implements SchemaClassTests<Schema> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.validation.Schema]

    @Override
    public Class<Schema> createNewSUT() {
        return Schema.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.validation.Schema]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.validation.Schema]

}
