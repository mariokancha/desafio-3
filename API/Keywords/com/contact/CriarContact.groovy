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

public class CriarContact {

	JsonSlurper slurper = new JsonSlurper()

	boolean crarContact(String pais, String nome, String email){

		def postContact = WS.sendRequest(findTestObject('Contato/Criação de contato', [('pais') : pais, ('nome') : nome, ('email') : email]))

		def parseResponse = slurper.parseText(postContact.getResponseBodyContent().toString())

		println (postContact.getResponseBodyContent().toString())

		def message = WS.verifyResponseStatusCode(postContact, 201,  FailureHandling.STOP_ON_FAILURE)

		println message

		return message
	}
}
