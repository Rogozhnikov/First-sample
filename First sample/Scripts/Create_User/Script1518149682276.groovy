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

WebUI.click(findTestObject('Users/span_Users'))

WebUI.waitForElementVisible(findTestObject('Users/btn_create_user'), 10)

WebUI.click(findTestObject('Users/btn_create_user'))

WebUI.waitForElementPresent(findTestObject('Users/input_form_Login'), 5)

WebUI.click(findTestObject('Users/input_form_Login'))

WebUI.setText(findTestObject('Users/input_form_Login'), GlobalVariable.User_login)

WebUI.setText(findTestObject('Users/input_Soname'), 'Тестовый')

WebUI.setText(findTestObject('Users/input_form_Name'), 'Пользователь')

WebUI.setText(findTestObject('Users/input_form_Post'), 'rogozhnikov_sergey@live.ru')

WebUI.setText(findTestObject('Users/input_form_Phone'), '89655734190')

WebUI.setText(findTestObject('Users/input_form_Number'), GlobalVariable.User_number)

WebUI.setText(findTestObject('Users/input_form_Pass'), GlobalVariable.User_pass)

WebUI.setText(findTestObject('Users/input_form_ConfirmPass'), GlobalVariable.User_pass)

WebUI.click(findTestObject('Users/btn_saveUser'))

