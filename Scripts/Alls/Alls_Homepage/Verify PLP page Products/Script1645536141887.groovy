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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alls.c1xjddw2-majidalfu1-s1-public.model-t.cc.commerce.ondemand.com/en-ae')

WebUI.click(findTestObject('Object Repository/Page_Official Website - Women  Men Fashion _e8583b/button_Accept Cookies'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Official Website - Women  Men Fashion _e8583b/span_Women'))

WebUI.click(findTestObject('Object Repository/Page_Official Website - Women  Men Fashion _e8583b/a_T-Shirts'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shop Womens T-Shirts Online  AllSaints UAE/div_Womens T-ShirtsOur womens T-shirts are _c0c61d'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Shop Womens T-Shirts Online  AllSaints UAE/h1_Womens T-Shirts'), 
    'Women\'s T-Shirts')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Shop Womens T-Shirts Online  AllSaints UAE/span_Womens T-Shirts'), 
    'Women\'s T-Shirts')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Shop Womens T-Shirts Online  AllSaints UAE/div_Name (descending)_col-item col-4'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Shop Womens T-Shirts Online  AllSaints UAE/div_AED 250.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Shop Womens T-Shirts Online  AllSaints UAE/button_Add to Bag'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Shop Womens T-Shirts Online  AllSaints UAE/div_M ML X XSS'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Shop Womens T-Shirts Online  AllSaints UAE/span_46 OFF'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Shop Womens T-Shirts Online  AllSaints UAE/div_On Sale'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Shop Womens T-Shirts Online  AllSaints UAE/div_Sale AED 145.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Shop Womens T-Shirts Online  AllSaints UAE/div_reg. AED 270.00'))

WebUI.closeBrowser()

