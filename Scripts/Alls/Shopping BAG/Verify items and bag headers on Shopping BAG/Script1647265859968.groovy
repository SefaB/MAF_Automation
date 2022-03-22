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

WebUI.callTestCase(findTestCase('Alls/Alls_Common/Add product to Bag'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Alls/Common/button_CHECKOUT'))

WebUI.verifyElementText(findTestObject('Alls/Shopping Bag/th_ITEM'), 'ITEM')

WebUI.verifyElementText(findTestObject('Alls/Shopping Bag/th_COLOUR'), 'COLOUR')

WebUI.verifyElementText(findTestObject('Alls/Shopping Bag/th_SIZE'), 'SIZE')

WebUI.verifyElementText(findTestObject('Alls/Shopping Bag/th_Quantity'), 'QUANTITY')

WebUI.verifyElementText(findTestObject('Alls/Shopping Bag/th_Price'), 'PRICE')

WebUI.verifyElementVisible(findTestObject('Alls/Shopping Bag/Product name'))

WebUI.verifyElementVisible(findTestObject('Alls/Shopping Bag/div_BLUEPRINT'))

WebUI.verifyElementVisible(findTestObject('Alls/Shopping Bag/td_2 Size Size 10'))

WebUI.verifyElementClickable(findTestObject('Alls/Shopping Bag/decrease btn'))

WebUI.verifyElementClickable(findTestObject('Alls/Shopping Bag/increase btn'))

WebUI.verifyElementVisible(findTestObject('Alls/Shopping Bag/VAT Amount'))

WebUI.verifyElementVisible(findTestObject('Alls/Shopping Bag/Subtotal (Incl.VAT)'))

WebUI.verifyElementVisible(findTestObject('Alls/Shopping Bag/Order Total'))

WebUI.click(findTestObject('Alls/Shopping Bag/button-remove'))

WebUI.closeBrowser()

