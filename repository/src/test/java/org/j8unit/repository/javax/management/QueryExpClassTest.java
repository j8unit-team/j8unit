package org.j8unit.repository.javax.management;

import javax.management.QueryExp;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link QueryExp} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.management.QueryExpClassTests}).
 */
@RunWith(J8Unit4.class)
public class QueryExpClassTest
implements QueryExpClassTests<QueryExp> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.QueryExp]

    @Override
    public Class<QueryExp> createNewSUT() {
        return QueryExp.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.QueryExp]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.QueryExp]

}
