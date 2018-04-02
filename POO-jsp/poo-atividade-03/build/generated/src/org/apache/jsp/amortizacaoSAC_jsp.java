package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class amortizacaoSAC_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src='js/jquery.min.js'></script>\n");
      out.write("        <script src='js/bootstrap.min.js'></script>\n");
      out.write("        <script src='js/scripts.js'></script>\n");
      out.write("        <link href='src/css/bootstrap.css' rel='stylesheet'>\n");
      out.write("        <title> Amortização Constante SAC</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cálculo de Sistema SAC </h1>\n");
      out.write("        <form>\n");
      out.write("            \n");
      out.write("            Capital: <br/><input type=\"text\" name=\"capital\"/><br/>\n");
      out.write("            Parcelas: <br/><input type=\"text\" name=\"parcelas\"/><br/>\n");
      out.write("            Juros: <br/><input type=\"text\" name=\"juros\"/><br/>\n");
      out.write("           <br/> <input type=\"submit\" Value=\"Enviar\"/><br/>\n");
      out.write("        </form>\n");
      out.write("        ");
 try { 
      out.write("\n");
      out.write("        \n");
      out.write("           ");
int capital = Integer.parseInt(request.getParameter("capital")); 
      out.write("  \n");
      out.write("           ");
int parcelas = Integer.parseInt(request.getParameter("parcelas")); 
      out.write("  \n");
      out.write("           ");
int juros = Integer.parseInt(request.getParameter("juros")); 
      out.write("  \n");
      out.write("          \n");
      out.write("           \n");
      out.write("            <table border=\"1\" style=\"text-align: center\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Período</th>\n");
      out.write("                <th>Saldo Devedor</th> \n");
      out.write("                <th>Amortização</th> \n");
      out.write("                <th>Juros</th>\n");
      out.write("                <th>Pretação</th>\n");
      out.write("                \n");
      out.write("                ");
 int valorAmortizacao = capital/parcelas; 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td> 0 </td>\n");
      out.write("                <td> ");
      out.print(capital);
      out.write(" </td>\n");
      out.write("                <td> - </td>\n");
      out.write("                <td> - </td>\n");
      out.write("                <td> - </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            ");
 int novoCapital = 0; 
      out.write("\n");
      out.write("            ");
 novoCapital = (capital - valorAmortizacao);
      out.write("\n");
      out.write("            ");
 int novoJuro = (capital*juros)/100; 
      out.write("\n");
      out.write("            ");
 int novaPrestacao = valorAmortizacao+novoJuro;
      out.write("\n");
      out.write("            \n");
      out.write("            ");
 for (int i=1; i <= parcelas; i ++) { 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td> ");
      out.print(i);
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(novoCapital);
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(valorAmortizacao);
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(novoJuro);
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(novaPrestacao);
      out.write("</td>\n");
      out.write("            </tr>  \n");
      out.write("             \n");
      out.write("             ");
novoCapital = novoCapital - valorAmortizacao; 
      out.write("\n");
      out.write("             ");
novoJuro = (novoCapital*juros)/100; 
      out.write(" \n");
      out.write("             ");
novaPrestacao = valorAmortizacao+novoJuro;
      out.write("\n");
      out.write("            \n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("          \n");
      out.write("         ");
 }catch(Exception ex){
      out.write("\n");
      out.write("            Entre com um número válido.\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("         \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
