package org.j8unit.repository.javax.jws;

import javax.jws.Oneway;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Oneway} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.jws.OnewayClassTests}).
 */
@RunWith(J8Unit4.class)
public class OnewayClassTest
implements OnewayClassTests<Oneway> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.Oneway]

    @Override
    public Class<Oneway> createNewSUT() {
        return Oneway.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.jws.Oneway]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.Oneway]

}
