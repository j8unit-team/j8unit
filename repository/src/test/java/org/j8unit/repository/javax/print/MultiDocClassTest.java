package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultiDocClassTest
implements org.j8unit.repository.javax.print.MultiDocClassTests<javax.print.MultiDoc> {

    @Override
    public Class<javax.print.MultiDoc> createNewSUT() {
        return javax.print.MultiDoc.class;
    }

}
