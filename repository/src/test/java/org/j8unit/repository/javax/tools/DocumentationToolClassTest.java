package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentationToolClassTest
implements org.j8unit.repository.javax.tools.DocumentationToolClassTests<javax.tools.DocumentationTool> {

    @Override
    public Class<javax.tools.DocumentationTool> createNewSUT() {
        return javax.tools.DocumentationTool.class;
    }

    @RunWith(J8Unit4.class)
    public static class DocumentationTaskClassTest
    implements org.j8unit.repository.javax.tools.DocumentationToolClassTests.DocumentationTaskClassTests<javax.tools.DocumentationTool.DocumentationTask> {

        @Override
        public Class<javax.tools.DocumentationTool.DocumentationTask> createNewSUT() {
            return javax.tools.DocumentationTool.DocumentationTask.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class LocationClassTest
    implements org.j8unit.repository.javax.tools.DocumentationToolClassTests.LocationClassTests<javax.tools.DocumentationTool.Location> {

        @Override
        public Class<javax.tools.DocumentationTool.Location> createNewSUT() {
            return javax.tools.DocumentationTool.Location.class;
        }

    }

}
