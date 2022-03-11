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

WebUI.callTestCase(findTestCase('Alls/Go to PDP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/img_Tap To Zoom_xs-upwauto xs-uphmax100 xs-_6cbf40'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/div_Tap To Zoom'))

WebUI.click(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/div_Tap To Zoom'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/img_Feedback_imageZoomFull'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Feedback_zoom-btn zoom-prev-btn xs-updnone'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Feedback_zoom-btn zoom-prev-btn xs-updnone'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Feedback_zoom-btn zoom-prev-btn xs-updnone'))

WebUI.click(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Feedback_zoom-btn zoom-prev-btn xs-updnone'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/img_Feedback_imageZoomFull_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Feedback_zoom-btn zoom-prev-btn xs-updnone'))

WebUI.click(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Feedback_zoom-btn zoom-prev-btn xs-updnone'))

WebUI.closeBrowser()

