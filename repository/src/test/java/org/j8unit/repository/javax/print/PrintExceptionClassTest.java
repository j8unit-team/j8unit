package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintExceptionClassTest
implements org.j8unit.repository.javax.print.PrintExceptionClassTests<javax.print.PrintException> {

    @Override
    public Class<javax.print.PrintException> createNewSUT() {
        return javax.print.PrintException.class;
    }

}
