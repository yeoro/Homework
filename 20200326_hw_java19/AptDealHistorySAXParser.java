package xml;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class AptDealHistorySAXParser {
	private List<AptDealHistory> list;
	
	public AptDealHistorySAXParser() {
		try {
			File file = new File("./src/xml/AptDealHistory.xml");
			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			
			AptDealHistorySAXHandler handler = new AptDealHistorySAXHandler();
			
			parser.parse(file, handler);
			
			list = handler.getList();
			
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void parse(String apt) {
		
		list.stream().filter(n -> n.get아파트().contains(apt)).forEach(n -> System.out.println(n));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AptDealHistorySAXParser parse = new AptDealHistorySAXParser();
		System.out.print("아파트 명을 입력해주세요 : ");
		parse.parse(sc.next());
		
		
		
	}

}
