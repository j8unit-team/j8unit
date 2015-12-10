package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationSupportClassTest
implements org.j8unit.repository.javax.management.relation.RelationSupportClassTests<javax.management.relation.RelationSupport> {

    @Override
    public Class<javax.management.relation.RelationSupport> createNewSUT() {
        return javax.management.relation.RelationSupport.class;
    }

}
