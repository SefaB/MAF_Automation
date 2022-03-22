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

WebUI.callTestCase(findTestCase('Alls/Go to PLP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/span_Womens Tops  Shirts'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/h1_Womens Tops  Shirts'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/div_From casual to formal'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/a_All tops  shirts'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/a_Tops'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/a_Shirts'))

WebUI.mouseOver(findTestObject('Alls/Items added to your bag/div_Name (descending)_col-item col-4 (1)'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/img_Name (descending) (1)'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/a_Tammy Leppo Top'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/button_Add to Bag (1)'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/span_Wishlist'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/button_Category'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/button_color'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/button_size'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/button_PRICE'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/button_Relevance'))

WebUI.mouseOver(findTestObject('Alls/Items added to your bag/h2_Nico Top'))

WebUI.verifyElementVisible(findTestObject('Alls/Items added to your bag/button_Add to favorites'))

WebUI.closeBrowser()

