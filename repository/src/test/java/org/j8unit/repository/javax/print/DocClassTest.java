package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocClassTest
implements org.j8unit.repository.javax.print.DocClassTests<javax.print.Doc> {

    @Override
    public Class<javax.print.Doc> createNewSUT() {
        return javax.print.Doc.class;
    }

}
