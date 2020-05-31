package comprarPassagemSteps
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
import com.paginas.PaginaSelecionarPassagem

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

	PaginaSelecionarPassagem passagem = new PaginaSelecionarPassagem()

	@Given("Esta na pagina de Flights Finder")
	def paginaDeSelecionarPassagem() {
		passagem.validaPagina()
	}

	@When("Selecionar ida e volta")
	def tipoDaCompra() {
		passagem.tipoDaCompraKey()
	}

	@And("escolher a (.*) de passageiros")
	def quantidadePassageiro(String qntpassageiro){
		passagem.quantidadePassageiroKey(qntpassageiro)
	}

	@And("escolher de (.*)")
	def localDePartida(String localpartida){
		passagem.localDePartidaKey(localpartida)
	}

	@And("escolher o M (.*)")
	def mesDePartida(String mespartida){
		passagem.mesDePartidaKey(mespartida)
	}

	@And("escolher o D (.*)")
	def diaPartida(String diapartida){
		passagem.diaPartidaKey(diapartida)
	}

	@And("escolher para (.*)")
	def localDeChegada(String localchegada){
		passagem.localDeChegadaKey(localchegada)
	}

	@And("escolher o m (.*)")
	def mesDaVolta(String mesvolta){
		passagem.mesDaVoltaKey(mesvolta)
	}

	@And("escolher o d (.*)")
	def diaDaVolta(String diavolta){
		passagem.diaDaVoltaKey(diavolta)
	}

	@And("escolher a classe de servico")
	def classeServico(){
		passagem.classeServicoKey()
	}

	@And("escolher a (.*) aerea")
	def ciaAerea(String cia){
		passagem.ciaAereaKey(cia)
	}

	@Then("clicar no botao continue")
	def botaoContinue(){
		passagem.botaoContinueKey()
	}
}