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

WebUI.callTestCase(findTestCase('Alls/Go to PDP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Add to Bag'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/div_Shopping Bag (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Shopping Bag (1)_close'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/div_Lee Lace Dress AED 650.00 Size SQUANTIT_69a79a'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Remove'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_CHECKOUT'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_CHECKOUT'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Continue Shopping'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Continue Shopping'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/span_AED 650.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/span_Total'))

WebUI.closeBrowser()

