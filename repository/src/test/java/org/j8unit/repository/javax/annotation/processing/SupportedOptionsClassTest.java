package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SupportedOptionsClassTest
implements org.j8unit.repository.javax.annotation.processing.SupportedOptionsClassTests<javax.annotation.processing.SupportedOptions> {

    @Override
    public Class<javax.annotation.processing.SupportedOptions> createNewSUT() {
        return javax.annotation.processing.SupportedOptions.class;
    }

}
