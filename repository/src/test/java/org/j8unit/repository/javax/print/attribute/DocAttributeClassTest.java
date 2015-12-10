package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocAttributeClassTest
implements org.j8unit.repository.javax.print.attribute.DocAttributeClassTests<javax.print.attribute.DocAttribute> {

    @Override
    public Class<javax.print.attribute.DocAttribute> createNewSUT() {
        return javax.print.attribute.DocAttribute.class;
    }

}
