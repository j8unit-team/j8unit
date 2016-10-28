package org.j8unit.repository.javax.print;

import javax.print.StreamPrintService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamPrintServiceClassTest
implements org.j8unit.repository.javax.print.StreamPrintServiceClassTests<StreamPrintService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.StreamPrintService]

    @Override
    public Class<StreamPrintService> createNewSUT() {
        return StreamPrintService.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.StreamPrintService]

}
