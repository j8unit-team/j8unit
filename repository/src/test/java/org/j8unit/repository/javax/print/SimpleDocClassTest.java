package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleDocClassTest
implements org.j8unit.repository.javax.print.SimpleDocClassTests<javax.print.SimpleDoc> {

    @Override
    public Class<javax.print.SimpleDoc> createNewSUT() {
        return javax.print.SimpleDoc.class;
    }

}
