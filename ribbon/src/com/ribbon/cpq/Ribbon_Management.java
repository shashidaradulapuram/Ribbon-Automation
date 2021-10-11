package com.ribbon.cpq;

import org.openqa.selenium.By;
import com.softclouds.framework.BaseClass;

public class Ribbon_Management extends BaseClass{
        
	    /////////////////////////////////////    ADD SITE || ADD FROM CATALOG || RECONFIGURE MODEL || DELETE MODEL /////////////////////////////////////////////////////////
	    public static By byHome                               = By.xpath("//a[text()='Home']");
		public static By byOpportunity                        = By.xpath("//a[text()='Opportunities']");
		public static By bySelectOpportunity                  = By.xpath("//a[text()='US TEST Oppty']");
		public static By byClickOracleQuotes                  = By.xpath("//span[text()='Oracle Quotes']");
		public static By byClickNewOracleQuote                = By.xpath("(//div[@class='pbHeader'])[2]//td[2]/input[@title='New Oracle Quote']");
		public static By byClickGoToList                      = By.xpath("(//div[@class='pbBody'])[2]/div[@class='pShowMore']/a[contains(text(),'Go to')]");
		public static By byClickOracleQuoteName               = By.xpath("//div[@class='pbBody']//tr/th/a[contains(text(),'AUTOMATION')]");
		public static By byClickEditButton                    = By.xpath("//td[@class='pbButton']//input[@name='edit']");
		public static By byClickDeleteButton                  = By.xpath("//td[@class='pbButton']//input[@title='Delete']");
		public static By byClickStartSyncButton               = By.xpath("//td[@class='pbButton']//input[@title='Start Sync']");
		public static By byClickStopSyncButton                = By.xpath("//td[@class='pbButton']//input[@title='Stop Sync']");
		public static By byClearQuoteName                     = By.xpath("//div[@id='transactionName_t-wrapper']//input[@id='transactionName_t|input']");
		public static By byCheckModelName1                    = By.xpath("(//div[@class='cpq-table-body oj-table-body']//div[@data-row-key='2']//div[@tabindex='0'])[1]");
		public static By byHighlightModelName                 = By.xpath("//div[contains(@class, 'col-_part_number-_model_name')]//span[text()='Provisioning and Portals Configurator']");
		public static By bySelectModelName                    = By.xpath("//div[contains(@class, 'col-_part_number-_model_name')]//span[text()='Provisioning and Portals Configurator']/parent::div/parent::div//div[contains(@class,'oj-fwk-icon')]");
		//public static By byReconfigureModel                   = By.xpath("(//div[@slot='iconButtons']//button//span[@slot='startIcon'])[1]");	
		public static By byReconfigureModel                   = By.xpath("//div[@slot='iconButtons']//button//span[contains(@class,'configure-icon')]");
		//public static By byDeleteModel                        = By.xpath("(//div[@slot='iconButtons']//button//span[@slot='startIcon'])[3]");
		public static By byDeleteModel                        = By.xpath("//div[@slot='iconButtons']//button//span[contains(@class,'delete-icon')]");
		public static By byAddSiteButton                      = By.xpath("//span[@class='oj-button-text'][text()='Add Site']");		
		public static By byAddFromCatalogButton               = By.xpath("//span[@class='oj-button-text'][text()='Add From Catalog']");
		//public static By byAddFromCatalogButton               = By.xpath("//oj-button[@name='add_from_catalog']/button");
		
		/////////////////////////////////////////////////////////   EDGEMARC RELATED     ////////////////////////////////////////////////////////////////////////////////
		public static By byClearSiteName                      = By.xpath("//input[@id='siteName|input']");
		public static By byTopConfigGroup					  = By.xpath("//div[@id='ojChoiceId_topConfigGroup_nonArray']");
		public static By bySelectEMTopConfigGroup			  = By.xpath("//div[@id='oj-listbox-drop']/ul/li/div[@aria-label='Edge']");
		public static By byConfigNameEM   					  = By.xpath("//div[@id='ojChoiceId_configuratorName_nonArray']");
		public static By bySelectEMConfigName   			  = By.xpath("//div[@id='oj-listbox-drop']/ul/li/div[@aria-label='EdgeMarc Configurator']");
		public static By byAddConfigurationButton             = By.xpath("//div[@id='addConfiguration']//button[text()='Add Configuration']");
		public static By byTargetApplication    			  = By.xpath("//div[@id='oj-select-choice-targetApplication']");
		public static By bySelectTargetApplication 			  = By.xpath("//div[@id='oj-listbox-drop']/ul/li/div[@aria-label='Zoom']");
		public static By bySystemConfiguration                = By.xpath("//div[@id='left-sidebar']//oj-tree-view[@id='system-navigation']/ul/li/ul/li/div/span[2]");		
		public static By byEdgeMarcCheckbox   				  = By.xpath("//input[@id='shippingOrderingLimitationsmodelleveltrue|cb']/parent::span");
		public static By byNewConfig     					  = By.xpath("//div[@id='ojChoiceId_willThisBeForANewOrUpgradeConfiguration']");
		public static By bySelectNewConfig     				  = By.xpath("//div[@id='oj-listbox-drop']/ul/li/div[@aria-label='New']");
		public static By byLocationEM     					  = By.xpath("//div[@id='oj-select-choice-location']");
		public static By bySelectLocationEM               	  = By.xpath("//div[@data-oj-containerid='ojChoiceId_location']/ul/li/div[@aria-label='United States']");
		public static By byEdgeMarcProductLine				  = By.xpath("//div[@id='oj-select-choice-edgeMarcProdLine']");
		public static By bySelectEdgeMarcProductLine		  = By.xpath("//div[@data-oj-containerid='ojChoiceId_edgeMarcProdLine']/ul/li/div[@aria-label='EdgeMarc 6000 (EM-6000)']");
		public static By byEdgeMarcQuote     				  = By.xpath("//div[@id='oj-select-choice-edgeMarcQuote']");
		public static By bySelectEdgeMarcQuote                = By.xpath("//div[@data-oj-containerid='ojChoiceId_edgeMarcQuote']/ul/li/div[@aria-label='EdgeMarc with configurable support']");
		public static By byClearSystemsRequire                = By.xpath("//input[@id='noOfSystem|input']");
		public static By byEdgeMarcConfigSupport              = By.xpath("//div[@id='oj-select-choice-edgeMarcWithConfigurableSupport']");
		public static By bySelectEdgeMarcConfigSupport        = By.xpath("//div[@data-oj-containerid='ojChoiceId_edgeMarcWithConfigurableSupport']/ul/li/div[@aria-label='EDGE-6000-8S-2X-P-U']");
		public static By bySDWANPerpetualLicense              = By.xpath("//div[@id='oj-select-choice-sDWANPerpetualLicense']");
		public static By bySelectSDWANPerpetualLicense        = By.xpath("//div[@data-oj-containerid='ojChoiceId_sDWANPerpetualLicense']/ul/li/div[@aria-label='Yes']");
		public static By byYearsOfSupport                     = By.xpath("//div[@id='oj-select-choice-yearsOfSupport']");
		public static By bySelectYearsOfSupport				  = By.xpath("//div[@data-oj-containerid='ojChoiceId_yearsOfSupport']/ul/li/div[@aria-label='1 Year']");
		public static By byImplementationServices             = By.xpath("//div[@id='oj-select-choice-implementationServices']");
		public static By bySelectImplementationServices       = By.xpath("//div[@data-oj-containerid='ojChoiceId_implementationServices']/ul/li/div[@aria-label='Yes']");
		public static By byImplementationType                 = By.xpath("//div[@id='oj-select-choice-implementationType']");
		public static By bySelectImplementationType           = By.xpath("//div[@data-oj-containerid='ojChoiceId_implementationType']/ul/li/div[@aria-label='Architectural Design & Implementation']");
		public static By bySIPurvivability                    = By.xpath("//div[@id='oj-select-choice-sipSurvivability']");
		public static By bySelectSIPurvivability			  = By.xpath("//div[@data-oj-containerid='ojChoiceId_sipSurvivability']/ul/li/div[@aria-label='Yes']");
		public static By byUpgradeCallCount                   = By.xpath("//div[@id='oj-select-choice-upgradeCallCounts']");
		public static By bySelectUpgradeCallCount			  = By.xpath("//div[@data-oj-containerid='ojChoiceId_upgradeCallCounts']/ul/li/div[@aria-label='Upgrade to 100-U Licenses']");
		public static By byAddAdditionalCallCounts            = By.xpath("//div[@id='oj-select-choice-doYouWantToAddAdditionalCallCounts']");
		public static By bySelectAddAdditionalCallCounts      = By.xpath("//div[@data-oj-containerid='ojChoiceId_doYouWantToAddAdditionalCallCounts']/ul/li/div[@aria-label='125']");
		public static By bySecondPRIPort                      = By.xpath("//div[@id='oj-select-choice-secondPRIPort']");
		public static By bySelectSecondPRIPort                = By.xpath("//div[@data-oj-containerid='ojChoiceId_secondPRIPort']/ul/li/div[@aria-label='Yes']");
		public static By byExpandMaintenance                  = By.xpath("//h3[text()='Maintenance']");
		public static By byMaintenanceProvider                = By.xpath("//div[@id='oj-select-choice-whoProvidesLevel12SupportForThisRibbonProvidesLevel3']");
		public static By bySelectMaintenanceProvider          = By.xpath("//div[@data-oj-containerid='ojChoiceId_whoProvidesLevel12SupportForThisRibbonProvidesLevel3']/ul/li/div[@aria-label='Ribbon']");
		public static By byLevelOfSupportRequired             = By.xpath("//div[@id='oj-select-choice-whatLevelOfSupportIsRequired_root']");
		public static By bySelectLevelOfSupportRequired       = By.xpath("//div[@data-oj-containerid='ojChoiceId_whatLevelOfSupportIsRequired_root']/ul/li/div[@aria-label='Premium (24x7 + AHR + Critical Issue Escalation)']");
		public static By byLevel12Support                     = By.xpath("//div[@id='ojChoiceId_whoProvidesLevel12SupportForThisRibbonProvidesLevel3']");
		public static By bySelectLevel12Support               = By.xpath("//div[@data-oj-containerid='ojChoiceId_whoProvidesLevel12SupportForThisRibbonProvidesLevel3']/ul/li/div[@aria-label='Ribbon']");
		////////////////////////////////////////////////////////////////////   GVPP RELATED /////////////////////////////////////////////////////////////////////////////////////
		public static By byGVPPTopConfigGroup                 = By.xpath("//div[@id='ojChoiceId_topConfigGroup_nonArray']");
		public static By bySelectGVPPTopConfigGroup			  = By.xpath("//div[@id='oj-listbox-drop']/ul/li/div[@aria-label='Management']");
		public static By byConfigNameGVPP                     = By.xpath("//div[@id='ojChoiceId_configuratorName_nonArray']");		
		public static By bySelectConfigNameGVPP               = By.xpath("//div[@id='oj-listbox-drop']/ul/li/div[@aria-label='Provisioning and Portals Configurator']");
		public static By byLocationGVPP                       = By.xpath("//div[@id='ojChoiceId_location_Lgb']");		
		public static By bySelectLocationGVPP                 = By.xpath("//div[@data-oj-containerid='ojChoiceId_location_Lgb']/ul/li/div[@aria-label='North America or Other ANSI Countries']");
		public static By byChangeLocationGVPP                 = By.xpath("//div[@data-oj-containerid='ojChoiceId_location_Lgb']/ul/li/div[@aria-label='Swiss']");
		public static By byPPSWR                              = By.xpath("//div[@id='ojChoiceId_provisionPortalsSWRelease']");
		public static By bySelectPPSWR                        = By.xpath("//div[@data-oj-containerid='ojChoiceId_provisionPortalsSWRelease']/ul/li/div[@aria-label='10.0']");
		public static By byPPDM                               = By.xpath("//div[@id='ojChoiceId_provisionPortalsDeploymentModel']");
		public static By bySelectPPDM                         = By.xpath("//div[@data-oj-containerid='ojChoiceId_provisionPortalsDeploymentModel']/ul/li/div[@aria-label='MA-RMS/VHE']");
		public static By byMARMSPT                            = By.xpath("//div[@id='ojChoiceId_mARMSPowerType']");
		public static By bySelectMARMSPT                      = By.xpath("//div[@data-oj-containerid='ojChoiceId_mARMSPowerType']/ul/li/div[@aria-label='AC']");
		public static By byChangeMARMSPT                      = By.xpath("//div[@data-oj-containerid='ojChoiceId_mARMSPowerType']/ul/li/div[@aria-label='DC']");
		public static By byHDDQuantity                        = By.xpath("//div[@id='ojChoiceId_quantityOfHDDsPerServer']");
		public static By bySelectHDDQuantity                  = By.xpath("//div[@data-oj-containerid='ojChoiceId_quantityOfHDDsPerServer']/ul/li/div[@aria-label='4']");
		public static By byChangeHDDQuantity                  = By.xpath("//div[@data-oj-containerid='ojChoiceId_quantityOfHDDsPerServer']/ul/li/div[@aria-label='3']");
		public static By byPSResiliencyOptions                = By.xpath("//div[@id='ojChoiceId_pSResiliencyOptions']");
		public static By bySelectPSResiliencyOptions          = By.xpath("//div[@data-oj-containerid='ojChoiceId_pSResiliencyOptions']/ul/li/div[@aria-label='PS Cold Standby Plus Resiliency']");
		public static By byEDPResiliencyOptions               = By.xpath("//div[@id='ojChoiceId_eDPResiliencyOptions']");
		public static By bySelectEDPResiliencyOptions         = By.xpath("//div[@data-oj-containerid='ojChoiceId_eDPResiliencyOptions']/ul/li/div[@aria-label='EDP Cold Standby Plus Resiliency']");
		public static By byClearEDPNodes                      = By.xpath("//input[@id='eDPNodes|input']");
		
		public static By byClearBasicLines                    = By.xpath("//input[@id='basicLines_existingPortal|input']");
		public static By byClearSIPLines                      = By.xpath("//input[@id='sIPLines_existingPortal|input']");
		public static By byClearSIPEDPDevices                 = By.xpath("//input[@id='sIPEndpointDeviceProvisioningEDPDevices_existingPortal|input']");
		public static By byClearEUPLogins                     = By.xpath("//input[@id='standardEndUserPortalEUPLogins_existingPortal|input']");
		public static By bySMBPortalLogins                    = By.xpath("//div[@id='ojChoiceId_sMBPortalLogins_existingPortal']");
		public static By bySelectSMBPortalLogins              = By.xpath("//div[@data-oj-containerid='ojChoiceId_sMBPortalLogins_existingPortal']/ul/li/div[@aria-label='Yes']");
		public static By bySPResellerPortalLogins             = By.xpath("//div[@id='ojChoiceId_serviceProviderResellerPortalLogins_existingPortal']");
		public static By bySelectSPResellerPortalLogins       = By.xpath("//div[@data-oj-containerid='ojChoiceId_serviceProviderResellerPortalLogins_existingPortal']/ul/li/div[@aria-label='Yes']");
		
		public static By byClearNewBasicLines                 = By.xpath("//input[@id='basicLines_newPortal|input']");
		public static By byClearNewSIPLines                   = By.xpath("//input[@id='sIPLines_newPortal|input']");
		public static By byClearNewSIPEDPDevices              = By.xpath("//input[@id='sIPEndpointDeviceProvisioningEDPDevices_newPortal|input']");
		public static By byClearNewEUPLogins                  = By.xpath("//input[@id='standardEndUserPortalEUPLogins_newPortal|input']");
		public static By byNewSMBPortalLogins                 = By.xpath("//div[@id='ojChoiceId_sMBPortalLogins_newPortal']");
		public static By bySelectNewSMBPortalLogins           = By.xpath("//div[@data-oj-containerid='ojChoiceId_sMBPortalLogins_newPortal']/ul/li/div[@aria-label='Yes']");
		public static By byNewSPResellerPortalLogins          = By.xpath("//div[@id='ojChoiceId_serviceProviderResellerPortalLogins_newPortal']");
		public static By bySelectNewSPResellerPortalLogins    = By.xpath("//div[@data-oj-containerid='ojChoiceId_serviceProviderResellerPortalLogins_newPortal']/ul/li/div[@aria-label='Yes']");
		public static By byClearCIMVoiceMail                  = By.xpath("//input[@id='cIMVoicemailFaxVirtualReceptionist|input']");
		
		public static By byPortalLanguagescheckkbox           = By.xpath("//input[@value='UK English']/parent::span");
		public static By byClearCustomNEWASCII                = By.xpath("//input[@id='nEWASCIIRequiresTranslationService|input']");
		public static By byClearCustomNEWDBCS                 = By.xpath("//input[@id='nEWDBCSRequiresTranslationService|input']");
		
		///////////////////////////////////////////////////////////////////////     ADD FROM CATALOG    /////////////////////////////////////////////////////////////////////////
		public static By byCatalogName                        = By.xpath("//div[@aria-labelledby='catalogueNameTxt_Bundle-label|label']");
		public static By bySelectCatalogName                  = By.xpath("//div[@data-oj-containerid='ojChoiceId_catalogueNameTxt_Bundle']/ul/li/div[@aria-label='3rd party Cellusys Catalog']");
		
		public static By byCategoryNameCatalog                = By.xpath("//div[@id='ojChoiceId_categoryName_Text']");
		public static By bySelectCategoryNameCatalogH          = By.xpath("//div[@id='oj-listbox-drop']/ul/li/div[@aria-label='Hardware']");
		public static By bySelectCategoryNameCatalogS          = By.xpath("//div[@id='oj-listbox-drop']/ul/li/div[@aria-label='Software']");
		
		public static By byCCMaintenanceProvider              = By.xpath("//div[@id='ojChoiceId_maintenanceProvider']");
		public static By bySelectCCMaintenanceProvider        = By.xpath("//div[@data-oj-containerid='ojChoiceId_maintenanceProvider']/ul/li/div[@aria-label='Ribbon']");
		
		public static By byAddCatalogButton                   = By.xpath("//div[@id='addCatalog']/button[text()='Add Catalog']");
		
		public static By byCatalogType                        = By.xpath("(//div[contains(@class,'col-categoryName_Bundle')])[2]");
		public static By bySelectCatalogType                  = By.xpath("//div[@data-oj-containerid='ojChoiceId_categoryName_Bundle']/ul/li/div[@aria-label='Hardware']");
		
		public static By bySytsemConfigurationRBP             = By.xpath("//div[@id='left-sidebar']//oj-tree-view[@id='system-navigation']//li/div/span[contains(text(),'Ribbon Bundle Product')]");
		public static By bySytsemConfigurationHardwareRBP     = By.xpath("//div[@id='left-sidebar']//oj-tree-view[@id='system-navigation']//li/div/span[contains(text(),'Hardware_3rd party Cellusys Catalog')]");
		public static By bySytsemConfigurationSoftwareRBP     = By.xpath("//div[@id='left-sidebar']//oj-tree-view[@id='system-navigation']//li/div/span[contains(text(),'Software_3rd party Cellusys Catalog')]");
		public static By bySearchButton                       = By.xpath("//button[text()='Search']");
		
		public static By byClearPartQtyGTP                    = By.xpath("//div[contains(text(),'1')]/following::oj-input-number//input[@id='partQty|input']");		
		public static By byClickPartQtyGTP                    = By.xpath("(//div[contains(@class,'cpq-table-segment')]//div[contains(@class,'cpq-table-body-row')]//div[contains(@class,'col-partQty')])[1]");
				
		public static By byClearPartQtyBS                     = By.xpath("//div[contains(@class,'cpq-table-body-row')]//span[@title='CELL-SFWBS']//following::div[2]//input[@id='partQty|input']");
		public static By byClearPartQtyLAB                    = By.xpath("//div[contains(@class,'cpq-table-body-row')]//span[@title='CELL-SFWLAB']//following::div[2]//input[@id='partQty|input']");
		
		public static By byClickPartQtyGTPFWGEO               = By.xpath("//div[contains(@class,'cpq-table-body-row')]//span[@title='CELL-GTPFWGEO']//following::div[2]/span");
		public static By byClearPartQtyGTPFWGEO               = By.xpath("//div[contains(text(),'1')]/following::oj-input-number//input[@id='partQty|input']");
		
		public static By byClearPartQtyMULT                   = By.xpath("//div[contains(@class,'cpq-table-body-row')]//span[@title='CELL-SFWMULT']//following::div[2]//input[@id='partQty|input']");
		public static By byClearPartQtyANA                    = By.xpath("//div[contains(@class,'cpq-table-body-row')]//span[@title='CELL-SMSANA']//following::div[2]//input[@id='partQty|input']");
				
		public static By byAddPartsButton                     = By.xpath("//button[text()='Add Parts']");
		public static By byAddIcon      					  = By.xpath("//div[@slot='iconButtons']//button//span[contains(@class,'add-icon')]");
		public static By byDeleteIcon 		     			  = By.xpath("//div[@slot='iconButtons']//button//span[contains(@class,'delete-icon')]");
		
		public static By byClickCatalogTypeTwo                = By.xpath("(//div[contains(@class,'cpq-table-body-row')]/div[contains(@class,'col-categoryName_Bundle')])[2]");
		public static By bySelectCatalogTypeTwo                = By.xpath("//div[@data-oj-containerid='ojChoiceId_categoryName_Bundle']/ul/li/div[@aria-label='Software']");
		//////////////////////////////////////////////////////      UPDATE || SAVE || ADD TO QUOTE || CANCEL          ////////////////////////////////////////////////////////////
		public static By byConfigUpdateButton                 = By.xpath("//span[@class='oj-button-text'][text()='Update']");
		//public static By byConfigUpdateButton                 = By.xpath("//oj-button[@name='update']/button");
		public static By byConfigSaveButton                   = By.xpath("//div[@class='toolbar-wrapper']//span[text()='Save']/parent::div");
		public static By byAddToQuoteButton                   = By.xpath("//oj-button[@name='_add_to_quote']/button");
		public static By byConfigCancelButton                 = By.xpath("//oj-button[@name='_cancel']/button");
		
		////////////////////////////////   SAVE || REPRICE || CALCULATE DISCOUNT || SUBMIT || CREATE NEW VERSION || CLONE || OPPORTUNITY    /////////////////////////////////////
		public static By byQuoteSaveButton                    = By.xpath("//oj-button[@name='update']/button");
		public static By byQuoteSFDCQuoteButton               = By.xpath("//oj-button[@name='sfdc_quote']/button");
		public static By byQuoteRepriceButton                 = By.xpath("//oj-button[@name='reprice']/button");
		public static By byQuoteCalculateDiscountButton       = By.xpath("//oj-button[@name='calculate_discount']/button");
		public static By byQuoteOpportunityButton             = By.xpath("//span[text()='Opportunity']");
		public static By byQuoteCreateNewVersionButton        = By.xpath("//oj-button[@name='create_new_version']/button");
		public static By byQuoteCloneButton                   = By.xpath("//oj-button[@name='clone']/button");
		
		///////////////////////////////////   QUOTE DETAILS || PROPOSALS || OPPORTUNITY DETAILS || DISCOUNTING || APPROVALS     /////////////////////////////////////////////////
		public static By byQuoteProposalsButton               = By.xpath("//a[@title='Proposals']");
		public static By byQuoteProposalType                  = By.xpath("//div[@id='ojChoiceId_proposalType_t']");
		public static By bySelectQuoteProposalType            = By.xpath("//div[@data-oj-containerid='ojChoiceId_proposalType_t']/ul/li/div[@aria-label='C&E']");
		public static By byQuoteFileType                      = By.xpath("//div[@id='ojChoiceId_fileType_t']");
		public static By bySelectExcelFileType                = By.xpath("//div[@data-oj-containerid='ojChoiceId_fileType_t']/ul/li/div[@aria-label='Excel (.xls)']");
		public static By byGenerateProposalExcelButton        = By.xpath("//oj-button[@name='generate_proposal_(excel)']");
		public static By bySelectPDFFileType                  = By.xpath("//div[@data-oj-containerid='ojChoiceId_fileType_t']/ul/li/div[@aria-label='PDF']");
		public static By byGenerateProposalPDFButton          = By.xpath("//oj-button[@name='generate_proposal_(pdf)']");
		public static By bySelectWordFileType                 = By.xpath("//div[@data-oj-containerid='ojChoiceId_fileType_t']/ul/li/div[@aria-label='Word']");
		public static By byGenerateProposalWordButton         = By.xpath("//oj-button[@name='generate_proposal']");
		public static By byGenerateSOWButton                  = By.xpath("//oj-button[@name='generate_sow']");
		
		public static By byQuoteOpportunityDetailsButton      = By.xpath("//a[@title='Opportunity Details']");
		
		public static By byQuoteDiscountingButton             = By.xpath("//a[@title='Discounting']");
		public static By byAddlProductDiscount                = By.xpath("//input[@id='additionalProductDiscount_t|input']");
		public static By byAddlMaintenanceDiscount            = By.xpath("//input[@id='additionalMaintenanceDiscount_t|input']");
		public static By byAddlServicesDiscount               = By.xpath("//input[@id='additionalServicesDiscount_t|input']");
		
		public static By byRadioButtonNOOTD                   = By.xpath("//input[@value='No OTD']/parent::span");
		public static By byRadioButtonOTDasPercentage         = By.xpath("//input[@value='Apply OTD as Percent']/parent::span");
		public static By byRadioButtonOTDasCurrency           = By.xpath("//input[@value='Apply OTD as Currency']/parent::span");
		
		public static By byOneTimeDiscount                    = By.xpath("//input[@id='oneTimeDiscount_t|input']");
		public static By byOneTimeDiscountAmount              = By.xpath("//input[@id='oneTimeDiscountAmount_t|input']");
		
		public static By byQuoteApprovalButton                = By.xpath("//a[@title='Approval']");
		public static By byQuoteDetailsButton                 = By.xpath("//a[@title='Quote Details']");		
		
		public static By byClickOnProfile                     = By.xpath("//a[@id='globalHeaderNameMink']");
		public static By byClickLogout                        = By.xpath("//a[@title='Logout']");		
		//public static By bylightningprofile					  = By.xpath("//span[@class='uiImage'])[1]");
		public static By bylightningprofile					  = By.xpath("//div[@class='slds-global-header__item']/ul/li[8]/span/button");
		public static By bySwitchtoclassic					  = By.xpath("//a[text()='Switch to Salesforce Classic']");
				
	}