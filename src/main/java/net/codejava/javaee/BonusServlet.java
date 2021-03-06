package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BonusServlet
 * @param <Bonusrechner>
 */
@WebServlet("/bonusServlet")
public class BonusServlet extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;
	public Bonusrechner Rechner;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BonusServlet() {
        super();
        Rechner = new Bonusrechner();
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String NameMitarbeiter = request.getParameter("yourName");
		String Firmenzugehoerigkeit = request.getParameter("Jahr");
		String AktuellesGehalt = request.getParameter("Gehalt");
		String Test = " ";
		
		double bonusProzenzsatz = Rechner.berechneBonusProzentsatz(Firmenzugehoerigkeit);
		
		double bonus = Rechner.berechneBonus(bonusProzenzsatz,AktuellesGehalt);
	
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hi " + NameMitarbeiter + " dein Bonus betr?gt " + bonus +" Euro</h1>");
		
		writer.close();
		// TODO Auto-generated method stub
	}

}
