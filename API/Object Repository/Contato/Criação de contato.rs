<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Criação de contato</name>
   <tag></tag>
   <elementGuidId>262190c1-f591-4049-91af-26ed9c35f5fd</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n \&quot;pais\&quot;: \&quot;${pais}\&quot;,\n \&quot;nome\&quot;: \&quot;${nome}\&quot;,\n \&quot;email\&quot;: \&quot;${email}\&quot;\n }&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://5ebec0beec800c0016043e6f.mockapi.io/contact</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'Brasil'</defaultValue>
      <description></description>
      <id>ab93c404-59a6-43e5-a024-7745f2cc70da</id>
      <masked>false</masked>
      <name>pais</name>
   </variables>
   <variables>
      <defaultValue>'Igor Silva'</defaultValue>
      <description></description>
      <id>ab378f56-8425-4bd6-ae0a-5ef73509fde7</id>
      <masked>false</masked>
      <name>nome</name>
   </variables>
   <variables>
      <defaultValue>'igordavi@gmail.com'</defaultValue>
      <description></description>
      <id>ccb00ea8-7a3a-4cc0-9f26-aa011d97fb3e</id>
      <masked>false</masked>
      <name>email</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
