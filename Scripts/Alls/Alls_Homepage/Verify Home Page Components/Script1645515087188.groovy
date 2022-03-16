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

WebUI.callTestCase(findTestCase('Alls/Alls_Common/Open browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/a_Sign In'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/span_Wishlist'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/span_Bag (0)'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/a_Search'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/span_Men'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/span_Women'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/span_Sale'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/a_ALLSAINTS'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/img_Official Website - Women Men Fashion'))

WebUI.verifyElementClickable(findTestObject('Alls/Alls_PLP/a_WOMEN'))

WebUI.verifyElementClickable(findTestObject('Alls/Alls_PLP/a_MEN'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/div_Shop WomenDressesLeather JacketsT-Shirt'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/div_New to AllSaints Sign up'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/div_INFORMATION'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/div_COPYRIGHT'))

WebUI.closeBrowser()

