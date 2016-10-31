package org.j8unit.repository.javax.print;

import javax.print.FlavorException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FlavorExceptionClassTest
implements org.j8unit.repository.javax.print.FlavorExceptionClassTests<FlavorException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.FlavorException]

    @Override
    public Class<FlavorException> createNewSUT() {
        return FlavorException.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.FlavorException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.FlavorException]

}
