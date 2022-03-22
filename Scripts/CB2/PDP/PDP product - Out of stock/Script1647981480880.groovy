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

WebUI.click(findTestObject('CB2/PDP/OOS Product/oos_product'))

WebUI.verifyElementVisible(findTestObject('CB2/PDP/OOS Product/product_title'))

WebUI.verifyElementVisible(findTestObject('CB2/PDP/OOS Product/product_price'))

WebUI.verifyElementVisible(findTestObject('CB2/PDP/OOS Product/product_sku'))

WebUI.verifyElementVisible(findTestObject('CB2/PDP/OOS Product/tabby_payment'))

WebUI.verifyElementVisible(findTestObject('CB2/PDP/OOS Product/out_of_stock_title'))

WebUI.verifyElementVisible(findTestObject('CB2/PDP/OOS Product/notify_when_product_back'))

WebUI.verifyElementVisible(findTestObject('CB2/PDP/OOS Product/product_details_section'))

WebUI.setText(findTestObject('CB2/PDP/OOS Product/email_input_for_notification'), 'test@test1.com')

WebUI.click(findTestObject('CB2/PDP/OOS Product/notify_me_button'))

WebUI.verifyElementVisible(findTestObject('CB2/PDP/OOS Product/confirmation_of_notification'))

WebUI.closeBrowser()

