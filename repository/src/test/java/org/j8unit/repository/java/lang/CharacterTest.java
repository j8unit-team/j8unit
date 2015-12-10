package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class CharacterTest
implements org.j8unit.repository.java.lang.CharacterTests<java.lang.Character> {

    @RunWith(J8Unit4.class)
    public static class SubsetTest
    implements org.j8unit.repository.java.lang.CharacterTests.SubsetTests<java.lang.Character.Subset> {

        @Override
        public java.lang.Character.Subset createNewSUT() {
            throw new AssertionError("There is no default constructor for [java.lang.Character.Subset] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class UnicodeBlockTest
    implements org.j8unit.repository.java.lang.CharacterTests.UnicodeBlockTests<java.lang.Character.UnicodeBlock> {

        @Override
        public java.lang.Character.UnicodeBlock createNewSUT() {
            throw new AssertionError("There is no default constructor for [java.lang.Character.UnicodeBlock] available.");
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class UnicodeScriptTest
    implements org.j8unit.repository.java.lang.CharacterTests.UnicodeScriptTests<java.lang.Character.UnicodeScript> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.lang.Character.UnicodeScript.class);
        }

        @Parameter(0)
        public java.lang.Character.UnicodeScript sut;

        @Override
        public java.lang.Character.UnicodeScript createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public java.lang.Character createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.lang.Character] available.");
    }

}
