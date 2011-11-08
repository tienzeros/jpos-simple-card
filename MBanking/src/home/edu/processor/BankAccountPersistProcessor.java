package home.edu.processor;


import org.jpos.iso.ISOMsg;

import com.hqsolution.hqserver.app.dao.BankAccount;

public class BankAccountPersistProcessor extends RequestProcessor{
	private BankAccount account;
	
	public BankAccountPersistProcessor() {
		
	}
	
	@Override
	public void process() {
		super.process();
		ISOMsg isoMsg = getMsgReceived();
		
		//get information from message
		
		account = null;
	}
	
	public BankAccount getBankAccount() {
		return account;
	}
}
