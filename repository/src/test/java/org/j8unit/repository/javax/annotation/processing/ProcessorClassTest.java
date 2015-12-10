package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProcessorClassTest
implements org.j8unit.repository.javax.annotation.processing.ProcessorClassTests<javax.annotation.processing.Processor> {

    @Override
    public Class<javax.annotation.processing.Processor> createNewSUT() {
        return javax.annotation.processing.Processor.class;
    }

}
