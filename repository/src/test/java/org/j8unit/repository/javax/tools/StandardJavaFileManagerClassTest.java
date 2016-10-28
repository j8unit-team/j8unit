package org.j8unit.repository.javax.tools;

import javax.tools.StandardJavaFileManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardJavaFileManagerClassTest
implements org.j8unit.repository.javax.tools.StandardJavaFileManagerClassTests<StandardJavaFileManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.StandardJavaFileManager]

    @Override
    public Class<StandardJavaFileManager> createNewSUT() {
        return StandardJavaFileManager.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.StandardJavaFileManager]

}
