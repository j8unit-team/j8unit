package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintRequestAttributeSetClassTest
implements org.j8unit.repository.javax.print.attribute.PrintRequestAttributeSetClassTests<javax.print.attribute.PrintRequestAttributeSet> {

    @Override
    public Class<javax.print.attribute.PrintRequestAttributeSet> createNewSUT() {
        return javax.print.attribute.PrintRequestAttributeSet.class;
    }

}
