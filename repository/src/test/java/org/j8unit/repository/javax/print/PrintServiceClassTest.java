package org.j8unit.repository.javax.print;

import javax.print.PrintService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceClassTest
implements org.j8unit.repository.javax.print.PrintServiceClassTests<PrintService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.PrintService]

    @Override
    public Class<PrintService> createNewSUT() {
        return PrintService.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.PrintService]

}
