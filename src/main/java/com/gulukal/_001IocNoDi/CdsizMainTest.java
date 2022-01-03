package com.gulukal._001IocNoDi;

public class CdsizMainTest {

	public static void name() {

		JavaManager javaManager = new JavaManager(new Java17()); // arguman olarak interface verdik

		javaManager.javaSurum();

		JavaManager javaManager1 = new JavaManager(new Java18()); // arguman olarak interface verdik

		javaManager1.javaSurum();

	}
}
