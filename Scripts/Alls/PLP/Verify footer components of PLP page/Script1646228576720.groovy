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

WebUI.callTestCase(findTestCase('Alls/Go to PLP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Womens Tops  Womens Shirts Online  All_a1087d/div_INFORMATIONContact UsReturns  ExchangeS_4881bc'), 
    1)

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/h6_INFORMATION'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/a_Contact Us'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/a_Returns  Exchange'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/a_Shipping and FAQs'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/a_Size Guide'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/a_Track Order'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/a_Terms  Conditions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/a_Privacy Policy'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/a_Site Map'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/h6_FOLLOW US'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/a_Instagram'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/div_COPYRIGHT  2021 ALLSAINTS ALL RIGHTS RE_2a6605'))

WebUI.closeBrowser()

