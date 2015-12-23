package org.j8unit.repository.java.util.jar;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class AttributesTest
implements org.j8unit.repository.java.util.jar.AttributesTests<java.util.jar.Attributes> {

    @Override
    public java.util.jar.Attributes createNewSUT() {
        return new java.util.jar.Attributes();
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class NameTest
    implements org.j8unit.repository.java.util.jar.AttributesTests.NameTests<java.util.jar.Attributes.Name> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.util.jar.Attributes.Name.MANIFEST_VERSION, //
                                    java.util.jar.Attributes.Name.IMPLEMENTATION_VENDOR, //
                                    java.util.jar.Attributes.Name.CLASS_PATH, //
                                    java.util.jar.Attributes.Name.MAIN_CLASS, //
                                    java.util.jar.Attributes.Name.SEALED, //
                                    java.util.jar.Attributes.Name.IMPLEMENTATION_URL, //
                                    java.util.jar.Attributes.Name.SPECIFICATION_VERSION, //
                                    java.util.jar.Attributes.Name.IMPLEMENTATION_VENDOR_ID, //
                                    java.util.jar.Attributes.Name.SPECIFICATION_VENDOR, //
                                    java.util.jar.Attributes.Name.EXTENSION_LIST, //
                                    java.util.jar.Attributes.Name.SPECIFICATION_TITLE, //
                                    java.util.jar.Attributes.Name.CONTENT_TYPE, //
                                    java.util.jar.Attributes.Name.IMPLEMENTATION_VERSION, //
                                    java.util.jar.Attributes.Name.IMPLEMENTATION_TITLE, //
                                    java.util.jar.Attributes.Name.SIGNATURE_VERSION, //
                                    java.util.jar.Attributes.Name.EXTENSION_NAME, //
                                    java.util.jar.Attributes.Name.EXTENSION_INSTALLATION);
        }

        @Parameter(0)
        public java.util.jar.Attributes.Name sut;

        @Override
        public java.util.jar.Attributes.Name createNewSUT() {
            return this.sut;
        }

    }

}
