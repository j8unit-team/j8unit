package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HashPrintJobAttributeSetTest
implements org.j8unit.repository.javax.print.attribute.HashPrintJobAttributeSetTests<javax.print.attribute.HashPrintJobAttributeSet> {

    @Override
    public javax.print.attribute.HashPrintJobAttributeSet createNewSUT() {
        return new javax.print.attribute.HashPrintJobAttributeSet();
    }

}
