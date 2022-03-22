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

WebUI.callTestCase(findTestCase('Alls/Alls_Common/Go to PDP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/a_Lee Lace Dress'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/div_SKU UPV0830016'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/div_AED 650.00'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/button_Add to Bag (1)'))

WebUI.verifyElementClickable(findTestObject('Alls/Alls_PDP/button_Add to Bag (1)'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/img_Add to favorites_share-logo xs-upmrauto_34568e (1)'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/span_Earn 65 points'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/div_SHARE'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/img_SHARE_'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/img_SHARE'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/img_SHARE_xs-upwauto xs-uphmax100 xs-upwmax100_1_2'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/button_Details'))

WebUI.click(findTestObject('Alls/Alls_PDP/button_Details'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/div_Relaxed fitShell 100 cottonDress 90'))

WebUI.closeBrowser()

