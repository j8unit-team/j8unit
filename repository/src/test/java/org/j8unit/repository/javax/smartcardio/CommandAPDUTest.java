package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CommandAPDU;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommandAPDUTest
implements org.j8unit.repository.javax.smartcardio.CommandAPDUTests<CommandAPDU> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CommandAPDU]

    @Override
    public CommandAPDU createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.smartcardio.CommandAPDU], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CommandAPDU]

}
