package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocAttributeSetClassTest
implements org.j8unit.repository.javax.print.attribute.DocAttributeSetClassTests<javax.print.attribute.DocAttributeSet> {

    @Override
    public Class<javax.print.attribute.DocAttributeSet> createNewSUT() {
        return javax.print.attribute.DocAttributeSet.class;
    }

}
