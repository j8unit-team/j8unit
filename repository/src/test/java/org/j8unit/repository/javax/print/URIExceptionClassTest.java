package org.j8unit.repository.javax.print;

import javax.print.URIException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URIExceptionClassTest
implements org.j8unit.repository.javax.print.URIExceptionClassTests<URIException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.URIException]

    @Override
    public Class<URIException> createNewSUT() {
        return URIException.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.URIException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.URIException]

}
