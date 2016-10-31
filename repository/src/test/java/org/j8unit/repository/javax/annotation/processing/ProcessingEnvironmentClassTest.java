package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.ProcessingEnvironment;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProcessingEnvironmentClassTest
implements org.j8unit.repository.javax.annotation.processing.ProcessingEnvironmentClassTests<ProcessingEnvironment> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.ProcessingEnvironment]

    @Override
    public Class<ProcessingEnvironment> createNewSUT() {
        return ProcessingEnvironment.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.ProcessingEnvironment]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.ProcessingEnvironment]

}
