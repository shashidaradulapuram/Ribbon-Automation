package com.softclouds.framework;

import java.io.FileReader;
import java.io.Reader;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class YamlWrapper {
	
	public final static String TEST_EXECUTION_CONFIG_FILE_PATH = "./resources/config/test_execution/macu_cp.yaml";		
	
	public static Map<?,?> yamlMaps = readTestExecutionConfigurationFile() ; 

	public static String getBrowserName() {
		return (String) yamlMaps.get("browser");
	}	
	
	public static String getBaseUrl() {
		return (String) yamlMaps.get("url");
	}
	public static String geturl_BUI() {
		return (String) yamlMaps.get("url_BUI");
	}	
	
	public static String getUsername() {
		return (String) yamlMaps.get("username");
	}
	public static String getPassword() {
		return (String) yamlMaps.get("password");
	}
	public static String getEnterQuoteName() {
		return (String) yamlMaps.get("enterquotename");
	}
	public static String getEnterSiteNameEM() {
		return (String) yamlMaps.get("entersitenameem");
	}
	public static String getEnterSystemsRequire() {
		return (String) yamlMaps.get("entersystemsrequire");
	}
	public static String getEnterSiteNameGVPP() {
		return (String) yamlMaps.get("entersitenamegvpp");
	}
	public static String getEnterEDPNodes() {
		return (String) yamlMaps.get("enteredpnodes");
	}
	public static String getEnterBasicLines() {
		return (String) yamlMaps.get("enterbasiclines");
	}
	public static String getEnterSIPLines() {
		return (String) yamlMaps.get("entersiplines");
	}
	public static String getEnterSIPEDPDevices() {
		return (String) yamlMaps.get("entersipedpdevices");
	}
	public static String getEnterEUPLogins() {
		return (String) yamlMaps.get("entereuplogins");
	}
	public static String getEnterNewBasicLines() {
		return (String) yamlMaps.get("enternewbasiclines");
	}
	public static String getEnterNewSIPLines() {
		return (String) yamlMaps.get("enternewsiplines");
	}
	public static String getEnterNewSIPEDPDevices() {
		return (String) yamlMaps.get("enternewsipedpdevices");
	}
	public static String getEnterNewEUPLogins() {
		return (String) yamlMaps.get("enterneweuplogins");
	}
	
	public static String getEnterCIMVoiceMail() {
		return (String) yamlMaps.get("entercimvoicemail");
	}
	
	public static String getEnterCustomNewASCII() {
		return (String) yamlMaps.get("entercustomnewascii");
	}
	public static String getEnterCustomNewDBCS() {
		return (String) yamlMaps.get("entercustomnewdbcs");
	}	
	
	public static String getEnterAddlProductDiscount() {
		return (String) yamlMaps.get("enteraddlproductdiscount");
	}
	public static String getEnterAddlMaintenanceDiscount() {
		return (String) yamlMaps.get("enteraddlmaintenancediscount");
	}
	public static String getEnterAddlServicesDiscount() {
		return (String) yamlMaps.get("enteraddlservicesdiscount");
	}
	public static String getEnterOneTimeDiscount() {
		return (String) yamlMaps.get("enteronetimediscount");
	}
	public static String getEnterOneTimeDiscountAmount() {
		return (String) yamlMaps.get("enteronetimediscountamount");
	}
	
	
	public static String getEnterPartQtyGTP() {
		return (String) yamlMaps.get("enterpartqtygtp");
	}
	public static String getEnterPartQtyBS() {
		return (String) yamlMaps.get("enterpartqtybs");
	}
	public static String getEnterPartQtyLAB() {
		return (String) yamlMaps.get("enterpartqtylab");
	}	
	
	public static String getEnterPartQtyGTPFWGEO() {
		return (String) yamlMaps.get("enterpartqtygtpfwgeo");
	}
	public static String getEnterPartQtySFWMULT() {
		return (String) yamlMaps.get("enterpartqtysfwmult");
	}
	public static String getEnterPartQtySMSANA() {
		return (String) yamlMaps.get("enterpartqtysmsana");
	}	
	
	
	public static String getsearchusername() {
		return (String) yamlMaps.get("searchusername");
	}
	public static String getsearchemailid() {
		return (String) yamlMaps.get("searchemailid");
	}
	public static String getsearchkeyword_search() {
		return (String) yamlMaps.get("keyword_search");
	}
	
	public static String gettitle() {
		return (String) yamlMaps.get("title");
	}
	public static String getkeywords() {
		return (String) yamlMaps.get("keywords");
	}
	public static String getcontentinfo() {
		return (String) yamlMaps.get("contentinfo");
	}
	public static String getcontent() {
		return (String) yamlMaps.get("content");
	}
	public static String getBasicInfo() {
		return (String) yamlMaps.get("BasicInfo");
	}	
	public static String getBasicContactInfo() {
		return (String) yamlMaps.get("BasicContactInfo");
	}
	public static String getSteps() {
		return (String) yamlMaps.get("Steps");
	}
	public static String getStepsContactInfo() {
		return (String) yamlMaps.get("StepsContactInfo");
	}
	public static String getForms_Resources() {
		return (String) yamlMaps.get("Forms_Resources");
	}
	public static String getForms_Resources_Content() {
		return (String) yamlMaps.get("Forms_Resources_Content");
	}
	public static String getSalesConnections() {
		return (String) yamlMaps.get("SalesConnections");
	}
	public static String getSalesConnectionsContent() {
		return (String) yamlMaps.get("SalesConnectionsContent");
	}
	public static String getId() {
		return (String) yamlMaps.get("Id");
	}
	public static String getLink() {
		return (String) yamlMaps.get("Link");
	}
	public static String getAnswerType() {
		return (String) yamlMaps.get("AnswerType");
	}
	public static String getStartTime() {
		return (String) yamlMaps.get("StartTime");
	}
	public static String getRemoveTime() {
		return (String) yamlMaps.get("RemoveTime");
	}
	public static String getReviewTime() {
		return (String) yamlMaps.get("ReviewTime");
	}
	public static String getEditkeywords() {
		return (String) yamlMaps.get("Editkeywords");
	}
	public static String getEditReason() {
		return (String) yamlMaps.get("EditReason");
	}
	
	public static String getAnswerId() {
		return (String) yamlMaps.get("AnswerId");
	}
	public static String getReplayForFeedBack() {
		return (String) yamlMaps.get("ReplayForFeedBack");
	}
	public static String getusername_BUI() {
		return (String) yamlMaps.get("username_BUI");
	}
	public static String getpassword_BUI() {
		return (String) yamlMaps.get("password_BUI");
	}
	public static String getRequest_Change() {
		return (String) yamlMaps.get("Request_Change");
	}
	public static String getThumbsUp_Down() {
		return (String) yamlMaps.get("ThumbsUp_Down");
	}
	public static String getlogin_id() {
		return (String) yamlMaps.get("login_id");
	}
	
	
	
	public static Integer getWebDriverWaitTime() {
		return (Integer) yamlMaps.get("webdriverWaitTime");
	}
	public static String getValueFromYAMLAsString(String key) {
		return (String) yamlMaps.get(key);
	}
	
	public static Integer getValueFromYAMLAsInteger(String key) {
		return (Integer) yamlMaps.get(key);
	}
	
	public static Object getValueFromYAMLAsObject(String key) {
		return yamlMaps.get(key);
	}
	
	private static Map<?, ?> readTestExecutionConfigurationFile() {
		try {
			Yaml yaml = new Yaml();
			Reader yamlFile = new FileReader(TEST_EXECUTION_CONFIG_FILE_PATH);
			return (Map<?,?>) yaml.load(yamlFile);
		} catch (Exception e) {
			GlobalVariables.log.error(e);
			return null;
		}
	}

}
