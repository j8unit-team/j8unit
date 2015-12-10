package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceClassTest
implements org.j8unit.repository.javax.print.PrintServiceClassTests<javax.print.PrintService> {

    @Override
    public Class<javax.print.PrintService> createNewSUT() {
        return javax.print.PrintService.class;
    }

}
