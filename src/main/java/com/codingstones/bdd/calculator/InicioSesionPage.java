//todos los pages siempre deben extender la clase base (en la nomenclatura de la clase)

package com.codingstones.bdd.calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



public class InicioSesionPage extends BaseClass{
	String xPathEmail1 = "//XCUIElementTypeOther[@name=\"Claro drive\"]/XCUIElementTypeOther[7]/XCUIElementTypeTextField";
	String xPathPassword = "//XCUIElementTypeOther[@name=\"Claro drive\"]/XCUIElementTypeOther[8]/XCUIElementTypeSecureTextField";
	String xPathEmailNegocio = "//XCUIElementTypeOther[@name=\"Claro drive\"]/XCUIElementTypeOther[8]/XCUIElementTypeTextField";
	String xPathPasswordNegocio = "//XCUIElementTypeOther[@name=\"Claro drive\"]/XCUIElementTypeOther[9]/XCUIElementTypeSecureTextField";
	String xPathEmailCV = "//XCUIElementTypeOther[@name=\"Claro drive\"]/XCUIElementTypeOther[7]/XCUIElementTypeTextField";
	String xPathPasswordCV = "//XCUIElementTypeOther[@name=\"Claro drive\"]/XCUIElementTypeOther[8]/XCUIElementTypeSecureTextField";
	String xPathLogoCD = "//XCUIElementTypeOther[@name=\"logo / claro drive black\"]";
	
	public void PressButtonSignIn(String buttonName){
		driver.findElement(By.name(buttonName)).click(); //busca el elemento con findElement, interactúa con .click
	}
	public void PressTxtFieldEmail() {
		driver.findElement(By.xpath(xPathEmail1)).click();
	}
	public void WriteEmail(String email) {
		driver.findElement(By.xpath(xPathEmail1)).sendKeys(email);
	}
	public void PressPasswordFieldEmail() {
		driver.findElement(By.xpath(xPathPassword)).click();
		
	}
	public void WritePassword(String pass) {
		driver.findElement(By.xpath(xPathPassword)).sendKeys(pass);
	}
	public void FindAlert(){
		waitForElement(By.name("¿Quieres configurar las cargas de cámara?"),12);
		driver.findElement(By.name("¿Quieres configurar las cargas de cámara?"));
		driver.findElement(By.name("Cancelar"));
		driver.findElement(By.name("Aceptar"));
	}
	public void PressTxtSignIn(String stringText) {
		driver.findElement(By.name(stringText)).click();
		
	}
	public void PressTxtFieldEmailNegocio() {
		driver.findElement(By.xpath(xPathEmailNegocio)).click();
		
	}
	public void PressTxtFieldPasswordNegocio() {
		driver.findElement(By.xpath(xPathPasswordNegocio)).click();
		
	}
	public void WriteNegocioEmail(String email) {
		driver.findElement(By.xpath(xPathEmailNegocio)).sendKeys(email);
		
	}
	public void WriteNegocioPassword(String pass) {
		driver.findElement(By.xpath(xPathPasswordNegocio)).sendKeys(pass);
		
	}
	public void PressTxtFieldEmailClaroVideo() {
		waitForElement(By.xpath(xPathEmailCV),2);
		driver.findElement(By.xpath(xPathEmailCV)).click();
	}
	public void WriteEmailClaroVideo(String emailCV) {
		driver.findElement(By.xpath(xPathEmailCV)).sendKeys(emailCV);
		
	}
	public void PressTxtFieldPasswordClaroVideo() {
		driver.findElement(By.xpath(xPathPasswordCV)).click();
	}
	public void WritePasswordClaroVideo(String passCV) {
		driver.findElement(By.xpath(xPathPasswordCV)).sendKeys(passCV);
		driver.findElement(By.xpath(xPathPasswordCV)).sendKeys(Keys.ENTER);
	}
	public void ValidateLanding() {
		System.out.println("Sí entre al BG");
		if(isVisible(By.xpath(xPathEmail1))) {
			driver.findElement(By.name("CANCELAR")).click();
			System.out.println("Estabas en landing cliente masivo/telmex/telcel");
		}
		else if (isVisible(By.xpath(xPathEmailCV))){
			driver.findElement(By.name("CANCELAR")).click();
			System.out.println("Estabas en landing Claro Video");
		}
		else if (isVisible(By.xpath(xPathEmailNegocio))) {
			driver.findElement(By.name("IR A CLARO DRIVE PERSONAL")).click();
			System.out.println("Estabas en landing Negocio");
		}
		
	}
	public void ValidateLoggedIn() {
		if(isVisible(By.name("Más"))) {
			driver.findElement(By.name("Más")).click();
			mobileScrollScreenIOS("UP");
			driver.findElement(By.name("Cerrar sesión")).click();
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]")).click();
			waitForElement(By.name("INICIA SESIÓN"),20);
		}
		
	}

}
