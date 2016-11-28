package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.Result;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Result} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.transform.ResultTests}).
 */
@RunWith(J8Unit4.class)
public class ResultTest
implements org.j8unit.repository.javax.xml.transform.ResultTests<Result> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.Result]

    @Override
    public Result createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.transform.Result], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.Result]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.Result]

}
