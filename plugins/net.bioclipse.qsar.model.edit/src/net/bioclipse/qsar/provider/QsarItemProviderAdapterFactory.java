/**
 *  Copyright (c) 2009 Ola Spjuth
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package net.bioclipse.qsar.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.bioclipse.qsar.util.QsarAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QsarItemProviderAdapterFactory extends QsarAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QsarItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.DescriptorlistType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DescriptorlistTypeItemProvider descriptorlistTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.DescriptorlistType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDescriptorlistTypeAdapter() {
        if (descriptorlistTypeItemProvider == null) {
            descriptorlistTypeItemProvider = new DescriptorlistTypeItemProvider(this);
        }

        return descriptorlistTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.DescriptorproviderType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DescriptorproviderTypeItemProvider descriptorproviderTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.DescriptorproviderType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDescriptorproviderTypeAdapter() {
        if (descriptorproviderTypeItemProvider == null) {
            descriptorproviderTypeItemProvider = new DescriptorproviderTypeItemProvider(this);
        }

        return descriptorproviderTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.DescriptorType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DescriptorTypeItemProvider descriptorTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.DescriptorType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDescriptorTypeAdapter() {
        if (descriptorTypeItemProvider == null) {
            descriptorTypeItemProvider = new DescriptorTypeItemProvider(this);
        }

        return descriptorTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.DocumentRoot} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootItemProvider documentRootItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.DocumentRoot}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDocumentRootAdapter() {
        if (documentRootItemProvider == null) {
            documentRootItemProvider = new DocumentRootItemProvider(this);
        }

        return documentRootItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.MetadataType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MetadataTypeItemProvider metadataTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.MetadataType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMetadataTypeAdapter() {
        if (metadataTypeItemProvider == null) {
            metadataTypeItemProvider = new MetadataTypeItemProvider(this);
        }

        return metadataTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.ParameterType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterTypeItemProvider parameterTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.ParameterType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createParameterTypeAdapter() {
        if (parameterTypeItemProvider == null) {
            parameterTypeItemProvider = new ParameterTypeItemProvider(this);
        }

        return parameterTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.PreprocessingStepType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PreprocessingStepTypeItemProvider preprocessingStepTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.PreprocessingStepType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPreprocessingStepTypeAdapter() {
        if (preprocessingStepTypeItemProvider == null) {
            preprocessingStepTypeItemProvider = new PreprocessingStepTypeItemProvider(this);
        }

        return preprocessingStepTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.PreprocessingType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PreprocessingTypeItemProvider preprocessingTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.PreprocessingType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPreprocessingTypeAdapter() {
        if (preprocessingTypeItemProvider == null) {
            preprocessingTypeItemProvider = new PreprocessingTypeItemProvider(this);
        }

        return preprocessingTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.QsarType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QsarTypeItemProvider qsarTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.QsarType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createQsarTypeAdapter() {
        if (qsarTypeItemProvider == null) {
            qsarTypeItemProvider = new QsarTypeItemProvider(this);
        }

        return qsarTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.ResourceType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResourceTypeItemProvider resourceTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.ResourceType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createResourceTypeAdapter() {
        if (resourceTypeItemProvider == null) {
            resourceTypeItemProvider = new ResourceTypeItemProvider(this);
        }

        return resourceTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.ResponsesListType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResponsesListTypeItemProvider responsesListTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.ResponsesListType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createResponsesListTypeAdapter() {
        if (responsesListTypeItemProvider == null) {
            responsesListTypeItemProvider = new ResponsesListTypeItemProvider(this);
        }

        return responsesListTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.ResponseType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResponseTypeItemProvider responseTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.ResponseType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createResponseTypeAdapter() {
        if (responseTypeItemProvider == null) {
            responseTypeItemProvider = new ResponseTypeItemProvider(this);
        }

        return responseTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.ResponseunitType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResponseunitTypeItemProvider responseunitTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.ResponseunitType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createResponseunitTypeAdapter() {
        if (responseunitTypeItemProvider == null) {
            responseunitTypeItemProvider = new ResponseunitTypeItemProvider(this);
        }

        return responseunitTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.StructurelistType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StructurelistTypeItemProvider structurelistTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.StructurelistType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createStructurelistTypeAdapter() {
        if (structurelistTypeItemProvider == null) {
            structurelistTypeItemProvider = new StructurelistTypeItemProvider(this);
        }

        return structurelistTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link net.bioclipse.qsar.StructureType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StructureTypeItemProvider structureTypeItemProvider;

    /**
     * This creates an adapter for a {@link net.bioclipse.qsar.StructureType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createStructureTypeAdapter() {
        if (structureTypeItemProvider == null) {
            structureTypeItemProvider = new StructureTypeItemProvider(this);
        }

        return structureTypeItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (descriptorlistTypeItemProvider != null) descriptorlistTypeItemProvider.dispose();
        if (descriptorproviderTypeItemProvider != null) descriptorproviderTypeItemProvider.dispose();
        if (descriptorTypeItemProvider != null) descriptorTypeItemProvider.dispose();
        if (documentRootItemProvider != null) documentRootItemProvider.dispose();
        if (metadataTypeItemProvider != null) metadataTypeItemProvider.dispose();
        if (parameterTypeItemProvider != null) parameterTypeItemProvider.dispose();
        if (preprocessingStepTypeItemProvider != null) preprocessingStepTypeItemProvider.dispose();
        if (preprocessingTypeItemProvider != null) preprocessingTypeItemProvider.dispose();
        if (qsarTypeItemProvider != null) qsarTypeItemProvider.dispose();
        if (resourceTypeItemProvider != null) resourceTypeItemProvider.dispose();
        if (responsesListTypeItemProvider != null) responsesListTypeItemProvider.dispose();
        if (responseTypeItemProvider != null) responseTypeItemProvider.dispose();
        if (responseunitTypeItemProvider != null) responseunitTypeItemProvider.dispose();
        if (structurelistTypeItemProvider != null) structurelistTypeItemProvider.dispose();
        if (structureTypeItemProvider != null) structureTypeItemProvider.dispose();
    }

}
