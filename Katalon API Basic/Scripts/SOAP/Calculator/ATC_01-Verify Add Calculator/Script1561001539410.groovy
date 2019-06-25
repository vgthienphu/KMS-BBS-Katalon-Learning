import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

_Response = WS.sendRequest(findTestObject('SOAP/Calculator/Add Calculator'))

WS.verifyResponseStatusCode(_Response, 200)

WS.verifyElementPropertyValue(_Response, 'AddResult', 15)
