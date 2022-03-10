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

WebUI.mouseOver(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/span_Men'))

WebUI.click(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/a_All Accessories'))

WebUI.click(findTestObject('Object Repository/Alls/Page_Mens Accessories - Mens Hats, Mens Sca_fd5d10/a_Sturge Leather Belt'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Sturge Leather Belt - Mens Leather Bel_e27809/a_Sturge Leather Belt'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Sturge Leather Belt - Mens Leather Bel_e27809/div_SKU UPV0785322'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Sturge Leather Belt - Mens Leather Bel_e27809/div_AED 375.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Sturge Leather Belt - Mens Leather Bel_e27809/div_Type in your email address below to get_3d3902'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Sturge Leather Belt - Mens Leather Bel_e27809/img_Add to favorites_share-logo xs-upmrauto_34568e'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Sturge Leather Belt - Mens Leather Bel_e27809/span_Earn 37.5 points'))

WebUI.closeBrowser()

