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

WebUI.callTestCase(findTestCase('Alls/Alls_Common/Go to PDP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Alls/Alls_PDP/button_Add to Bag (1)'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/div_Shopping Bag (1)'))

WebUI.verifyElementClickable(findTestObject('Alls/Alls_PDP/button_Shopping Bag (1)_close'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/div_Lee Lace Dress AED 650.00 Size SQUANTIT'))

WebUI.verifyElementClickable(findTestObject('Alls/Alls_PDP/button_Remove'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/button_CHECKOUT'))

WebUI.verifyElementClickable(findTestObject('Alls/Alls_PDP/button_CHECKOUT'))

WebUI.verifyElementClickable(findTestObject('Alls/Alls_PDP/button_Continue Shopping'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/button_Continue Shopping'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/span_AED 650.00'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/span_Total'))

WebUI.closeBrowser()

