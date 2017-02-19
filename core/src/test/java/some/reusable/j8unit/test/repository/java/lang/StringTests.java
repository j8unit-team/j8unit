package some.reusable.j8unit.test.repository.java.lang;

import some.reusable.j8unit.test.repository.java.io.SerializableTests;

public abstract interface StringTests<SUT extends String>
extends SerializableTests<SUT>, ComparableTests<SUT, String>, CharSequenceTests<SUT>, ObjectTests<SUT> {

}
