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

WebUI.click(findTestObject('Alls/Items added to your bag/a_Nico Top'))

WebUI.click(findTestObject('Alls/Shopping Bag/button_Add to Bag2'))

WebUI.verifyElementVisible(findTestObject('Alls/Alls_PLP/button_CHECKOUT (1)'))

WebUI.click(findTestObject('Alls/Alls_PLP/button_CHECKOUT (1)'))

//alls.c1xjddw2-majidalfu1-s1-public.model-t.cc.commerce.ondemand.com/en-ae/cart = WebUI.getUrl()
//alls.c1xjddw2-majidalfu1-s1-public.model-t.cc.commerce.ondemand.com/en-ae/cart = WebUI.getUrl()
https: WebUI.closeBrowser()

