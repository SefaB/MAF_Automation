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

WebUI.click(findTestObject('CB2/View Cart - few items/product_Channel_Green_Velvet_Office_Chair'))

WebUI.click(findTestObject('CB2/View Cart - few items/plus_quantity_button'))

WebUI.click(findTestObject('CB2/View Cart - few items/plus_quantity_button'))

WebUI.click(findTestObject('CB2/Items Added to Bag/add_to_cart_button'))

WebUI.click(findTestObject('CB2/Items Added to Bag/checkout_now_button'))

WebUI.verifyElementVisible(findTestObject('CB2/View Cart - few items/product_title'))

WebUI.verifyElementVisible(findTestObject('CB2/View Cart - few items/product_SKU'))

WebUI.verifyElementVisible(findTestObject('CB2/View Cart - few items/product_image'))

WebUI.setText(findTestObject('CB2/View Cart - few items/product_quantity_input'), '4')

WebUI.click(findTestObject('CB2/View Cart - few items/update_button'))

WebUI.click(findTestObject('CB2/View Cart - few items/add_to_wishlist_button'))

WebUI.verifyElementVisible(findTestObject('CB2/View Cart - few items/sign_in_or_create_account_popup'))

WebUI.click(findTestObject('CB2/View Cart - few items/close_sign_in_popup'))

WebUI.click(findTestObject('CB2/View Cart - few items/remove_button'))

WebUI.verifyElementVisible(findTestObject('CB2/View Cart - few items/empty_cart_title'))

WebUI.closeBrowser()

