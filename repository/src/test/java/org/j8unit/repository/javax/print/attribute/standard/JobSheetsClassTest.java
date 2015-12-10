package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JobSheetsClassTest
implements org.j8unit.repository.javax.print.attribute.standard.JobSheetsClassTests<javax.print.attribute.standard.JobSheets> {

    @Override
    public Class<javax.print.attribute.standard.JobSheets> createNewSUT() {
        return javax.print.attribute.standard.JobSheets.class;
    }

}
