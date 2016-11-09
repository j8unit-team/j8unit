package org.j8unit.repository.java.util.jar;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AttributesTest
implements FactoryBasedJ8UnitTest<Attributes>, AttributesTests<Attributes> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.Attributes]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Attributes::new);
    }

    @Parameter(0)
    public Callable<Attributes> sutFactory;

    @Override
    public Callable<Attributes> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.jar.Attributes]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.jar.Attributes]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Name} (by simply reusing the
     * J8Unit test interface {@link NameTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class NameTest
    implements NameTests<Name> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.Attributes$Name]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(Name.MANIFEST_VERSION, //
                                                       Name.IMPLEMENTATION_VENDOR, //
                                                       Name.CLASS_PATH, //
                                                       Name.MAIN_CLASS, //
                                                       Name.SEALED, //
                                                       Name.IMPLEMENTATION_URL, //
                                                       Name.SPECIFICATION_VERSION, //
                                                       Name.IMPLEMENTATION_VENDOR_ID, //
                                                       Name.SPECIFICATION_VENDOR, //
                                                       Name.EXTENSION_LIST, //
                                                       Name.SPECIFICATION_TITLE, //
                                                       Name.CONTENT_TYPE, //
                                                       Name.IMPLEMENTATION_VERSION, //
                                                       Name.IMPLEMENTATION_TITLE, //
                                                       Name.SIGNATURE_VERSION, //
                                                       Name.EXTENSION_NAME, //
                                                       Name.EXTENSION_INSTALLATION);
        }

        @Parameter(0)
        public Name sut;

        @Override
        public Name createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.jar.Attributes$Name]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.jar.Attributes$Name]

    }

}
