package xml;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AptDealHistorySAXHandler extends DefaultHandler {

	private String temp;
	private AptDealHistory adh;
	private ArrayList<AptDealHistory> list;

	public AptDealHistorySAXHandler() {
		list = new ArrayList<AptDealHistory>();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attr) {
		if(qName.equals("item")) {
			adh = new AptDealHistory();
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
		temp = String.valueOf(ch, start, length);
	}
	
	public void endElement(String uri, String localName, String qName) {
		
		if (qName.equals("거래금액")) {
			adh.set거래금액(temp);
		}
		
		if (qName.equals("아파트")) {
			adh.set아파트(temp);
		}
	
		if (qName.equals("법정동")) {
			adh.set법정동(temp);
		}
		
		if(qName.equals("item")) {
			list.add(adh);
			adh = null;
		}
	}
	
	public ArrayList<AptDealHistory> getList() {
		return list;
	}	
	public void setList(ArrayList<AptDealHistory> list) {
		this.list = list;
	}
}
