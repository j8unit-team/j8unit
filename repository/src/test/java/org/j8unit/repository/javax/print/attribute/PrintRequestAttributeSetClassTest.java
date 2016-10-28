package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintRequestAttributeSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintRequestAttributeSetClassTest
implements org.j8unit.repository.javax.print.attribute.PrintRequestAttributeSetClassTests<PrintRequestAttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.PrintRequestAttributeSet]

    @Override
    public Class<PrintRequestAttributeSet> createNewSUT() {
        return PrintRequestAttributeSet.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.PrintRequestAttributeSet]

}
