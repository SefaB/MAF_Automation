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

WebUI.click(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/button_Accept Cookies'))

WebUI.mouseOver(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/span_Women'))

WebUI.click(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/a_Dresses'))

WebUI.verifyElementVisible(findTestObject('Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/Page_AllSaints Dresses - Mini Dresses, Maxi Dresses  AllSaints UAE/a_2-In-1 Dresses'))

WebUI.verifyElementVisible(findTestObject('Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/Page_AllSaints Dresses - Mini Dresses, Maxi Dresses  AllSaints UAE/a_All Dresses'))

WebUI.verifyElementVisible(findTestObject('Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/Page_AllSaints Dresses - Mini Dresses, Maxi Dresses  AllSaints UAE/a_Maxi Dresses'))

WebUI.verifyElementVisible(findTestObject('Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/Page_AllSaints Dresses - Mini Dresses, Maxi Dresses  AllSaints UAE/a_Midi Dresses'))

WebUI.verifyElementVisible(findTestObject('Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/Page_AllSaints Dresses - Mini Dresses, Maxi Dresses  AllSaints UAE/a_Occasion Dresses'))

WebUI.verifyElementVisible(findTestObject('Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/Page_AllSaints Dresses - Mini Dresses, Maxi Dresses  AllSaints UAE/a_Printed Dresses'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/button_Category'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/button_color'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/button_size'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/button_PRICE'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/button_Relevance'))

WebUI.closeBrowser()

