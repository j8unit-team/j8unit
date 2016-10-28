package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.Predicate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PredicateTest
implements org.j8unit.repository.javax.sql.rowset.PredicateTests<Predicate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.Predicate]

    @Override
    public Predicate createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.Predicate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.Predicate]

}
