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

WebUI.waitForElementPresent(findTestObject('Table_designer/All_objects'), 30)

WebUI.click(findTestObject('Table_designer/All_objects'))

WebUI.click(findTestObject('Table_designer/btn_create_table'))

WebUI.waitForElementPresent(findTestObject('Table_designer/input_table-name'), 30)

WebUI.setText(findTestObject('Table_designer/input_table-name'), 'Тестовая таблица')

WebUI.waitForElementPresent(findTestObject('Table_designer/btn_create_column'), 40)

WebUI.click(findTestObject('Table_designer/btn_create_column'))

WebUI.click(findTestObject('Table_designer/Column1_id'))

WebUI.click(findTestObject('Table_designer/input_name'))

WebUI.setText(findTestObject('Table_designer/input_name'), 'Номер по порядку')

WebUI.click(findTestObject('Table_designer/Span_field_types'))

WebUI.click(findTestObject('Table_designer/Choose_integer'))

WebUI.click(findTestObject('Table_designer/btn_create_column'))

WebUI.click(findTestObject('Table_designer/Column2_string'))

WebUI.setText(findTestObject('Table_designer/input_name'), 'Строка')

WebUI.click(findTestObject('Table_designer/btn_create_column_group'))

WebUI.click(findTestObject('Table_designer/column_group'))

WebUI.click(findTestObject('Table_designer/btn_create_internal_column'))

WebUI.click(findTestObject('Table_designer/New_column_click'))

WebUI.setText(findTestObject('Table_designer/input_name'), 'Текст')

WebUI.click(findTestObject('Table_designer/Span_field_types'))

WebUI.click(findTestObject('Table_designer/Choose_multitext'))

WebUI.click(findTestObject('Table_designer/Pre_column'))

WebUI.click(findTestObject('Table_designer/column_group'))

WebUI.click(findTestObject('Table_designer/btn_create_internal_column'))

WebUI.click(findTestObject('Table_designer/New_column_click'))

WebUI.setText(findTestObject('Table_designer/input_name'), 'Вещественное')

WebUI.click(findTestObject('Table_designer/Span_field_types'))

WebUI.click(findTestObject('Table_designer/Choose_real'))

WebUI.click(findTestObject('Table_designer/column_group'))

WebUI.click(findTestObject('Table_designer/btn_create_internal_column'))

WebUI.click(findTestObject('Table_designer/New_column_click'))

WebUI.setText(findTestObject('Table_designer/input_name'), 'Дата')

WebUI.click(findTestObject('Table_designer/Span_field_types'))

WebUI.click(findTestObject('Table_designer/Choose_date'))

WebUI.click(findTestObject('Table_designer/column_group'))

WebUI.click(findTestObject('Table_designer/Pre_column'))

WebUI.click(findTestObject('Table_designer/btn_create_internal_column'))

WebUI.click(findTestObject('Table_designer/New_column_click'))

WebUI.setText(findTestObject('Table_designer/input_name'), 'Дата и время')

WebUI.click(findTestObject('Table_designer/Span_field_types'))

WebUI.click(findTestObject('Table_designer/Choose_date_time'))

WebUI.click(findTestObject('Table_designer/Pre_column'))

WebUI.click(findTestObject('Table_designer/column_group'))

WebUI.click(findTestObject('Table_designer/btn_create_internal_column'))

WebUI.click(findTestObject('Table_designer/New_column_click'))

WebUI.setText(findTestObject('Table_designer/input_name'), 'Логический')

WebUI.click(findTestObject('Table_designer/Span_field_types'))

WebUI.click(findTestObject('Table_designer/Choose_logic'))

WebUI.click(findTestObject('Table_designer/Pre_column'))

WebUI.click(findTestObject('Table_designer/column_group'))

WebUI.click(findTestObject('Table_designer/btn_create_internal_column'))

WebUI.click(findTestObject('Table_designer/New_column_click'))

WebUI.setText(findTestObject('Table_designer/input_name'), 'Файл')

WebUI.click(findTestObject('Table_designer/Span_field_types'))

WebUI.click(findTestObject('Table_designer/Choose_file'))

WebUI.click(findTestObject('Table_designer/btn_save_table '))

WebUI.delay(GlobalVariable.Time_out, FailureHandling.STOP_ON_FAILURE)

