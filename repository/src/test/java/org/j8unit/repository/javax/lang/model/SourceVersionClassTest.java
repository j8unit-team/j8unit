package org.j8unit.repository.javax.lang.model;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SourceVersionClassTest
implements org.j8unit.repository.javax.lang.model.SourceVersionClassTests<javax.lang.model.SourceVersion> {

    @Override
    public Class<javax.lang.model.SourceVersion> createNewSUT() {
        return javax.lang.model.SourceVersion.class;
    }

}
