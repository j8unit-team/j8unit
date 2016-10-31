package org.j8unit.repository.javax.management;

import javax.management.QueryEval;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class QueryEvalTest
implements org.j8unit.repository.javax.management.QueryEvalTests<QueryEval> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.QueryEval]

    @Override
    public QueryEval createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.QueryEval], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.QueryEval]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.QueryEval]

}
