package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SupportedSourceVersionClassTest
implements org.j8unit.repository.javax.annotation.processing.SupportedSourceVersionClassTests<javax.annotation.processing.SupportedSourceVersion> {

    @Override
    public Class<javax.annotation.processing.SupportedSourceVersion> createNewSUT() {
        return javax.annotation.processing.SupportedSourceVersion.class;
    }

}
