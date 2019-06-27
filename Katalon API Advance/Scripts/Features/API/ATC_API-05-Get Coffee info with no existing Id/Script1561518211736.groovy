import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Send request to get coffee with no existing id'
def res = WS.callTestCase(findTestCase('Common/API/Get Coffee'), [('p_Id') : p_Id], FailureHandling.STOP_ON_FAILURE)

'Verify status code'
WS.verifyResponseStatusCode(res.response, 200)

'Verify return no coffee'
WS.verifyEqual(res.jsonBody, null)

@com.kms.katalon.core.annotation.SetUp
def setUp() {
    p_Id = '500'
}

