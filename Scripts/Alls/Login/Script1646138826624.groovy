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

WebUI.callTestCase(findTestCase('Alls/Open browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/a_Sign In'))

WebUI.click(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/a_CONTINUE'))

WebUI.setText(findTestObject('Object Repository/Alls/Page_Sign In with Auth0/input_New Login to all Majid Al Futtaim bra_77e722'), 
    'tanyatester8@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Alls/Page_Sign In with Auth0/input_Email Address_password'), 'N7HJqLlUfAvFoavH9nBpXw==')

WebUI.click(findTestObject('Object Repository/Alls/Page_Sign In with Auth0/button_Sign in'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Official Website - Women  Men Fashion _e8583b/span_Hello, Tanya'))

