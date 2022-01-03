package com.gulukal._001IocNoDi;

//Description : IOC biz kendimiz olusturacagiz
//amac: Spring framework un bize sagladigi yarari gormek
//IOC kendim olusturuyorum

public class JavaManager {
	
	//interface cagirdim
	private IJavaVersion iJavaVersion;
	
	//parametreli constructor
	public JavaManager( IJavaVersion iJavaVersion ) {
		this.iJavaVersion = iJavaVersion;
	}
	
	//metot
	public void javaSurum() {
		iJavaVersion.surum();
	}
}
