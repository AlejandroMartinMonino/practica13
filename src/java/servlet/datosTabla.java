package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Ciudad;

/**
 *
 * @author alexr
 */
@WebServlet(name = "datosTabla", urlPatterns = {"/datosTabla"})
public class datosTabla extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) 
        {
            ArrayList<Ciudad> ciudades = new ArrayList<>();
            ciudades.add(new Ciudad("España","Madrid","imagenes/img1.png","Europa",4778000));
            ciudades.add(new Ciudad("Francia","París","imagenes/img2.png","Europa",6797000));
            ciudades.add(new Ciudad("Alemania","Berlín","imagenes/img3.png","Europa",8380000));
            ciudades.add(new Ciudad("China","Pekín","imagenes/img4.png","Asia",14120000));
            ciudades.add(new Ciudad("Perú","Lima","imagenes/img5.png","América",3405000));
            ciudades.add(new Ciudad("Portugal","Lisboa","imagenes/img6.png","Europa",1041000));
            ciudades.add(new Ciudad("Tailandia","Bangkok","imagenes/img7.png","Asia",7170000));
            ciudades.add(new Ciudad("Marruecos","Rabat","imagenes/img8.png","África",3746000));
            ciudades.add(new Ciudad("Reino Unido","Londres","imagenes/img9.png","Europa",6697000));
            ciudades.add(new Ciudad("Polonia","Varsovia","imagenes/img10.png","Europa",3682000));
            
            request.setAttribute("listaciudad",ciudades);
            RequestDispatcher dispatcher = request.getRequestDispatcher("vertabla.jsp");
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
