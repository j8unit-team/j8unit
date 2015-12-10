package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeSetClassTest
implements org.j8unit.repository.javax.print.attribute.AttributeSetClassTests<javax.print.attribute.AttributeSet> {

    @Override
    public Class<javax.print.attribute.AttributeSet> createNewSUT() {
        return javax.print.attribute.AttributeSet.class;
    }

}
