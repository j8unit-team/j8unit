package org.j8unit.repository.javax.activation;

import javax.activation.CommandInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CommandInfo} (by simply reusing the
 * J8Unit test interface {@link CommandInfoTests}).
 */

@RunWith(J8Unit4.class)
public class CommandInfoTest
implements CommandInfoTests<CommandInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.CommandInfo]

    @Override
    public CommandInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.activation.CommandInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.activation.CommandInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.activation.CommandInfo]

}
