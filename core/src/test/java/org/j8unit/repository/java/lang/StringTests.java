package org.j8unit.repository.java.lang;

import org.j8unit.repository.java.io.SerializableTests;

public abstract interface StringTests<SUT extends String>
extends SerializableTests<SUT>, ComparableTests<SUT, String>, CharSequenceTests<SUT>, ObjectTests<SUT> {

}
