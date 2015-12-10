package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceAttributeSetClassTest
implements org.j8unit.repository.javax.print.attribute.PrintServiceAttributeSetClassTests<javax.print.attribute.PrintServiceAttributeSet> {

    @Override
    public Class<javax.print.attribute.PrintServiceAttributeSet> createNewSUT() {
        return javax.print.attribute.PrintServiceAttributeSet.class;
    }

}
