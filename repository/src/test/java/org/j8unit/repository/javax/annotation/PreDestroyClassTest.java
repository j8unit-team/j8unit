package org.j8unit.repository.javax.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PreDestroyClassTest
implements org.j8unit.repository.javax.annotation.PreDestroyClassTests<javax.annotation.PreDestroy> {

    @Override
    public Class<javax.annotation.PreDestroy> createNewSUT() {
        return javax.annotation.PreDestroy.class;
    }

}
