package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.SupportedOptions;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SupportedOptionsClassTest
implements org.j8unit.repository.javax.annotation.processing.SupportedOptionsClassTests<SupportedOptions> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.SupportedOptions]

    @Override
    public Class<SupportedOptions> createNewSUT() {
        return SupportedOptions.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.SupportedOptions]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.SupportedOptions]

}
