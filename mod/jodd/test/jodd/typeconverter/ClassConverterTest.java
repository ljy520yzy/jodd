// Copyright (c) 2003-2010, Jodd Team (jodd.org). All Rights Reserved.

package jodd.typeconverter;

public class ClassConverterTest extends BaseTestCase {

	public void testConversion() {
		assertNull(ClassConverter.valueOf(null));

		assertEquals(String.class, ClassConverter.valueOf(String.class));
		assertEquals(Integer.class, ClassConverter.valueOf("java.lang.Integer"));

		try {
			ClassConverter.valueOf("foo.Klass");
			fail();
		} catch (TypeConversionException ignore) {
		}
	}
}
