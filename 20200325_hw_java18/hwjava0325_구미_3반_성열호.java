package app;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import medical.Hospital;
import person.Patient;

public class NetworkHttpServerPatient {

	public static void main(String[] args) {
		Patient p1 = new Patient("김은송", 42, "010-1111-1111", "호흡곤란", "001", true);
		Patient p2 = new Patient("오혜영", 30, "010-2222-2222", "과음", "901", false);
		Patient p3 = new Patient("배성재", 35, "010-3333-3333", "폐렴", "901", false);
		
		// 환자 Collection
		List<Patient> patientList = new ArrayList<>();
		patientList.add(p1);
		patientList.add(p2);
		patientList.add(p3);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html><body><h2>환자 정보</h2><table style='border: 1px solid green;'>");
		for(Patient p : patientList) {
			sb.append("<tr style='border: 1px solid green;'><td>")
			.append(p.getName().substring(0, 1)).append("XX</td><td>")
			.append(p.getPhone().substring(0, 9))
			.append("XXXX</td></tr>");
		}
		
		sb.append("</table></body></html>");
		String html = sb.toString();
		
		try (ServerSocket ss = new ServerSocket(8090)){
			System.out.println("[Hospital Info Server is ready]");
			
			while(true) {
				try (Socket socket = ss.accept()){
					
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
					
					bw.write("HTTP/1.1 200 OK \r\n");
					bw.write("Content-Type: text/html; charset=utf-8 \r\n");
					bw.write("Content-Length: " + html.getBytes().length + "\r\n");
					bw.write("\r\n");
					bw.write(html);
					bw.write("\r\n");
					bw.flush();
					
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
