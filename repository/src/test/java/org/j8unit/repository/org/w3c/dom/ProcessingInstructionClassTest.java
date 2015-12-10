package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProcessingInstructionClassTest
implements org.j8unit.repository.org.w3c.dom.ProcessingInstructionClassTests<org.w3c.dom.ProcessingInstruction> {

    @Override
    public Class<org.w3c.dom.ProcessingInstruction> createNewSUT() {
        return org.w3c.dom.ProcessingInstruction.class;
    }

}
