package com.codingstones.bdd.calculator.steps;

import com.codingstones.bdd.calculator.InicioSesionPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InicioSesionSteps {
	
	
	static InicioSesionPage inicioSesion= new InicioSesionPage();

	
	@When("I tap in {string} button")
	public void i_tap_in_button(String stringButton) {
		inicioSesion.PressButtonSignIn(stringButton);
	}

	@Then("I tap in email text field")
	public void i_tap_in_email_text_field(){
		inicioSesion.PressTxtFieldEmail();
	}

	@Then("I Write the email {string}")
	public void i_write_the_email(String email) {
		inicioSesion.WriteEmail(email);
	}
	
	@Then("I tap in password text field")
	public void i_tap_in_password_text_field(){
		inicioSesion.PressPasswordFieldEmail();
	}
	
	@Then("I Write the password {string}")
	public void i_write_the_password(String pass) {
		inicioSesion.WritePassword(pass);
	}

	@Then("I validate that automatic upload alert exists")
	public void i_validate_that_automatic_upload_alert_exists() {
		inicioSesion.FindAlert();
	}

	@When("I tap in {string} text")
	public void i_tap_in_text(String stringText) {
	    inicioSesion.PressTxtSignIn(stringText);
	}
	@Then("I tap in Negocio email text field")
	public void i_tap_in_negocio_email_text_field() {
		inicioSesion.PressTxtFieldEmailNegocio();
	}
	@Then("I tap in Negocio password text field")
	public void i_tap_in_negocio_password_text_field() {
		inicioSesion.PressTxtFieldPasswordNegocio();
	}








}
