package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeListClassTest
implements org.j8unit.repository.javax.management.AttributeListClassTests<javax.management.AttributeList> {

    @Override
    public Class<javax.management.AttributeList> createNewSUT() {
        return javax.management.AttributeList.class;
    }

}
