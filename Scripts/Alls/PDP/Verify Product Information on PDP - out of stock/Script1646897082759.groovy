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

WebUI.callTestCase(findTestCase('Alls/Open browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Alls/Items added to your bag/span_Men'))

WebUI.click(findTestObject('Alls/Items added to your bag/a_All Accessories'))

WebUI.click(findTestObject('Alls/Alls_PLP/a_Sturge Leather Belt'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/a_Sturge Leather Belt'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/div_SKU UPV0785322'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/div_AED 375.00'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/div_Type in your email address'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/img_Add to favorites_share-logo'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/span_Earn 37.5 points'))

WebUI.closeBrowser()

