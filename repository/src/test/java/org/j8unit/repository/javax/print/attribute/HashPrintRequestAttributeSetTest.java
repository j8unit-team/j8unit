package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HashPrintRequestAttributeSetTest
implements org.j8unit.repository.javax.print.attribute.HashPrintRequestAttributeSetTests<javax.print.attribute.HashPrintRequestAttributeSet> {

    @Override
    public javax.print.attribute.HashPrintRequestAttributeSet createNewSUT() {
        return new javax.print.attribute.HashPrintRequestAttributeSet();
    }

}
