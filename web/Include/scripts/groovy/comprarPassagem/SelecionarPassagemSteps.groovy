package comprarPassagem
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SelecionarPassagemSteps {

	@Given("Esta na pagina de Flights Finder")
	def paginaDeSelecionarPassagem() {
		WebUI.verifyElementPresent(findTestObject('PaginaFlights/a_Flights'), 5)
	}

	@When("Selecionar ida e volta")
	def tipoDaCompra() {
		WebUI.click(findTestObject('PaginaFlights/PaginaEncontrarPassagem/input_Round_Trip_One_Way'))
	}

	@And("escolher a (.*) de passageiros")
	def quantidadePassageiro(String qntpassageiros){
		WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Qnt_Passageiros'), qntpassageiros, true)
	}

	@And("escolher de (.*)")
	def localDePartida(String localpartida){
		WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Partindo_de'), localpartida, true)
	}

	@And("escolher o M (.*)")
	def mesDePartida(String mespartida){
		WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Mes_da _Partida'), mespartida, true)
	}

	@And("escolher o D (.*)")
	def diaPartida(String diapartida){
		WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_dia_da_partida'), diapartida, true)
	}

	@And("escolher para (.*)")
	def localDeChegada(String localchegada){
		WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Voltando_de'), localchegada, true)
	}

	@And("escolher o m (.*)")
	def mesDaVolta(String mesvolta){
		WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Mes_da _Volta'), mesvolta, true)
	}

	@And("escolher o d (.*)")
	def diaDaVolta(String diavolta){
		WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_dia_da_volta'), diavolta, true)
	}

	@And("escolher a classe de servico")
	def classeServico(){
		WebUI.click(findTestObject('PaginaFlights/PaginaEncontrarPassagem/input_Service_Classe'))
	}

	@And("escolher a (.*) aerea")
	def ciaAerea(String cia){
		WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Airline'), cia, true)
	}

	@Then("clicar no botao continue")
	def botaoContinue(){
		WebUI.click(findTestObject('PaginaFlights/PaginaEncontrarPassagem/input_Continue'))
	}
}