package com.contact

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

import groovy.json.JsonSlurper
import internal.GlobalVariable
import sun.java2d.cmm.kcms.pelArrayInfo

public class BuscarContato {
	
	JsonSlurper slurper = new JsonSlurper()
	
	def buscarContatos(){
		
		def getContatos = WS.sendRequest(findTestObject('Contato/BuscarContatos'))
		
		def message = WS.verifyResponseStatusCode(getContatos, 200)
		
		println message
		
		return message
	}
	
	def buscarContatoPorID(String idContato){
		
		def getContato = WS.sendRequest(findTestObject('Contato/BuscarContato', [('idContato') : idContato]))
		
		def parseResponse = slurper.parseText(getContato.getResponseBodyContent().toString())
		
		println (getContato.getResponseBodyContent().toString())
		
		def getIdContato =  parseResponse.get("id")
		
		println getIdContato
		
		def message = WS.verifyResponseStatusCode(getContato, 200)
		
		println message
		
		return getIdContato
	}
}
