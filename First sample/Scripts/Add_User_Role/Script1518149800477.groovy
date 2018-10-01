import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.delay(60)

WebUI.refresh()

WebUI.click(findTestObject('Users/span_Users'))

WebUI.setText(findTestObject('Users/User_Login'), GlobalVariable.User_login)

WebUI.click(findTestObject('Users/Login_header'))

WebUI.waitForElementPresent(findTestObject('Users/btn_create_user'), 30)

WebUI.click(findTestObject('Users/btn_Edit_User'))

WebUI.waitForElementPresent(findTestObject('Users/btn_User_Roles'), 30)

WebUI.click(findTestObject('Users/btn_User_Roles'))

WebUI.setText(findTestObject('Users/input_form_User_Roles'), GlobalVariable.User_role_new)

WebUI.click(findTestObject('Users/Role_New_Katalon'))

WebUI.setText(findTestObject('Users/input_form_User_Roles'), GlobalVariable.User_role_old)

WebUI.click(findTestObject('Users/Role_Old_Weaver'))

WebUI.click(findTestObject('Users/btn_Save_User'))

WebUI.delay(GlobalVariable.Time_out)

