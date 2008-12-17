/**
 * Copyright (c) 2007-2008 The Bioclipse Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * www.eclipse.org���epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>
 * 
 * Contributors:
 *     Ola Spjuth - initial API and implementation
 * 
 *
 * $Id$
 */
package net.bioclipse.qsar;
import org.eclipse.emf.ecore.EObject;
/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.ParameterType#getKey <em>Key</em>}</li>
 *   <li>{@link net.bioclipse.qsar.ParameterType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bioclipse.qsar.QsarPackage#getParameterType()
 * @model extendedMetaData="name='parameterType' kind='empty'"
 * @generated
 */
public interface ParameterType extends EObject {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";
        /**
         * Returns the value of the '<em><b>Key</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Key</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Key</em>' attribute.
         * @see #setKey(String)
         * @see net.bioclipse.qsar.QsarPackage#getParameterType_Key()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
         *        extendedMetaData="kind='attribute' name='key'"
         * @generated
         */
        String getKey();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.ParameterType#getKey <em>Key</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Key</em>' attribute.
         * @see #getKey()
         * @generated
         */
        void setKey(String value);
        /**
         * Returns the value of the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Value</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Value</em>' attribute.
         * @see #setValue(String)
         * @see net.bioclipse.qsar.QsarPackage#getParameterType_Value()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='value'"
         * @generated
         */
        String getValue();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.ParameterType#getValue <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' attribute.
         * @see #getValue()
         * @generated
         */
        void setValue(String value);
} // ParameterType
