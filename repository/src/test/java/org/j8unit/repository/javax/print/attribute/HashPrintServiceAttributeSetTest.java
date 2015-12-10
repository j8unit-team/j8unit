package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HashPrintServiceAttributeSetTest
implements org.j8unit.repository.javax.print.attribute.HashPrintServiceAttributeSetTests<javax.print.attribute.HashPrintServiceAttributeSet> {

    @Override
    public javax.print.attribute.HashPrintServiceAttributeSet createNewSUT() {
        return new javax.print.attribute.HashPrintServiceAttributeSet();
    }

}
