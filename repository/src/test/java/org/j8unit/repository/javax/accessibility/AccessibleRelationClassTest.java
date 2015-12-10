package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleRelationClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleRelationClassTests<javax.accessibility.AccessibleRelation> {

    @Override
    public Class<javax.accessibility.AccessibleRelation> createNewSUT() {
        return javax.accessibility.AccessibleRelation.class;
    }

}
