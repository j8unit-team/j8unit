package org.j8unit.repository.javax.activation;

import javax.activation.CommandMap;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CommandMap} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.activation.CommandMapTests}).
 */
@RunWith(J8Unit4.class)
public class CommandMapTest
implements CommandMapTests<CommandMap> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.CommandMap]

    @Override
    public CommandMap createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.activation.CommandMap], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.activation.CommandMap]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.activation.CommandMap]

}
