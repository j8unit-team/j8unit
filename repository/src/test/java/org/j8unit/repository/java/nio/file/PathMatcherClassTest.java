package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PathMatcherClassTest
implements org.j8unit.repository.java.nio.file.PathMatcherClassTests<java.nio.file.PathMatcher> {

    @Override
    public Class<java.nio.file.PathMatcher> createNewSUT() {
        return java.nio.file.PathMatcher.class;
    }

}
