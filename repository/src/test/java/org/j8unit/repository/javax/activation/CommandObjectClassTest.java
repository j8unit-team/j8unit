package org.j8unit.repository.javax.activation;

import javax.activation.CommandObject;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommandObjectClassTest
implements org.j8unit.repository.javax.activation.CommandObjectClassTests<CommandObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.CommandObject]

    @Override
    public Class<CommandObject> createNewSUT() {
        return CommandObject.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.CommandObject]

}
