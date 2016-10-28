package org.j8unit.repository.javax.print;

import javax.print.MultiDoc;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultiDocClassTest
implements org.j8unit.repository.javax.print.MultiDocClassTests<MultiDoc> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.MultiDoc]

    @Override
    public Class<MultiDoc> createNewSUT() {
        return MultiDoc.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.MultiDoc]

}
