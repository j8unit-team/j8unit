package org.j8unit.repository.javax.xml.transform;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResultClassTest
implements org.j8unit.repository.javax.xml.transform.ResultClassTests<javax.xml.transform.Result> {

    @Override
    public Class<javax.xml.transform.Result> createNewSUT() {
        return javax.xml.transform.Result.class;
    }

}
