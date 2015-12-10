package org.j8unit.repository.javax.jws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebParamClassTest
implements org.j8unit.repository.javax.jws.WebParamClassTests<javax.jws.WebParam> {

    @RunWith(J8Unit4.class)
    public static class ModeClassTest
    implements org.j8unit.repository.javax.jws.WebParamClassTests.ModeClassTests<javax.jws.WebParam.Mode> {

        @Override
        public Class<javax.jws.WebParam.Mode> createNewSUT() {
            return javax.jws.WebParam.Mode.class;
        }

    }

    @Override
    public Class<javax.jws.WebParam> createNewSUT() {
        return javax.jws.WebParam.class;
    }

}
