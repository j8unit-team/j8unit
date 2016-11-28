package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.Result;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Result} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.transform.ResultClassTests}).
 */
@RunWith(J8Unit4.class)
public class ResultClassTest
implements org.j8unit.repository.javax.xml.transform.ResultClassTests<Result> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.Result]

    @Override
    public Class<Result> createNewSUT() {
        return Result.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.Result]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.Result]

}
