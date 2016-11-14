package org.j8unit.repository.javax.activation;

import javax.activation.CommandObject;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CommandObject} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.activation.CommandObjectClassTests}).
 */

@RunWith(J8Unit4.class)
public class CommandObjectClassTest
implements CommandObjectClassTests<CommandObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.CommandObject]

    @Override
    public Class<CommandObject> createNewSUT() {
        return CommandObject.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.CommandObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.CommandObject]

}
