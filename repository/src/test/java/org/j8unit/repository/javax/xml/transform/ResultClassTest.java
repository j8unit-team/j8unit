package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.Result;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResultClassTest
implements org.j8unit.repository.javax.xml.transform.ResultClassTests<Result> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.Result]

    @Override
    public Class<Result> createNewSUT() {
        return Result.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.Result]

}
