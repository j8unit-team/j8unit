package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CommandAPDU;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CommandAPDU} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.smartcardio.CommandAPDUTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("restriction")
public class CommandAPDUTest
implements CommandAPDUTests<CommandAPDU> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CommandAPDU]

    @Override
    public CommandAPDU createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.smartcardio.CommandAPDU], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.smartcardio.CommandAPDU]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.smartcardio.CommandAPDU]

}
