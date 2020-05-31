package com.paginas

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class PaginaLogin {

	private TestObject inputUserName  =	findTestObject('PaginaLogin/input_User_Name')
	private TestObject inputPassword  =	findTestObject('PaginaLogin/input_Password')
	private TestObject buttonSubmit  =	findTestObject('PaginaLogin/input_Submit')
	private TestObject paginaFlights  =	findTestObject('PaginaFlights/a_Flights')


	@Keyword
	def login (String nome, String password){
		enterUsername(nome)
		enterPassword(password)
		WebUI.takeScreenshot()
	}

	@Keyword
	def enterUsername (String nome){
		WebUI.setText(inputUserName, nome)
	}

	@Keyword
	def enterPassword (String password) {
		WebUI.setText(inputPassword, password)
	}

	@Keyword
	def clickButtonLogin(){
		WebUI.click(buttonSubmit)
	}

	@Keyword
	def validaPaginaFlights(){
		WebUI.verifyElementPresent(findTestObject('PaginaFlights/a_Flights'), 5)
		WebUI.takeScreenshot()
	}
}
