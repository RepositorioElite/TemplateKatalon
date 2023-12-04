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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.guru99.com/test/newtours/')

WebUI.click(findTestObject('Object Repository/Page_Welcome Mercury Tours/a_REGISTER'))

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_firstName'), 'Jorge')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_lastName'), 'Esteban')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_phone'), '3152331545')

WebUI.click(findTestObject('Object Repository/Page_Register Mercury Tours/input_phone'))

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_userName'), 'juane.puerta@sqasa.co')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_address1'), 'Carrera 87 #45-20')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_city'), 'Medellin')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_state'), 'Antioquia')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_postalCode'), '050020')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_email'), 'Juan')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register Mercury Tours/input_password'), 'GKobWL6P29PoPlTnslXPlg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register Mercury Tours/input_confirmPassword'), 'GKobWL6P29PoPlTnslXPlg==')

WebUI.click(findTestObject('Object Repository/Page_Register Mercury Tours/input_submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Register Mercury Tours/b_Dear JuanEsteban,'), 'Dear Jorge Esteban,')

WebUI.closeBrowser()

