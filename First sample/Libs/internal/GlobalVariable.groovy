package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object Time_out
     
    /**
     * <p></p>
     */
    public static Object User_login
     
    /**
     * <p></p>
     */
    public static Object User_role_new
     
    /**
     * <p></p>
     */
    public static Object User_role_old
     
    /**
     * <p></p>
     */
    public static Object User_number
     
    /**
     * <p></p>
     */
    public static Object User_pass
     
    /**
     * <p></p>
     */
    public static Object Admin_login
     
    /**
     * <p></p>
     */
    public static Object Admin_pass
     
    /**
     * <p></p>
     */
    public static Object Link
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['Time_out' : 75, 'User_login' : 'Тестовый пользователь katalon12', 'User_role_new' : 'Тестовая роль katalon 1', 'User_role_old' : 'Намотчица', 'User_number' : '23022028', 'User_pass' : '123456', 'Admin_login' : 'admin', 'Admin_pass' : 'fhf2vfrd926k', 'Link' : 'http://test555.test.getreport.pro/'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        Time_out = selectedVariables['Time_out']
        User_login = selectedVariables['User_login']
        User_role_new = selectedVariables['User_role_new']
        User_role_old = selectedVariables['User_role_old']
        User_number = selectedVariables['User_number']
        User_pass = selectedVariables['User_pass']
        Admin_login = selectedVariables['Admin_login']
        Admin_pass = selectedVariables['Admin_pass']
        Link = selectedVariables['Link']
        
    }
}
