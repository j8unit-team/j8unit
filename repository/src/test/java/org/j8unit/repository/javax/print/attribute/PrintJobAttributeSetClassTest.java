package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobAttributeSetClassTest
implements org.j8unit.repository.javax.print.attribute.PrintJobAttributeSetClassTests<javax.print.attribute.PrintJobAttributeSet> {

    @Override
    public Class<javax.print.attribute.PrintJobAttributeSet> createNewSUT() {
        return javax.print.attribute.PrintJobAttributeSet.class;
    }

}
