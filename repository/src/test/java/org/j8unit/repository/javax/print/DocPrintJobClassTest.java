package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocPrintJobClassTest
implements org.j8unit.repository.javax.print.DocPrintJobClassTests<javax.print.DocPrintJob> {

    @Override
    public Class<javax.print.DocPrintJob> createNewSUT() {
        return javax.print.DocPrintJob.class;
    }

}
