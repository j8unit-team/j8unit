package org.j8unit.repository.javax.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResourcesClassTest
implements org.j8unit.repository.javax.annotation.ResourcesClassTests<javax.annotation.Resources> {

    @Override
    public Class<javax.annotation.Resources> createNewSUT() {
        return javax.annotation.Resources.class;
    }

}
