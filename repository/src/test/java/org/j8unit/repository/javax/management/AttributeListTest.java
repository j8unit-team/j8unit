package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeListTest
implements org.j8unit.repository.javax.management.AttributeListTests<javax.management.AttributeList> {

    @Override
    public javax.management.AttributeList createNewSUT() {
        return new javax.management.AttributeList();
    }

}
