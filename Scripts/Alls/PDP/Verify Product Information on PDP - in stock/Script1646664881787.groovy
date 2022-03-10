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

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/a_Lee Lace Dress'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/div_SKU UPV0830016'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/div_AED 650.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Add to Bag'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Add to Bag'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/img_Add to favorites_share-logo xs-upmrauto_34568e'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/span_Earn 65 points'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/div_SHARE'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/img_SHARE_xs-upwauto xs-uphmax100 xs-upwmax100'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/img_SHARE_xs-upwauto xs-uphmax100 xs-upwmax100_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/img_SHARE_xs-upwauto xs-uphmax100 xs-upwmax100_1_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Details'))

WebUI.click(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/button_Details'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Lee Lace Dress  AllSaints UAE/div_Relaxed fitShell 100 cottonDress 90 vis_561296'))

WebUI.closeBrowser()

