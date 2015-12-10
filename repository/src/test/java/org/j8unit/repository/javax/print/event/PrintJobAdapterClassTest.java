package org.j8unit.repository.javax.print.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobAdapterClassTest
implements org.j8unit.repository.javax.print.event.PrintJobAdapterClassTests<javax.print.event.PrintJobAdapter> {

    @Override
    public Class<javax.print.event.PrintJobAdapter> createNewSUT() {
        return javax.print.event.PrintJobAdapter.class;
    }

}
