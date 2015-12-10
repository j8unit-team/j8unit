package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamPrintServiceClassTest
implements org.j8unit.repository.javax.print.StreamPrintServiceClassTests<javax.print.StreamPrintService> {

    @Override
    public Class<javax.print.StreamPrintService> createNewSUT() {
        return javax.print.StreamPrintService.class;
    }

}
