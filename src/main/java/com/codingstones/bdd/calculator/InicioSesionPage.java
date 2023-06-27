//todos los pages siempre deben extender la clase base (en la nomenclatura de la clase)

package com.codingstones.bdd.calculator;

import org.openqa.selenium.By;



public class InicioSesionPage extends BaseClass{
	String xPathEmail1 = "//XCUIElementTypeOther[@name=\"Claro drive\"]/XCUIElementTypeOther[7]/XCUIElementTypeTextField";
	String xPathPassword = "//XCUIElementTypeOther[@name=\"Claro drive\"]/XCUIElementTypeOther[8]/XCUIElementTypeSecureTextField";
	
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
	
}
