package home.edu.factory;

import home.edu.msg.util.MessageUtil;

import java.util.Date;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;

public class IsoMessageBuilder {

	public static IsoMessageBuilder createBuilder() {
		return new IsoMessageBuilder();
	}

	private ISOMsg isoMsg = new ISOMsg();

	private IsoMessageBuilder() {

	}
	
	public IsoMessageBuilder setMTI(String mti) {
		try {
			isoMsg.setMTI(mti);
		} catch (ISOException e) {

		}
		return this;
	}

	public IsoMessageBuilder setField11(Date date) {
		try {
			isoMsg.set(11, MessageUtil.longToByteArray(date.getTime()));
		} catch (ISOException e) {

		}
		return this;
	}

	public IsoMessageBuilder setField3(String processionCode) {
		try {
			isoMsg.set(3, processionCode);
		} catch (ISOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public IsoMessageBuilder setField48(byte[] processionCode) {
		try {
			isoMsg.set(48, processionCode);
		} catch (ISOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public IsoMessageBuilder rebuild(ISOMsg isoMsg) {
		this.isoMsg = isoMsg;
		return this;
	}
	
	public IsoMessageBuilder setPackage(ISOPackager isoPackager) {
		this.isoMsg.setPackager(isoPackager);
		return this;
	}

	public ISOMsg build() {
		return isoMsg;
	}

}
