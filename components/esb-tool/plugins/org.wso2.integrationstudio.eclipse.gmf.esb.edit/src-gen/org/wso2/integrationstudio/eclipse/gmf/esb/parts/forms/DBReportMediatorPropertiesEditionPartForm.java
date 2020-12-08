/**
 * Generated with Acceleo
 */
package org.wso2.integrationstudio.eclipse.gmf.esb.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import org.wso2.integrationstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.integrationstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.integrationstudio.eclipse.gmf.esb.SqlDatabaseType;
import org.wso2.integrationstudio.eclipse.gmf.esb.SqlExecutorConnectionType;
import org.wso2.integrationstudio.eclipse.gmf.esb.SqlExecutorDatasourceType;
import org.wso2.integrationstudio.eclipse.gmf.esb.impl.EsbFactoryImpl;
import org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart;
import org.wso2.integrationstudio.eclipse.gmf.esb.parts.EsbViewsRepository;
import org.wso2.integrationstudio.eclipse.gmf.esb.presentation.ConnectionObj;
import org.wso2.integrationstudio.eclipse.gmf.esb.presentation.DependencyProvider;
import org.wso2.integrationstudio.eclipse.gmf.esb.presentation.EEFPropertyViewUtil;
import org.wso2.integrationstudio.eclipse.gmf.esb.presentation.EEFRegistryKeyPropertyEditorDialog;
import org.wso2.integrationstudio.eclipse.gmf.esb.providers.EsbMessages;
import org.wso2.integrationstudio.esb.form.editors.article.providers.NamedEntityDescriptor;

import static org.wso2.integrationstudio.eclipse.gmf.esb.Constants.TXT_DATABASE_CONNECTION_URL_MSSQL;
import static org.wso2.integrationstudio.eclipse.gmf.esb.Constants.TXT_DATABASE_CONNECTION_URL_MYSQL;
import static org.wso2.integrationstudio.eclipse.gmf.esb.Constants.TXT_DATABASE_CONNECTION_URL_ORACLE;
import static org.wso2.integrationstudio.eclipse.gmf.esb.Constants.TXT_DATABASE_CONNECTION_URL_POSTGRESQL;
import static org.wso2.integrationstudio.eclipse.gmf.esb.Constants.TXT_DATABASE_DRIVER_MYSQL;
import static org.wso2.integrationstudio.eclipse.gmf.esb.Constants.TXT_DATABASE_DRIVER_MSSQL;
import static org.wso2.integrationstudio.eclipse.gmf.esb.Constants.TXT_DATABASE_DRIVER_ORACLE;
import static org.wso2.integrationstudio.eclipse.gmf.esb.Constants.TXT_DATABASE_DRIVER_POSTGRESQL;
import static org.wso2.integrationstudio.eclipse.gmf.esb.Constants.TXT_DATABASE_USER_MYSQL;
import static org.wso2.integrationstudio.eclipse.gmf.esb.Constants.TXT_DATABASE_USER_MSSQL;
import static org.wso2.integrationstudio.eclipse.gmf.esb.Constants.TXT_DATABASE_USER_ORACLE;
import static org.wso2.integrationstudio.eclipse.gmf.esb.Constants.TXT_DATABASE_USER_POSTGRESQL;

// End of user code

/**
 * 
 * 
 */
public class DBReportMediatorPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, DBReportMediatorPropertiesEditionPart {

	protected EMFComboViewer connectionType;
	protected EMFComboViewer connectionDsType;
	protected EMFComboViewer connectionDbType;
	protected Text connectionDbDriver;
	protected Text connectionDsInitialContext;
	protected Text connectionDsName;
	protected Text connectionURL;
	protected Text connectionUsername;
	protected Text connectionPassword;
	protected Button dependencyProvider;
	protected Button connectionUseTransaction;
	protected Button isRegistryBasedDriverConfig;
	protected Button isRegistryBasedUrlConfig;
	protected Button isRegistryBasedUserConfig;
	protected Button isRegistryBasedPassConfig;
	protected ReferencesTable sqlStatements;
	protected List<ViewerFilter> sqlStatementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sqlStatementsFilters = new ArrayList<ViewerFilter>();
	protected Text commentsList;
	protected Button editCommentsList;
	protected EList commentsListList;
	protected Button reverse;
	protected EMFComboViewer propertyAutocommit;
	protected EMFComboViewer propertyIsolation;
	protected Text propertyMaxactive;
	protected Text propertyMaxidle;
	protected Text propertyMaxopenstatements;
	protected Text propertyMaxwait;
	protected Text propertyMinidle;
	protected EMFComboViewer propertyPoolstatements;
	protected EMFComboViewer propertyTestonborrow;
	protected EMFComboViewer propertyTestwhileidle;
	protected Text propertyValidationquery;
	protected Text propertyInitialsize;
	protected Text description;

	// Start of user code for additional methods
	protected Text registryBasedDriverConfigKeyText;
	protected Text registryBasedUrlConfigKeyText;
	protected Text registryBasedUserConfigKeyText;
	protected Text registryBasedPassConfigKeyText;
	    
	protected RegistryKeyProperty registryBasedDriverConfigKey;
	protected RegistryKeyProperty registryBasedUrlConfigKey;
	protected RegistryKeyProperty registryBasedUserConfigKey;
	protected RegistryKeyProperty registryBasedPassConfigKey;
	    
	protected Composite connectionGroup;
	protected Composite statementsGroup;
	protected Composite propertiesGroup;
	protected Composite miscGroup;
	
	protected Section propertiesSection;
	
	protected Control[] connectionTypeElements;
	protected Control[] connectionDsTypeElements;
	protected Control[] connectionDbTypeElements;
	protected Control[] connectionDbDriverElements;
	protected Control[] connectionDsInitialContextElements;
	protected Control[] connectionDsNameElements;
	protected Control[] connectionURLElements;
	protected Control[] connectionUsernameElements;
	protected Control[] connectionPasswordElements;
	protected Control[] connectionUserTransactionElements;
	protected Control[] propertyAutoCommitElements;
	protected Control[] propertyIsolationElements;
	protected Control[] descriptionElements;
	protected Control[] propertyInitialSizeElements;
	protected Control[] propertyValidationQueryElements;
	protected Control[] propertyTestWhileIdelElements;
	protected Control[] propertyTestOnBorrowElements;
	protected Control[] propertyPoolstatementsElements;
	protected Control[] propertyMinIdelElements;
	protected Control[] propertyMaxWaitElements;
	protected Control[] propertyMaxOpenStatementsElements;
	protected Control[] propertyMaxIdleElements;
	protected Control[] propertyMaxActiveElements;
	protected Control[] connectionDbConfiguration;
	protected Control[] isRegistryBasedDriverConfigElements;
	protected Control[] isRegistryBasedUrlConfigElements;
	protected Control[] isRegistryBasedUserConfigElements;
	protected Control[] isRegistryBasedPassConfigElements;
	protected Control[] registryBasedDriverConfigKeyElements;
	protected Control[] registryBasedPassConfigKeyElements;
	protected Control[] registryBasedUserConfigKeyElements;
	protected Control[] registryBasedUrlConfigKeyElements;
	
	String jarPath = "";

	DependencyProvider dp;
	// End of user code

	/**
	 * For {@link ISection} use only.
	 */
	public DBReportMediatorPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DBReportMediatorPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		Form form = widgetFactory.createForm(parent);
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return form;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence dBReportMediatorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep connectionStep = dBReportMediatorStep.addStep(EsbViewsRepository.DBReportMediator.Connection.class);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.connectionType);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.databaseConfiguration);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.connectionDsType);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.connectionDbType);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedDriverConfig);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.connectionDbDriver);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.registryBasedDriverConfigKey);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.connectionDsInitialContext);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.connectionDsName);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUrlConfig);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.connectionURL);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.registryBasedUrlConfigKey);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUserConfig);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.connectionUsername);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.registryBasedUserConfigKey);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedPassConfig);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.connectionPassword);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.registryBasedPassConfigKey);
		connectionStep.addStep(EsbViewsRepository.DBReportMediator.Connection.connectionUseTransaction);
		
		dBReportMediatorStep
			.addStep(EsbViewsRepository.DBReportMediator.Statements.class)
			.addStep(EsbViewsRepository.DBReportMediator.Statements.sqlStatements);
		
		CompositionStep propertiesStep = dBReportMediatorStep.addStep(EsbViewsRepository.DBReportMediator.Properties.class);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.commentsList);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.reverse);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.propertyAutocommit);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.propertyIsolation);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.propertyMaxactive);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.propertyMaxidle);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.propertyMaxopenstatements);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.propertyMaxwait);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.propertyMinidle);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.propertyPoolstatements);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.propertyTestonborrow);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.propertyTestwhileidle);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.propertyValidationquery);
		propertiesStep.addStep(EsbViewsRepository.DBReportMediator.Properties.propertyInitialsize);
		
		dBReportMediatorStep
			.addStep(EsbViewsRepository.DBReportMediator.Misc.class)
			.addStep(EsbViewsRepository.DBReportMediator.Misc.description);
		
		
		composer = new PartComposer(dBReportMediatorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EsbViewsRepository.DBReportMediator.Connection.class) {
					return createConnectionGroup(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.connectionType) {
					return createConnectionTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.connectionDsType) {
					return createConnectionDsTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.connectionDbType) {
					return createConnectionDbTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.connectionDbDriver) {
					return createConnectionDbDriverText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.connectionDsInitialContext) {
					return createConnectionDsInitialContextText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.connectionDsName) {
					return createConnectionDsNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.connectionURL) {
					return createConnectionURLText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.connectionUsername) {
					return createConnectionUsernameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.connectionPassword) {
					return createConnectionPasswordText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.connectionUseTransaction) {
					return createConnectionUseTransactionCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Statements.class) {
					return createStatementsGroup(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Statements.sqlStatements) {
					return createSqlStatementsTableComposition(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.commentsList) {
					return createCommentsListMultiValuedEditor(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.reverse) {
					return createReverseCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.propertyAutocommit) {
					return createPropertyAutocommitEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.propertyIsolation) {
					return createPropertyIsolationEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.propertyMaxactive) {
					return createPropertyMaxactiveText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.propertyMaxidle) {
					return createPropertyMaxidleText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.propertyMaxopenstatements) {
					return createPropertyMaxopenstatementsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.propertyMaxwait) {
					return createPropertyMaxwaitText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.propertyMinidle) {
					return createPropertyMinidleText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.propertyPoolstatements) {
					return createPropertyPoolstatementsEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.propertyTestonborrow) {
					return createPropertyTestonborrowEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.propertyTestwhileidle) {
					return createPropertyTestwhileidleEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.propertyValidationquery) {
					return createPropertyValidationqueryText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Properties.propertyInitialsize) {
					return createPropertyInitialsizeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Misc.class) {
					return createMiscGroup(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Misc.description) {
					return createDescriptionText(widgetFactory, parent);
				}				
				if (key == EsbViewsRepository.DBReportMediator.Connection.databaseConfiguration) {
					return createDbConfiguration(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedDriverConfig) {
					return createIsRegistryBasedDriverConfigCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUserConfig) {
					return createIsRegistryBasedUserConfigCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUrlConfig) {
					return createIsRegistryBasedUrlConfigCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedPassConfig) {
					return createIsRegistryBasedPassConfigCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.registryBasedDriverConfigKey) {
					return createRegistryBasedDriverConfigKeyWidget(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.registryBasedPassConfigKey) {
					return createRegistryBasedPassConfigKeyWidget(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.registryBasedUserConfigKey) {
					return createRegistryBasedUserConfigKeyWidget(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.DBReportMediator.Connection.registryBasedUrlConfigKey) {
					return createRegistryBasedUrlConfigKeyWidget(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	
	/**
     * @generated NOT
     */

    protected Composite createDbConfiguration(FormToolkit widgetFactory, Composite parent) {
        Control propertyInitializeLabel = createDescription(parent,
                EsbViewsRepository.DBReportMediator.Connection.databaseConfiguration,
                EsbMessages.DBReportMediatorPropertiesEditionPart_DatabaseConfigurationLabel);
        dependencyProvider = new Button(parent, SWT.NULL);

        GridData dependencyProviderData = new GridData();
        dependencyProvider.setText("Configure");
        dependencyProviderData.grabExcessHorizontalSpace = false;
        dependencyProvider.setLayoutData(dependencyProviderData);
        dependencyProvider.addListener(SWT.Selection, new Listener() {

            @Override
            public void handleEvent(org.eclipse.swt.widgets.Event event) {
                // TODO Auto-generated method stub
                new Thread(new Runnable() {
                    public void run() {
                        Display.getDefault().asyncExec(new Runnable() {
                            public void run() {
                                Display display = PlatformUI.getWorkbench().getDisplay();
                                Shell shell = display.getActiveShell();
                                dp = new DependencyProvider(shell, SWT.NONE, null, null);
                                ConnectionObj obj = new ConnectionObj();
                                obj.setDbDriver(getConnectionDbDriver().isEmpty() ? "" : getConnectionDbDriver());
                                obj.setDbType(getConnectionDbType().getName().isEmpty() ? ""
                                        : getConnectionDbType().getName());
                                obj.setPassword(getConnectionPassword().isEmpty() ? "" : getConnectionPassword());
                                obj.setUrl(getConnectionURL().isEmpty() ? "" : getConnectionURL());
                                obj.setUserName(getConnectionUsername().isEmpty() ? "" : getConnectionUsername());
                                obj.setJarPath(jarPath);

                                dp.open(obj);

                                jarPath = obj.getJarPath();

                                propertiesEditionComponent.firePropertiesChanged(
                                    new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
                                            EsbViewsRepository.DBReportMediator.Connection.connectionDbType,
                                            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
                                            SqlDatabaseType.getByName(obj.getDbType())));
                                propertiesEditionComponent.firePropertiesChanged(
                                    new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
                                            EsbViewsRepository.DBReportMediator.Connection.connectionDbDriver,
                                            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
                                            obj.getDbDriver()));
                                propertiesEditionComponent.firePropertiesChanged(
                                    new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
                                            EsbViewsRepository.DBReportMediator.Connection.connectionURL,
                                            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
                                            obj.getUrl()));
                                propertiesEditionComponent.firePropertiesChanged(
                                    new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
                                            EsbViewsRepository.DBReportMediator.Connection.connectionUsername,
                                            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
                                            obj.getUserName()));
                                propertiesEditionComponent.firePropertiesChanged(
                                    new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
                                            EsbViewsRepository.DBReportMediator.Connection.connectionPassword,
                                            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
                                            obj.getPassword()));
                            }
                        });
                    }
                }).start();
            }
        });

        Control propertyInitializeHelp = FormUtils.createHelpButton(widgetFactory, parent,
                propertiesEditionComponent.getHelpContent(
                        EsbViewsRepository.DBReportMediator.Connection.databaseConfiguration,
                        EsbViewsRepository.FORM_KIND),
                null); // $NON-NLS-1$

        // Start of user code for createDependencyProviderEMFComboViewer
        connectionDbConfiguration = new Control[] { propertyInitializeLabel, dependencyProvider,
                propertyInitializeHelp };
        // End of user code
        return parent;
    }


	/**
     * @generated NOT
     */
	protected Composite createConnectionGroup(FormToolkit widgetFactory, final Composite parent) {
		Section connectionSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		connectionSection.setText(EsbMessages.DBReportMediatorPropertiesEditionPart_ConnectionGroupLabel);
		GridData connectionSectionData = new GridData(GridData.FILL_HORIZONTAL);
		connectionSectionData.horizontalSpan = 3;
		connectionSection.setLayoutData(connectionSectionData);
		connectionGroup = widgetFactory.createComposite(connectionSection);
		GridLayout connectionGroupLayout = new GridLayout();
		connectionGroupLayout.numColumns = 3;
		connectionGroup.setLayout(connectionGroupLayout);
		connectionSection.setClient(connectionGroup);
		return connectionGroup;
	}

	/**
     * @generated NOT
     */
	protected Composite createConnectionTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		Control connectionTypeLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Connection.connectionType, EsbMessages.DBReportMediatorPropertiesEditionPart_ConnectionTypeLabel);
		connectionType = new EMFComboViewer(parent);
		connectionType.setContentProvider(new ArrayContentProvider());
		connectionType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData connectionTypeData = new GridData(GridData.FILL_HORIZONTAL);
		connectionType.getCombo().setLayoutData(connectionTypeData);
                connectionType.getCombo().addListener(SWT.MouseVerticalWheel, new Listener() {

                    @Override
                    public void handleEvent(Event arg0) {
                        arg0.doit = false;
                    }
                });
		connectionType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Connection.connectionType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConnectionType()));
				refresh();
			}

		});
		connectionType.setID(EsbViewsRepository.DBReportMediator.Connection.connectionType);
		Control connectionTypeHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Connection.connectionType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConnectionTypeEMFComboViewer
		connectionTypeElements = new Control[] {connectionTypeLabel, connectionType.getCombo(), connectionTypeHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createConnectionDsTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		Control connectionDsTypeLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Connection.connectionDsType, EsbMessages.DBReportMediatorPropertiesEditionPart_ConnectionDsTypeLabel);
		connectionDsType = new EMFComboViewer(parent);
		connectionDsType.setContentProvider(new ArrayContentProvider());
		connectionDsType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData connectionDsTypeData = new GridData(GridData.FILL_HORIZONTAL);
		connectionDsType.getCombo().setLayoutData(connectionDsTypeData);
                connectionDsType.getCombo().addListener(SWT.MouseVerticalWheel, new Listener() {

                    @Override
                    public void handleEvent(Event arg0) {
                        arg0.doit = false;
                    }
                });
		connectionDsType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Connection.connectionDsType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConnectionDsType()));
				validate();
			}

		});
		connectionDsType.setID(EsbViewsRepository.DBReportMediator.Connection.connectionDsType);
		Control connectionDsTypeHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Connection.connectionDsType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConnectionDsTypeEMFComboViewer
		connectionDsTypeElements = new Control[] {connectionDsTypeLabel, connectionDsType.getCombo(), connectionDsTypeHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */	
	protected Composite createConnectionDbTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		Control connectionDbTypeLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Connection.connectionDbType, EsbMessages.DBReportMediatorPropertiesEditionPart_ConnectionDbTypeLabel);
		connectionDbType = new EMFComboViewer(parent);
		connectionDbType.setContentProvider(new ArrayContentProvider());
		connectionDbType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData connectionDbTypeData = new GridData(GridData.FILL_HORIZONTAL);
		connectionDbType.getCombo().setLayoutData(connectionDbTypeData);
                connectionDbType.getCombo().addListener(SWT.MouseVerticalWheel, new Listener() {

                    @Override
                    public void handleEvent(Event arg0) {
                        arg0.doit = false;
                    }
                });
		connectionDbType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Connection.connectionDbType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConnectionDbType()));
				fillDbConnectionDefaultValues();
			}

		});
		connectionDbType.setID(EsbViewsRepository.DBReportMediator.Connection.connectionDbType);
		Control connectionDbTypeHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Connection.connectionDbType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConnectionDbTypeEMFComboViewer
		connectionDbTypeElements = new Control[] { connectionDbTypeLabel, connectionDbType.getCombo(), connectionDbTypeHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createConnectionDbDriverText(FormToolkit widgetFactory, Composite parent) {
		Control connectionDbDriverLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Connection.connectionDbDriver, EsbMessages.DBReportMediatorPropertiesEditionPart_ConnectionDbDriverLabel);
		connectionDbDriver = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		connectionDbDriver.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData connectionDbDriverData = new GridData(GridData.FILL_HORIZONTAL);
		connectionDbDriver.setLayoutData(connectionDbDriverData);
		connectionDbDriver.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Connection.connectionDbDriver,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, connectionDbDriver.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.connectionDbDriver,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, connectionDbDriver.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		connectionDbDriver.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Connection.connectionDbDriver, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, connectionDbDriver.getText()));
				}
			}
		});
		EditingUtils.setID(connectionDbDriver, EsbViewsRepository.DBReportMediator.Connection.connectionDbDriver);
		EditingUtils.setEEFtype(connectionDbDriver, "eef::Text"); //$NON-NLS-1$
		Control connectionDbDriverHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Connection.connectionDbDriver, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConnectionDbDriverText
		connectionDbDriverElements = new Control[] {connectionDbDriverLabel, connectionDbDriver, connectionDbDriverHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createConnectionDsInitialContextText(FormToolkit widgetFactory, Composite parent) {
		Control connectionDsInitialContextLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Connection.connectionDsInitialContext, EsbMessages.DBReportMediatorPropertiesEditionPart_ConnectionDsInitialContextLabel);
		connectionDsInitialContext = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		connectionDsInitialContext.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData connectionDsInitialContextData = new GridData(GridData.FILL_HORIZONTAL);
		connectionDsInitialContext.setLayoutData(connectionDsInitialContextData);
		connectionDsInitialContext.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Connection.connectionDsInitialContext,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, connectionDsInitialContext.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.connectionDsInitialContext,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, connectionDsInitialContext.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		connectionDsInitialContext.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Connection.connectionDsInitialContext, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, connectionDsInitialContext.getText()));
				}
			}
		});
		EditingUtils.setID(connectionDsInitialContext, EsbViewsRepository.DBReportMediator.Connection.connectionDsInitialContext);
		EditingUtils.setEEFtype(connectionDsInitialContext, "eef::Text"); //$NON-NLS-1$
		Control connectionDsInitialContextHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Connection.connectionDsInitialContext, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConnectionDsInitialContextText
		connectionDsInitialContextElements = new Control[] { connectionDsInitialContextLabel, connectionDsInitialContext, connectionDsInitialContextHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createConnectionDsNameText(FormToolkit widgetFactory, Composite parent) {
		Control connectionDsNameLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Connection.connectionDsName, EsbMessages.DBReportMediatorPropertiesEditionPart_ConnectionDsNameLabel);
		connectionDsName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		connectionDsName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData connectionDsNameData = new GridData(GridData.FILL_HORIZONTAL);
		connectionDsName.setLayoutData(connectionDsNameData);
		connectionDsName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Connection.connectionDsName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, connectionDsName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.connectionDsName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, connectionDsName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		connectionDsName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Connection.connectionDsName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, connectionDsName.getText()));
				}
			}
		});
		EditingUtils.setID(connectionDsName, EsbViewsRepository.DBReportMediator.Connection.connectionDsName);
		EditingUtils.setEEFtype(connectionDsName, "eef::Text"); //$NON-NLS-1$
		Control connectionDsNameHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Connection.connectionDsName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConnectionDsNameText
		connectionDsNameElements = new Control[] {connectionDsNameLabel, connectionDsName, connectionDsNameHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createConnectionURLText(FormToolkit widgetFactory, Composite parent) {
		Control connectionURLLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Connection.connectionURL, EsbMessages.DBReportMediatorPropertiesEditionPart_ConnectionURLLabel);
		connectionURL = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		connectionURL.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData connectionURLData = new GridData(GridData.FILL_HORIZONTAL);
		connectionURL.setLayoutData(connectionURLData);
		connectionURL.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Connection.connectionURL,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, connectionURL.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.connectionURL,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, connectionURL.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		connectionURL.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Connection.connectionURL, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, connectionURL.getText()));
				}
			}
		});
		EditingUtils.setID(connectionURL, EsbViewsRepository.DBReportMediator.Connection.connectionURL);
		EditingUtils.setEEFtype(connectionURL, "eef::Text"); //$NON-NLS-1$
		Control connectionURLHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Connection.connectionURL, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConnectionURLText
		connectionURLElements = new Control[] { connectionURLLabel, connectionURL, connectionURLHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createConnectionUsernameText(FormToolkit widgetFactory, Composite parent) {
		Control connectionUsernameLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Connection.connectionUsername, EsbMessages.DBReportMediatorPropertiesEditionPart_ConnectionUsernameLabel);
		connectionUsername = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		connectionUsername.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData connectionUsernameData = new GridData(GridData.FILL_HORIZONTAL);
		connectionUsername.setLayoutData(connectionUsernameData);
		connectionUsername.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Connection.connectionUsername,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, connectionUsername.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.connectionUsername,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, connectionUsername.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		connectionUsername.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Connection.connectionUsername, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, connectionUsername.getText()));
				}
			}
		});
		EditingUtils.setID(connectionUsername, EsbViewsRepository.DBReportMediator.Connection.connectionUsername);
		EditingUtils.setEEFtype(connectionUsername, "eef::Text"); //$NON-NLS-1$
		Control connectionUsernameHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Connection.connectionUsername, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConnectionUsernameText
		connectionUsernameElements = new Control[] {connectionUsernameLabel, connectionUsername, connectionUsernameHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createConnectionPasswordText(FormToolkit widgetFactory, Composite parent) {
		Control connectionPasswordLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Connection.connectionPassword, EsbMessages.DBReportMediatorPropertiesEditionPart_ConnectionPasswordLabel);
		connectionPassword = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		connectionPassword.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData connectionPasswordData = new GridData(GridData.FILL_HORIZONTAL);
		connectionPassword.setLayoutData(connectionPasswordData);
		connectionPassword.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Connection.connectionPassword,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, connectionPassword.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.connectionPassword,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, connectionPassword.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		connectionPassword.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Connection.connectionPassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, connectionPassword.getText()));
				}
			}
		});
		EditingUtils.setID(connectionPassword, EsbViewsRepository.DBReportMediator.Connection.connectionPassword);
		EditingUtils.setEEFtype(connectionPassword, "eef::Text"); //$NON-NLS-1$
		Control connectionPasswordHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Connection.connectionPassword, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConnectionPasswordText
		connectionPasswordElements = new Control[] {connectionPasswordLabel, connectionPassword, connectionPasswordHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createConnectionUseTransactionCheckbox(FormToolkit widgetFactory, Composite parent) {
		Control connectionUserTransactionLabel = connectionUseTransaction = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.DBReportMediator.Connection.connectionUseTransaction, EsbMessages.DBReportMediatorPropertiesEditionPart_ConnectionUseTransactionLabel), SWT.CHECK);
		connectionUseTransaction.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Connection.connectionUseTransaction, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(connectionUseTransaction.getSelection())));
			}

		});
		GridData connectionUseTransactionData = new GridData(GridData.FILL_HORIZONTAL);
		connectionUseTransactionData.horizontalSpan = 2;
		connectionUseTransaction.setLayoutData(connectionUseTransactionData);
		EditingUtils.setID(connectionUseTransaction, EsbViewsRepository.DBReportMediator.Connection.connectionUseTransaction);
		EditingUtils.setEEFtype(connectionUseTransaction, "eef::Checkbox"); //$NON-NLS-1$
		Control connectionUserTransactionHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Connection.connectionUseTransaction, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConnectionUseTransactionCheckbox
		connectionUserTransactionElements = new Control[] { connectionUserTransactionLabel, connectionUseTransaction, connectionUserTransactionHelp};
		// End of user code
		return parent;
	}

	protected Composite createIsRegistryBasedDriverConfigCheckbox(FormToolkit widgetFactory, Composite parent) {
		isRegistryBasedDriverConfig = widgetFactory
				.createButton(parent,
						getDescription(EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedDriverConfig,
								EsbMessages.DBReportMediatorPropertiesEditionPart_IsRegistryBasedDriverConfigLabel),
						SWT.CHECK);
		isRegistryBasedDriverConfig.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedDriverConfig,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									new Boolean(isRegistryBasedDriverConfig.getSelection())));
				}
				validate();
			}

		});
		GridData isRegistryBasedDriverConfigData = new GridData(GridData.FILL_HORIZONTAL);
		isRegistryBasedDriverConfigData.horizontalSpan = 2;
		isRegistryBasedDriverConfig.setLayoutData(isRegistryBasedDriverConfigData);
		EditingUtils.setID(isRegistryBasedDriverConfig,
				EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedDriverConfig);
		EditingUtils.setEEFtype(isRegistryBasedDriverConfig, "eef::Checkbox"); //$NON-NLS-1$
		Control isRegistryBasedDriverConfigHelp = FormUtils.createHelpButton(widgetFactory, parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedDriverConfig,
						EsbViewsRepository.FORM_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createIsRegistryBasedDriverConfigCheckbox
		isRegistryBasedDriverConfigElements = new Control[] { isRegistryBasedDriverConfig,
				isRegistryBasedDriverConfigHelp };
		// End of user code
		return parent;
	}

	protected Composite createIsRegistryBasedUrlConfigCheckbox(FormToolkit widgetFactory, Composite parent) {
		isRegistryBasedUrlConfig = widgetFactory
				.createButton(parent,
						getDescription(EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUrlConfig,
								EsbMessages.DBReportMediatorPropertiesEditionPart_IsRegistryBasedUrlConfigLabel),
						SWT.CHECK);
		isRegistryBasedUrlConfig.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUrlConfig,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									new Boolean(isRegistryBasedUrlConfig.getSelection())));
				}
				validate();
			}

		});
		GridData isRegistryBasedUrlConfigData = new GridData(GridData.FILL_HORIZONTAL);
		isRegistryBasedUrlConfigData.horizontalSpan = 2;
		isRegistryBasedUrlConfig.setLayoutData(isRegistryBasedUrlConfigData);
		EditingUtils.setID(isRegistryBasedUrlConfig,
				EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUrlConfig);
		EditingUtils.setEEFtype(isRegistryBasedUrlConfig, "eef::Checkbox"); //$NON-NLS-1$
		Control isRegistryBasedUrlConfigHelp = FormUtils.createHelpButton(widgetFactory, parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUrlConfig,
						EsbViewsRepository.FORM_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createIsRegistryBasedUrlConfigCheckbox
		isRegistryBasedUrlConfigElements = new Control[] { isRegistryBasedUrlConfig, isRegistryBasedUrlConfigHelp };
		// End of user code
		return parent;
	}

	protected Composite createIsRegistryBasedUserConfigCheckbox(FormToolkit widgetFactory, Composite parent) {
		isRegistryBasedUserConfig = widgetFactory
				.createButton(parent,
						getDescription(EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUserConfig,
								EsbMessages.DBReportMediatorPropertiesEditionPart_IsRegistryBasedUserConfigLabel),
						SWT.CHECK);
		isRegistryBasedUserConfig.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUserConfig,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									new Boolean(isRegistryBasedUserConfig.getSelection())));
				}
				validate();
			}
		});
		GridData isRegistryBasedUserConfigData = new GridData(GridData.FILL_HORIZONTAL);
		isRegistryBasedUserConfigData.horizontalSpan = 2;
		isRegistryBasedUserConfig.setLayoutData(isRegistryBasedUserConfigData);
		EditingUtils.setID(isRegistryBasedUserConfig,
				EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUserConfig);
		EditingUtils.setEEFtype(isRegistryBasedUserConfig, "eef::Checkbox"); //$NON-NLS-1$
		Control isRegistryBasedUserConfigHelp = FormUtils.createHelpButton(widgetFactory, parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUserConfig,
						EsbViewsRepository.FORM_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createIsRegistryBasedUserConfigCheckbox
		isRegistryBasedUserConfigElements = new Control[] { isRegistryBasedUserConfig, isRegistryBasedUserConfigHelp };
		// End of user code
		return parent;
	}

	protected Composite createIsRegistryBasedPassConfigCheckbox(FormToolkit widgetFactory, Composite parent) {
		isRegistryBasedPassConfig = widgetFactory
				.createButton(parent,
						getDescription(EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedPassConfig,
								EsbMessages.DBReportMediatorPropertiesEditionPart_IsRegistryBasedPassConfigLabel),
						SWT.CHECK);
		isRegistryBasedPassConfig.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedPassConfig,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									new Boolean(isRegistryBasedPassConfig.getSelection())));
				}
				validate();
			}
		});
		GridData isRegistryBasedPassConfigData = new GridData(GridData.FILL_HORIZONTAL);
		isRegistryBasedPassConfigData.horizontalSpan = 2;
		isRegistryBasedPassConfig.setLayoutData(isRegistryBasedPassConfigData);
		EditingUtils.setID(isRegistryBasedPassConfig,
				EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedPassConfig);
		EditingUtils.setEEFtype(isRegistryBasedPassConfig, "eef::Checkbox"); //$NON-NLS-1$
		Control isRegistryBasedPassConfigHelp = FormUtils.createHelpButton(widgetFactory, parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedPassConfig,
						EsbViewsRepository.FORM_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createIsRegistryBasedPassConfigCheckbox
		isRegistryBasedPassConfigElements = new Control[] { isRegistryBasedPassConfig, isRegistryBasedPassConfigHelp };
		// End of user code
		return parent;
	}

  /**
     * @generated NOT
     */
	protected Composite createStatementsGroup(FormToolkit widgetFactory, final Composite parent) {
		Section statementsSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		statementsSection.setText(EsbMessages.DBReportMediatorPropertiesEditionPart_StatementsGroupLabel);
		GridData statementsSectionData = new GridData(GridData.FILL_HORIZONTAL);
		statementsSectionData.horizontalSpan = 3;
		statementsSection.setLayoutData(statementsSectionData);
		statementsGroup = widgetFactory.createComposite(statementsSection);
		GridLayout statementsGroupLayout = new GridLayout();
		statementsGroupLayout.numColumns = 3;
		statementsGroup.setLayout(statementsGroupLayout);
		statementsSection.setClient(statementsGroup);
		return statementsGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSqlStatementsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.sqlStatements = new ReferencesTable(getDescription(EsbViewsRepository.DBReportMediator.Statements.sqlStatements, EsbMessages.DBReportMediatorPropertiesEditionPart_SqlStatementsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Statements.sqlStatements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				sqlStatements.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Statements.sqlStatements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				sqlStatements.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Statements.sqlStatements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				sqlStatements.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Statements.sqlStatements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				sqlStatements.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.sqlStatementsFilters) {
			this.sqlStatements.addFilter(filter);
		}
		this.sqlStatements.setHelpText(propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Statements.sqlStatements, EsbViewsRepository.FORM_KIND));
		this.sqlStatements.createControls(parent, widgetFactory);
		this.sqlStatements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Statements.sqlStatements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sqlStatementsData = new GridData(GridData.FILL_HORIZONTAL);
		sqlStatementsData.horizontalSpan = 3;
		this.sqlStatements.setLayoutData(sqlStatementsData);
		this.sqlStatements.setLowerBound(0);
		this.sqlStatements.setUpperBound(-1);
		sqlStatements.setID(EsbViewsRepository.DBReportMediator.Statements.sqlStatements);
		sqlStatements.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSqlStatementsTableComposition

		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EsbMessages.DBReportMediatorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
     * @generated NOT
     */
	protected Composite createCommentsListMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		commentsList = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData commentsListData = new GridData(GridData.FILL_HORIZONTAL);
		commentsListData.horizontalSpan = 2;
		commentsList.setLayoutData(commentsListData);
		EditingUtils.setID(commentsList, EsbViewsRepository.DBReportMediator.Properties.commentsList);
		EditingUtils.setEEFtype(commentsList, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editCommentsList = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.DBReportMediator.Properties.commentsList, EsbMessages.DBReportMediatorPropertiesEditionPart_CommentsListLabel), SWT.NONE);
		GridData editCommentsListData = new GridData();
		editCommentsList.setLayoutData(editCommentsListData);
		editCommentsList.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						commentsList.getShell(), "DBReportMediator", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						commentsListList, EsbPackage.eINSTANCE.getEsbElement_CommentsList().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					commentsListList = dialog.getResult();
					if (commentsListList == null) {
						commentsListList = new BasicEList();
					}
					commentsList.setText(commentsListList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.commentsList, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(commentsListList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editCommentsList, EsbViewsRepository.DBReportMediator.Properties.commentsList);
		EditingUtils.setEEFtype(editCommentsList, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createCommentsListMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createReverseCheckbox(FormToolkit widgetFactory, Composite parent) {
		reverse = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.DBReportMediator.Properties.reverse, EsbMessages.DBReportMediatorPropertiesEditionPart_ReverseLabel), SWT.CHECK);
		reverse.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.reverse, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(reverse.getSelection())));
			}

		});
		GridData reverseData = new GridData(GridData.FILL_HORIZONTAL);
		reverseData.horizontalSpan = 2;
		reverse.setLayoutData(reverseData);
		EditingUtils.setID(reverse, EsbViewsRepository.DBReportMediator.Properties.reverse);
		EditingUtils.setEEFtype(reverse, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.reverse, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createReverseCheckbox

		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertyAutocommitEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		Control propertyAutoCommitLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Properties.propertyAutocommit, EsbMessages.DBReportMediatorPropertiesEditionPart_PropertyAutocommitLabel);
		propertyAutocommit = new EMFComboViewer(parent);
		propertyAutocommit.setContentProvider(new ArrayContentProvider());
		propertyAutocommit.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData propertyAutocommitData = new GridData(GridData.FILL_HORIZONTAL);
		propertyAutocommit.getCombo().setLayoutData(propertyAutocommitData);
                propertyAutocommit.getCombo().addListener(SWT.MouseVerticalWheel, new Listener() {

                    @Override
                    public void handleEvent(Event arg0) {
                        arg0.doit = false;
                    }
                });
		propertyAutocommit.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.propertyAutocommit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPropertyAutocommit()));
			}

		});
		propertyAutocommit.setID(EsbViewsRepository.DBReportMediator.Properties.propertyAutocommit);
		Control propertyAutoCommitHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.propertyAutocommit, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyAutocommitEMFComboViewer
		propertyAutoCommitElements = new Control[] { propertyAutoCommitLabel, propertyAutocommit.getCombo(), propertyAutoCommitHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertyIsolationEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		Control propertyIsolationLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Properties.propertyIsolation, EsbMessages.DBReportMediatorPropertiesEditionPart_PropertyIsolationLabel);
		propertyIsolation = new EMFComboViewer(parent);
		propertyIsolation.setContentProvider(new ArrayContentProvider());
		propertyIsolation.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData propertyIsolationData = new GridData(GridData.FILL_HORIZONTAL);
		propertyIsolation.getCombo().setLayoutData(propertyIsolationData);
                propertyIsolation.getCombo().addListener(SWT.MouseVerticalWheel, new Listener() {

                    @Override
                    public void handleEvent(Event arg0) {
                        arg0.doit = false;
                    }
                });
		propertyIsolation.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.propertyIsolation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPropertyIsolation()));
			}

		});
		propertyIsolation.setID(EsbViewsRepository.DBReportMediator.Properties.propertyIsolation);
		Control propertyIsolationHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.propertyIsolation, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyIsolationEMFComboViewer
		propertyIsolationElements = new Control[] {propertyIsolationLabel, propertyIsolation.getCombo(), propertyIsolationHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertyMaxactiveText(FormToolkit widgetFactory, Composite parent) {
		Control propertyMaxActiveLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Properties.propertyMaxactive, EsbMessages.DBReportMediatorPropertiesEditionPart_PropertyMaxactiveLabel);
		propertyMaxactive = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		propertyMaxactive.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData propertyMaxactiveData = new GridData(GridData.FILL_HORIZONTAL);
		propertyMaxactive.setLayoutData(propertyMaxactiveData);
		propertyMaxactive.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Properties.propertyMaxactive,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyMaxactive.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Properties.propertyMaxactive,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, propertyMaxactive.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		propertyMaxactive.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.propertyMaxactive, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyMaxactive.getText()));
				}
			}
		});
		EditingUtils.setID(propertyMaxactive, EsbViewsRepository.DBReportMediator.Properties.propertyMaxactive);
		EditingUtils.setEEFtype(propertyMaxactive, "eef::Text"); //$NON-NLS-1$
		Control propertyMaxActiveHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.propertyMaxactive, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyMaxactiveText
		propertyMaxActiveElements = new Control[] {propertyMaxActiveLabel, propertyMaxactive, propertyMaxActiveHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertyMaxidleText(FormToolkit widgetFactory, Composite parent) {
		Control propertyMaxIdleLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Properties.propertyMaxidle, EsbMessages.DBReportMediatorPropertiesEditionPart_PropertyMaxidleLabel);
		propertyMaxidle = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		propertyMaxidle.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData propertyMaxidleData = new GridData(GridData.FILL_HORIZONTAL);
		propertyMaxidle.setLayoutData(propertyMaxidleData);
		propertyMaxidle.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Properties.propertyMaxidle,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyMaxidle.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Properties.propertyMaxidle,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, propertyMaxidle.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		propertyMaxidle.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.propertyMaxidle, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyMaxidle.getText()));
				}
			}
		});
		EditingUtils.setID(propertyMaxidle, EsbViewsRepository.DBReportMediator.Properties.propertyMaxidle);
		EditingUtils.setEEFtype(propertyMaxidle, "eef::Text"); //$NON-NLS-1$
		Control propertyMaxIdleHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.propertyMaxidle, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyMaxidleText
		propertyMaxIdleElements = new Control[] {propertyMaxIdleLabel, propertyMaxidle, propertyMaxIdleHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertyMaxopenstatementsText(FormToolkit widgetFactory, Composite parent) {
		Control propertyMaxOpenStatementsLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Properties.propertyMaxopenstatements, EsbMessages.DBReportMediatorPropertiesEditionPart_PropertyMaxopenstatementsLabel);
		propertyMaxopenstatements = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		propertyMaxopenstatements.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData propertyMaxopenstatementsData = new GridData(GridData.FILL_HORIZONTAL);
		propertyMaxopenstatements.setLayoutData(propertyMaxopenstatementsData);
		propertyMaxopenstatements.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Properties.propertyMaxopenstatements,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyMaxopenstatements.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Properties.propertyMaxopenstatements,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, propertyMaxopenstatements.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		propertyMaxopenstatements.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.propertyMaxopenstatements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyMaxopenstatements.getText()));
				}
			}
		});
		EditingUtils.setID(propertyMaxopenstatements, EsbViewsRepository.DBReportMediator.Properties.propertyMaxopenstatements);
		EditingUtils.setEEFtype(propertyMaxopenstatements, "eef::Text"); //$NON-NLS-1$
		Control propertyMaxOpenStatementsHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.propertyMaxopenstatements, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyMaxopenstatementsText
		propertyMaxOpenStatementsElements = new Control[] { propertyMaxOpenStatementsLabel, propertyMaxopenstatements, propertyMaxOpenStatementsHelp}; 
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertyMaxwaitText(FormToolkit widgetFactory, Composite parent) {
		Control propertyMaxWaitLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Properties.propertyMaxwait, EsbMessages.DBReportMediatorPropertiesEditionPart_PropertyMaxwaitLabel);
		propertyMaxwait = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		propertyMaxwait.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData propertyMaxwaitData = new GridData(GridData.FILL_HORIZONTAL);
		propertyMaxwait.setLayoutData(propertyMaxwaitData);
		propertyMaxwait.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Properties.propertyMaxwait,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyMaxwait.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Properties.propertyMaxwait,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, propertyMaxwait.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		propertyMaxwait.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.propertyMaxwait, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyMaxwait.getText()));
				}
			}
		});
		EditingUtils.setID(propertyMaxwait, EsbViewsRepository.DBReportMediator.Properties.propertyMaxwait);
		EditingUtils.setEEFtype(propertyMaxwait, "eef::Text"); //$NON-NLS-1$
		Control propertyMaxWaitHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.propertyMaxwait, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyMaxwaitText
		propertyMaxWaitElements = new Control[] {propertyMaxWaitLabel, propertyMaxwait, propertyMaxWaitHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertyMinidleText(FormToolkit widgetFactory, Composite parent) {
		Control propertyMinIdelLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Properties.propertyMinidle, EsbMessages.DBReportMediatorPropertiesEditionPart_PropertyMinidleLabel);
		propertyMinidle = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		propertyMinidle.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData propertyMinidleData = new GridData(GridData.FILL_HORIZONTAL);
		propertyMinidle.setLayoutData(propertyMinidleData);
		propertyMinidle.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Properties.propertyMinidle,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyMinidle.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Properties.propertyMinidle,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, propertyMinidle.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		propertyMinidle.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.propertyMinidle, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyMinidle.getText()));
				}
			}
		});
		EditingUtils.setID(propertyMinidle, EsbViewsRepository.DBReportMediator.Properties.propertyMinidle);
		EditingUtils.setEEFtype(propertyMinidle, "eef::Text"); //$NON-NLS-1$
		Control propertyMinIdelHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.propertyMinidle, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyMinidleText
		propertyMinIdelElements = new Control[] {propertyMinIdelLabel, propertyMinidle, propertyMinIdelHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertyPoolstatementsEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		Control propertyPoolstatementsLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Properties.propertyPoolstatements, EsbMessages.DBReportMediatorPropertiesEditionPart_PropertyPoolstatementsLabel);
		propertyPoolstatements = new EMFComboViewer(parent);
		propertyPoolstatements.setContentProvider(new ArrayContentProvider());
		propertyPoolstatements.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData propertyPoolstatementsData = new GridData(GridData.FILL_HORIZONTAL);
		propertyPoolstatements.getCombo().setLayoutData(propertyPoolstatementsData);
                propertyPoolstatements.getCombo().addListener(SWT.MouseVerticalWheel, new Listener() {

                    @Override
                    public void handleEvent(Event arg0) {
                        arg0.doit = false;
                    }
                });
		propertyPoolstatements.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.propertyPoolstatements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPropertyPoolstatements()));
			}

		});
		propertyPoolstatements.setID(EsbViewsRepository.DBReportMediator.Properties.propertyPoolstatements);
		Control propertyPoolstatementsHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.propertyPoolstatements, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyPoolstatementsEMFComboViewer
		propertyPoolstatementsElements = new Control[] {propertyPoolstatementsLabel, propertyPoolstatements.getCombo(), propertyPoolstatementsHelp}; 
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertyTestonborrowEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		Control propertyTestOnBorrowLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Properties.propertyTestonborrow, EsbMessages.DBReportMediatorPropertiesEditionPart_PropertyTestonborrowLabel);
		propertyTestonborrow = new EMFComboViewer(parent);
		propertyTestonborrow.setContentProvider(new ArrayContentProvider());
		propertyTestonborrow.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData propertyTestonborrowData = new GridData(GridData.FILL_HORIZONTAL);
		propertyTestonborrow.getCombo().setLayoutData(propertyTestonborrowData);
                propertyTestonborrow.getCombo().addListener(SWT.MouseVerticalWheel, new Listener() {

                    @Override
                    public void handleEvent(Event arg0) {
                        arg0.doit = false;
                    }
                });
		propertyTestonborrow.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.propertyTestonborrow, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPropertyTestonborrow()));
			}

		});
		propertyTestonborrow.setID(EsbViewsRepository.DBReportMediator.Properties.propertyTestonborrow);
		Control propertyTestOnBorrowHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.propertyTestonborrow, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyTestonborrowEMFComboViewer
		propertyTestOnBorrowElements = new Control[] {propertyTestOnBorrowLabel, propertyTestonborrow.getCombo(), propertyTestOnBorrowHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertyTestwhileidleEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		Control propertyTestWhileIdelLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Properties.propertyTestwhileidle, EsbMessages.DBReportMediatorPropertiesEditionPart_PropertyTestwhileidleLabel);
		propertyTestwhileidle = new EMFComboViewer(parent);
		propertyTestwhileidle.setContentProvider(new ArrayContentProvider());
		propertyTestwhileidle.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData propertyTestwhileidleData = new GridData(GridData.FILL_HORIZONTAL);
		propertyTestwhileidle.getCombo().setLayoutData(propertyTestwhileidleData);
                propertyTestwhileidle.getCombo().addListener(SWT.MouseVerticalWheel, new Listener() {

                    @Override
                    public void handleEvent(Event arg0) {
                        arg0.doit = false;
                    }
                });
		propertyTestwhileidle.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.propertyTestwhileidle, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPropertyTestwhileidle()));
			}

		});
		propertyTestwhileidle.setID(EsbViewsRepository.DBReportMediator.Properties.propertyTestwhileidle);
		Control propertyTestWhileIdelHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.propertyTestwhileidle, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyTestwhileidleEMFComboViewer
		propertyTestWhileIdelElements = new Control[] {propertyTestWhileIdelLabel, propertyTestwhileidle.getCombo(), propertyTestWhileIdelHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertyValidationqueryText(FormToolkit widgetFactory, Composite parent) {
		Control propertyValidationQueryLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Properties.propertyValidationquery, EsbMessages.DBReportMediatorPropertiesEditionPart_PropertyValidationqueryLabel);
		propertyValidationquery = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		propertyValidationquery.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData propertyValidationqueryData = new GridData(GridData.FILL_HORIZONTAL);
		propertyValidationquery.setLayoutData(propertyValidationqueryData);
		propertyValidationquery.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Properties.propertyValidationquery,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyValidationquery.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Properties.propertyValidationquery,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, propertyValidationquery.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		propertyValidationquery.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.propertyValidationquery, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyValidationquery.getText()));
				}
			}
		});
		EditingUtils.setID(propertyValidationquery, EsbViewsRepository.DBReportMediator.Properties.propertyValidationquery);
		EditingUtils.setEEFtype(propertyValidationquery, "eef::Text"); //$NON-NLS-1$
		Control propertyValidationQueryHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.propertyValidationquery, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyValidationqueryText
		propertyValidationQueryElements = new Control[] { propertyValidationQueryLabel, propertyValidationquery, propertyValidationQueryHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createPropertyInitialsizeText(FormToolkit widgetFactory, Composite parent) {
		Control propertyInitialSizeLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Properties.propertyInitialsize, EsbMessages.DBReportMediatorPropertiesEditionPart_PropertyInitialsizeLabel);
		propertyInitialsize = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		propertyInitialsize.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData propertyInitialsizeData = new GridData(GridData.FILL_HORIZONTAL);
		propertyInitialsize.setLayoutData(propertyInitialsizeData);
		propertyInitialsize.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Properties.propertyInitialsize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyInitialsize.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Properties.propertyInitialsize,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, propertyInitialsize.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		propertyInitialsize.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Properties.propertyInitialsize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertyInitialsize.getText()));
				}
			}
		});
		EditingUtils.setID(propertyInitialsize, EsbViewsRepository.DBReportMediator.Properties.propertyInitialsize);
		EditingUtils.setEEFtype(propertyInitialsize, "eef::Text"); //$NON-NLS-1$
		Control propertyInitialSizeHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Properties.propertyInitialsize, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyInitialsizeText
		propertyInitialSizeElements = new Control[] {propertyInitialSizeLabel, propertyInitialsize, propertyInitialSizeHelp};
		// End of user code
		return parent;
	}

	/**
     * @generated NOT
     */
	protected Composite createMiscGroup(FormToolkit widgetFactory, final Composite parent) {
		Section miscSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		miscSection.setText(EsbMessages.DBReportMediatorPropertiesEditionPart_MiscGroupLabel);
		GridData miscSectionData = new GridData(GridData.FILL_HORIZONTAL);
		miscSectionData.horizontalSpan = 3;
		miscSection.setLayoutData(miscSectionData);
		miscGroup = widgetFactory.createComposite(miscSection);
		GridLayout miscGroupLayout = new GridLayout();
		miscGroupLayout.numColumns = 3;
		miscGroup.setLayout(miscGroupLayout);
		miscSection.setClient(miscGroup);
		return miscGroup;
	}

	/**
     * @generated NOT
     */
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		Control descriptionLabel = createDescription(parent, EsbViewsRepository.DBReportMediator.Misc.description, EsbMessages.DBReportMediatorPropertiesEditionPart_DescriptionLabel);
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBReportMediatorPropertiesEditionPartForm.this,
							EsbViewsRepository.DBReportMediator.Misc.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Misc.description,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, description.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DBReportMediatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this, EsbViewsRepository.DBReportMediator.Misc.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, EsbViewsRepository.DBReportMediator.Misc.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		Control descriptionHelp = FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.DBReportMediator.Misc.description, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText
		descriptionElements = new Control[] { descriptionLabel, description, descriptionHelp};
		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getConnectionType()
	 * 
	 */
	public Enumerator getConnectionType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) connectionType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#initConnectionType(Object input, Enumerator current)
	 */
	public void initConnectionType(Object input, Enumerator current) {
		connectionType.setInput(input);
		connectionType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionType);
		if (eefElementEditorReadOnlyState && connectionType.isEnabled()) {
			connectionType.setEnabled(false);
			connectionType.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionType.isEnabled()) {
			connectionType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setConnectionType(Enumerator newValue)
	 * 
	 */
	public void setConnectionType(Enumerator newValue) {
		connectionType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionType);
		if (eefElementEditorReadOnlyState && connectionType.isEnabled()) {
			connectionType.setEnabled(false);
			connectionType.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionType.isEnabled()) {
			connectionType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getConnectionDsType()
	 * 
	 */
	public Enumerator getConnectionDsType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) connectionDsType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#initConnectionDsType(Object input, Enumerator current)
	 */
	public void initConnectionDsType(Object input, Enumerator current) {
		connectionDsType.setInput(input);
		connectionDsType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionDsType);
		if (eefElementEditorReadOnlyState && connectionDsType.isEnabled()) {
			connectionDsType.setEnabled(false);
			connectionDsType.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDsType.isEnabled()) {
			connectionDsType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setConnectionDsType(Enumerator newValue)
	 * 
	 */
	public void setConnectionDsType(Enumerator newValue) {
		connectionDsType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionDsType);
		if (eefElementEditorReadOnlyState && connectionDsType.isEnabled()) {
			connectionDsType.setEnabled(false);
			connectionDsType.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDsType.isEnabled()) {
			connectionDsType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getConnectionDbType()
	 * 
	 */
	public Enumerator getConnectionDbType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) connectionDbType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#initConnectionDbType(Object input, Enumerator current)
	 */
	public void initConnectionDbType(Object input, Enumerator current) {
		connectionDbType.setInput(input);
		connectionDbType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionDbType);
		if (eefElementEditorReadOnlyState && connectionDbType.isEnabled()) {
			connectionDbType.setEnabled(false);
			connectionDbType.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDbType.isEnabled()) {
			connectionDbType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setConnectionDbType(Enumerator newValue)
	 * 
	 */
	public void setConnectionDbType(Enumerator newValue) {
		connectionDbType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionDbType);
		if (eefElementEditorReadOnlyState && connectionDbType.isEnabled()) {
			connectionDbType.setEnabled(false);
			connectionDbType.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDbType.isEnabled()) {
			connectionDbType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getConnectionDbDriver()
	 * 
	 */
	public String getConnectionDbDriver() {
		return connectionDbDriver.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setConnectionDbDriver(String newValue)
	 * 
	 */
	public void setConnectionDbDriver(String newValue) {
		if (newValue != null) {
			connectionDbDriver.setText(newValue);
		} else {
			connectionDbDriver.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionDbDriver);
		if (eefElementEditorReadOnlyState && connectionDbDriver.isEnabled()) {
			connectionDbDriver.setEnabled(false);
			connectionDbDriver.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDbDriver.isEnabled()) {
			connectionDbDriver.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getConnectionDsInitialContext()
	 * 
	 */
	public String getConnectionDsInitialContext() {
		return connectionDsInitialContext.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setConnectionDsInitialContext(String newValue)
	 * 
	 */
	public void setConnectionDsInitialContext(String newValue) {
		if (newValue != null) {
			connectionDsInitialContext.setText(newValue);
		} else {
			connectionDsInitialContext.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionDsInitialContext);
		if (eefElementEditorReadOnlyState && connectionDsInitialContext.isEnabled()) {
			connectionDsInitialContext.setEnabled(false);
			connectionDsInitialContext.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDsInitialContext.isEnabled()) {
			connectionDsInitialContext.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getConnectionDsName()
	 * 
	 */
	public String getConnectionDsName() {
		return connectionDsName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setConnectionDsName(String newValue)
	 * 
	 */
	public void setConnectionDsName(String newValue) {
		if (newValue != null) {
			connectionDsName.setText(newValue);
		} else {
			connectionDsName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionDsName);
		if (eefElementEditorReadOnlyState && connectionDsName.isEnabled()) {
			connectionDsName.setEnabled(false);
			connectionDsName.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDsName.isEnabled()) {
			connectionDsName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getConnectionURL()
	 * 
	 */
	public String getConnectionURL() {
		return connectionURL.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setConnectionURL(String newValue)
	 * 
	 */
	public void setConnectionURL(String newValue) {
		if (newValue != null) {
			connectionURL.setText(newValue);
		} else {
			connectionURL.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionURL);
		if (eefElementEditorReadOnlyState && connectionURL.isEnabled()) {
			connectionURL.setEnabled(false);
			connectionURL.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionURL.isEnabled()) {
			connectionURL.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getConnectionUsername()
	 * 
	 */
	public String getConnectionUsername() {
		return connectionUsername.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setConnectionUsername(String newValue)
	 * 
	 */
	public void setConnectionUsername(String newValue) {
		if (newValue != null) {
			connectionUsername.setText(newValue);
		} else {
			connectionUsername.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionUsername);
		if (eefElementEditorReadOnlyState && connectionUsername.isEnabled()) {
			connectionUsername.setEnabled(false);
			connectionUsername.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionUsername.isEnabled()) {
			connectionUsername.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getConnectionPassword()
	 * 
	 */
	public String getConnectionPassword() {
		return connectionPassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setConnectionPassword(String newValue)
	 * 
	 */
	public void setConnectionPassword(String newValue) {
		if (newValue != null) {
			connectionPassword.setText(newValue);
		} else {
			connectionPassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionPassword);
		if (eefElementEditorReadOnlyState && connectionPassword.isEnabled()) {
			connectionPassword.setEnabled(false);
			connectionPassword.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionPassword.isEnabled()) {
			connectionPassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getConnectionUseTransaction()
	 * 
	 */
	public Boolean getConnectionUseTransaction() {
		return Boolean.valueOf(connectionUseTransaction.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setConnectionUseTransaction(Boolean newValue)
	 * 
	 */
	public void setConnectionUseTransaction(Boolean newValue) {
		if (newValue != null) {
			connectionUseTransaction.setSelection(newValue.booleanValue());
		} else {
			connectionUseTransaction.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Connection.connectionUseTransaction);
		if (eefElementEditorReadOnlyState && connectionUseTransaction.isEnabled()) {
			connectionUseTransaction.setEnabled(false);
			connectionUseTransaction.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionUseTransaction.isEnabled()) {
			connectionUseTransaction.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getIsRegistryBasedDriverConfig()
	 * 
	 */
	public Boolean getIsRegistryBasedDriverConfig() {
		return Boolean.valueOf(isRegistryBasedDriverConfig.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setIsRegistryBasedDriverConfig(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsRegistryBasedDriverConfig(Boolean newValue) {
		if (newValue != null) {
			isRegistryBasedDriverConfig.setSelection(newValue.booleanValue());
		} else {
			isRegistryBasedDriverConfig.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedDriverConfig);
		if (eefElementEditorReadOnlyState && isRegistryBasedDriverConfig.isEnabled()) {
			isRegistryBasedDriverConfig.setEnabled(false);
			isRegistryBasedDriverConfig.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isRegistryBasedDriverConfig.isEnabled()) {
			isRegistryBasedDriverConfig.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getIsRegistryBasedUrlConfig()
	 * 
	 */
	public Boolean getIsRegistryBasedUrlConfig() {
		return Boolean.valueOf(isRegistryBasedUrlConfig.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setIsRegistryBasedUrlConfig(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsRegistryBasedUrlConfig(Boolean newValue) {
		if (newValue != null) {
			isRegistryBasedUrlConfig.setSelection(newValue.booleanValue());
		} else {
			isRegistryBasedUrlConfig.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUrlConfig);
		if (eefElementEditorReadOnlyState && isRegistryBasedUrlConfig.isEnabled()) {
			isRegistryBasedUrlConfig.setEnabled(false);
			isRegistryBasedUrlConfig.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isRegistryBasedUrlConfig.isEnabled()) {
			isRegistryBasedUrlConfig.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getIsRegistryBasedUserConfig()
	 * 
	 */
	public Boolean getIsRegistryBasedUserConfig() {
		return Boolean.valueOf(isRegistryBasedUserConfig.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setIsRegistryBasedUserConfig(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsRegistryBasedUserConfig(Boolean newValue) {
		if (newValue != null) {
			isRegistryBasedUserConfig.setSelection(newValue.booleanValue());
		} else {
			isRegistryBasedUserConfig.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedUserConfig);
		if (eefElementEditorReadOnlyState && isRegistryBasedUserConfig.isEnabled()) {
			isRegistryBasedUserConfig.setEnabled(false);
			isRegistryBasedUserConfig.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isRegistryBasedUserConfig.isEnabled()) {
			isRegistryBasedUserConfig.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getIsRegistryBasedPassConfig()
	 * 
	 */
	public Boolean getIsRegistryBasedPassConfig() {
		return Boolean.valueOf(isRegistryBasedPassConfig.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setIsRegistryBasedPassConfig(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsRegistryBasedPassConfig(Boolean newValue) {
		if (newValue != null) {
			isRegistryBasedPassConfig.setSelection(newValue.booleanValue());
		} else {
			isRegistryBasedPassConfig.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBReportMediator.Connection.isRegistryBasedPassConfig);
		if (eefElementEditorReadOnlyState && isRegistryBasedPassConfig.isEnabled()) {
			isRegistryBasedPassConfig.setEnabled(false);
			isRegistryBasedPassConfig.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isRegistryBasedPassConfig.isEnabled()) {
			isRegistryBasedPassConfig.setEnabled(true);
		}

	}

  /**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#initSqlStatements(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSqlStatements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sqlStatements.setContentProvider(contentProvider);
		sqlStatements.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Statements.sqlStatements);
		if (eefElementEditorReadOnlyState && sqlStatements.isEnabled()) {
			sqlStatements.setEnabled(false);
			sqlStatements.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sqlStatements.isEnabled()) {
			sqlStatements.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#updateSqlStatements()
	 * 
	 */
	public void updateSqlStatements() {
	sqlStatements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#addFilterSqlStatements(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSqlStatements(ViewerFilter filter) {
		sqlStatementsFilters.add(filter);
		if (this.sqlStatements != null) {
			this.sqlStatements.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#addBusinessFilterSqlStatements(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSqlStatements(ViewerFilter filter) {
		sqlStatementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#isContainedInSqlStatementsTable(EObject element)
	 * 
	 */
	public boolean isContainedInSqlStatementsTable(EObject element) {
		return ((ReferencesTableSettings)sqlStatements.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getCommentsList()
	 * 
	 */
	public EList getCommentsList() {
		return commentsListList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setCommentsList(EList newValue)
	 * 
	 */
	public void setCommentsList(EList newValue) {
		commentsListList = newValue;
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.commentsList);
		if (eefElementEditorReadOnlyState && commentsList.isEnabled()) {
			commentsList.setEnabled(false);
			commentsList.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !commentsList.isEnabled()) {
			commentsList.setEnabled(true);
		}	
		
	}

	public void addToCommentsList(Object newValue) {
		commentsListList.add(newValue);
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToCommentsList(Object newValue) {
		commentsListList.remove(newValue);
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getReverse()
	 * 
	 */
	public Boolean getReverse() {
		return Boolean.valueOf(reverse.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setReverse(Boolean newValue)
	 * 
	 */
	public void setReverse(Boolean newValue) {
		if (newValue != null) {
			reverse.setSelection(newValue.booleanValue());
		} else {
			reverse.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.reverse);
		if (eefElementEditorReadOnlyState && reverse.isEnabled()) {
			reverse.setEnabled(false);
			reverse.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reverse.isEnabled()) {
			reverse.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getPropertyAutocommit()
	 * 
	 */
	public Enumerator getPropertyAutocommit() {
		Enumerator selection = (Enumerator) ((StructuredSelection) propertyAutocommit.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#initPropertyAutocommit(Object input, Enumerator current)
	 */
	public void initPropertyAutocommit(Object input, Enumerator current) {
		propertyAutocommit.setInput(input);
		propertyAutocommit.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyAutocommit);
		if (eefElementEditorReadOnlyState && propertyAutocommit.isEnabled()) {
			propertyAutocommit.setEnabled(false);
			propertyAutocommit.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyAutocommit.isEnabled()) {
			propertyAutocommit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setPropertyAutocommit(Enumerator newValue)
	 * 
	 */
	public void setPropertyAutocommit(Enumerator newValue) {
		propertyAutocommit.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyAutocommit);
		if (eefElementEditorReadOnlyState && propertyAutocommit.isEnabled()) {
			propertyAutocommit.setEnabled(false);
			propertyAutocommit.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyAutocommit.isEnabled()) {
			propertyAutocommit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getPropertyIsolation()
	 * 
	 */
	public Enumerator getPropertyIsolation() {
		Enumerator selection = (Enumerator) ((StructuredSelection) propertyIsolation.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#initPropertyIsolation(Object input, Enumerator current)
	 */
	public void initPropertyIsolation(Object input, Enumerator current) {
		propertyIsolation.setInput(input);
		propertyIsolation.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyIsolation);
		if (eefElementEditorReadOnlyState && propertyIsolation.isEnabled()) {
			propertyIsolation.setEnabled(false);
			propertyIsolation.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyIsolation.isEnabled()) {
			propertyIsolation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setPropertyIsolation(Enumerator newValue)
	 * 
	 */
	public void setPropertyIsolation(Enumerator newValue) {
		propertyIsolation.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyIsolation);
		if (eefElementEditorReadOnlyState && propertyIsolation.isEnabled()) {
			propertyIsolation.setEnabled(false);
			propertyIsolation.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyIsolation.isEnabled()) {
			propertyIsolation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getPropertyMaxactive()
	 * 
	 */
	public String getPropertyMaxactive() {
		return propertyMaxactive.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setPropertyMaxactive(String newValue)
	 * 
	 */
	public void setPropertyMaxactive(String newValue) {
		if (newValue != null) {
			propertyMaxactive.setText(newValue);
		} else {
			propertyMaxactive.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyMaxactive);
		if (eefElementEditorReadOnlyState && propertyMaxactive.isEnabled()) {
			propertyMaxactive.setEnabled(false);
			propertyMaxactive.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyMaxactive.isEnabled()) {
			propertyMaxactive.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getPropertyMaxidle()
	 * 
	 */
	public String getPropertyMaxidle() {
		return propertyMaxidle.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setPropertyMaxidle(String newValue)
	 * 
	 */
	public void setPropertyMaxidle(String newValue) {
		if (newValue != null) {
			propertyMaxidle.setText(newValue);
		} else {
			propertyMaxidle.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyMaxidle);
		if (eefElementEditorReadOnlyState && propertyMaxidle.isEnabled()) {
			propertyMaxidle.setEnabled(false);
			propertyMaxidle.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyMaxidle.isEnabled()) {
			propertyMaxidle.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getPropertyMaxopenstatements()
	 * 
	 */
	public String getPropertyMaxopenstatements() {
		return propertyMaxopenstatements.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setPropertyMaxopenstatements(String newValue)
	 * 
	 */
	public void setPropertyMaxopenstatements(String newValue) {
		if (newValue != null) {
			propertyMaxopenstatements.setText(newValue);
		} else {
			propertyMaxopenstatements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyMaxopenstatements);
		if (eefElementEditorReadOnlyState && propertyMaxopenstatements.isEnabled()) {
			propertyMaxopenstatements.setEnabled(false);
			propertyMaxopenstatements.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyMaxopenstatements.isEnabled()) {
			propertyMaxopenstatements.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getPropertyMaxwait()
	 * 
	 */
	public String getPropertyMaxwait() {
		return propertyMaxwait.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setPropertyMaxwait(String newValue)
	 * 
	 */
	public void setPropertyMaxwait(String newValue) {
		if (newValue != null) {
			propertyMaxwait.setText(newValue);
		} else {
			propertyMaxwait.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyMaxwait);
		if (eefElementEditorReadOnlyState && propertyMaxwait.isEnabled()) {
			propertyMaxwait.setEnabled(false);
			propertyMaxwait.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyMaxwait.isEnabled()) {
			propertyMaxwait.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getPropertyMinidle()
	 * 
	 */
	public String getPropertyMinidle() {
		return propertyMinidle.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setPropertyMinidle(String newValue)
	 * 
	 */
	public void setPropertyMinidle(String newValue) {
		if (newValue != null) {
			propertyMinidle.setText(newValue);
		} else {
			propertyMinidle.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyMinidle);
		if (eefElementEditorReadOnlyState && propertyMinidle.isEnabled()) {
			propertyMinidle.setEnabled(false);
			propertyMinidle.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyMinidle.isEnabled()) {
			propertyMinidle.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getPropertyPoolstatements()
	 * 
	 */
	public Enumerator getPropertyPoolstatements() {
		Enumerator selection = (Enumerator) ((StructuredSelection) propertyPoolstatements.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#initPropertyPoolstatements(Object input, Enumerator current)
	 */
	public void initPropertyPoolstatements(Object input, Enumerator current) {
		propertyPoolstatements.setInput(input);
		propertyPoolstatements.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyPoolstatements);
		if (eefElementEditorReadOnlyState && propertyPoolstatements.isEnabled()) {
			propertyPoolstatements.setEnabled(false);
			propertyPoolstatements.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyPoolstatements.isEnabled()) {
			propertyPoolstatements.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setPropertyPoolstatements(Enumerator newValue)
	 * 
	 */
	public void setPropertyPoolstatements(Enumerator newValue) {
		propertyPoolstatements.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyPoolstatements);
		if (eefElementEditorReadOnlyState && propertyPoolstatements.isEnabled()) {
			propertyPoolstatements.setEnabled(false);
			propertyPoolstatements.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyPoolstatements.isEnabled()) {
			propertyPoolstatements.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getPropertyTestonborrow()
	 * 
	 */
	public Enumerator getPropertyTestonborrow() {
		Enumerator selection = (Enumerator) ((StructuredSelection) propertyTestonborrow.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#initPropertyTestonborrow(Object input, Enumerator current)
	 */
	public void initPropertyTestonborrow(Object input, Enumerator current) {
		propertyTestonborrow.setInput(input);
		propertyTestonborrow.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyTestonborrow);
		if (eefElementEditorReadOnlyState && propertyTestonborrow.isEnabled()) {
			propertyTestonborrow.setEnabled(false);
			propertyTestonborrow.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyTestonborrow.isEnabled()) {
			propertyTestonborrow.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setPropertyTestonborrow(Enumerator newValue)
	 * 
	 */
	public void setPropertyTestonborrow(Enumerator newValue) {
		propertyTestonborrow.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyTestonborrow);
		if (eefElementEditorReadOnlyState && propertyTestonborrow.isEnabled()) {
			propertyTestonborrow.setEnabled(false);
			propertyTestonborrow.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyTestonborrow.isEnabled()) {
			propertyTestonborrow.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getPropertyTestwhileidle()
	 * 
	 */
	public Enumerator getPropertyTestwhileidle() {
		Enumerator selection = (Enumerator) ((StructuredSelection) propertyTestwhileidle.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#initPropertyTestwhileidle(Object input, Enumerator current)
	 */
	public void initPropertyTestwhileidle(Object input, Enumerator current) {
		propertyTestwhileidle.setInput(input);
		propertyTestwhileidle.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyTestwhileidle);
		if (eefElementEditorReadOnlyState && propertyTestwhileidle.isEnabled()) {
			propertyTestwhileidle.setEnabled(false);
			propertyTestwhileidle.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyTestwhileidle.isEnabled()) {
			propertyTestwhileidle.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setPropertyTestwhileidle(Enumerator newValue)
	 * 
	 */
	public void setPropertyTestwhileidle(Enumerator newValue) {
		propertyTestwhileidle.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyTestwhileidle);
		if (eefElementEditorReadOnlyState && propertyTestwhileidle.isEnabled()) {
			propertyTestwhileidle.setEnabled(false);
			propertyTestwhileidle.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyTestwhileidle.isEnabled()) {
			propertyTestwhileidle.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getPropertyValidationquery()
	 * 
	 */
	public String getPropertyValidationquery() {
		return propertyValidationquery.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setPropertyValidationquery(String newValue)
	 * 
	 */
	public void setPropertyValidationquery(String newValue) {
		if (newValue != null) {
			propertyValidationquery.setText(newValue);
		} else {
			propertyValidationquery.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyValidationquery);
		if (eefElementEditorReadOnlyState && propertyValidationquery.isEnabled()) {
			propertyValidationquery.setEnabled(false);
			propertyValidationquery.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyValidationquery.isEnabled()) {
			propertyValidationquery.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getPropertyInitialsize()
	 * 
	 */
	public String getPropertyInitialsize() {
		return propertyInitialsize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setPropertyInitialsize(String newValue)
	 * 
	 */
	public void setPropertyInitialsize(String newValue) {
		if (newValue != null) {
			propertyInitialsize.setText(newValue);
		} else {
			propertyInitialsize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Properties.propertyInitialsize);
		if (eefElementEditorReadOnlyState && propertyInitialsize.isEnabled()) {
			propertyInitialsize.setEnabled(false);
			propertyInitialsize.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyInitialsize.isEnabled()) {
			propertyInitialsize.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBReportMediatorPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBReportMediator.Misc.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(EsbMessages.DBReportMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EsbMessages.DBReportMediator_Part_Title;
	}

	// Start of user code additional methods
	protected Composite createRegistryBasedDriverConfigKeyWidget(FormToolkit widgetFactory, Composite parent) {
		Control registryBasedDriverConfigKeyLabel = createDescription(parent,
				EsbViewsRepository.DBReportMediator.Connection.registryBasedDriverConfigKey,
				EsbMessages.DBReportMediatorPropertiesEditionPart_RegistryBasedDriverConfigKeyLabel);
		widgetFactory.paintBordersFor(parent);
		if (registryBasedDriverConfigKey == null) {
			registryBasedDriverConfigKey = EsbFactoryImpl.eINSTANCE.createRegistryKeyProperty();
		}
		String initValueExpression = registryBasedDriverConfigKey.getKeyValue().isEmpty() ? ""
				: registryBasedDriverConfigKey.getKeyValue();
		registryBasedDriverConfigKeyText = widgetFactory.createText(parent, initValueExpression, SWT.READ_ONLY);
		registryBasedDriverConfigKeyText.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		registryBasedDriverConfigKeyText.setLayoutData(valueData);
		registryBasedDriverConfigKeyText.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent event) {
				EEFRegistryKeyPropertyEditorDialog dialog = new EEFRegistryKeyPropertyEditorDialog(view.getShell(),
						SWT.NULL, registryBasedDriverConfigKey, new ArrayList<NamedEntityDescriptor>());
				dialog.open();
				registryBasedDriverConfigKeyText.setText(registryBasedDriverConfigKey.getKeyValue());
				propertiesEditionComponent.firePropertiesChanged(
						new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
								EsbViewsRepository.DBReportMediator.Connection.registryBasedDriverConfigKey,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
								getRegistryBasedDriverConfigKey()));
			}

		});

		registryBasedDriverConfigKeyText.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (!EEFPropertyViewUtil.isReservedKeyCombination(e)) {
					EEFRegistryKeyPropertyEditorDialog dialog = new EEFRegistryKeyPropertyEditorDialog(view.getShell(),
							SWT.NULL, registryBasedDriverConfigKey, new ArrayList<NamedEntityDescriptor>());
					dialog.open();
					registryBasedDriverConfigKeyText.setText(registryBasedDriverConfigKey.getKeyValue());
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.registryBasedDriverConfigKey,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									getRegistryBasedDriverConfigKey()));
				}
			}

		});
		EditingUtils.setID(registryBasedDriverConfigKeyText,
				EsbViewsRepository.DBReportMediator.Connection.registryBasedDriverConfigKey);
		EditingUtils.setEEFtype(registryBasedDriverConfigKeyText, "eef::Text");
		Control registryBasedDriverConfigKeyHelp = FormUtils.createHelpButton(widgetFactory, parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBReportMediator.Connection.registryBasedDriverConfigKey,
						EsbViewsRepository.FORM_KIND),
				null); // $NON-NLS-1$
		registryBasedDriverConfigKeyElements = new Control[] { registryBasedDriverConfigKeyLabel,
				registryBasedDriverConfigKeyText, registryBasedDriverConfigKeyHelp };
		return parent;
	}

	protected Composite createRegistryBasedPassConfigKeyWidget(FormToolkit widgetFactory, Composite parent) {
		Control registryBasedPassConfigKeyLabel = createDescription(parent,
				EsbViewsRepository.DBReportMediator.Connection.registryBasedPassConfigKey,
				EsbMessages.DBReportMediatorPropertiesEditionPart_RegistryBasedPassConfigKeyLabel);
		widgetFactory.paintBordersFor(parent);
		if (registryBasedPassConfigKey == null) {
			registryBasedPassConfigKey = EsbFactoryImpl.eINSTANCE.createRegistryKeyProperty();
		}
		String initValueExpression = registryBasedPassConfigKey.getKeyValue().isEmpty() ? ""
				: registryBasedPassConfigKey.getKeyValue();
		registryBasedPassConfigKeyText = widgetFactory.createText(parent, initValueExpression, SWT.READ_ONLY);
		registryBasedPassConfigKeyText.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		registryBasedPassConfigKeyText.setLayoutData(valueData);
		registryBasedPassConfigKeyText.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent event) {
				EEFRegistryKeyPropertyEditorDialog dialog = new EEFRegistryKeyPropertyEditorDialog(view.getShell(),
						SWT.NULL, registryBasedPassConfigKey, new ArrayList<NamedEntityDescriptor>());
				dialog.open();
				registryBasedPassConfigKeyText.setText(registryBasedPassConfigKey.getKeyValue());
				propertiesEditionComponent.firePropertiesChanged(
						new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
								EsbViewsRepository.DBReportMediator.Connection.registryBasedPassConfigKey,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
								getRegistryBasedPassConfigKey()));
			}

		});

		registryBasedPassConfigKeyText.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (!EEFPropertyViewUtil.isReservedKeyCombination(e)) {
					EEFRegistryKeyPropertyEditorDialog dialog = new EEFRegistryKeyPropertyEditorDialog(view.getShell(),
							SWT.NULL, registryBasedPassConfigKey, new ArrayList<NamedEntityDescriptor>());
					dialog.open();
					registryBasedPassConfigKeyText.setText(registryBasedPassConfigKey.getKeyValue());
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.registryBasedPassConfigKey,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									getRegistryBasedPassConfigKey()));
				}
			}

		});
		EditingUtils.setID(registryBasedPassConfigKeyText,
				EsbViewsRepository.DBReportMediator.Connection.registryBasedPassConfigKey);
		EditingUtils.setEEFtype(registryBasedPassConfigKeyText, "eef::Text");
		Control registryBasedPassConfigKeyHelp = FormUtils.createHelpButton(widgetFactory, parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBReportMediator.Connection.registryBasedPassConfigKey,
						EsbViewsRepository.FORM_KIND),
				null); // $NON-NLS-1$
		registryBasedPassConfigKeyElements = new Control[] { registryBasedPassConfigKeyLabel,
				registryBasedPassConfigKeyText, registryBasedPassConfigKeyHelp };
		return parent;
	}

	protected Composite createRegistryBasedUserConfigKeyWidget(FormToolkit widgetFactory, Composite parent) {
		Control registryBasedUserConfigKeyLabel = createDescription(parent,
				EsbViewsRepository.DBReportMediator.Connection.registryBasedUserConfigKey,
				EsbMessages.DBReportMediatorPropertiesEditionPart_RegistryBasedUserConfigKeyLabel);
		widgetFactory.paintBordersFor(parent);
		if (registryBasedUserConfigKey == null) {
			registryBasedUserConfigKey = EsbFactoryImpl.eINSTANCE.createRegistryKeyProperty();
		}
		String initValueExpression = registryBasedUserConfigKey.getKeyValue().isEmpty() ? ""
				: registryBasedUserConfigKey.getKeyValue();
		registryBasedUserConfigKeyText = widgetFactory.createText(parent, initValueExpression, SWT.READ_ONLY);
		registryBasedUserConfigKeyText.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		registryBasedUserConfigKeyText.setLayoutData(valueData);
		registryBasedUserConfigKeyText.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent event) {
				EEFRegistryKeyPropertyEditorDialog dialog = new EEFRegistryKeyPropertyEditorDialog(view.getShell(),
						SWT.NULL, registryBasedUserConfigKey, new ArrayList<NamedEntityDescriptor>());
				dialog.open();
				registryBasedUserConfigKeyText.setText(registryBasedUserConfigKey.getKeyValue());
				propertiesEditionComponent.firePropertiesChanged(
						new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
								EsbViewsRepository.DBReportMediator.Connection.registryBasedUserConfigKey,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
								getRegistryBasedUserConfigKey()));
			}

		});

		registryBasedUserConfigKeyText.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (!EEFPropertyViewUtil.isReservedKeyCombination(e)) {
					EEFRegistryKeyPropertyEditorDialog dialog = new EEFRegistryKeyPropertyEditorDialog(view.getShell(),
							SWT.NULL, registryBasedUserConfigKey, new ArrayList<NamedEntityDescriptor>());
					dialog.open();
					registryBasedUserConfigKeyText.setText(registryBasedUserConfigKey.getKeyValue());
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.registryBasedUserConfigKey,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									getRegistryBasedUserConfigKey()));
				}
			}

		});
		EditingUtils.setID(registryBasedUserConfigKeyText,
				EsbViewsRepository.DBReportMediator.Connection.registryBasedUserConfigKey);
		EditingUtils.setEEFtype(registryBasedUserConfigKeyText, "eef::Text");
		Control registryBasedUserConfigKeyHelp = FormUtils.createHelpButton(widgetFactory, parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBReportMediator.Connection.registryBasedUserConfigKey,
						EsbViewsRepository.FORM_KIND),
				null); // $NON-NLS-1$
		registryBasedUserConfigKeyElements = new Control[] { registryBasedUserConfigKeyLabel,
				registryBasedUserConfigKeyText, registryBasedUserConfigKeyHelp };
		return parent;
	}

	protected Composite createRegistryBasedUrlConfigKeyWidget(FormToolkit widgetFactory, Composite parent) {
		Control registryBasedUrlConfigKeyLabel = createDescription(parent,
				EsbViewsRepository.DBReportMediator.Connection.registryBasedUrlConfigKey,
				EsbMessages.DBReportMediatorPropertiesEditionPart_RegistryBasedUrlConfigKeyLabel);
		widgetFactory.paintBordersFor(parent);
		if (registryBasedUrlConfigKey == null) {
			registryBasedUrlConfigKey = EsbFactoryImpl.eINSTANCE.createRegistryKeyProperty();
		}
		String initValueExpression = registryBasedUrlConfigKey.getKeyValue().isEmpty() ? ""
				: registryBasedUrlConfigKey.getKeyValue();
		registryBasedUrlConfigKeyText = widgetFactory.createText(parent, initValueExpression, SWT.READ_ONLY);
		registryBasedUrlConfigKeyText.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		registryBasedUrlConfigKeyText.setLayoutData(valueData);
		registryBasedUrlConfigKeyText.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent event) {
				EEFRegistryKeyPropertyEditorDialog dialog = new EEFRegistryKeyPropertyEditorDialog(view.getShell(),
						SWT.NULL, registryBasedUrlConfigKey, new ArrayList<NamedEntityDescriptor>());
				dialog.open();
				registryBasedUrlConfigKeyText.setText(registryBasedUrlConfigKey.getKeyValue());
				propertiesEditionComponent.firePropertiesChanged(
						new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
								EsbViewsRepository.DBReportMediator.Connection.registryBasedUrlConfigKey,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
								getRegistryBasedUrlrConfigKey()));
			}

		});

		registryBasedUrlConfigKeyText.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (!EEFPropertyViewUtil.isReservedKeyCombination(e)) {
					EEFRegistryKeyPropertyEditorDialog dialog = new EEFRegistryKeyPropertyEditorDialog(view.getShell(),
							SWT.NULL, registryBasedUrlConfigKey, new ArrayList<NamedEntityDescriptor>());
					dialog.open();
					registryBasedUrlConfigKeyText.setText(registryBasedUrlConfigKey.getKeyValue());
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBReportMediatorPropertiesEditionPartForm.this,
									EsbViewsRepository.DBReportMediator.Connection.registryBasedUrlConfigKey,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									getRegistryBasedUrlrConfigKey()));
				}
			}

		});
		EditingUtils.setID(registryBasedUrlConfigKeyText,
				EsbViewsRepository.DBReportMediator.Connection.registryBasedUrlConfigKey);
		EditingUtils.setEEFtype(registryBasedUrlConfigKeyText, "eef::Text");
		Control registryBasedUrlConfigKeyHelp = FormUtils.createHelpButton(widgetFactory, parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBReportMediator.Connection.registryBasedUrlConfigKey,
						EsbViewsRepository.FORM_KIND),
				null); // $NON-NLS-1$
		registryBasedUrlConfigKeyElements = new Control[] { registryBasedUrlConfigKeyLabel,
				registryBasedUrlConfigKeyText, registryBasedUrlConfigKeyHelp };
		return parent;
	}
    
	@Override
    public void refresh() {
        super.refresh();
        validate();
    }
	
	public void validate() {
        EEFPropertyViewUtil eu = new EEFPropertyViewUtil(view);
        eu.clearElements(new Composite[] { connectionGroup });
        eu.clearElements(new Composite[] { miscGroup });
        eu.clearElements(new Composite[] { propertiesGroup });
        
        eu.showEntry(connectionTypeElements, false);
        
        if (getConnectionType() != null && getConnectionType().getName().equals(SqlExecutorConnectionType.DATA_SOURCE.getName())) {
            eu.showEntry(connectionDsTypeElements, false);
            
            if (getConnectionDsType() != null && getConnectionDsType().getName().equals(SqlExecutorDatasourceType.EXTERNAL.getName())) {
                eu.showEntry(connectionDsInitialContextElements, false);
                
                eu.showEntry(isRegistryBasedUrlConfigElements, false);
                if (getIsRegistryBasedUrlConfig()) {
                    eu.showEntry(registryBasedUrlConfigKeyElements, false);
                } else {
                    eu.showEntry(connectionURLElements, false);
                }
                
                eu.showEntry(isRegistryBasedUserConfigElements, false);
                if (getIsRegistryBasedUserConfig()) {
                    eu.showEntry(registryBasedUserConfigKeyElements, false);
                } else {
                    eu.showEntry(connectionUsernameElements, false);
                }
                
                eu.showEntry(isRegistryBasedPassConfigElements, false);
                if (getIsRegistryBasedPassConfig()) {
                    eu.showEntry(registryBasedPassConfigKeyElements, false);
                } else {
                    eu.showEntry(connectionPasswordElements, false);
                }
                
                eu.showEntry(connectionDsNameElements, false);
                
                enablePropertiesElements(eu);
                
            } else if (getConnectionDsType() != null && getConnectionDsType().getName().equals(SqlExecutorDatasourceType.CARBON.getName())) {
                if (propertiesSection != null && propertiesSection.getLayoutData() != null) {
                    ((GridData) propertiesSection.getLayoutData()).exclude = true;
                }
                propertiesSection.setVisible(false);
                eu.showEntry(connectionDsNameElements, false);
            }
            
        } else if (getConnectionType() != null && getConnectionType().getName().equals(SqlExecutorConnectionType.DB_CONNECTION.getName())) {
            eu.showEntry(connectionDbTypeElements, false);
            
            eu.showEntry(isRegistryBasedDriverConfigElements, false);
            if (getIsRegistryBasedDriverConfig()) {
                eu.showEntry(registryBasedDriverConfigKeyElements, false);
            } else {
                eu.showEntry(connectionDbDriverElements, false);
            }
            
            eu.showEntry(isRegistryBasedUrlConfigElements, false);
            if (getIsRegistryBasedUrlConfig()) {
                eu.showEntry(registryBasedUrlConfigKeyElements, false);
            } else {
                eu.showEntry(connectionURLElements, false);
            }
            
            eu.showEntry(isRegistryBasedUserConfigElements, false);
            if (getIsRegistryBasedUserConfig()) {
                eu.showEntry(registryBasedUserConfigKeyElements, false);
            } else {
                eu.showEntry(connectionUsernameElements, false);
            }
            
            eu.showEntry(isRegistryBasedPassConfigElements, false);
            if (getIsRegistryBasedPassConfig()) {
                eu.showEntry(registryBasedPassConfigKeyElements, false);
            } else {
                eu.showEntry(connectionPasswordElements, false);
            }
            
            eu.showEntry(connectionDbConfiguration, false);
            
            enablePropertiesElements(eu);
        }
        eu.showEntry(connectionUserTransactionElements, false);
        eu.showEntry(descriptionElements, false);
        
        view.layout(true, true);
    }
    
    private void enablePropertiesElements(EEFPropertyViewUtil eu) {
        eu.showEntry(propertyAutoCommitElements, false);
        eu.showEntry(propertyIsolationElements, false);
        eu.showEntry(propertyMaxActiveElements, false);
        eu.showEntry(propertyMaxIdleElements, false);
        eu.showEntry(propertyMaxOpenStatementsElements, false);
        eu.showEntry(propertyMaxWaitElements, false);
        eu.showEntry(propertyMinIdelElements, false);
        eu.showEntry(propertyPoolstatementsElements, false);
        eu.showEntry(propertyTestOnBorrowElements, false);
        eu.showEntry(propertyTestWhileIdelElements, false);
        eu.showEntry(propertyValidationQueryElements, false);
        eu.showEntry(propertyInitialSizeElements, false);
    }
	
    private void fillDbConnectionDefaultValues() {
        String dbDriver = "";
        String dbURL = "";
        String dbUsername = "";
        if (getConnectionDbType() != null) {
            switch (getConnectionDbType().getName()) {
            case "MYSQL":
                dbDriver = TXT_DATABASE_DRIVER_MYSQL;
                dbURL = TXT_DATABASE_CONNECTION_URL_MYSQL;
                dbUsername = TXT_DATABASE_USER_MYSQL;
                break;
            case "ORACLE":
                dbDriver = TXT_DATABASE_DRIVER_ORACLE;
                dbURL = TXT_DATABASE_CONNECTION_URL_ORACLE;
                dbUsername = TXT_DATABASE_USER_ORACLE;
                break;
            case "MSSQL":
                dbDriver = TXT_DATABASE_DRIVER_MSSQL;
                dbURL = TXT_DATABASE_CONNECTION_URL_MSSQL;
                dbUsername = TXT_DATABASE_USER_MSSQL;
                break;
            case "POSTGRESQL":
                dbDriver = TXT_DATABASE_DRIVER_POSTGRESQL;
                dbURL = TXT_DATABASE_CONNECTION_URL_POSTGRESQL;
                dbUsername = TXT_DATABASE_USER_POSTGRESQL;
                break;
            }
        }
        
        //db driver
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
                DBReportMediatorPropertiesEditionPartForm.this,
                EsbViewsRepository.DBReportMediator.Connection.connectionDbDriver,
                PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dbDriver));
        propertiesEditionComponent
                .firePropertiesChanged(new PropertiesEditionEvent(
                        DBReportMediatorPropertiesEditionPartForm.this,
                        EsbViewsRepository.DBReportMediator.Connection.connectionDbDriver,
                        PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
                        null, dbDriver));
        
        //db url
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
                DBReportMediatorPropertiesEditionPartForm.this,
                EsbViewsRepository.DBReportMediator.Connection.connectionURL,
                PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dbURL));
        propertiesEditionComponent
                .firePropertiesChanged(new PropertiesEditionEvent(
                        DBReportMediatorPropertiesEditionPartForm.this,
                        EsbViewsRepository.DBReportMediator.Connection.connectionURL,
                        PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
                        null, dbURL));
        
        //db username
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
                DBReportMediatorPropertiesEditionPartForm.this,
                EsbViewsRepository.DBReportMediator.Connection.connectionUsername,
                PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dbUsername));
        propertiesEditionComponent
                .firePropertiesChanged(new PropertiesEditionEvent(
                        DBReportMediatorPropertiesEditionPartForm.this,
                        EsbViewsRepository.DBReportMediator.Connection.connectionUsername,
                        PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
                        null, dbUsername));
        
        
    }
    
	@Override
	public RegistryKeyProperty getRegistryBasedDriverConfigKey() {
		return registryBasedDriverConfigKey;
	}

	@Override
	public void setRegistryBasedDriverConfigKey(RegistryKeyProperty registryKeyProperty) {
		if (registryKeyProperty != null) {
			registryBasedDriverConfigKeyText.setText(registryKeyProperty.getKeyValue());
			registryBasedDriverConfigKey = registryKeyProperty;
		}
	}

	@Override
	public RegistryKeyProperty getRegistryBasedUrlrConfigKey() {
		return registryBasedUrlConfigKey;
	}

	@Override
	public void setRegistryBasedUrlConfigKey(RegistryKeyProperty registryKeyProperty) {
		if (registryKeyProperty != null) {
			registryBasedUrlConfigKeyText.setText(registryKeyProperty.getKeyValue());
			registryBasedUrlConfigKey = registryKeyProperty;
		}
	}

	@Override
	public RegistryKeyProperty getRegistryBasedUserConfigKey() {
		return registryBasedUserConfigKey;
	}

	@Override
	public void setRegistryBasedUserConfigKey(RegistryKeyProperty registryKeyProperty) {
		if (registryKeyProperty != null) {
			registryBasedUserConfigKeyText.setText(registryKeyProperty.getKeyValue());
			registryBasedUserConfigKey = registryKeyProperty;
		}
	}

	@Override
	public RegistryKeyProperty getRegistryBasedPassConfigKey() {
		return registryBasedPassConfigKey;
	}

	@Override
	public void setRegistryBasedPassConfigKey(RegistryKeyProperty registryKeyProperty) {
		if (registryKeyProperty != null) {
			registryBasedPassConfigKeyText.setText(registryKeyProperty.getKeyValue());
			registryBasedPassConfigKey = registryKeyProperty;
		}
	}
	// End of user code


}
