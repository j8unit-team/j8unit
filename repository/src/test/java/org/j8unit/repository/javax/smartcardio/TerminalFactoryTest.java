package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.TerminalFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TerminalFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.smartcardio.TerminalFactoryTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("restriction")
public class TerminalFactoryTest
implements TerminalFactoryTests<TerminalFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.TerminalFactory]

    @Override
    public TerminalFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.smartcardio.TerminalFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.smartcardio.TerminalFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.smartcardio.TerminalFactory]

}
