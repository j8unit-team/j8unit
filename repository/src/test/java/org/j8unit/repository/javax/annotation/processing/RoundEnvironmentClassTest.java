package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoundEnvironmentClassTest
implements org.j8unit.repository.javax.annotation.processing.RoundEnvironmentClassTests<javax.annotation.processing.RoundEnvironment> {

    @Override
    public Class<javax.annotation.processing.RoundEnvironment> createNewSUT() {
        return javax.annotation.processing.RoundEnvironment.class;
    }

}
