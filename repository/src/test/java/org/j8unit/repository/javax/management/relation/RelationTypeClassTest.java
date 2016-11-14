package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RelationType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.relation.RelationTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class RelationTypeClassTest
implements RelationTypeClassTests<RelationType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationType]

    @Override
    public Class<RelationType> createNewSUT() {
        return RelationType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.RelationType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationType]

}
