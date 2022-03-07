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

WebUI.callTestCase(findTestCase('Alls/Go to PLP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/button_Relevance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/button_Name (ascending)'))

WebUI.click(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/button_Name (ascending)'))

//alls.c1xjddw2-majidalfu1-s1-public.model-t.cc.commerce.ondemand.com/en-ae/c/women/women-clothing/women-tops-and-shirts?sortCode=name-asc = 
//alls.c1xjddw2-majidalfu1-s1-public.model-t.cc.commerce.ondemand.com/en-ae/c/women/women-clothing/women-tops-and-shirts?sortCode=name-asc = 
https: https://alls.c1xjddw2-majidalfu1-s1-public.model-t.cc.commerce.ondemand.com/en-ae/c/women/women-clothing/women-tops-and-shirts?sortCode=name-asc = 
WebUI.getUrl()

WebUI.verifyElementVisible(findTestObject('Object Repository/Alls/Page_Womens Tops  Womens Shirts Online  All_a1087d/button_Name (ascending)_1'))

WebUI.closeBrowser()

