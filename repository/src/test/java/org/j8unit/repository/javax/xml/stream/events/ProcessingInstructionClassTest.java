package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.ProcessingInstruction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ProcessingInstruction} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.events.ProcessingInstructionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ProcessingInstructionClassTest
implements ProcessingInstructionClassTests<ProcessingInstruction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.ProcessingInstruction]

    @Override
    public Class<ProcessingInstruction> createNewSUT() {
        return ProcessingInstruction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.ProcessingInstruction]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.ProcessingInstruction]

}
