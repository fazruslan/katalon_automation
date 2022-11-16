package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseUrl
     
    /**
     * <p></p>
     */
    public static Object fieldName
     
    /**
     * <p></p>
     */
    public static Object fieldEmail
     
    /**
     * <p></p>
     */
    public static Object newLanguageRadioBtn
     
    /**
     * <p></p>
     */
    public static Object newSportActivityRadioBtn
     
    /**
     * <p></p>
     */
    public static Object drawingRadIoBtn
     
    /**
     * <p></p>
     */
    public static Object playingMusicRadioBtn
     
    /**
     * <p></p>
     */
    public static Object taxCodeRadioBtn
     
    /**
     * <p></p>
     */
    public static Object notification
     
    /**
     * <p></p>
     */
    public static Object pageTitle
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            baseUrl = selectedVariables['baseUrl']
            fieldName = selectedVariables['fieldName']
            fieldEmail = selectedVariables['fieldEmail']
            newLanguageRadioBtn = selectedVariables['newLanguageRadioBtn']
            newSportActivityRadioBtn = selectedVariables['newSportActivityRadioBtn']
            drawingRadIoBtn = selectedVariables['drawingRadIoBtn']
            playingMusicRadioBtn = selectedVariables['playingMusicRadioBtn']
            taxCodeRadioBtn = selectedVariables['taxCodeRadioBtn']
            notification = selectedVariables['notification']
            pageTitle = selectedVariables['pageTitle']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
