package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationClassTest
implements org.j8unit.repository.javax.management.relation.RelationClassTests<javax.management.relation.Relation> {

    @Override
    public Class<javax.management.relation.Relation> createNewSUT() {
        return javax.management.relation.Relation.class;
    }

}
