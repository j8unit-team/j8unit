package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.SupportedSourceVersion;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SupportedSourceVersionClassTest
implements org.j8unit.repository.javax.annotation.processing.SupportedSourceVersionClassTests<SupportedSourceVersion> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.SupportedSourceVersion]

    @Override
    public Class<SupportedSourceVersion> createNewSUT() {
        return SupportedSourceVersion.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.SupportedSourceVersion]

}
