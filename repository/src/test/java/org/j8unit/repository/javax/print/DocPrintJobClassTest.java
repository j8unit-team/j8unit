package org.j8unit.repository.javax.print;

import javax.print.DocPrintJob;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocPrintJobClassTest
implements org.j8unit.repository.javax.print.DocPrintJobClassTests<DocPrintJob> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.DocPrintJob]

    @Override
    public Class<DocPrintJob> createNewSUT() {
        return DocPrintJob.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.DocPrintJob]

}
