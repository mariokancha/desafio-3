import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

CucumberKW.runFeatureFile('Include/features/Login.feature')

WebUI.click(findTestObject('PaginaFlights/PaginaEncontrarPassagem/input_Round_Trip_One_Way'))

WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Qnt_Passageiros'), '1', true)

WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Partindo_de'), 'London', true)

WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Mes_da _Partida'), '5', true)

WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_dia_da_partida'), '15', true)

WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Voltando_de'), 'New York', true)

WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Mes_da _Volta'), '7', true)

WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_dia_da_volta'), '11', true)

WebUI.click(findTestObject('PaginaFlights/PaginaEncontrarPassagem/input_Service_Classe'))

WebUI.selectOptionByValue(findTestObject('PaginaFlights/PaginaEncontrarPassagem/select_Airline'), 'Blue Skies Airlines', true)

WebUI.click(findTestObject('PaginaFlights/PaginaEncontrarPassagem/input_Continue'))

