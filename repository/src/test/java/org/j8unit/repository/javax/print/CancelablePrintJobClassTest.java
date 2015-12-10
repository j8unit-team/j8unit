package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CancelablePrintJobClassTest
implements org.j8unit.repository.javax.print.CancelablePrintJobClassTests<javax.print.CancelablePrintJob> {

    @Override
    public Class<javax.print.CancelablePrintJob> createNewSUT() {
        return javax.print.CancelablePrintJob.class;
    }

}
