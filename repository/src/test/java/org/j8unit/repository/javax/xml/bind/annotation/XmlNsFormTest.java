package org.j8unit.repository.javax.xml.bind.annotation;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.xml.bind.annotation.XmlNsForm;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlNsForm} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlNsFormTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class XmlNsFormTest
implements XmlNsFormTests<XmlNsForm> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlNsForm]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOfEnumClass(XmlNsForm.class);
    }

    @Parameter(0)
    public XmlNsForm sut;

    @Override
    public XmlNsForm createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlNsForm]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlNsForm]

}
