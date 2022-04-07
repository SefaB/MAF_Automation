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

WebUI.callTestCase(findTestCase('CB2/Common/User login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CB2/Common/main_navigation_burger_menu'))

WebUI.click(findTestObject('CB2/PLP/Category_L1_Furniture'))

WebUI.click(findTestObject('CB2/PLP/Category_L2_Office Furniture'))

WebUI.click(findTestObject('CB2/PLP/Category_L3_Office Chairs'))

WebUI.click(findTestObject('CB2/Wishlist/add_to_fav_court_chair'))

WebUI.click(findTestObject('CB2/Wishlist/add_to_fav_chelsea_chair'))

WebUI.click(findTestObject('CB2/Wishlist/wishlist_icon'))

WebUI.verifyElementVisible(findTestObject('CB2/Wishlist/header_section_wishlist'))

WebUI.verifyElementVisible(findTestObject('CB2/Wishlist/heade_logo'))

WebUI.scrollToElement(findTestObject('CB2/Wishlist/footer_section'), 0)

WebUI.verifyElementVisible(findTestObject('CB2/Wishlist/footer_section'))

WebUI.verifyElementVisible(findTestObject('CB2/Wishlist/footer_sign_up_section'))

WebUI.verifyElementVisible(findTestObject('CB2/Wishlist/cookies_settings_section'))

WebUI.verifyElementVisible(findTestObject('CB2/Wishlist/privacy_policy_section_footer'))

WebUI.scrollToElement(findTestObject('CB2/Wishlist/header_section_wishlist'), 0)

WebUI.verifyElementVisible(findTestObject('CB2/Wishlist/home_breadcrumb'))

WebUI.verifyElementVisible(findTestObject('CB2/Wishlist/my_account_breadcrumb'))

WebUI.verifyElementVisible(findTestObject('CB2/Wishlist/my_favorites_breadcrumb'))

WebUI.mouseOver(findTestObject('CB2/Wishlist/header_section_wishlist'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CB2/Wishlist/remove_from_fav_velvet_chair'))

WebUI.click(findTestObject('CB2/Wishlist/remove_from_fav_court_chair'))

WebUI.closeBrowser()

