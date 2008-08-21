package net.bioclipse.qsar.test.business;

import static org.junit.Assert.*;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.bioclipse.core.business.BioclipseException;
import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.core.domain.SmilesMolecule;
import net.bioclipse.qsar.business.IQsarManager;
import net.bioclipse.qsar.business.QsarManager;
import net.bioclipse.qsar.descriptor.IDescriptorResult;
import net.bioclipse.qsar.descriptor.model.Descriptor;
import net.bioclipse.qsar.descriptor.model.DescriptorCategory;
import net.bioclipse.qsar.descriptor.model.DescriptorProvider;

import org.junit.Test;

public class TestQsarManager {

	IQsarManager qsar;
	
	public TestQsarManager() {
		
		//Unnecessary to use OSGI.
		qsar=new QsarManager();
	}
	
	

	@Test
	public void testGetCategories(){

		//Get category IDs
		List<String> lst = qsar.getCategories();
		assertNotNull(lst);
		assertTrue(lst.size()>=2);

		System.out.println("=======================");
		System.out.println("Category IDs:");
		for (String str : lst){
			System.out.println("  - " + str);
		}
		System.out.println("=======================");

		//Get category classes
		List<DescriptorCategory> lstFull = qsar.getFullCategories();
		assertNotNull(lstFull);
		
		//Should have same size as IDs
		assertTrue(lstFull.size()==(lst.size()));

	}

	@Test
	public void testGetProviders(){

		//Get provider IDs
		List<String> lst = qsar.getProviders();
		assertNotNull(lst);
		assertTrue(lst.size()>=2);

		System.out.println("=======================");
		System.out.println("Provider IDs:");
		for (String str : lst){
			System.out.println("  - " + str);
		}
		System.out.println("=======================");

		//Get provider classes
		List<DescriptorProvider> lstFull = qsar.getFullProviders();
		assertNotNull(lstFull);
		
		//Should have same size as IDs
		assertTrue(lstFull.size()==(lst.size()));

	}

	@Test
	public void testGetDescriptors(){

		//Matches plugin.xml
		String providerID="net.bioclipse.qsar.test.descriptorProvider1";
		String providerID2="net.bioclipse.qsar.test.descriptorProvider2";
		String cat1id="net.bioclipse.qsar.test.category1";
		String cat2id="net.bioclipse.qsar.test.category2";
		
		String descriptorID="net.bioclipse.qsar.test.descriptor3";
		String descriptorID3D="net.bioclipse.qsar.test.descriptor3D";

		assertEquals(2, qsar.getDescriptors(providerID).size());
		assertEquals(3, qsar.getDescriptors(providerID2).size());
		
		assertEquals(1, qsar.getDescriptors(providerID, cat1id).size());
		assertEquals(1, qsar.getDescriptors(providerID2, cat1id).size());
		assertEquals(1, qsar.getDescriptors(providerID, cat2id).size());
		assertEquals(2, qsar.getDescriptors(providerID2, cat2id).size());

		assertTrue(qsar.existsDescriptor(descriptorID));
		
		//Get decriptor by hardcoded id
		Descriptor desc=qsar.getDescriptor(descriptorID);
		assertNotNull(desc);
		assertFalse(desc.isRequires3D());
		assertEquals("category1", desc.getCategory().getName());
		assertEquals("descriptorProvider2", desc.getProvider().getName());

		//Get decriptor by hardcoded id
		desc=qsar.getDescriptor(descriptorID3D);
		assertNotNull(desc);
		assertTrue(desc.isRequires3D());
		assertEquals("category2", desc.getCategory().getName());
		assertEquals("descriptorProvider2", desc.getProvider().getName());
	
	}
	
	
	
	
	
	@Test
	public void testCalculateSingleMolSingleDescriptor(){

		IMolecule mol=new SmilesMolecule("C1CCCCC1CC(CC)CC");
		String descriptorID="net.bioclipse.qsar.test.descriptor3";
		
		IDescriptorResult res = qsar.calculate(mol, descriptorID);
		assertNotNull(res);
		assertNull(res.getErrorMessage());
		assertEquals(descriptorID, res.getDescriptorId());
		assertEquals(3, res.getLabels().length);
		assertEquals(3, res.getValues().length);

		//Dummycalculator returns 15.2456 as first result in array
		assertEquals(new Float(15.2456), res.getValues()[0]);
		
	}

	@Test
	public void testCalculateDescriptorWithError(){

		IMolecule mol=new SmilesMolecule("C1CCCCC1CC(CC)CC");
		String descriptorID="net.bioclipse.qsar.test.descriptorERROR";
		
		IDescriptorResult res = qsar.calculate(mol, descriptorID);
		assertNotNull(res.getErrorMessage());
		
		System.out.println("Error message: " + res.getErrorMessage());
		assertEquals("Failed to calculate descriptor '" +
				descriptorID + "'. Reason: Unknown", 
				res.getErrorMessage());

	}

	@Test
	public void testCalculateDescriptorWithMissing3D(){

		IMolecule mol=new SmilesMolecule("C1CCCCC1CC(CC)CC");
		String descriptorID="net.bioclipse.qsar.test.descriptor3D";
		
		IDescriptorResult res = qsar.calculate(mol, descriptorID);
		assertNotNull(res.getErrorMessage());
		
		System.out.println("Error message: " + res.getErrorMessage());
		assertEquals("Failed to calculate descriptor '" +
				descriptorID + "'. Molecule has no 3D coordinates.", 
				res.getErrorMessage());

	}

	@Test
	public void testCalculateMultipleMolMultipleDescriptor() throws BioclipseException{
		
		IMolecule mol1=new SmilesMolecule("C1CCCCC1CC(CC)CC");
		IMolecule mol2=new SmilesMolecule("C1CCCCC1CC(CC)CCCCCO");
		String descriptorID="net.bioclipse.qsar.test.descriptor3";
		String descriptorID2="net.bioclipse.qsar.test.descriptor2";
		
		List<IMolecule> mols=new ArrayList<IMolecule>();
		List<String> descs=new ArrayList<String>();
		
		mols.add(mol1);
		mols.add(mol2);
		descs.add(descriptorID);
		descs.add(descriptorID2);
		
		Map<IMolecule, List<IDescriptorResult>> res = qsar.calculate(mols, descs);
		assertNotNull(res);
		
		List<IDescriptorResult> res1=res.get(mol1);
		List<IDescriptorResult> res2=res.get(mol2);

		assertEquals(2, res1.size());
		assertEquals(2, res2.size());

		IDescriptorResult dres1=res1.get(0);
		IDescriptorResult dres11=res1.get(1);
		IDescriptorResult dres2=res2.get(0);
		IDescriptorResult dres22=res2.get(1);

		assertNull(dres1.getErrorMessage());
		assertNull(dres11.getErrorMessage());
		assertNull(dres2.getErrorMessage());
		assertNull(dres22.getErrorMessage());

		System.out.println("Mol: " + mol1.getSmiles());
		System.out.println("Desc " + dres1.getDescriptorId() +": " + 
				dres1.getLabels()[0] + "=" + dres1.getValues()[0] +", " + 
				dres1.getLabels()[1] + "=" + dres1.getValues()[1] +", " + 
				dres1.getLabels()[2] + "=" + dres1.getValues()[2] +", ");

		System.out.println("Mol: " + mol1.getSmiles());
		System.out.println("Desc " + dres11.getDescriptorId() +": " + 
				dres11.getLabels()[0] + "=" + dres11.getValues()[0] +", " + 
				dres11.getLabels()[1] + "=" + dres11.getValues()[1] +", " + 
				dres11.getLabels()[2] + "=" + dres11.getValues()[2] +", ");

		System.out.println("Mol: " + mol2.getSmiles());
		System.out.println("Desc " + dres2.getDescriptorId() +": " + 
				dres2.getLabels()[0] + "=" + dres2.getValues()[0] +", " + 
				dres2.getLabels()[1] + "=" + dres2.getValues()[1] +", " + 
				dres2.getLabels()[2] + "=" + dres2.getValues()[2] +", ");

		System.out.println("Mol: " + mol2.getSmiles());
		System.out.println("Desc " + dres22.getDescriptorId() +": " + 
				dres22.getLabels()[0] + "=" + dres22.getValues()[0] +", " + 
				dres22.getLabels()[1] + "=" + dres22.getValues()[1] +", " + 
				dres22.getLabels()[2] + "=" + dres22.getValues()[2] +", ");

		assertEquals(3, dres1.getLabels().length);
		assertEquals(3, dres1.getValues().length);
		assertEquals("label1", dres1.getLabels()[0]);
		assertEquals("label2", dres1.getLabels()[1]);
		assertEquals("label3", dres1.getLabels()[2]);
		assertEquals(new Float(15.2456), dres1.getValues()[0]);
		assertEquals(new Float(47.01), dres1.getValues()[1]);
		assertEquals(new Float(-6.44), dres1.getValues()[2]);
		

	}

}