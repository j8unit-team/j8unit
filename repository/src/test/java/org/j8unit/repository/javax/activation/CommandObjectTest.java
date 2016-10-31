package org.j8unit.repository.javax.activation;

import javax.activation.CommandObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommandObjectTest
implements org.j8unit.repository.javax.activation.CommandObjectTests<CommandObject> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.CommandObject]

    @Override
    public CommandObject createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.activation.CommandObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.activation.CommandObject]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.activation.CommandObject]

}
