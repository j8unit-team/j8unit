package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceLookupClassTest
implements org.j8unit.repository.javax.print.PrintServiceLookupClassTests<javax.print.PrintServiceLookup> {

    @Override
    public Class<javax.print.PrintServiceLookup> createNewSUT() {
        return javax.print.PrintServiceLookup.class;
    }

}
