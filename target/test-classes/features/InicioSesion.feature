Feature: Login to Claro Drive App

@tagInicioCorreo
Scenario: Login with email account
	When I tap in "INICIA SESIÓN" button
	Then I tap in email text field
	Then I Write the email "bgr.10@yopmail.com"
	When I tap in "SIGUIENTE" button
	Then I tap in password text field
	Then I Write the password "Qa654321"
	When I tap in "SIGUIENTE" button
	Then I validate that automatic upload alert exists
	When I tap in "Cancelar" button
	
@tagInicioTelmex
Scenario: Login with Telmex account
	When I tap in "INICIA SESIÓN" button
	Then I tap in email text field
	Then I Write the email "telmex_cd0@tahyu.com"
	When I tap in "SIGUIENTE" button
	Then I tap in password text field
	Then I Write the password "Qa654321"
	When I tap in "SIGUIENTE" button
	Then I validate that automatic upload alert exists
	When I tap in "Cancelar" button
	
@tagInicioTelcel
Scenario: Login with Telcel account
	When I tap in "INICIA SESIÓN" button
	Then I tap in email text field
	Then I Write the email "jorgeivanrz@gmail.com"
	When I tap in "SIGUIENTE" button
	Then I tap in password text field
	Then I Write the password "Qa654321Qa"
	When I tap in "SIGUIENTE" button
	Then I validate that automatic upload alert exists
	When I tap in "Cancelar" button

@tagInicioNegocio
Scenario: Login with Negocio account
	When I tap in "IR A CLARO DRIVE NEGOCIO" text
	Then I tap in Negocio email text field
	Then I Write the Negocio email "qa-tests-dev-29-01@getnada.com"
	Then I tap in Negocio password text field
	Then I Write the Negocio password "Qa654321$"
	When I tap in "INICIAR SESIÓN" button
	Then I validate that automatic upload alert exists
	When I tap in "Cancelar" button
	
@tagInicioClaroVideo
Scenario: Login with Claro Video account
	When I tap in "INICIA SESIÓN" button
	When I tap in "Claro video" text
	Then I tap in Claro video email text field
	Then I Write the Claro video email "chris.prod03@getnada.com"
	Then I tap in Claro video password text field
	Then I Write the Claro video password "Qa654321!"
	Then I validate that automatic upload alert exists
	When I tap in "Cancelar" button