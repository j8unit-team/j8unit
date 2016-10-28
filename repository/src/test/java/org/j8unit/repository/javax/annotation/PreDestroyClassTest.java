package org.j8unit.repository.javax.annotation;

import javax.annotation.PreDestroy;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PreDestroyClassTest
implements org.j8unit.repository.javax.annotation.PreDestroyClassTests<PreDestroy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.PreDestroy]

    @Override
    public Class<PreDestroy> createNewSUT() {
        return PreDestroy.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.PreDestroy]

}
