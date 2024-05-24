package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumno
 */
@WebServlet(name = "CalcularEdad", urlPatterns = {"/CalcularEdad"})
public class CalcularEdad extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //out.println("<!DOCTYPE html>");
            //out.println("<html>");
            //out.println("<head>");
            //out.println("<title>Servlet CalcularEdad</title>");            
            //out.println("</head>");
            //out.println("<body>");
            //out.println("<h1>Servlet CalcularEdad at " + request.getContextPath() + "</h1>");
            //out.println("</body>");
            //out.println("</html>");
        
        
        //Mediante esta linea consigo el dato que se pasa por el formulario, en este caso el DNI.
        String dni = request.getParameter("dni_pers");
        String nombre = request.getParameter("nombre_pers");
        //out.println("<h1>"+ed+"</h1>");
        
        String fech = request.getParameter("fecha_nac");
        
        Date fechaFormat = null;
        
        try 
        {
            DateFormat formater;
            Date date;
            formater = new SimpleDateFormat("yyyy-MM-dd");
            date = (Date) formater.parse(fech);
            fechaFormat = date;
            } catch (ParseException ex) 
            {
                Logger.getLogger(CalcularEdad.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        SimpleDateFormat sacarAnio; 
        sacarAnio = new SimpleDateFormat("yyyy");
        String anioIntroducido = sacarAnio.format(fechaFormat);
        int anioIntroInt = Integer.parseInt(anioIntroducido);
        
        Date fechaActual = new Date();
        String anioActual = sacarAnio.format(fechaActual);
        int anioActualInt = Integer.parseInt(anioActual);
        
        int edadUsu = anioActualInt - anioIntroInt;
        
        
        //Esto es lo que se va a enviar al .jsp, el primer valor tiene que ser igual al que se
        //indique en la variable del .jsp
        request.setAttribute("edadjsp", edadUsu);
        request.setAttribute("dniUsu",dni);
        request.setAttribute("nombreUsu",nombre);
        
        
        //Aqui se indica al .jsp al cual se quiere enviar el dato
        RequestDispatcher dispatcher = request.getRequestDispatcher("procesar_datos.jsp");
        dispatcher.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
