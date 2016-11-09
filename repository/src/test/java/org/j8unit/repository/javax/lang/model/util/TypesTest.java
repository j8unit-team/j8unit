package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.Types;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Types} (by simply reusing the J8Unit
 * test interface {@link TypesTests}).
 */

@RunWith(J8Unit4.class)
public class TypesTest
implements TypesTests<Types> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.util.Types]

    @Override
    public Types createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.util.Types], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.util.Types]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.util.Types]

}
