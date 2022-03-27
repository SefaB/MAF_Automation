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

WebUI.callTestCase(findTestCase('CB2/Common/Browser open'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CB2/Common/main_navigation_burger_menu'))

WebUI.click(findTestObject('CB2/PLP/Category_L1_Furniture'))

WebUI.click(findTestObject('CB2/PLP/Category_L2_Office Furniture'))

WebUI.click(findTestObject('CB2/PLP/Category_L3_Office Chairs'))

WebUI.click(findTestObject('CB2/PDP/Recently Viewed/Product_Ad_Black_Executive_Chair'))

WebUI.click(findTestObject('CB2/PDP/Recently Viewed/breadcrumb_Office_Chairs'))

WebUI.click(findTestObject('CB2/PDP/Recently Viewed/Product_Channel_Green_Velvet_Office _Chair'))

WebUI.click(findTestObject('CB2/PDP/Recently Viewed/breadcrumb_Office_Chairs'))

WebUI.click(findTestObject('CB2/PDP/Recently Viewed/Product_Channel_Suede_Office_Chair'))

WebUI.click(findTestObject('CB2/PDP/Recently Viewed/breadcrumb_Office_Chairs'))

WebUI.click(findTestObject('CB2/PDP/Recently Viewed/Product_Chelsea_Home_Office _Chair'))

WebUI.click(findTestObject('CB2/PDP/Recently Viewed/breadcrumb_Office_Chairs'))

WebUI.click(findTestObject('CB2/PDP/Recently Viewed/Product_Rue _Cambon_Grey_Tweed_Office_Chair'))

WebUI.scrollToElement(findTestObject('CB2/PDP/Recently Viewed/recently_viewed_section'), 0)

WebUI.verifyElementVisible(findTestObject('CB2/PDP/Recently Viewed/rec_v _Chelsea Home Office Chair'))

WebUI.verifyElementVisible(findTestObject('CB2/PDP/Recently Viewed/rec_v_Ad Black Executive Chair'))

WebUI.verifyElementVisible(findTestObject('CB2/PDP/Recently Viewed/rec_v_Channel Green Velvet Office Chair'))

WebUI.verifyElementVisible(findTestObject('CB2/PDP/Recently Viewed/rec_v_Channel Suede Office Chair'))

WebUI.verifyElementVisible(findTestObject('CB2/PDP/Recently Viewed/rec_v_Rue Cambon Grey Tweed Office Chair'))

WebUI.closeBrowser()

