<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Alteração de contato</name>
   <tag></tag>
   <elementGuidId>ad03ce9b-fd7d-4b3a-b5d9-f020bafc065e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot; {\n \&quot;id\&quot;: \&quot;${id}\&quot;,\n \&quot;pais\&quot;: \&quot;${pais}\&quot;,\n \&quot;nome\&quot;: \&quot;${nome}\&quot;,\n \&quot;email\&quot;: \&quot;${email}\&quot;\n }\n&quot;,
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
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://5ebec0beec800c0016043e6f.mockapi.io/contact/${id}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'126'</defaultValue>
      <description></description>
      <id>7f4b49f4-f7fa-4d35-8216-f9d0ca765df4</id>
      <masked>false</masked>
      <name>id</name>
   </variables>
   <variables>
      <defaultValue>'Argentina'</defaultValue>
      <description></description>
      <id>322a0ee7-8ec6-40b3-9ccf-424075523f2b</id>
      <masked>false</masked>
      <name>pais</name>
   </variables>
   <variables>
      <defaultValue>'Igor Silva'</defaultValue>
      <description></description>
      <id>91c40bf2-0115-4dda-bab6-6eeda3655279</id>
      <masked>false</masked>
      <name>nome</name>
   </variables>
   <variables>
      <defaultValue>'igordavi@gmail.com'</defaultValue>
      <description></description>
      <id>6fd146b9-619b-48e5-99a2-8525c35eef38</id>
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
