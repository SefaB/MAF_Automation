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

WebUI.callTestCase(findTestCase('CAB/CAB_Common/CAB_Open_Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('CAB/CAB_PLP/nav_Furniture'))

WebUI.click(findTestObject('CAB/CAB_PLP/nav_furniture_sofa_items'))

WebUI.verifyElementVisible(findTestObject('CAB/CAB_PLP/PLP_First_Product'))

WebUI.verifyElementVisible(findTestObject('CAB/CAB_PLP/PLP_First_Product_Image'))

WebUI.verifyElementVisible(findTestObject('CAB/CAB_PLP/PLP_First_Product_PriceTag'))

WebUI.verifyElementVisible(findTestObject('CAB/CAB_PLP/PLP_relevance'))

WebUI.click(findTestObject('CAB/CAB_PLP/PLP_relevance'))

WebUI.click(findTestObject('CAB/CAB_PLP/PLP_relevance_ascending'))

WebUI.click(findTestObject('CAB/CAB_PLP/PLP_relevance_descending'))

WebUI.click(findTestObject('CAB/CAB_PLP/PLP_relevance_price_high'))

WebUI.click(findTestObject('CAB/CAB_PLP/PLP_relevance_price_low'))

