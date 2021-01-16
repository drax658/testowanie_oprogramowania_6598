import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.demoqa.com/')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Forms'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/li_Practice Form'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Name_firstName'), 'Jan')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Name_lastName'), 'Kowalski')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Email_userEmail'), 'test@test.com')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_(10 Digits)_userNumber'), '6656656555')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ToolsQA/select_190019011902190319041905190619071908_246ee1'), 
    '1981', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ToolsQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_16'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/label_Sports'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/textarea_Current Address_currentAddress'), 'Address')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Select State_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Haryana'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Select City_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Panipat'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/button_Close'))

WebUI.closeBrowser()

