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

WebUI.navigateToUrl(GlobalVariable.Link)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('table_behavior/Table_OC'))

WebUI.waitForElementPresent(findTestObject('table_behavior/btn_Plus'), 30)

WebUI.click(findTestObject('table_behavior/btn_Plus'))

WebUI.click(findTestObject('table_behavior/Type_OC'))

WebUI.click(findTestObject('table_behavior/Type_120'))

WebUI.click(findTestObject('table_behavior/Coils_count'))

WebUI.click(findTestObject('table_behavior/Coils'))

WebUI.click(findTestObject('table_behavior/Number_OC'))

WebUI.setText(findTestObject('table_behavior/Number_OC'), '26022020')

WebUI.click(findTestObject('table_behavior/Glue_type'))

WebUI.click(findTestObject('table_behavior/glue_RTV-655'))

WebUI.click(findTestObject('table_behavior/Machine_type'))

WebUI.click(findTestObject('table_behavior/MachineNRU1'))

WebUI.click(findTestObject('table_behavior/Fiber_type'))

WebUI.click(findTestObject('table_behavior/Fiber'))

WebUI.click(findTestObject('table_behavior/Carcass'))

WebUI.setText(findTestObject('table_behavior/Carcass'), '7')

WebUI.click(findTestObject('table_behavior/Tension'))

WebUI.setText(findTestObject('table_behavior/Tension'), '7')

WebUI.click(findTestObject('table_behavior/Production_type'))

WebUI.click(findTestObject('table_behavior/SerialProduction'))

WebUI.click(findTestObject('table_behavior/MachineNumber'))

WebUI.click(findTestObject('table_behavior/Machine3048235'))

WebUI.click(findTestObject('table_behavior/btn_Date_start_icon'))

WebUI.click(findTestObject('table_behavior/btn_Date_start_today'))

WebUI.click(findTestObject('table_behavior/btn_Date_start_today_ok'))

WebUI.click(findTestObject('table_behavior/btn_Date_end_icon'))

WebUI.click(findTestObject('table_behavior/btn_Date_end_today'))

WebUI.click(findTestObject('table_behavior/btn_Date_end_now'))

WebUI.scrollToElement(findTestObject('table_behavior/Weavers'), 5)

WebUI.click(findTestObject('table_behavior/Weavers'))

WebUI.click(findTestObject('table_behavior/Weaver'))

WebUI.click(findTestObject('table_behavior/Status'))

WebUI.click(findTestObject('table_behavior/NewStatus'))

WebUI.click(findTestObject('table_behavior/btn_Save_Row_and_Exit'))

