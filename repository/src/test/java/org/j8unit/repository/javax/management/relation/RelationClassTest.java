package org.j8unit.repository.javax.management.relation;

import javax.management.relation.Relation;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Relation} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.management.relation.RelationClassTests}).
 */
@RunWith(J8Unit4.class)
public class RelationClassTest
implements RelationClassTests<Relation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.Relation]

    @Override
    public Class<Relation> createNewSUT() {
        return Relation.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.Relation]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.Relation]

}
