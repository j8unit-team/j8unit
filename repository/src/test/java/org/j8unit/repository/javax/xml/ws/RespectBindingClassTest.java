package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.RespectBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RespectBinding} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.RespectBindingClassTests}).
 */
@RunWith(J8Unit4.class)
public class RespectBindingClassTest
implements RespectBindingClassTests<RespectBinding> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.RespectBinding]

    @Override
    public Class<RespectBinding> createNewSUT() {
        return RespectBinding.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.RespectBinding]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.RespectBinding]

}
