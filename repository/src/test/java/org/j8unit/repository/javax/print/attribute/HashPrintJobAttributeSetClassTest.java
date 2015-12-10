package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HashPrintJobAttributeSetClassTest
implements org.j8unit.repository.javax.print.attribute.HashPrintJobAttributeSetClassTests<javax.print.attribute.HashPrintJobAttributeSet> {

    @Override
    public Class<javax.print.attribute.HashPrintJobAttributeSet> createNewSUT() {
        return javax.print.attribute.HashPrintJobAttributeSet.class;
    }

}
