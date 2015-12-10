package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HashDocAttributeSetTest
implements org.j8unit.repository.javax.print.attribute.HashDocAttributeSetTests<javax.print.attribute.HashDocAttributeSet> {

    @Override
    public javax.print.attribute.HashDocAttributeSet createNewSUT() {
        return new javax.print.attribute.HashDocAttributeSet();
    }

}
