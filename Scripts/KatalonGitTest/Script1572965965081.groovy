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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fs28.formsite.com/MultiServiceTechnologySolutions/luryybr8yl/index.html')

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-3'), 
    'Jane')

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-4'), 
    'Moreno')

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-5'), 
    'jane.moreno@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-6'), 
    '9099856214')

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-7'), 
    'Jane')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/select_CorporationGovernmentLLCMunicipality_58e944'), 
    'Radio-0', true)

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-9'), 
    '430 East F street')

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-11'), 
    'Overland Park')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/select_AlabamaAlaskaArizonaArkansasCaliforn_eff432'), 
    'Radio-15', true)

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-13'), 
    '66223')

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-14'), 
    '123456789')

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-18'), 
    '10000000')

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-23'), 
    'Jane')

WebUI.setText(findTestObject('Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-24'), 'Moreno')

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-25'), 
    'jane.moreno@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-26'), 
    '9095864726')

WebUI.click(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__Submit'))

WebUI.click(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/label_I Certify that all information provid_71038d'))

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-35'), 
    'Jane')

WebUI.setText(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__RESULT_TextField-36'), 
    'Moreno')

WebUI.click(findTestObject('Object Repository/Page_Best Buy Customer Credit Application (_ec3f08/input__Submit'))

WebUI.closeBrowser()

