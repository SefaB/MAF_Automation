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

WebUI.callTestCase(findTestCase('CAB/CAB_Common/CAB_Open_Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/holiday_banner'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/JustForYou_aFewThings_media-body_items'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/JusForYou_aFewThings_media-body'))

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/JustForYou_aFewThings_media-body_items'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/theHolidaysAreComing_banner'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/theHolidaysAreComing_banner'))

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/theHolidaysAreComing_media-body'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/fall_is_in_banner'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/fall_is_in_banner'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/find_Your_Outside_banner'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/find_Your_Outside_banner'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/top_Product_Furnitures_banner'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/top_Product_Furnitures_banner'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/work_From_Home_Essentials_banner'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/work_From_Home_Essentials_banner'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/top_Product_Housewares_carousel'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/top_Product_Housewares_carousel'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/we_Celebrate_Them_All_banner'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/we_Celebrate_Them_All_banner'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/crate_Design_Studio_banner'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/crate_Design_Studio_banner'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/a_Soft_Spot_for_Towels_banner'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/a_Soft_Spot_for_Towels_banner'))

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/basics_that_make_theBed_Banner'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/it_Your_Favorite_Everyday_Getaway'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/it_Your_Favorite_Everyday_Getaway'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/Crate_Kids_the_statement_nursery'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/Crate_Kids_the_statement_nursery'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/better_Together_Banner'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/better_Together_Banner'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/your_Moments_Your_Way_banner'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/your_Moments_Your_Way_banner'))

WebUI.scrollToElement(findTestObject('CAB/CAB_Homepage/contact_Us_card'), 0)

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/contact_Us_card'))

WebUI.verifyElementVisible(findTestObject('CAB/CAB_Homepage/my_Account_Card'))

