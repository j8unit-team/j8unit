package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProcessingEnvironmentClassTest
implements org.j8unit.repository.javax.annotation.processing.ProcessingEnvironmentClassTests<javax.annotation.processing.ProcessingEnvironment> {

    @Override
    public Class<javax.annotation.processing.ProcessingEnvironment> createNewSUT() {
        return javax.annotation.processing.ProcessingEnvironment.class;
    }

}
