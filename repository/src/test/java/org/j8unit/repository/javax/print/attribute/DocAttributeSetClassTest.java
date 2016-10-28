package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.DocAttributeSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocAttributeSetClassTest
implements org.j8unit.repository.javax.print.attribute.DocAttributeSetClassTests<DocAttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.DocAttributeSet]

    @Override
    public Class<DocAttributeSet> createNewSUT() {
        return DocAttributeSet.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.DocAttributeSet]

}
