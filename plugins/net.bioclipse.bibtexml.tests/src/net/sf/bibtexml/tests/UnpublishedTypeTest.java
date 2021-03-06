/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.sf.bibtexml.BibtexmlFactory;
import net.sf.bibtexml.UnpublishedType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unpublished Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnpublishedTypeTest extends TestCase {

    /**
     * The fixture for this Unpublished Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnpublishedType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(UnpublishedTypeTest.class);
    }

    /**
     * Constructs a new Unpublished Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnpublishedTypeTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Unpublished Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(UnpublishedType fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Unpublished Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnpublishedType getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(BibtexmlFactory.eINSTANCE.createUnpublishedType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

} //UnpublishedTypeTest
