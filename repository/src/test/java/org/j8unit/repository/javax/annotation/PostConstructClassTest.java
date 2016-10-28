package org.j8unit.repository.javax.annotation;

import javax.annotation.PostConstruct;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PostConstructClassTest
implements org.j8unit.repository.javax.annotation.PostConstructClassTests<PostConstruct> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.PostConstruct]

    @Override
    public Class<PostConstruct> createNewSUT() {
        return PostConstruct.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.PostConstruct]

}
