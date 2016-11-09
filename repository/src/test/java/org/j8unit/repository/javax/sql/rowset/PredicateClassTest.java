package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.Predicate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Predicate} (by simply reusing the J8Unit
 * test interface {@link PredicateClassTests}).
 */

@RunWith(J8Unit4.class)
public class PredicateClassTest
implements PredicateClassTests<Predicate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.Predicate]

    @Override
    public Class<Predicate> createNewSUT() {
        return Predicate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.Predicate]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.Predicate]

}
