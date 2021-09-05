package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public double berechneBonusProzentsatz(String Firmenzugehoerigkeit) {
    	
         if (Double.parseDouble(Firmenzugehoerigkeit)<=3) {
         	return 0.05;
         }else if (Double.parseDouble(Firmenzugehoerigkeit)<=5){
        	 return 0.1;        	
         }else if (Double.parseDouble(Firmenzugehoerigkeit)<=8){
        	 return 0.15;
         }else if (Double.parseDouble(Firmenzugehoerigkeit)<=10){
        	 return 0.20;
         }else if (Double.parseDouble(Firmenzugehoerigkeit)<=15){
        	 return 0.25;
         }else if (Double.parseDouble(Firmenzugehoerigkeit)<=20){
        	 return 0.30;
         }else return 0.35;
    }
    
    public double berechneBonus(String Firmenzugehoerigkeit, String AktuellesGehalt) {
    	
    	double bonus = Double.parseDouble(AktuellesGehalt)*berechneBonusProzentsatz(Firmenzugehoerigkeit);
    	
    	return bonus;
   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String NameMitarbeiter = request.getParameter("yourName");
		String Firmenzugehoerigkeit = request.getParameter("Jahr");
		String AktuellesGehalt = request.getParameter("Gehalt");
		
		double bonus = berechneBonus(Firmenzugehoerigkeit,AktuellesGehalt);
		
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hi " + NameMitarbeiter + " dein Bonus beträgt" + bonus +" Euro</h1>");
		
		
		writer.close();
		// TODO Auto-generated method stub
	}

}
