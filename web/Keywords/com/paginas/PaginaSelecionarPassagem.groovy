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

public class PaginaSelecionarPassagem {


	private TestObject inputRound = findTestObject('PaginaFlights/PaginaEncontrarPassagem/input_Round_Trip_One_Way')
	private TestObject qntPassageiros = findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Qnt_Passageiros')
	private TestObject lPartida = findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Partindo_de')
	private TestObject mesPartida = findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Mes_da _Partida')
	private TestObject diaPartida = findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_dia_da_partida')
	private TestObject voltanDe = findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Voltando_de')
	private TestObject mesVolta = findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Mes_da _Volta')
	private TestObject diaVolta = findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_dia_da_volta')
	private TestObject classeAerea = findTestObject('PaginaFlights/PaginaEncontrarPassagem/input_Service_Classe')
	private TestObject selectCia = findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Airline')
	private TestObject buttonContinue = findTestObject('PaginaFlights/PaginaEncontrarPassagem/input_Continue')

	PaginaLogin login = new PaginaLogin()

	@Keyword
	def validaPagina(){
		login.validaPaginaFlights()
	}

	@Keyword
	def tipoDaCompraKey() {
		WebUI.click(inputRound)
	}

	@Keyword
	def quantidadePassageiroKey(String passageiro){
		WebUI.selectOptionByValue(qntPassageiros, passageiro, true)
	}

	@Keyword
	def localDePartidaKey(String localpartida){
		WebUI.selectOptionByValue(lPartida, localpartida, true)
	}

	@Keyword
	def mesDePartidaKey(String mespartida){
		WebUI.selectOptionByValue(mesPartida, mespartida, true)
	}

	@Keyword
	def diaPartidaKey(String diapartida){
		WebUI.selectOptionByValue(diaPartida, diapartida, true)
	}

	@Keyword
	def localDeChegadaKey(String localchegada){
		WebUI.selectOptionByValue(voltanDe, localchegada, true)
	}

	@Keyword
	def mesDaVoltaKey(String mesvolta){
		WebUI.selectOptionByValue(mesVolta, mesvolta, true)
	}

	@Keyword
	def diaDaVoltaKey(String diavolta){
		WebUI.selectOptionByValue(diaVolta, diavolta, true)
	}

	@Keyword
	def classeServicoKey(){
		WebUI.click(classeAerea)
	}

	@Keyword
	def ciaAereaKey(String cia){
		WebUI.selectOptionByValue(selectCia, cia, true)
	}

	@Keyword
	def botaoContinueKey(){
		WebUI.click(buttonContinue)
	}
}
