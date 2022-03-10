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

WebUI.scrollToElement(findTestObject('CB2/Footer/footer_section'), 0)

WebUI.verifyElementVisible(findTestObject('CB2/Footer/footer_title'))

WebUI.verifyElementVisible(findTestObject('CB2/Footer/our_brands_section'))

WebUI.verifyElementVisible(findTestObject('CB2/Footer/our_company_section'))

WebUI.verifyElementVisible(findTestObject('CB2/Footer/contact_us_section'))

WebUI.verifyElementVisible(findTestObject('CB2/Footer/resources_link'))

WebUI.verifyElementVisible(findTestObject('CB2/Footer/my_account_link'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CB2/Footer/social_networks_section'))

WebUI.setText(findTestObject('CB2/Footer/footer_email_input'), 'test@test.com')

WebUI.click(findTestObject('CB2/Footer/submit_mail_button'))

WebUI.verifyElementVisible(findTestObject('CB2/Footer/successfull_subscription_text'))

WebUI.closeBrowser()

