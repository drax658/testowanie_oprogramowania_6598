import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\domin\\AppData\\Local\\Temp\\Katalon\\20210116_201754\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://www.demoqa.com/\')\n\nWebUI.click(findTestObject(\'Page_ToolsQA/div_Forms\'))\n\nWebUI.click(findTestObject(\'Page_ToolsQA/li_Practice Form\'))\n\nWebUI.setText(findTestObject(\'Page_ToolsQA/input_Name_firstName\'), \'Jan\')\n\nWebUI.setText(findTestObject(\'Page_ToolsQA/input_Name_lastName\'), \'Kowalski\')\n\nWebUI.setText(findTestObject(\'Page_ToolsQA/input_Email_userEmail\'), \'test\')\n\nWebUI.setText(findTestObject(\'Page_ToolsQA/input_(10 Digits)_userNumber\'), \'123123\')\n\nWebUI.click(findTestObject(\'Page_ToolsQA/input_Date of Birth_dateOfBirthInput\'))\n\nWebUI.selectOptionByValue(findTestObject(\'Page_ToolsQA/select_190019011902190319041905190619071908_246ee1\'), \'2028\', true)\n\nWebUI.click(findTestObject(\'Page_ToolsQA/div_29\'))\n\nWebUI.setText(findTestObject(\'Page_ToolsQA/textarea_Current Address_currentAddress\'), \'address\')\n\nWebUI.click(findTestObject(\'Page_ToolsQA/button_Submit\'))\n\nWebUI.click(findTestObject(\'Page_ToolsQA/div_Select State_css-1gtu0rj-indicatorContainer\'))\n\nWebUI.click(findTestObject(\'Page_ToolsQA/div_Uttar Pradesh\'))\n\nWebUI.click(findTestObject(\'Page_ToolsQA/div_Select City_css-1gtu0rj-indicatorContainer\'))\n\nWebUI.click(findTestObject(\'Page_ToolsQA/div_Lucknow\'))\n\nWebUI.click(findTestObject(\'Page_ToolsQA/div_Select State_css-1gtu0rj-indicatorContainer\'))\n\nWebUI.click(findTestObject(\'Page_ToolsQA/div_Haryana\'))\n\nWebUI.click(findTestObject(\'Page_ToolsQA/div_Select City_css-1gtu0rj-indicatorContainer\'))\n\nWebUI.click(findTestObject(\'Page_ToolsQA/div_Panipat\'))\n\nWebUI.click(findTestObject(\'Page_ToolsQA/button_Submit\'))\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

