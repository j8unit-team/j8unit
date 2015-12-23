package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharacterClassTest
implements org.j8unit.repository.java.lang.CharacterClassTests<java.lang.Character> {

    @Override
    public Class<java.lang.Character> createNewSUT() {
        return java.lang.Character.class;
    }

    @RunWith(J8Unit4.class)
    public static class UnicodeScriptClassTest
    implements org.j8unit.repository.java.lang.CharacterClassTests.UnicodeScriptClassTests<java.lang.Character.UnicodeScript> {

        @Override
        public Class<java.lang.Character.UnicodeScript> createNewSUT() {
            return java.lang.Character.UnicodeScript.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class SubsetClassTest
    implements org.j8unit.repository.java.lang.CharacterClassTests.SubsetClassTests<java.lang.Character.Subset> {

        @Override
        public Class<java.lang.Character.Subset> createNewSUT() {
            return java.lang.Character.Subset.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class UnicodeBlockClassTest
    implements org.j8unit.repository.java.lang.CharacterClassTests.UnicodeBlockClassTests<java.lang.Character.UnicodeBlock> {

        @Override
        public Class<java.lang.Character.UnicodeBlock> createNewSUT() {
            return java.lang.Character.UnicodeBlock.class;
        }

    }

}
