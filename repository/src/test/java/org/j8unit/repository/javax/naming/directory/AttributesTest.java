package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.Attributes;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Attributes} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.directory.AttributesTests}).
 */
@RunWith(J8Unit4.class)
public class AttributesTest
implements AttributesTests<Attributes> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.directory.Attributes]

    @Override
    public Attributes createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.directory.Attributes], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.directory.Attributes]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.directory.Attributes]

}
