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
	
	@Then("I Write the Negocio email {string}")
	public void i_write_the_Negocio_email(String email) {
		inicioSesion.WriteNegocioEmail(email);
	}
	
	@Then("I tap in password text field")
	public void i_tap_in_password_text_field(){
		inicioSesion.PressPasswordFieldEmail();
	}
	
	@Then("I Write the password {string}")
	public void i_write_the_password(String pass) {
		inicioSesion.WritePassword(pass);
	}
	
	@Then("I Write the Negocio password {string}")
	public void i_write_the_Negocio_password(String pass) {
		inicioSesion.WriteNegocioPassword(pass);
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
	
	@Then("I tap in Claro video email text field")
	public void i_tap_in_claro_video_email_text_field() {
		inicioSesion.PressTxtFieldEmailClaroVideo();
	}
	@Then("I Write the Claro video email {string}")
	public void i_write_the_claro_video_email(String emailCV) {
		inicioSesion.WriteEmailClaroVideo(emailCV);
	}
	@Then("I tap in Claro video password text field")
	public void i_tap_in_claro_video_password_text_field() {
		inicioSesion.PressTxtFieldPasswordClaroVideo();
	}
	@Then("I Write the Claro video password {string}")
	public void i_write_the_claro_video_password(String passCV) {
		inicioSesion.WritePasswordClaroVideo(passCV);
	}

	@When("I am in some landing")
	public void i_am_in_some_landing() {
	    inicioSesion.ValidateLanding();
	}















}
