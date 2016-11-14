package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ProcessingInstruction;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ProcessingInstruction} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.ProcessingInstructionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ProcessingInstructionClassTest
implements ProcessingInstructionClassTests<ProcessingInstruction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ProcessingInstruction]

    @Override
    public Class<ProcessingInstruction> createNewSUT() {
        return ProcessingInstruction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ProcessingInstruction]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ProcessingInstruction]

}
