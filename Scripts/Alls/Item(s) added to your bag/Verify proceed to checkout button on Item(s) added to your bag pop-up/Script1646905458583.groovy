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

WebUI.callTestCase(findTestCase('Alls/Go to PLP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/button_Add to Bag'))

WebUI.click(findTestObject('Object Repository/Alls/Page_AllSaints Dresses - Mini Dresses, Maxi_ff1ee8/button_CHECKOUT'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Shopping Bag  AllSaints UAE/button_PROCEED TO CHECKOUT'))

WebUI.click(findTestObject('Object Repository/Alls/Page_Shopping Bag  AllSaints UAE/button_PROCEED TO CHECKOUT'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Shopping Bag  AllSaints UAE/div_New Customers  If desired, you may crea_0338c4'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Shopping Bag  AllSaints UAE/button_GUEST CHECKOUT'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Shopping Bag  AllSaints UAE/button_SIGN IN AND CHECKOUT'))

WebUI.closeBrowser()

