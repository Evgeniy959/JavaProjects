package com.mycompany.servletimages;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
@WebServlet(name = "Servlet2", value = "/Servlet2")
//@WebServlet(name = "Servlet2", urlPatterns ={"/Servlet2"})
public class Servlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    //protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
///* TODO output your page here. You may use
//following sample code.
//*/
//        out.println("<!DOCTYPE html>");
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Servlet Servlet2</title>");
//        out.println("</head>");
//        out.println("<body>");
//
        String btn1=request.getParameter("showImages");
        String select=request.getParameter("lImages");
        if( (btn1!=null && btn1.equals("View Page")) ||
                select!=null)
        {
            String root=request.getServletContext().
                    getRealPath("");
            String savePath=root+File.separator+Servlet1.
                    SAVEDIR;
            File dir=new File(savePath);
            //File f=null;
//            out.println("<h2>Select image to view</h2>");
//            out.println("<form method='POST' action='Servlet2' >");
//                    out.println("<select name='lImages'>");
//            for(String fname:dir.list())
//            {
//                f=new File(savePath+File.separator+fname);
//                if(!f.isFile())
//                    continue;
//                //out.println("<option>"+fname+"</option>");
//            }
//            ArrayList<User> usersL = new ArrayList<User>() {{
//                add(new User("Tom", "USA", 25));
//                add(new User("Mike", "France", 33));
//                add(new User("Bob", "Bali", 45));
//            }};
            request.setAttribute("dirList", dir.list());
            request.setAttribute("savePath", savePath);
            //getServletContext().getRequestDispatcher("/view_images.jsp").forward(request, response);
//            out.println("</select>");
//            out.println("<input type='submit' value='Show image'/>");
//                    out.println("</form>");
            if(select!=null)
            {
                Path path = Paths.get(savePath+File.
                        separator+select);
                byte[] data = Files.readAllBytes(path);
                StringBuilder sbImage = new StringBuilder();
                sbImage.append("data:image/png;base64,");
                sbImage.append(new String(Base64.getEncoder().encode(data)));
                request.setAttribute("sbImage", sbImage);
//                out.println("<img src='"+sbImage.toString()+"'/>");
//                out.println("<hr>" + "<a href=\"servlet2\">Hello Servlet2</a>");
            }
            getServletContext().getRequestDispatcher("/view_images.jsp").forward(request, response);
        }
//
//        out.println("<h4>The image is presented by Servlet2 at " + request.getContextPath() +
//                "</h4>");
//        out.println("</body>");
//        out.println("</html>");
//        out.flush();
//        out.close();
    }
}
