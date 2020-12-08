/**
 * Generated with Acceleo
 */
package org.wso2.integrationstudio.eclipse.gmf.esb.parts.impl;

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

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import org.wso2.integrationstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.integrationstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart;
import org.wso2.integrationstudio.eclipse.gmf.esb.parts.EsbViewsRepository;

import org.wso2.integrationstudio.eclipse.gmf.esb.providers.EsbMessages;

// End of user code

/**
 * 
 * 
 */
public class DBLookupMediatorPropertiesEditionPartImpl extends CompositePropertiesEditionPart
		implements ISWTPropertiesEditionPart, DBLookupMediatorPropertiesEditionPart {

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
	protected EMFComboViewer connectionType;
	protected EMFComboViewer connectionDsType;
	protected Text connectionDsInitialContext;
	protected EMFComboViewer connectionDbType;
	protected Text connectionDbDriver;
	protected Text connectionDsName;
	protected Text connectionURL;
	protected Text connectionUsername;
	protected Text connectionPassword;
	protected Button isRegistryBasedDriverConfig;
	protected Button isRegistryBasedUrlConfig;
	protected Button isRegistryBasedUserConfig;
	protected Button isRegistryBasedPassConfig;
	// Start of user code for Database Configuration widgets declarations

	// End of user code

	protected ReferencesTable sqlStatements;
	protected List<ViewerFilter> sqlStatementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sqlStatementsFilters = new ArrayList<ViewerFilter>();

	/**
	 * Default constructor
	 * 
	 * @param editionComponent
	 *            the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DBLookupMediatorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 *      createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 *      createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) {
		CompositionSequence dBLookupMediatorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = dBLookupMediatorStep
				.addStep(EsbViewsRepository.DBLookupMediator.Properties.class);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.commentsList);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.reverse);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.propertyAutocommit);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.propertyIsolation);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.propertyMaxactive);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.propertyMaxidle);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.propertyMaxopenstatements);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.propertyMaxwait);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.propertyMinidle);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.propertyPoolstatements);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.propertyTestonborrow);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.propertyTestwhileidle);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.propertyValidationquery);
		propertiesStep.addStep(EsbViewsRepository.DBLookupMediator.Properties.propertyInitialsize);

		dBLookupMediatorStep.addStep(EsbViewsRepository.DBLookupMediator.Misc.class)
				.addStep(EsbViewsRepository.DBLookupMediator.Misc.description);

		CompositionStep connectionStep = dBLookupMediatorStep
				.addStep(EsbViewsRepository.DBLookupMediator.Connection.class);
		connectionStep.addStep(EsbViewsRepository.DBLookupMediator.Connection.connectionType);
		connectionStep.addStep(EsbViewsRepository.DBLookupMediator.Connection.connectionDsType);
		connectionStep.addStep(EsbViewsRepository.DBLookupMediator.Connection.connectionDsInitialContext);
		connectionStep.addStep(EsbViewsRepository.DBLookupMediator.Connection.connectionDbType);
		connectionStep.addStep(EsbViewsRepository.DBLookupMediator.Connection.connectionDbDriver);
		connectionStep.addStep(EsbViewsRepository.DBLookupMediator.Connection.connectionDsName);
		connectionStep.addStep(EsbViewsRepository.DBLookupMediator.Connection.connectionURL);
		connectionStep.addStep(EsbViewsRepository.DBLookupMediator.Connection.connectionUsername);
		connectionStep.addStep(EsbViewsRepository.DBLookupMediator.Connection.connectionPassword);
		connectionStep.addStep(EsbViewsRepository.DBLookupMediator.Connection.databaseConfiguration);

		dBLookupMediatorStep.addStep(EsbViewsRepository.DBLookupMediator.Statements.class)
				.addStep(EsbViewsRepository.DBLookupMediator.Statements.sqlStatements);

		composer = new PartComposer(dBLookupMediatorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EsbViewsRepository.DBLookupMediator.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.commentsList) {
					return createCommentsListMultiValuedEditor(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.reverse) {
					return createReverseCheckbox(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.propertyAutocommit) {
					return createPropertyAutocommitEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.propertyIsolation) {
					return createPropertyIsolationEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.propertyMaxactive) {
					return createPropertyMaxactiveText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.propertyMaxidle) {
					return createPropertyMaxidleText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.propertyMaxopenstatements) {
					return createPropertyMaxopenstatementsText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.propertyMaxwait) {
					return createPropertyMaxwaitText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.propertyMinidle) {
					return createPropertyMinidleText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.propertyPoolstatements) {
					return createPropertyPoolstatementsEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.propertyTestonborrow) {
					return createPropertyTestonborrowEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.propertyTestwhileidle) {
					return createPropertyTestwhileidleEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.propertyValidationquery) {
					return createPropertyValidationqueryText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Properties.propertyInitialsize) {
					return createPropertyInitialsizeText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Misc.class) {
					return createMiscGroup(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Misc.description) {
					return createDescriptionText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Connection.class) {
					return createConnectionGroup(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Connection.connectionType) {
					return createConnectionTypeEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Connection.connectionDsType) {
					return createConnectionDsTypeEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Connection.connectionDsInitialContext) {
					return createConnectionDsInitialContextText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Connection.connectionDbType) {
					return createConnectionDbTypeEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Connection.connectionDbDriver) {
					return createConnectionDbDriverText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Connection.connectionDsName) {
					return createConnectionDsNameText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Connection.connectionURL) {
					return createConnectionURLText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Connection.connectionUsername) {
					return createConnectionUsernameText(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Connection.connectionPassword) {
					return createConnectionPasswordText(parent);
				}
				// Start of user code for Database Configuration addToPart creation

				// End of user code
				if (key == EsbViewsRepository.DBLookupMediator.Statements.class) {
					return createStatementsGroup(parent);
				}
				if (key == EsbViewsRepository.DBLookupMediator.Statements.sqlStatements) {
					return createSqlStatementsAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	protected Composite createCommentsListMultiValuedEditor(Composite parent) {
		commentsList = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData commentsListData = new GridData(GridData.FILL_HORIZONTAL);
		commentsListData.horizontalSpan = 2;
		commentsList.setLayoutData(commentsListData);
		EditingUtils.setID(commentsList, EsbViewsRepository.DBLookupMediator.Properties.commentsList);
		EditingUtils.setEEFtype(commentsList, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editCommentsList = new Button(parent, SWT.NONE);
		editCommentsList.setText(getDescription(EsbViewsRepository.DBLookupMediator.Properties.commentsList,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_CommentsListLabel));
		GridData editCommentsListData = new GridData();
		editCommentsList.setLayoutData(editCommentsListData);
		editCommentsList.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(commentsList.getShell(), "DBLookupMediator", //$NON-NLS-1$
						new AdapterFactoryLabelProvider(adapterFactory), commentsListList, EsbPackage.eINSTANCE.getEsbElement_CommentsList().getEType(), null, false,
						true, null, null);
				if (dialog.open() == Window.OK) {
					commentsListList = dialog.getResult();
					if (commentsListList == null) {
						commentsListList = new BasicEList();
					}
					commentsList.setText(commentsListList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBLookupMediatorPropertiesEditionPartImpl.this,
							EsbViewsRepository.DBLookupMediator.Properties.commentsList, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, new BasicEList(commentsListList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editCommentsList, EsbViewsRepository.DBLookupMediator.Properties.commentsList);
		EditingUtils.setEEFtype(editCommentsList, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createCommentsListMultiValuedEditor

		// End of user code
		return parent;
	}

	protected Composite createReverseCheckbox(Composite parent) {
		reverse = new Button(parent, SWT.CHECK);
		reverse.setText(getDescription(EsbViewsRepository.DBLookupMediator.Properties.reverse,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_ReverseLabel));
		reverse.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBLookupMediatorPropertiesEditionPartImpl.this,
							EsbViewsRepository.DBLookupMediator.Properties.reverse, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, new Boolean(reverse.getSelection())));
			}

		});
		GridData reverseData = new GridData(GridData.FILL_HORIZONTAL);
		reverseData.horizontalSpan = 2;
		reverse.setLayoutData(reverseData);
		EditingUtils.setID(reverse, EsbViewsRepository.DBLookupMediator.Properties.reverse);
		EditingUtils.setEEFtype(reverse, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				EsbViewsRepository.DBLookupMediator.Properties.reverse, EsbViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createReverseCheckbox

		// End of user code
		return parent;
	}

	/**
	 * @generated NOT
	 */
	protected Composite createPropertyAutocommitEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Properties.propertyAutocommit,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertyAutocommitLabel);
		propertyAutocommit = new EMFComboViewer(parent);
		propertyAutocommit.setContentProvider(new ArrayContentProvider());
		propertyAutocommit
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBLookupMediatorPropertiesEditionPartImpl.this,
							EsbViewsRepository.DBLookupMediator.Properties.propertyAutocommit,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPropertyAutocommit()));
			}

		});
		propertyAutocommit.setID(EsbViewsRepository.DBLookupMediator.Properties.propertyAutocommit);
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Properties.propertyAutocommit, EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createPropertyAutocommitEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated NOT
	 */
	protected Composite createPropertyIsolationEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Properties.propertyIsolation,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertyIsolationLabel);
		propertyIsolation = new EMFComboViewer(parent);
		propertyIsolation.setContentProvider(new ArrayContentProvider());
		propertyIsolation
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBLookupMediatorPropertiesEditionPartImpl.this,
							EsbViewsRepository.DBLookupMediator.Properties.propertyIsolation,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPropertyIsolation()));
			}

		});
		propertyIsolation.setID(EsbViewsRepository.DBLookupMediator.Properties.propertyIsolation);
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Properties.propertyIsolation, EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createPropertyIsolationEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createPropertyMaxactiveText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Properties.propertyMaxactive,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertyMaxactiveLabel);
		propertyMaxactive = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData propertyMaxactiveData = new GridData(GridData.FILL_HORIZONTAL);
		propertyMaxactive.setLayoutData(propertyMaxactiveData);
		propertyMaxactive.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Properties.propertyMaxactive,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									propertyMaxactive.getText()));
			}

		});
		propertyMaxactive.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Properties.propertyMaxactive,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										propertyMaxactive.getText()));
				}
			}

		});
		EditingUtils.setID(propertyMaxactive, EsbViewsRepository.DBLookupMediator.Properties.propertyMaxactive);
		EditingUtils.setEEFtype(propertyMaxactive, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Properties.propertyMaxactive, EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createPropertyMaxactiveText

		// End of user code
		return parent;
	}

	protected Composite createPropertyMaxidleText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Properties.propertyMaxidle,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertyMaxidleLabel);
		propertyMaxidle = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData propertyMaxidleData = new GridData(GridData.FILL_HORIZONTAL);
		propertyMaxidle.setLayoutData(propertyMaxidleData);
		propertyMaxidle.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Properties.propertyMaxidle,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									propertyMaxidle.getText()));
			}

		});
		propertyMaxidle.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Properties.propertyMaxidle,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										propertyMaxidle.getText()));
				}
			}

		});
		EditingUtils.setID(propertyMaxidle, EsbViewsRepository.DBLookupMediator.Properties.propertyMaxidle);
		EditingUtils.setEEFtype(propertyMaxidle, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Properties.propertyMaxidle, EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createPropertyMaxidleText

		// End of user code
		return parent;
	}

	protected Composite createPropertyMaxopenstatementsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Properties.propertyMaxopenstatements,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertyMaxopenstatementsLabel);
		propertyMaxopenstatements = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData propertyMaxopenstatementsData = new GridData(GridData.FILL_HORIZONTAL);
		propertyMaxopenstatements.setLayoutData(propertyMaxopenstatementsData);
		propertyMaxopenstatements.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Properties.propertyMaxopenstatements,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									propertyMaxopenstatements.getText()));
			}

		});
		propertyMaxopenstatements.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Properties.propertyMaxopenstatements,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										propertyMaxopenstatements.getText()));
				}
			}

		});
		EditingUtils.setID(propertyMaxopenstatements,
				EsbViewsRepository.DBLookupMediator.Properties.propertyMaxopenstatements);
		EditingUtils.setEEFtype(propertyMaxopenstatements, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Properties.propertyMaxopenstatements,
						EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createPropertyMaxopenstatementsText

		// End of user code
		return parent;
	}

	protected Composite createPropertyMaxwaitText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Properties.propertyMaxwait,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertyMaxwaitLabel);
		propertyMaxwait = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData propertyMaxwaitData = new GridData(GridData.FILL_HORIZONTAL);
		propertyMaxwait.setLayoutData(propertyMaxwaitData);
		propertyMaxwait.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Properties.propertyMaxwait,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									propertyMaxwait.getText()));
			}

		});
		propertyMaxwait.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Properties.propertyMaxwait,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										propertyMaxwait.getText()));
				}
			}

		});
		EditingUtils.setID(propertyMaxwait, EsbViewsRepository.DBLookupMediator.Properties.propertyMaxwait);
		EditingUtils.setEEFtype(propertyMaxwait, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Properties.propertyMaxwait, EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createPropertyMaxwaitText

		// End of user code
		return parent;
	}

	protected Composite createPropertyMinidleText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Properties.propertyMinidle,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertyMinidleLabel);
		propertyMinidle = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData propertyMinidleData = new GridData(GridData.FILL_HORIZONTAL);
		propertyMinidle.setLayoutData(propertyMinidleData);
		propertyMinidle.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Properties.propertyMinidle,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									propertyMinidle.getText()));
			}

		});
		propertyMinidle.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Properties.propertyMinidle,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										propertyMinidle.getText()));
				}
			}

		});
		EditingUtils.setID(propertyMinidle, EsbViewsRepository.DBLookupMediator.Properties.propertyMinidle);
		EditingUtils.setEEFtype(propertyMinidle, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Properties.propertyMinidle, EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createPropertyMinidleText

		// End of user code
		return parent;
	}

	/**
	 * @generated NOT
	 */
	protected Composite createPropertyPoolstatementsEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Properties.propertyPoolstatements,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertyPoolstatementsLabel);
		propertyPoolstatements = new EMFComboViewer(parent);
		propertyPoolstatements.setContentProvider(new ArrayContentProvider());
		propertyPoolstatements
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Properties.propertyPoolstatements,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									getPropertyPoolstatements()));
			}

		});
		propertyPoolstatements.setID(EsbViewsRepository.DBLookupMediator.Properties.propertyPoolstatements);
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Properties.propertyPoolstatements,
						EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createPropertyPoolstatementsEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated NOT
	 */
	protected Composite createPropertyTestonborrowEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Properties.propertyTestonborrow,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertyTestonborrowLabel);
		propertyTestonborrow = new EMFComboViewer(parent);
		propertyTestonborrow.setContentProvider(new ArrayContentProvider());
		propertyTestonborrow
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Properties.propertyTestonborrow,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									getPropertyTestonborrow()));
			}

		});
		propertyTestonborrow.setID(EsbViewsRepository.DBLookupMediator.Properties.propertyTestonborrow);
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Properties.propertyTestonborrow,
						EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createPropertyTestonborrowEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated NOT
	 */
	protected Composite createPropertyTestwhileidleEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Properties.propertyTestwhileidle,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertyTestwhileidleLabel);
		propertyTestwhileidle = new EMFComboViewer(parent);
		propertyTestwhileidle.setContentProvider(new ArrayContentProvider());
		propertyTestwhileidle
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Properties.propertyTestwhileidle,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									getPropertyTestwhileidle()));
			}

		});
		propertyTestwhileidle.setID(EsbViewsRepository.DBLookupMediator.Properties.propertyTestwhileidle);
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Properties.propertyTestwhileidle,
						EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createPropertyTestwhileidleEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createPropertyValidationqueryText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Properties.propertyValidationquery,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertyValidationqueryLabel);
		propertyValidationquery = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData propertyValidationqueryData = new GridData(GridData.FILL_HORIZONTAL);
		propertyValidationquery.setLayoutData(propertyValidationqueryData);
		propertyValidationquery.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Properties.propertyValidationquery,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									propertyValidationquery.getText()));
			}

		});
		propertyValidationquery.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Properties.propertyValidationquery,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										propertyValidationquery.getText()));
				}
			}

		});
		EditingUtils.setID(propertyValidationquery,
				EsbViewsRepository.DBLookupMediator.Properties.propertyValidationquery);
		EditingUtils.setEEFtype(propertyValidationquery, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Properties.propertyValidationquery,
						EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createPropertyValidationqueryText

		// End of user code
		return parent;
	}

	protected Composite createPropertyInitialsizeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Properties.propertyInitialsize,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_PropertyInitialsizeLabel);
		propertyInitialsize = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData propertyInitialsizeData = new GridData(GridData.FILL_HORIZONTAL);
		propertyInitialsize.setLayoutData(propertyInitialsizeData);
		propertyInitialsize.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Properties.propertyInitialsize,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									propertyInitialsize.getText()));
			}

		});
		propertyInitialsize.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Properties.propertyInitialsize,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										propertyInitialsize.getText()));
				}
			}

		});
		EditingUtils.setID(propertyInitialsize, EsbViewsRepository.DBLookupMediator.Properties.propertyInitialsize);
		EditingUtils.setEEFtype(propertyInitialsize, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				EsbViewsRepository.DBLookupMediator.Properties.propertyInitialsize, EsbViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createPropertyInitialsizeText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createMiscGroup(Composite parent) {
		Group miscGroup = new Group(parent, SWT.NONE);
		miscGroup.setText(EsbMessages.DBLookupMediatorPropertiesEditionPart_MiscGroupLabel);
		GridData miscGroupData = new GridData(GridData.FILL_HORIZONTAL);
		miscGroupData.horizontalSpan = 3;
		miscGroup.setLayoutData(miscGroupData);
		GridLayout miscGroupLayout = new GridLayout();
		miscGroupLayout.numColumns = 3;
		miscGroup.setLayout(miscGroupLayout);
		return miscGroup;
	}

	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Misc.description,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_DescriptionLabel);
		description = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Misc.description, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								DBLookupMediatorPropertiesEditionPartImpl.this,
								EsbViewsRepository.DBLookupMediator.Misc.description, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, EsbViewsRepository.DBLookupMediator.Misc.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				EsbViewsRepository.DBLookupMediator.Misc.description, EsbViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createConnectionGroup(Composite parent) {
		Group connectionGroup = new Group(parent, SWT.NONE);
		connectionGroup.setText(EsbMessages.DBLookupMediatorPropertiesEditionPart_ConnectionGroupLabel);
		GridData connectionGroupData = new GridData(GridData.FILL_HORIZONTAL);
		connectionGroupData.horizontalSpan = 3;
		connectionGroup.setLayoutData(connectionGroupData);
		GridLayout connectionGroupLayout = new GridLayout();
		connectionGroupLayout.numColumns = 3;
		connectionGroup.setLayout(connectionGroupLayout);
		return connectionGroup;
	}

	/**
	 * @generated NOT
	 */
	protected Composite createConnectionTypeEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Connection.connectionType,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_ConnectionTypeLabel);
		connectionType = new EMFComboViewer(parent);
		connectionType.setContentProvider(new ArrayContentProvider());
		connectionType
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBLookupMediatorPropertiesEditionPartImpl.this,
							EsbViewsRepository.DBLookupMediator.Connection.connectionType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConnectionType()));
			}

		});
		connectionType.setID(EsbViewsRepository.DBLookupMediator.Connection.connectionType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				EsbViewsRepository.DBLookupMediator.Connection.connectionType, EsbViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createConnectionTypeEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated NOT
	 */
	protected Composite createConnectionDsTypeEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Connection.connectionDsType,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_ConnectionDsTypeLabel);
		connectionDsType = new EMFComboViewer(parent);
		connectionDsType.setContentProvider(new ArrayContentProvider());
		connectionDsType
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBLookupMediatorPropertiesEditionPartImpl.this,
							EsbViewsRepository.DBLookupMediator.Connection.connectionDsType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConnectionDsType()));
			}

		});
		connectionDsType.setID(EsbViewsRepository.DBLookupMediator.Connection.connectionDsType);
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Connection.connectionDsType, EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createConnectionDsTypeEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createConnectionDsInitialContextText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Connection.connectionDsInitialContext,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_ConnectionDsInitialContextLabel);
		connectionDsInitialContext = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData connectionDsInitialContextData = new GridData(GridData.FILL_HORIZONTAL);
		connectionDsInitialContext.setLayoutData(connectionDsInitialContextData);
		connectionDsInitialContext.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Connection.connectionDsInitialContext,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									connectionDsInitialContext.getText()));
			}

		});
		connectionDsInitialContext.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Connection.connectionDsInitialContext,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										connectionDsInitialContext.getText()));
				}
			}

		});
		EditingUtils.setID(connectionDsInitialContext,
				EsbViewsRepository.DBLookupMediator.Connection.connectionDsInitialContext);
		EditingUtils.setEEFtype(connectionDsInitialContext, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Connection.connectionDsInitialContext,
						EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createConnectionDsInitialContextText

		// End of user code
		return parent;
	}

	/**
	 * @generated NOT
	 */
	protected Composite createConnectionDbTypeEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Connection.connectionDbType,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_ConnectionDbTypeLabel);
		connectionDbType = new EMFComboViewer(parent);
		connectionDbType.setContentProvider(new ArrayContentProvider());
		connectionDbType
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBLookupMediatorPropertiesEditionPartImpl.this,
							EsbViewsRepository.DBLookupMediator.Connection.connectionDbType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConnectionDbType()));
			}

		});
		connectionDbType.setID(EsbViewsRepository.DBLookupMediator.Connection.connectionDbType);
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Connection.connectionDbType, EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createConnectionDbTypeEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createConnectionDbDriverText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Connection.connectionDbDriver,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_ConnectionDbDriverLabel);
		connectionDbDriver = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData connectionDbDriverData = new GridData(GridData.FILL_HORIZONTAL);
		connectionDbDriver.setLayoutData(connectionDbDriverData);
		connectionDbDriver.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Connection.connectionDbDriver,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									connectionDbDriver.getText()));
			}

		});
		connectionDbDriver.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Connection.connectionDbDriver,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										connectionDbDriver.getText()));
				}
			}

		});
		EditingUtils.setID(connectionDbDriver, EsbViewsRepository.DBLookupMediator.Connection.connectionDbDriver);
		EditingUtils.setEEFtype(connectionDbDriver, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Connection.connectionDbDriver, EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createConnectionDbDriverText

		// End of user code
		return parent;
	}

	protected Composite createConnectionDsNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Connection.connectionDsName,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_ConnectionDsNameLabel);
		connectionDsName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData connectionDsNameData = new GridData(GridData.FILL_HORIZONTAL);
		connectionDsName.setLayoutData(connectionDsNameData);
		connectionDsName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Connection.connectionDsName,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									connectionDsName.getText()));
			}

		});
		connectionDsName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Connection.connectionDsName,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										connectionDsName.getText()));
				}
			}

		});
		EditingUtils.setID(connectionDsName, EsbViewsRepository.DBLookupMediator.Connection.connectionDsName);
		EditingUtils.setEEFtype(connectionDsName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Connection.connectionDsName, EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createConnectionDsNameText

		// End of user code
		return parent;
	}

	protected Composite createConnectionURLText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Connection.connectionURL,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_ConnectionURLLabel);
		connectionURL = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData connectionURLData = new GridData(GridData.FILL_HORIZONTAL);
		connectionURL.setLayoutData(connectionURLData);
		connectionURL.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBLookupMediatorPropertiesEditionPartImpl.this,
							EsbViewsRepository.DBLookupMediator.Connection.connectionURL, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, connectionURL.getText()));
			}

		});
		connectionURL.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Connection.connectionURL,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										connectionURL.getText()));
				}
			}

		});
		EditingUtils.setID(connectionURL, EsbViewsRepository.DBLookupMediator.Connection.connectionURL);
		EditingUtils.setEEFtype(connectionURL, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				EsbViewsRepository.DBLookupMediator.Connection.connectionURL, EsbViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createConnectionURLText

		// End of user code
		return parent;
	}

	protected Composite createConnectionUsernameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Connection.connectionUsername,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_ConnectionUsernameLabel);
		connectionUsername = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData connectionUsernameData = new GridData(GridData.FILL_HORIZONTAL);
		connectionUsername.setLayoutData(connectionUsernameData);
		connectionUsername.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Connection.connectionUsername,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									connectionUsername.getText()));
			}

		});
		connectionUsername.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Connection.connectionUsername,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										connectionUsername.getText()));
				}
			}

		});
		EditingUtils.setID(connectionUsername, EsbViewsRepository.DBLookupMediator.Connection.connectionUsername);
		EditingUtils.setEEFtype(connectionUsername, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Connection.connectionUsername, EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createConnectionUsernameText

		// End of user code
		return parent;
	}

	protected Composite createConnectionPasswordText(Composite parent) {
		createDescription(parent, EsbViewsRepository.DBLookupMediator.Connection.connectionPassword,
				EsbMessages.DBLookupMediatorPropertiesEditionPart_ConnectionPasswordLabel);
		connectionPassword = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData connectionPasswordData = new GridData(GridData.FILL_HORIZONTAL);
		connectionPassword.setLayoutData(connectionPasswordData);
		connectionPassword.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Connection.connectionPassword,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									connectionPassword.getText()));
			}

		});
		connectionPassword.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Connection.connectionPassword,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										connectionPassword.getText()));
				}
			}

		});
		EditingUtils.setID(connectionPassword, EsbViewsRepository.DBLookupMediator.Connection.connectionPassword);
		EditingUtils.setEEFtype(connectionPassword, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Connection.connectionPassword, EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createConnectionPasswordText

		// End of user code
		return parent;
	}

	protected Composite createIsRegistryBasedDriverConfigCheckbox(Composite parent) {
		isRegistryBasedDriverConfig = new Button(parent, SWT.CHECK);
		isRegistryBasedDriverConfig
				.setText(getDescription(EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedDriverConfig,
						EsbMessages.DBLookupMediatorPropertiesEditionPart_IsRegistryBasedDriverConfigLabel));
		isRegistryBasedDriverConfig.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedDriverConfig,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									new Boolean(isRegistryBasedDriverConfig.getSelection())));
			}

		});
		GridData isRegistryBasedDriverConfigData = new GridData(GridData.FILL_HORIZONTAL);
		isRegistryBasedDriverConfigData.horizontalSpan = 2;
		isRegistryBasedDriverConfig.setLayoutData(isRegistryBasedDriverConfigData);
		EditingUtils.setID(isRegistryBasedDriverConfig,
				EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedDriverConfig);
		EditingUtils.setEEFtype(isRegistryBasedDriverConfig, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedDriverConfig,
						EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createIsRegistryBasedDriverConfigCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsRegistryBasedUrlConfigCheckbox(Composite parent) {
		isRegistryBasedUrlConfig = new Button(parent, SWT.CHECK);
		isRegistryBasedUrlConfig
				.setText(getDescription(EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedUrlConfig,
						EsbMessages.DBLookupMediatorPropertiesEditionPart_IsRegistryBasedUrlConfigLabel));
		isRegistryBasedUrlConfig.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedUrlConfig,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									new Boolean(isRegistryBasedUrlConfig.getSelection())));
			}

		});
		GridData isRegistryBasedUrlConfigData = new GridData(GridData.FILL_HORIZONTAL);
		isRegistryBasedUrlConfigData.horizontalSpan = 2;
		isRegistryBasedUrlConfig.setLayoutData(isRegistryBasedUrlConfigData);
		EditingUtils.setID(isRegistryBasedUrlConfig,
				EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedUrlConfig);
		EditingUtils.setEEFtype(isRegistryBasedUrlConfig, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedUrlConfig,
						EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createIsRegistryBasedUrlConfigCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsRegistryBasedUserConfigCheckbox(Composite parent) {
		isRegistryBasedUserConfig = new Button(parent, SWT.CHECK);
		isRegistryBasedUserConfig
				.setText(getDescription(EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedUserConfig,
						EsbMessages.DBLookupMediatorPropertiesEditionPart_IsRegistryBasedUserConfigLabel));
		isRegistryBasedUserConfig.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedUserConfig,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									new Boolean(isRegistryBasedUserConfig.getSelection())));
			}

		});
		GridData isRegistryBasedUserConfigData = new GridData(GridData.FILL_HORIZONTAL);
		isRegistryBasedUserConfigData.horizontalSpan = 2;
		isRegistryBasedUserConfig.setLayoutData(isRegistryBasedUserConfigData);
		EditingUtils.setID(isRegistryBasedUserConfig,
				EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedUserConfig);
		EditingUtils.setEEFtype(isRegistryBasedUserConfig, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedUserConfig,
						EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createIsRegistryBasedUserConfigCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsRegistryBasedPassConfigCheckbox(Composite parent) {
		isRegistryBasedPassConfig = new Button(parent, SWT.CHECK);
		isRegistryBasedPassConfig
				.setText(getDescription(EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedPassConfig,
						EsbMessages.DBLookupMediatorPropertiesEditionPart_IsRegistryBasedPassConfigLabel));
		isRegistryBasedPassConfig.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(
							new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
									EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedPassConfig,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									new Boolean(isRegistryBasedPassConfig.getSelection())));
			}

		});
		GridData isRegistryBasedPassConfigData = new GridData(GridData.FILL_HORIZONTAL);
		isRegistryBasedPassConfigData.horizontalSpan = 2;
		isRegistryBasedPassConfig.setLayoutData(isRegistryBasedPassConfigData);
		EditingUtils.setID(isRegistryBasedPassConfig,
				EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedPassConfig);
		EditingUtils.setEEFtype(isRegistryBasedPassConfig, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedPassConfig,
						EsbViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for createIsRegistryBasedPassConfigCheckbox

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createStatementsGroup(Composite parent) {
		Group statementsGroup = new Group(parent, SWT.NONE);
		statementsGroup.setText(EsbMessages.DBLookupMediatorPropertiesEditionPart_StatementsGroupLabel);
		GridData statementsGroupData = new GridData(GridData.FILL_HORIZONTAL);
		statementsGroupData.horizontalSpan = 3;
		statementsGroup.setLayoutData(statementsGroupData);
		GridLayout statementsGroupLayout = new GridLayout();
		statementsGroupLayout.numColumns = 3;
		statementsGroup.setLayout(statementsGroupLayout);
		return statementsGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSqlStatementsAdvancedTableComposition(Composite parent) {
		this.sqlStatements = new ReferencesTable(
				getDescription(EsbViewsRepository.DBLookupMediator.Statements.sqlStatements,
						EsbMessages.DBLookupMediatorPropertiesEditionPart_SqlStatementsLabel),
				new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Statements.sqlStatements,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						sqlStatements.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Statements.sqlStatements,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						sqlStatements.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Statements.sqlStatements,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						sqlStatements.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(
								new PropertiesEditionEvent(DBLookupMediatorPropertiesEditionPartImpl.this,
										EsbViewsRepository.DBLookupMediator.Statements.sqlStatements,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						sqlStatements.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.sqlStatementsFilters) {
			this.sqlStatements.addFilter(filter);
		}
		this.sqlStatements.setHelpText(propertiesEditionComponent.getHelpContent(
				EsbViewsRepository.DBLookupMediator.Statements.sqlStatements, EsbViewsRepository.SWT_KIND));
		this.sqlStatements.createControls(parent);
		this.sqlStatements.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DBLookupMediatorPropertiesEditionPartImpl.this,
							EsbViewsRepository.DBLookupMediator.Statements.sqlStatements, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData sqlStatementsData = new GridData(GridData.FILL_HORIZONTAL);
		sqlStatementsData.horizontalSpan = 3;
		this.sqlStatements.setLayoutData(sqlStatementsData);
		this.sqlStatements.setLowerBound(0);
		this.sqlStatements.setUpperBound(-1);
		sqlStatements.setID(EsbViewsRepository.DBLookupMediator.Statements.sqlStatements);
		sqlStatements.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSqlStatementsAdvancedTableComposition

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
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getCommentsList()
	 * 
	 */
	public EList getCommentsList() {
		return commentsListList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setCommentsList(EList
	 *      newValue)
	 * 
	 */
	public void setCommentsList(EList newValue) {
		commentsListList = newValue;
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBLookupMediator.Properties.commentsList);
		if (eefElementEditorReadOnlyState && commentsList.isEnabled()) {
			commentsList.setEnabled(false);
			commentsList.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
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
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getReverse()
	 * 
	 */
	public Boolean getReverse() {
		return Boolean.valueOf(reverse.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setReverse(Boolean
	 *      newValue)
	 * 
	 */
	public void setReverse(Boolean newValue) {
		if (newValue != null) {
			reverse.setSelection(newValue.booleanValue());
		} else {
			reverse.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBLookupMediator.Properties.reverse);
		if (eefElementEditorReadOnlyState && reverse.isEnabled()) {
			reverse.setEnabled(false);
			reverse.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reverse.isEnabled()) {
			reverse.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getPropertyAutocommit()
	 * 
	 */
	public Enumerator getPropertyAutocommit() {
		Enumerator selection = (Enumerator) ((StructuredSelection) propertyAutocommit.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#initPropertyAutocommit(Object
	 *      input, Enumerator current)
	 */
	public void initPropertyAutocommit(Object input, Enumerator current) {
		propertyAutocommit.setInput(input);
		propertyAutocommit.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyAutocommit);
		if (eefElementEditorReadOnlyState && propertyAutocommit.isEnabled()) {
			propertyAutocommit.setEnabled(false);
			propertyAutocommit.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyAutocommit.isEnabled()) {
			propertyAutocommit.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setPropertyAutocommit(Enumerator
	 *      newValue)
	 * 
	 */
	public void setPropertyAutocommit(Enumerator newValue) {
		propertyAutocommit.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyAutocommit);
		if (eefElementEditorReadOnlyState && propertyAutocommit.isEnabled()) {
			propertyAutocommit.setEnabled(false);
			propertyAutocommit.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyAutocommit.isEnabled()) {
			propertyAutocommit.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getPropertyIsolation()
	 * 
	 */
	public Enumerator getPropertyIsolation() {
		Enumerator selection = (Enumerator) ((StructuredSelection) propertyIsolation.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#initPropertyIsolation(Object
	 *      input, Enumerator current)
	 */
	public void initPropertyIsolation(Object input, Enumerator current) {
		propertyIsolation.setInput(input);
		propertyIsolation.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyIsolation);
		if (eefElementEditorReadOnlyState && propertyIsolation.isEnabled()) {
			propertyIsolation.setEnabled(false);
			propertyIsolation.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyIsolation.isEnabled()) {
			propertyIsolation.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setPropertyIsolation(Enumerator
	 *      newValue)
	 * 
	 */
	public void setPropertyIsolation(Enumerator newValue) {
		propertyIsolation.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyIsolation);
		if (eefElementEditorReadOnlyState && propertyIsolation.isEnabled()) {
			propertyIsolation.setEnabled(false);
			propertyIsolation.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyIsolation.isEnabled()) {
			propertyIsolation.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getPropertyMaxactive()
	 * 
	 */
	public String getPropertyMaxactive() {
		return propertyMaxactive.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setPropertyMaxactive(String
	 *      newValue)
	 * 
	 */
	public void setPropertyMaxactive(String newValue) {
		if (newValue != null) {
			propertyMaxactive.setText(newValue);
		} else {
			propertyMaxactive.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyMaxactive);
		if (eefElementEditorReadOnlyState && propertyMaxactive.isEnabled()) {
			propertyMaxactive.setEnabled(false);
			propertyMaxactive.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyMaxactive.isEnabled()) {
			propertyMaxactive.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getPropertyMaxidle()
	 * 
	 */
	public String getPropertyMaxidle() {
		return propertyMaxidle.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setPropertyMaxidle(String
	 *      newValue)
	 * 
	 */
	public void setPropertyMaxidle(String newValue) {
		if (newValue != null) {
			propertyMaxidle.setText(newValue);
		} else {
			propertyMaxidle.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyMaxidle);
		if (eefElementEditorReadOnlyState && propertyMaxidle.isEnabled()) {
			propertyMaxidle.setEnabled(false);
			propertyMaxidle.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyMaxidle.isEnabled()) {
			propertyMaxidle.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getPropertyMaxopenstatements()
	 * 
	 */
	public String getPropertyMaxopenstatements() {
		return propertyMaxopenstatements.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setPropertyMaxopenstatements(String
	 *      newValue)
	 * 
	 */
	public void setPropertyMaxopenstatements(String newValue) {
		if (newValue != null) {
			propertyMaxopenstatements.setText(newValue);
		} else {
			propertyMaxopenstatements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyMaxopenstatements);
		if (eefElementEditorReadOnlyState && propertyMaxopenstatements.isEnabled()) {
			propertyMaxopenstatements.setEnabled(false);
			propertyMaxopenstatements.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyMaxopenstatements.isEnabled()) {
			propertyMaxopenstatements.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getPropertyMaxwait()
	 * 
	 */
	public String getPropertyMaxwait() {
		return propertyMaxwait.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setPropertyMaxwait(String
	 *      newValue)
	 * 
	 */
	public void setPropertyMaxwait(String newValue) {
		if (newValue != null) {
			propertyMaxwait.setText(newValue);
		} else {
			propertyMaxwait.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyMaxwait);
		if (eefElementEditorReadOnlyState && propertyMaxwait.isEnabled()) {
			propertyMaxwait.setEnabled(false);
			propertyMaxwait.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyMaxwait.isEnabled()) {
			propertyMaxwait.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getPropertyMinidle()
	 * 
	 */
	public String getPropertyMinidle() {
		return propertyMinidle.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setPropertyMinidle(String
	 *      newValue)
	 * 
	 */
	public void setPropertyMinidle(String newValue) {
		if (newValue != null) {
			propertyMinidle.setText(newValue);
		} else {
			propertyMinidle.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyMinidle);
		if (eefElementEditorReadOnlyState && propertyMinidle.isEnabled()) {
			propertyMinidle.setEnabled(false);
			propertyMinidle.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyMinidle.isEnabled()) {
			propertyMinidle.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getPropertyPoolstatements()
	 * 
	 */
	public Enumerator getPropertyPoolstatements() {
		Enumerator selection = (Enumerator) ((StructuredSelection) propertyPoolstatements.getSelection())
				.getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#initPropertyPoolstatements(Object
	 *      input, Enumerator current)
	 */
	public void initPropertyPoolstatements(Object input, Enumerator current) {
		propertyPoolstatements.setInput(input);
		propertyPoolstatements.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyPoolstatements);
		if (eefElementEditorReadOnlyState && propertyPoolstatements.isEnabled()) {
			propertyPoolstatements.setEnabled(false);
			propertyPoolstatements.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyPoolstatements.isEnabled()) {
			propertyPoolstatements.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setPropertyPoolstatements(Enumerator
	 *      newValue)
	 * 
	 */
	public void setPropertyPoolstatements(Enumerator newValue) {
		propertyPoolstatements.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyPoolstatements);
		if (eefElementEditorReadOnlyState && propertyPoolstatements.isEnabled()) {
			propertyPoolstatements.setEnabled(false);
			propertyPoolstatements.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyPoolstatements.isEnabled()) {
			propertyPoolstatements.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getPropertyTestonborrow()
	 * 
	 */
	public Enumerator getPropertyTestonborrow() {
		Enumerator selection = (Enumerator) ((StructuredSelection) propertyTestonborrow.getSelection())
				.getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#initPropertyTestonborrow(Object
	 *      input, Enumerator current)
	 */
	public void initPropertyTestonborrow(Object input, Enumerator current) {
		propertyTestonborrow.setInput(input);
		propertyTestonborrow.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyTestonborrow);
		if (eefElementEditorReadOnlyState && propertyTestonborrow.isEnabled()) {
			propertyTestonborrow.setEnabled(false);
			propertyTestonborrow.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyTestonborrow.isEnabled()) {
			propertyTestonborrow.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setPropertyTestonborrow(Enumerator
	 *      newValue)
	 * 
	 */
	public void setPropertyTestonborrow(Enumerator newValue) {
		propertyTestonborrow.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyTestonborrow);
		if (eefElementEditorReadOnlyState && propertyTestonborrow.isEnabled()) {
			propertyTestonborrow.setEnabled(false);
			propertyTestonborrow.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyTestonborrow.isEnabled()) {
			propertyTestonborrow.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getPropertyTestwhileidle()
	 * 
	 */
	public Enumerator getPropertyTestwhileidle() {
		Enumerator selection = (Enumerator) ((StructuredSelection) propertyTestwhileidle.getSelection())
				.getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#initPropertyTestwhileidle(Object
	 *      input, Enumerator current)
	 */
	public void initPropertyTestwhileidle(Object input, Enumerator current) {
		propertyTestwhileidle.setInput(input);
		propertyTestwhileidle.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyTestwhileidle);
		if (eefElementEditorReadOnlyState && propertyTestwhileidle.isEnabled()) {
			propertyTestwhileidle.setEnabled(false);
			propertyTestwhileidle.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyTestwhileidle.isEnabled()) {
			propertyTestwhileidle.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setPropertyTestwhileidle(Enumerator
	 *      newValue)
	 * 
	 */
	public void setPropertyTestwhileidle(Enumerator newValue) {
		propertyTestwhileidle.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyTestwhileidle);
		if (eefElementEditorReadOnlyState && propertyTestwhileidle.isEnabled()) {
			propertyTestwhileidle.setEnabled(false);
			propertyTestwhileidle.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyTestwhileidle.isEnabled()) {
			propertyTestwhileidle.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getPropertyValidationquery()
	 * 
	 */
	public String getPropertyValidationquery() {
		return propertyValidationquery.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setPropertyValidationquery(String
	 *      newValue)
	 * 
	 */
	public void setPropertyValidationquery(String newValue) {
		if (newValue != null) {
			propertyValidationquery.setText(newValue);
		} else {
			propertyValidationquery.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyValidationquery);
		if (eefElementEditorReadOnlyState && propertyValidationquery.isEnabled()) {
			propertyValidationquery.setEnabled(false);
			propertyValidationquery.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyValidationquery.isEnabled()) {
			propertyValidationquery.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getPropertyInitialsize()
	 * 
	 */
	public String getPropertyInitialsize() {
		return propertyInitialsize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setPropertyInitialsize(String
	 *      newValue)
	 * 
	 */
	public void setPropertyInitialsize(String newValue) {
		if (newValue != null) {
			propertyInitialsize.setText(newValue);
		} else {
			propertyInitialsize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Properties.propertyInitialsize);
		if (eefElementEditorReadOnlyState && propertyInitialsize.isEnabled()) {
			propertyInitialsize.setEnabled(false);
			propertyInitialsize.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !propertyInitialsize.isEnabled()) {
			propertyInitialsize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setDescription(String
	 *      newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DBLookupMediator.Misc.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getConnectionType()
	 * 
	 */
	public Enumerator getConnectionType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) connectionType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#initConnectionType(Object
	 *      input, Enumerator current)
	 */
	public void initConnectionType(Object input, Enumerator current) {
		connectionType.setInput(input);
		connectionType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Connection.connectionType);
		if (eefElementEditorReadOnlyState && connectionType.isEnabled()) {
			connectionType.setEnabled(false);
			connectionType.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionType.isEnabled()) {
			connectionType.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setConnectionType(Enumerator
	 *      newValue)
	 * 
	 */
	public void setConnectionType(Enumerator newValue) {
		connectionType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Connection.connectionType);
		if (eefElementEditorReadOnlyState && connectionType.isEnabled()) {
			connectionType.setEnabled(false);
			connectionType.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionType.isEnabled()) {
			connectionType.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getConnectionDsType()
	 * 
	 */
	public Enumerator getConnectionDsType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) connectionDsType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#initConnectionDsType(Object
	 *      input, Enumerator current)
	 */
	public void initConnectionDsType(Object input, Enumerator current) {
		connectionDsType.setInput(input);
		connectionDsType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Connection.connectionDsType);
		if (eefElementEditorReadOnlyState && connectionDsType.isEnabled()) {
			connectionDsType.setEnabled(false);
			connectionDsType.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDsType.isEnabled()) {
			connectionDsType.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setConnectionDsType(Enumerator
	 *      newValue)
	 * 
	 */
	public void setConnectionDsType(Enumerator newValue) {
		connectionDsType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Connection.connectionDsType);
		if (eefElementEditorReadOnlyState && connectionDsType.isEnabled()) {
			connectionDsType.setEnabled(false);
			connectionDsType.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDsType.isEnabled()) {
			connectionDsType.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getConnectionDsInitialContext()
	 * 
	 */
	public String getConnectionDsInitialContext() {
		return connectionDsInitialContext.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setConnectionDsInitialContext(String
	 *      newValue)
	 * 
	 */
	public void setConnectionDsInitialContext(String newValue) {
		if (newValue != null) {
			connectionDsInitialContext.setText(newValue);
		} else {
			connectionDsInitialContext.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Connection.connectionDsInitialContext);
		if (eefElementEditorReadOnlyState && connectionDsInitialContext.isEnabled()) {
			connectionDsInitialContext.setEnabled(false);
			connectionDsInitialContext.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDsInitialContext.isEnabled()) {
			connectionDsInitialContext.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getConnectionDbType()
	 * 
	 */
	public Enumerator getConnectionDbType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) connectionDbType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#initConnectionDbType(Object
	 *      input, Enumerator current)
	 */
	public void initConnectionDbType(Object input, Enumerator current) {
		connectionDbType.setInput(input);
		connectionDbType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Connection.connectionDbType);
		if (eefElementEditorReadOnlyState && connectionDbType.isEnabled()) {
			connectionDbType.setEnabled(false);
			connectionDbType.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDbType.isEnabled()) {
			connectionDbType.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setConnectionDbType(Enumerator
	 *      newValue)
	 * 
	 */
	public void setConnectionDbType(Enumerator newValue) {
		connectionDbType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Connection.connectionDbType);
		if (eefElementEditorReadOnlyState && connectionDbType.isEnabled()) {
			connectionDbType.setEnabled(false);
			connectionDbType.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDbType.isEnabled()) {
			connectionDbType.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getConnectionDbDriver()
	 * 
	 */
	public String getConnectionDbDriver() {
		return connectionDbDriver.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setConnectionDbDriver(String
	 *      newValue)
	 * 
	 */
	public void setConnectionDbDriver(String newValue) {
		if (newValue != null) {
			connectionDbDriver.setText(newValue);
		} else {
			connectionDbDriver.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Connection.connectionDbDriver);
		if (eefElementEditorReadOnlyState && connectionDbDriver.isEnabled()) {
			connectionDbDriver.setEnabled(false);
			connectionDbDriver.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDbDriver.isEnabled()) {
			connectionDbDriver.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getConnectionDsName()
	 * 
	 */
	public String getConnectionDsName() {
		return connectionDsName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setConnectionDsName(String
	 *      newValue)
	 * 
	 */
	public void setConnectionDsName(String newValue) {
		if (newValue != null) {
			connectionDsName.setText(newValue);
		} else {
			connectionDsName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Connection.connectionDsName);
		if (eefElementEditorReadOnlyState && connectionDsName.isEnabled()) {
			connectionDsName.setEnabled(false);
			connectionDsName.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionDsName.isEnabled()) {
			connectionDsName.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getConnectionURL()
	 * 
	 */
	public String getConnectionURL() {
		return connectionURL.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setConnectionURL(String
	 *      newValue)
	 * 
	 */
	public void setConnectionURL(String newValue) {
		if (newValue != null) {
			connectionURL.setText(newValue);
		} else {
			connectionURL.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Connection.connectionURL);
		if (eefElementEditorReadOnlyState && connectionURL.isEnabled()) {
			connectionURL.setEnabled(false);
			connectionURL.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionURL.isEnabled()) {
			connectionURL.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getConnectionUsername()
	 * 
	 */
	public String getConnectionUsername() {
		return connectionUsername.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setConnectionUsername(String
	 *      newValue)
	 * 
	 */
	public void setConnectionUsername(String newValue) {
		if (newValue != null) {
			connectionUsername.setText(newValue);
		} else {
			connectionUsername.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Connection.connectionUsername);
		if (eefElementEditorReadOnlyState && connectionUsername.isEnabled()) {
			connectionUsername.setEnabled(false);
			connectionUsername.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionUsername.isEnabled()) {
			connectionUsername.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getConnectionPassword()
	 * 
	 */
	public String getConnectionPassword() {
		return connectionPassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setConnectionPassword(String
	 *      newValue)
	 * 
	 */
	public void setConnectionPassword(String newValue) {
		if (newValue != null) {
			connectionPassword.setText(newValue);
		} else {
			connectionPassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Connection.connectionPassword);
		if (eefElementEditorReadOnlyState && connectionPassword.isEnabled()) {
			connectionPassword.setEnabled(false);
			connectionPassword.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectionPassword.isEnabled()) {
			connectionPassword.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getIsRegistryBasedDriverConfig()
	 * 
	 */
	public Boolean getIsRegistryBasedDriverConfig() {
		return Boolean.valueOf(isRegistryBasedDriverConfig.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setIsRegistryBasedDriverConfig(Boolean
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
				EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedDriverConfig);
		if (eefElementEditorReadOnlyState && isRegistryBasedDriverConfig.isEnabled()) {
			isRegistryBasedDriverConfig.setEnabled(false);
			isRegistryBasedDriverConfig.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isRegistryBasedDriverConfig.isEnabled()) {
			isRegistryBasedDriverConfig.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getIsRegistryBasedUrlConfig()
	 * 
	 */
	public Boolean getIsRegistryBasedUrlConfig() {
		return Boolean.valueOf(isRegistryBasedUrlConfig.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setIsRegistryBasedUrlConfig(Boolean
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
				EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedUrlConfig);
		if (eefElementEditorReadOnlyState && isRegistryBasedUrlConfig.isEnabled()) {
			isRegistryBasedUrlConfig.setEnabled(false);
			isRegistryBasedUrlConfig.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isRegistryBasedUrlConfig.isEnabled()) {
			isRegistryBasedUrlConfig.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getIsRegistryBasedUserConfig()
	 * 
	 */
	public Boolean getIsRegistryBasedUserConfig() {
		return Boolean.valueOf(isRegistryBasedUserConfig.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setIsRegistryBasedUserConfig(Boolean
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
				EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedUserConfig);
		if (eefElementEditorReadOnlyState && isRegistryBasedUserConfig.isEnabled()) {
			isRegistryBasedUserConfig.setEnabled(false);
			isRegistryBasedUserConfig.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isRegistryBasedUserConfig.isEnabled()) {
			isRegistryBasedUserConfig.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#getIsRegistryBasedPassConfig()
	 * 
	 */
	public Boolean getIsRegistryBasedPassConfig() {
		return Boolean.valueOf(isRegistryBasedPassConfig.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#setIsRegistryBasedPassConfig(Boolean
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
				EsbViewsRepository.DBLookupMediator.Connection.isRegistryBasedPassConfig);
		if (eefElementEditorReadOnlyState && isRegistryBasedPassConfig.isEnabled()) {
			isRegistryBasedPassConfig.setEnabled(false);
			isRegistryBasedPassConfig.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isRegistryBasedPassConfig.isEnabled()) {
			isRegistryBasedPassConfig.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#initSqlStatements(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initSqlStatements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sqlStatements.setContentProvider(contentProvider);
		sqlStatements.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(
				EsbViewsRepository.DBLookupMediator.Statements.sqlStatements);
		if (eefElementEditorReadOnlyState && sqlStatements.isEnabled()) {
			sqlStatements.setEnabled(false);
			sqlStatements.setToolTipText(EsbMessages.DBLookupMediator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sqlStatements.isEnabled()) {
			sqlStatements.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#updateSqlStatements()
	 * 
	 */
	public void updateSqlStatements() {
		sqlStatements.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#addFilterSqlStatements(ViewerFilter
	 *      filter)
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
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#addBusinessFilterSqlStatements(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSqlStatements(ViewerFilter filter) {
		sqlStatementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.eclipse.gmf.esb.parts.DBLookupMediatorPropertiesEditionPart#isContainedInSqlStatementsTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInSqlStatementsTable(EObject element) {
		return ((ReferencesTableSettings) sqlStatements.getInput()).contains(element);
	}

	// Start of user code for Database Configuration specific getters and setters
	// implementation

	// End of user code

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EsbMessages.DBLookupMediator_Part_Title;
	}

	@Override
	public RegistryKeyProperty getRegistryBasedDriverConfigKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRegistryBasedDriverConfigKey(RegistryKeyProperty registryKeyProperty) {
		// TODO Auto-generated method stub

	}

	@Override
	public RegistryKeyProperty getRegistryBasedUrlrConfigKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRegistryBasedUrlConfigKey(RegistryKeyProperty registryKeyProperty) {
		// TODO Auto-generated method stub

	}

	@Override
	public RegistryKeyProperty getRegistryBasedUserConfigKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRegistryBasedUserConfigKey(RegistryKeyProperty registryKeyProperty) {
		// TODO Auto-generated method stub

	}

	@Override
	public RegistryKeyProperty getRegistryBasedPassConfigKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRegistryBasedPassConfigKey(RegistryKeyProperty registryKeyProperty) {
		// TODO Auto-generated method stub

	}

	// Start of user code additional methods

	// End of user code

}
