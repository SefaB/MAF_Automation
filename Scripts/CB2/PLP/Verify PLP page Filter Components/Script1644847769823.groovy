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

WebUI.click(findTestObject('CB2/PLP_filters/button_PRICE'))

WebUI.click(findTestObject('CB2/PLP_filters/label_AED 1000 - AED 5000 (28)'))

WebUI.click(findTestObject('CB2/PLP_filters/button_Apply'))

WebUI.verifyElementVisible(findTestObject('CB2/PLP_filters/2nd_item_image_filtered'))

WebUI.click(findTestObject('CB2/PLP_filters/button_Clear All'))

WebUI.click(findTestObject('CB2/PLP_filters/button_Fabric'))

WebUI.click(findTestObject('CB2/PLP_filters/label_Cream (1)'))

WebUI.click(findTestObject('CB2/PLP_filters/button_Apply_fabric_category'))

WebUI.verifyElementVisible(findTestObject('CB2/PLP_filters/a_Rue Cambon Office Chair'))

WebUI.click(findTestObject('CB2/PLP_filters/button_Clear All'))

WebUI.click(findTestObject('CB2/PLP_filters/button_Color'))

WebUI.click(findTestObject('CB2/PLP_filters/label_White Marble TopBlack Oak Drawer (1)'))

WebUI.click(findTestObject('CB2/PLP_filters/button_Apply_for_color_cat'))

WebUI.verifyElementVisible(findTestObject('CB2/PLP_filters/img_Price (highest first)_xs-upwauto xs-uphmax100 xs-upwmax100'))

WebUI.click(findTestObject('CB2/PLP_filters/button_Clear All'))

WebUI.click(findTestObject('CB2/PLP_filters/button_Category_fl'))

WebUI.click(findTestObject('CB2/PLP_filters/label_Desks (16)_cat'))

WebUI.click(findTestObject('CB2/PLP_filters/button_Apply_cat'))

WebUI.verifyElementVisible(findTestObject('CB2/PLP_filters/a_Avalon Ivory Faux Shagreen Desk'))

WebUI.click(findTestObject('CB2/PLP_filters/button_Clear All'))

WebUI.closeBrowser()

