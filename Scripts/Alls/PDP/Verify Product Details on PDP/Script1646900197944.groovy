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

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/div_Notes'))

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Dress it up. The Lee Lace Dress'), 
    'Dress it up. The Lee Lace Dress. It\'s an off-duty essential. With a sweatshirt body. And lace-trimmed hem.')

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Instant layer'), 'Instant layer')

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Pullover'), 'Pullover')

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Short length'), 'Short length')

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Long sleeve'), 'Long sleeve')

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Crew neck'), 'Crew neck')

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Lace trim at the hem'), 
    'Lace trim at the hem')

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Model is 59177cm and wears a size Medium'), 
    'Model is 5\'9"/177cm and wears a size Medium')

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/button_Details'))

WebUI.click(findTestObject('Alls/Alls_PDP/button_Details'))

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Relaxed fit'), 'Relaxed fit')

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Shell 100 cotton'), 
    'Shell: 100% cotton')

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Dress 90 viscose, 10 elastane'), 
    'Dress: 90% viscose, 10% elastane')

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Lace 100 polyamide'), 
    'Lace: 100% polyamide')

WebUI.verifyElementText(findTestObject('Alls/Alls_PDP/div_Machine wash inside out'), 
    'Machine wash inside out')

WebUI.click(findTestObject('Alls/Alls_PDP/button_Notes'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/div_SHARE'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/img_SHARE_'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/img_SHARE'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PDP/img_SHARE_xs-upwauto xs-uphmax100 xs-upwmax100_1_2'))

WebUI.verifyElementClickable(findTestObject('Alls/Alls_PDP/img_SHARE_'))

WebUI.verifyElementClickable(findTestObject('Alls/Alls_PDP/img_SHARE'))

WebUI.verifyElementClickable(findTestObject('Alls/Alls_PDP/img_SHARE_xs-upwauto xs-uphmax100 xs-upwmax100_1_2'))

WebUI.closeBrowser()

