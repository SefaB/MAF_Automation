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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Alls/Alls_Common/Login - nonShare'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/Alls/Shopping Bag/span_Women'))

WebUI.click(findTestObject('Object Repository/Alls/Shopping Bag/a_Dresses'))

WebUI.click(findTestObject('Object Repository/Alls/Shopping Bag/button_Add to Bag'))

WebUI.click(findTestObject('Object Repository/Alls/Shopping Bag/button_CHECKOUT'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Shopping Bag/img_AED 745.00_share-logo'))

WebUI.verifyElementVisible(findTestObject('Alls/Shopping Bag/span_You could earn 313 SHARE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Alls/Shopping Bag/button_Join Today'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Alls/Shopping Bag/u_Learn more about SHARE'))

WebUI.closeBrowser()

