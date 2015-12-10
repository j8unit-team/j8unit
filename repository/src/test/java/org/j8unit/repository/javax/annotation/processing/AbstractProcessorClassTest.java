package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractProcessorClassTest
implements org.j8unit.repository.javax.annotation.processing.AbstractProcessorClassTests<javax.annotation.processing.AbstractProcessor> {

    @Override
    public Class<javax.annotation.processing.AbstractProcessor> createNewSUT() {
        return javax.annotation.processing.AbstractProcessor.class;
    }

}
