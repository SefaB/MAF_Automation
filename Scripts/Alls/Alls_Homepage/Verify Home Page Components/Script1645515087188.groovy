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

WebUI.callTestCase(findTestCase('Alls/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/img_Official Website - Women  Men Fashion_x_a0c28d'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/a_WOMEN'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/a_MEN'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/div_Shop WomenDressesLeather JacketsT-Shirt_8b594c'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/div_New to AllSaints Sign up for 20 off ful_b4d31b'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/div_INFORMATIONContact UsReturns  ExchangeS_4881bc'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/div_COPYRIGHT  2021 ALLSAINTS ALL RIGHTS RE_2a6605'))

WebUI.closeBrowser()

