package org.j8unit.repository.javax.jws.soap;

import javax.jws.soap.InitParam;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InitParam} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.jws.soap.InitParamClassTests}).
 */

@RunWith(J8Unit4.class)
public class InitParamClassTest
implements InitParamClassTests<InitParam> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.soap.InitParam]

    @Override
    public Class<InitParam> createNewSUT() {
        return InitParam.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.jws.soap.InitParam]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.soap.InitParam]

}
